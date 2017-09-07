package org.gemoc.sample.legacyfsm.xsfsm.trace.tracemanager;

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

public class FsmTraceConstructor implements ITraceConstructor {
	private fsmTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private fsmTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<fsmTrace.Steps.SpecificStep> context = new LinkedList<fsmTrace.Steps.SpecificStep>();

	public FsmTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = fsmTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean copiedState = false;

	private fsmTrace.States.State copyState(fsmTrace.States.State oldState) {
		fsmTrace.States.State newState = fsmTrace.States.StatesFactory.eINSTANCE.createState();
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
			fsmTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
			}
			if (stateChanged) {
				final fsmTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final fsmTrace.States.State startingState = lastState;
					final fsmTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		fsmTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof fsmTrace.Steps.SpecificStep) {
			step_cast = (fsmTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			fsmTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<fsmTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof fsmTrace.Steps.Fsm_AssignValueAction_Execute) {
				fsmTrace.Steps.Fsm_AssignValueAction_Execute fsm_AssignValueAction_ExecuteInstance = (fsmTrace.Steps.Fsm_AssignValueAction_Execute) step_cast;
				traceRoot.getFsm_AssignValueAction_Execute_Sequence().add(fsm_AssignValueAction_ExecuteInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_DecreaseValueAction_Execute) {
				fsmTrace.Steps.Fsm_DecreaseValueAction_Execute fsm_DecreaseValueAction_ExecuteInstance = (fsmTrace.Steps.Fsm_DecreaseValueAction_Execute) step_cast;
				traceRoot.getFsm_DecreaseValueAction_Execute_Sequence().add(fsm_DecreaseValueAction_ExecuteInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_EqualNumberGuard_Holds) {
				fsmTrace.Steps.Fsm_EqualNumberGuard_Holds fsm_EqualNumberGuard_HoldsInstance = (fsmTrace.Steps.Fsm_EqualNumberGuard_Holds) step_cast;
				traceRoot.getFsm_EqualNumberGuard_Holds_Sequence().add(fsm_EqualNumberGuard_HoldsInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds) {
				fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds fsm_GreaterThanNumberGuard_HoldsInstance = (fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds) step_cast;
				traceRoot.getFsm_GreaterThanNumberGuard_Holds_Sequence().add(fsm_GreaterThanNumberGuard_HoldsInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_Guard_Holds) {
				fsmTrace.Steps.Fsm_Guard_Holds fsm_Guard_HoldsInstance = (fsmTrace.Steps.Fsm_Guard_Holds) step_cast;
				traceRoot.getFsm_Guard_Holds_Sequence().add(fsm_Guard_HoldsInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_IncreaseValueAction_Execute) {
				fsmTrace.Steps.Fsm_IncreaseValueAction_Execute fsm_IncreaseValueAction_ExecuteInstance = (fsmTrace.Steps.Fsm_IncreaseValueAction_Execute) step_cast;
				traceRoot.getFsm_IncreaseValueAction_Execute_Sequence().add(fsm_IncreaseValueAction_ExecuteInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds) {
				fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds fsm_LessThanNumberGuard_HoldsInstance = (fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds) step_cast;
				traceRoot.getFsm_LessThanNumberGuard_Holds_Sequence().add(fsm_LessThanNumberGuard_HoldsInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_NumberGuard_Holds) {
				fsmTrace.Steps.Fsm_NumberGuard_Holds fsm_NumberGuard_HoldsInstance = (fsmTrace.Steps.Fsm_NumberGuard_Holds) step_cast;
				traceRoot.getFsm_NumberGuard_Holds_Sequence().add(fsm_NumberGuard_HoldsInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues) {
				fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues fsm_StateMachine_AssignInitialValuesInstance = (fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues) step_cast;
				traceRoot.getFsm_StateMachine_AssignInitialValues_Sequence()
						.add(fsm_StateMachine_AssignInitialValuesInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_StateMachine_Step) {
				fsmTrace.Steps.Fsm_StateMachine_Step fsm_StateMachine_StepInstance = (fsmTrace.Steps.Fsm_StateMachine_Step) step_cast;
				traceRoot.getFsm_StateMachine_Step_Sequence().add(fsm_StateMachine_StepInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_Transition_Fire) {
				fsmTrace.Steps.Fsm_Transition_Fire fsm_Transition_FireInstance = (fsmTrace.Steps.Fsm_Transition_Fire) step_cast;
				traceRoot.getFsm_Transition_Fire_Sequence().add(fsm_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(fsmTrace.Steps.SpecificStep currentStep, fsmTrace.States.State startingState,
			fsmTrace.States.State endingState) {

		fsmTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof fsmTrace.Steps.Fsm_StateMachine_Step) {
			implicitStep = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_StateMachine_Step_ImplicitStep();
		} else if (currentStep instanceof fsmTrace.Steps.Fsm_Transition_Fire) {
			implicitStep = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_Transition_Fire_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<fsmTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		fsmTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = fsmTrace.FsmTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<fsmTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
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
