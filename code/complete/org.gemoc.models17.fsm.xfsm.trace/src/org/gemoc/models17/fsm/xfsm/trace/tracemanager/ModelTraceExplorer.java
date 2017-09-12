package org.gemoc.models17.fsm.xfsm.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceViewListener;

public class ModelTraceExplorer implements ITraceExplorer {
	private modelTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private modelTrace.States.State currentState = null;
	private final List<Step> callStack = new ArrayList<>();

	private final List<List<? extends modelTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<modelTrace.States.State> statesTrace;

	private modelTrace.Steps.SpecificStep stepIntoResult;
	private modelTrace.Steps.SpecificStep stepOverResult;
	private modelTrace.Steps.SpecificStep stepReturnResult;

	private modelTrace.Steps.SpecificStep stepBackIntoResult;
	private modelTrace.Steps.SpecificStep stepBackOverResult;
	private modelTrace.Steps.SpecificStep stepBackOutResult;

	private final Map<modelTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	private final Map<modelTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<List<? extends modelTrace.States.Value>, modelTrace.States.Value> backValueCache = new HashMap<>();

	private final Map<ITraceViewListener, Set<TraceViewCommand>> listeners = new HashMap<>();

	public ModelTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public ModelTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends modelTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends modelTrace.States.Value>> result = new ArrayList<>();
		for (modelTrace.States.model.TracedBuffer tracedObject : traceRoot.getModel_tracedBuffers()) {
			result.add(tracedObject.getCurrentValuesSequence());
		}
		for (modelTrace.States.model.TracedFSM tracedObject : traceRoot.getModel_tracedFSMs()) {
			result.add(tracedObject.getConsummedStringSequence());
			result.add(tracedObject.getCurrentStateSequence());
			result.add(tracedObject.getProducedStringSequence());
			result.add(tracedObject.getUnprocessedStringSequence());
		}
		return result;
	}

	private modelTrace.States.Value getActiveValue(final List<? extends modelTrace.States.Value> valueTrace,
			final modelTrace.States.State state) {
		modelTrace.States.Value result = null;
		for (modelTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private modelTrace.States.Value getPreviousValue(final List<? extends modelTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() - 1;
		final modelTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i + 1));
		modelTrace.States.Value previousValue = null;
		while (i > -1 && (previousValue == null || previousValue == value)) {
			previousValue = getActiveValue(valueTrace, statesTrace.get(i));
			i--;
		}
		return previousValue;
	}

	private modelTrace.States.Value getNextValue(final List<? extends modelTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() + 1;
		final modelTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i - 1));
		modelTrace.States.Value nextValue = null;
		final int traceLength = valueTrace.stream().map(v -> v.getStatesNoOpposite().size()).reduce(0, (a, b) -> a + b);
		while (i < traceLength && (nextValue == null || nextValue == value)) {
			nextValue = getActiveValue(valueTrace, statesTrace.get(i));
			i++;
		}
		return nextValue;
	}

	private int getStartingIndex(modelTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(modelTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private modelTrace.Steps.SpecificStep findNextStep(final List<modelTrace.Steps.SpecificStep> stepPath,
			final modelTrace.Steps.SpecificStep previousStep, final int start) {
		final List<modelTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		modelTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		modelTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final modelTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<modelTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<modelTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private modelTrace.Steps.SpecificStep computeBackInto(List<modelTrace.Steps.SpecificStep> stepPath) {
		final List<modelTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		modelTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final modelTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final modelTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<modelTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) parentStep;
			final List<? extends modelTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final modelTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				modelTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<modelTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<modelTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<modelTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final modelTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				modelTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<modelTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<modelTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<modelTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private modelTrace.Steps.SpecificStep computeBackOver(List<modelTrace.Steps.SpecificStep> stepPath) {
		final List<modelTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		modelTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final modelTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final modelTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<modelTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) parentStep;
			final List<modelTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final modelTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private modelTrace.Steps.SpecificStep computeBackOut(List<modelTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private modelTrace.Steps.SpecificStep computeStepInto(List<modelTrace.Steps.SpecificStep> stepPath,
			List<modelTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private modelTrace.Steps.SpecificStep computeStepOver(List<modelTrace.Steps.SpecificStep> stepPath,
			List<modelTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private modelTrace.Steps.SpecificStep computeStepReturn(List<modelTrace.Steps.SpecificStep> stepPath,
			List<modelTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<modelTrace.Steps.SpecificStep> stepPath) {
		final List<modelTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<modelTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof modelTrace.States.State) {
			modelTrace.States.State stateToGo = (modelTrace.States.State) eObject;
			for (modelTrace.States.FSM_consummedString_Value value : stateToGo.getFSM_consummedString_Values()) {
				if (value.getParent() instanceof modelTrace.States.model.TracedFSM) {
					modelTrace.States.model.TracedFSM parent_cast = (modelTrace.States.model.TracedFSM) value
							.getParent();
					java.lang.String toset = value.getConsummedString();
					java.lang.String current = ((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
							.getConsummedString();
					if (current != toset) {
						((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
								.setConsummedString((java.lang.String) toset);
					}
				}
			}
			for (modelTrace.States.FSM_currentState_Value value : stateToGo.getFSM_currentState_Values()) {
				if (value.getParent() instanceof modelTrace.States.model.TracedFSM) {
					modelTrace.States.model.TracedFSM parent_cast = (modelTrace.States.model.TracedFSM) value
							.getParent();
					org.gemoc.models17.fsm.xfsm.model.State toset = value.getCurrentState();
					org.gemoc.models17.fsm.xfsm.model.State current = ((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast
							.getOriginalObject()).getCurrentState();
					if (current != toset) {
						((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
								.setCurrentState((org.gemoc.models17.fsm.xfsm.model.State) toset);
					}
				}
			}
			for (modelTrace.States.Buffer_currentValues_Value value : stateToGo.getBuffer_currentValues_Values()) {
				if (value.getParent() instanceof modelTrace.States.model.TracedBuffer) {
					modelTrace.States.model.TracedBuffer parent_cast = (modelTrace.States.model.TracedBuffer) value
							.getParent();
					org.gemoc.models17.fsm.xfsm.model.Buffer originalObject = (org.gemoc.models17.fsm.xfsm.model.Buffer) parent_cast
							.getOriginalObject();
					originalObject.getCurrentValues().clear();
					originalObject.getCurrentValues().addAll(value.getCurrentValues());
				}
			}
			for (modelTrace.States.FSM_producedString_Value value : stateToGo.getFSM_producedString_Values()) {
				if (value.getParent() instanceof modelTrace.States.model.TracedFSM) {
					modelTrace.States.model.TracedFSM parent_cast = (modelTrace.States.model.TracedFSM) value
							.getParent();
					java.lang.String toset = value.getProducedString();
					java.lang.String current = ((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
							.getProducedString();
					if (current != toset) {
						((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
								.setProducedString((java.lang.String) toset);
					}
				}
			}
			for (modelTrace.States.FSM_unprocessedString_Value value : stateToGo.getFSM_unprocessedString_Values()) {
				if (value.getParent() instanceof modelTrace.States.model.TracedFSM) {
					modelTrace.States.model.TracedFSM parent_cast = (modelTrace.States.model.TracedFSM) value
							.getParent();
					java.lang.String toset = value.getUnprocessedString();
					java.lang.String current = ((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
							.getUnprocessedString();
					if (current != toset) {
						((org.gemoc.models17.fsm.xfsm.model.FSM) parent_cast.getOriginalObject())
								.setUnprocessedString((java.lang.String) toset);
					}
				}
			}
			backValueCache.clear();
		} else if (eObject instanceof modelTrace.States.Value) {
			goTo(((modelTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private void jumpBeforeStep(modelTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(modelTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, modelTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return backValueCache.computeIfAbsent(valueTraces.get(traceIndex),
					valueTrace -> getPreviousValue(valueTrace)) != null;
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final modelTrace.States.Value previousValue = backValueCache.get(valueTraces.get(traceIndex));
			if (previousValue != null) {
				jump(previousValue);
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final modelTrace.States.Value nextValue = getNextValue(valueTraces.get(traceIndex));
			if (nextValue != null) {
				jump(nextValue);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<modelTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<modelTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<modelTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			modelTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<modelTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				modelTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<modelTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<modelTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<modelTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<modelTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							modelTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<modelTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final modelTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<modelTrace.Steps.SpecificStep> s_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<modelTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<modelTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<modelTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<modelTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (Map.Entry<ITraceViewListener, Set<TraceViewCommand>> entry : listeners.entrySet()) {
			entry.getValue().forEach(c -> c.execute());
		}
	}

	@Override
	public void registerCommand(ITraceViewListener listener, TraceViewCommand command) {
		if (listener != null) {
			Set<TraceViewCommand> commands = listeners.get(listener);
			if (commands == null) {
				commands = new HashSet<>();
				listeners.put(listener, commands);
			}
			commands.add(command);
		}
	}

	@Override
	public void removeListener(ITraceViewListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof modelTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof modelTrace.States.Value) {
			final modelTrace.States.State state = ((modelTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<modelTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		modelTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<modelTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof modelTrace.Steps.SpecificStep) {
			modelTrace.Steps.SpecificStep step_cast = (modelTrace.Steps.SpecificStep) step;
			final List<modelTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof modelTrace.Steps.SpecificStep) {
				newPath.add(0, (modelTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			notifyListeners();
		} else {
			throw new IllegalArgumentException(
					"ModelTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public void statesAdded(List<EObject> state) {
	}

	@Override
	public void valuesAdded(List<EObject> value) {
	}

	@Override
	public void dimensionsAdded(List<List<? extends EObject>> dimensions) {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		notifyListeners();
	}

	@Override
	public void stepsStarted(List<EObject> steps) {
	}

	@Override
	public void stepsEnded(List<EObject> steps) {
	}
}
