package org.gemoc.models17.fsm.xfsm.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ModelTraceConstructor implements ITraceConstructor {
	private modelTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private modelTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<modelTrace.Steps.SpecificStep> context = new LinkedList<modelTrace.Steps.SpecificStep>();

	public ModelTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = modelTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.models17.fsm.xfsm.model.Buffer) {
						org.gemoc.models17.fsm.xfsm.model.Buffer o_cast = (org.gemoc.models17.fsm.xfsm.model.Buffer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.models17.fsm.xfsm.model.FSM) {
						org.gemoc.models17.fsm.xfsm.model.FSM o_cast = (org.gemoc.models17.fsm.xfsm.model.FSM) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.gemoc.models17.fsm.xfsm.model.Buffer o_cast,
			modelTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			modelTrace.States.model.TracedBuffer tracedObject = modelTrace.States.model.ModelFactory.eINSTANCE
					.createTracedBuffer();
			tracedObject.setOriginalObject((org.gemoc.models17.fsm.xfsm.model.Buffer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getModel_tracedBuffers().add(tracedObject);

			// Creation of the first value of the field currentValues
			modelTrace.States.Buffer_currentValues_Value firstValue_currentValues = modelTrace.States.StatesFactory.eINSTANCE
					.createBuffer_currentValues_Value();

			firstValue_currentValues.setCurrentValues((java.lang.String) o_cast.getCurrentValues());
			tracedObject.getCurrentValuesSequence().add(firstValue_currentValues);
			newState.getBuffer_currentValues_Values().add(firstValue_currentValues);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.models17.fsm.xfsm.model.FSM o_cast,
			modelTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			modelTrace.States.model.TracedFSM tracedObject = modelTrace.States.model.ModelFactory.eINSTANCE
					.createTracedFSM();
			tracedObject.setOriginalObject((org.gemoc.models17.fsm.xfsm.model.FSM) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getModel_tracedFSMs().add(tracedObject);

			// Creation of the first value of the field consummedString
			modelTrace.States.FSM_consummedString_Value firstValue_consummedString = modelTrace.States.StatesFactory.eINSTANCE
					.createFSM_consummedString_Value();

			firstValue_consummedString.setConsummedString((java.lang.String) o_cast.getConsummedString());
			tracedObject.getConsummedStringSequence().add(firstValue_consummedString);
			newState.getFSM_consummedString_Values().add(firstValue_consummedString);

			// Creation of the first value of the field currentState
			modelTrace.States.FSM_currentState_Value firstValue_currentState = modelTrace.States.StatesFactory.eINSTANCE
					.createFSM_currentState_Value();

			if (o_cast.getCurrentState() != null) {
				firstValue_currentState
						.setCurrentState((org.gemoc.models17.fsm.xfsm.model.State) o_cast.getCurrentState());
			} else {
				firstValue_currentState.setCurrentState((org.gemoc.models17.fsm.xfsm.model.State) null);
			}

			tracedObject.getCurrentStateSequence().add(firstValue_currentState);
			newState.getFSM_currentState_Values().add(firstValue_currentState);

			// Creation of the first value of the field producedString
			modelTrace.States.FSM_producedString_Value firstValue_producedString = modelTrace.States.StatesFactory.eINSTANCE
					.createFSM_producedString_Value();

			firstValue_producedString.setProducedString((java.lang.String) o_cast.getProducedString());
			tracedObject.getProducedStringSequence().add(firstValue_producedString);
			newState.getFSM_producedString_Values().add(firstValue_producedString);

			// Creation of the first value of the field underProcessTrigger
			modelTrace.States.FSM_underProcessTrigger_Value firstValue_underProcessTrigger = modelTrace.States.StatesFactory.eINSTANCE
					.createFSM_underProcessTrigger_Value();

			firstValue_underProcessTrigger.setUnderProcessTrigger((java.lang.String) o_cast.getUnderProcessTrigger());
			tracedObject.getUnderProcessTriggerSequence().add(firstValue_underProcessTrigger);
			newState.getFSM_underProcessTrigger_Values().add(firstValue_underProcessTrigger);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private modelTrace.States.State copyState(modelTrace.States.State oldState) {
		modelTrace.States.State newState = modelTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getFSM_consummedString_Values().addAll(oldState.getFSM_consummedString_Values());
		newState.getFSM_currentState_Values().addAll(oldState.getFSM_currentState_Values());
		newState.getBuffer_currentValues_Values().addAll(oldState.getBuffer_currentValues_Values());
		newState.getFSM_producedString_Values().addAll(oldState.getFSM_producedString_Values());
		newState.getFSM_underProcessTrigger_Values().addAll(oldState.getFSM_underProcessTrigger_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			modelTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.models17.fsm.xfsm.model.Buffer) {
						org.gemoc.models17.fsm.xfsm.model.Buffer o_cast = (org.gemoc.models17.fsm.xfsm.model.Buffer) o;

						if (p.getFeatureID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
								.getBuffer_CurrentValues().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							modelTrace.States.model.TracedBuffer traced = (modelTrace.States.model.TracedBuffer) exeToTraced
									.get(o);
							modelTrace.States.Buffer_currentValues_Value lastValue = traced.getCurrentValuesSequence()
									.get(traced.getCurrentValuesSequence().size() - 1);
							newState.getBuffer_currentValues_Values().remove(lastValue);

							// And we create a proper new value
							modelTrace.States.Buffer_currentValues_Value newValue = modelTrace.States.StatesFactory.eINSTANCE
									.createBuffer_currentValues_Value();

							java.lang.String value = o_cast.getCurrentValues();

							newValue.setCurrentValues((java.lang.String) value);

							traced.getCurrentValuesSequence().add(newValue);
							newState.getBuffer_currentValues_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.models17.fsm.xfsm.model.FSM) {
						org.gemoc.models17.fsm.xfsm.model.FSM o_cast = (org.gemoc.models17.fsm.xfsm.model.FSM) o;

						if (p.getFeatureID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
								.getFSM_CurrentState().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							modelTrace.States.model.TracedFSM traced = (modelTrace.States.model.TracedFSM) exeToTraced
									.get(o);
							modelTrace.States.FSM_currentState_Value lastValue = traced.getCurrentStateSequence()
									.get(traced.getCurrentStateSequence().size() - 1);
							newState.getFSM_currentState_Values().remove(lastValue);

							// And we create a proper new value
							modelTrace.States.FSM_currentState_Value newValue = modelTrace.States.StatesFactory.eINSTANCE
									.createFSM_currentState_Value();

							org.gemoc.models17.fsm.xfsm.model.State value = null;
							if (o_cast.getCurrentState() != null) {
								value = o_cast.getCurrentState();
							}

							newValue.setCurrentState((org.gemoc.models17.fsm.xfsm.model.State) value);

							traced.getCurrentStateSequence().add(newValue);
							newState.getFSM_currentState_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
								.getFSM_ProducedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							modelTrace.States.model.TracedFSM traced = (modelTrace.States.model.TracedFSM) exeToTraced
									.get(o);
							modelTrace.States.FSM_producedString_Value lastValue = traced.getProducedStringSequence()
									.get(traced.getProducedStringSequence().size() - 1);
							newState.getFSM_producedString_Values().remove(lastValue);

							// And we create a proper new value
							modelTrace.States.FSM_producedString_Value newValue = modelTrace.States.StatesFactory.eINSTANCE
									.createFSM_producedString_Value();

							java.lang.String value = o_cast.getProducedString();

							newValue.setProducedString((java.lang.String) value);

							traced.getProducedStringSequence().add(newValue);
							newState.getFSM_producedString_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
								.getFSM_UnderProcessTrigger().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							modelTrace.States.model.TracedFSM traced = (modelTrace.States.model.TracedFSM) exeToTraced
									.get(o);
							modelTrace.States.FSM_underProcessTrigger_Value lastValue = traced
									.getUnderProcessTriggerSequence()
									.get(traced.getUnderProcessTriggerSequence().size() - 1);
							newState.getFSM_underProcessTrigger_Values().remove(lastValue);

							// And we create a proper new value
							modelTrace.States.FSM_underProcessTrigger_Value newValue = modelTrace.States.StatesFactory.eINSTANCE
									.createFSM_underProcessTrigger_Value();

							java.lang.String value = o_cast.getUnderProcessTrigger();

							newValue.setUnderProcessTrigger((java.lang.String) value);

							traced.getUnderProcessTriggerSequence().add(newValue);
							newState.getFSM_underProcessTrigger_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
								.getFSM_ConsummedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							modelTrace.States.model.TracedFSM traced = (modelTrace.States.model.TracedFSM) exeToTraced
									.get(o);
							modelTrace.States.FSM_consummedString_Value lastValue = traced.getConsummedStringSequence()
									.get(traced.getConsummedStringSequence().size() - 1);
							newState.getFSM_consummedString_Values().remove(lastValue);

							// And we create a proper new value
							modelTrace.States.FSM_consummedString_Value newValue = modelTrace.States.StatesFactory.eINSTANCE
									.createFSM_consummedString_Value();

							java.lang.String value = o_cast.getConsummedString();

							newValue.setConsummedString((java.lang.String) value);

							traced.getConsummedStringSequence().add(newValue);
							newState.getFSM_consummedString_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final modelTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final modelTrace.States.State startingState = lastState;
					final modelTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getFSM_consummedString_Values().clear();
				newState.getFSM_currentState_Values().clear();
				newState.getBuffer_currentValues_Values().clear();
				newState.getFSM_producedString_Values().clear();
				newState.getFSM_underProcessTrigger_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		modelTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof modelTrace.Steps.SpecificStep) {
			step_cast = (modelTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			modelTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<modelTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof modelTrace.Steps.Root_Initialize) {
				modelTrace.Steps.Root_Initialize root_InitializeInstance = (modelTrace.Steps.Root_Initialize) step_cast;
				traceRoot.getRoot_Initialize_Sequence().add(root_InitializeInstance);
			} else if (step_cast instanceof modelTrace.Steps.Model_FSM_Run) {
				modelTrace.Steps.Model_FSM_Run model_FSM_RunInstance = (modelTrace.Steps.Model_FSM_Run) step_cast;
				traceRoot.getModel_FSM_Run_Sequence().add(model_FSM_RunInstance);
			} else if (step_cast instanceof modelTrace.Steps.Model_State_Step) {
				modelTrace.Steps.Model_State_Step model_State_StepInstance = (modelTrace.Steps.Model_State_Step) step_cast;
				traceRoot.getModel_State_Step_Sequence().add(model_State_StepInstance);
			} else if (step_cast instanceof modelTrace.Steps.Model_Transition_Fire) {
				modelTrace.Steps.Model_Transition_Fire model_Transition_FireInstance = (modelTrace.Steps.Model_Transition_Fire) step_cast;
				traceRoot.getModel_Transition_Fire_Sequence().add(model_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(modelTrace.Steps.SpecificStep currentStep, modelTrace.States.State startingState,
			modelTrace.States.State endingState) {

		modelTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof modelTrace.Steps.Model_FSM_Run) {
			implicitStep = modelTrace.Steps.StepsFactory.eINSTANCE.createModel_FSM_Run_ImplicitStep();
		} else if (currentStep instanceof modelTrace.Steps.Model_State_Step) {
			implicitStep = modelTrace.Steps.StepsFactory.eINSTANCE.createModel_State_Step_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<modelTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		modelTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = modelTrace.ModelTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<modelTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
