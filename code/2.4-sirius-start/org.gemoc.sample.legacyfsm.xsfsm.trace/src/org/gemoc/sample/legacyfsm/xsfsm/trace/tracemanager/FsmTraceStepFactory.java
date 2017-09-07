
package org.gemoc.sample.legacyfsm.xsfsm.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class FsmTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getAssignValueAction().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_AssignValueAction_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getDecreaseValueAction().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_DecreaseValueAction_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("holds")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getEqualNumberGuard().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_EqualNumberGuard_Holds();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("holds")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getGreaterThanNumberGuard().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_GreaterThanNumberGuard_Holds();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("holds")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getEqualNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getGreaterThanNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getLessThanNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getNumberGuard().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_Guard_Holds();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getIncreaseValueAction().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_IncreaseValueAction_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("holds")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getLessThanNumberGuard().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_LessThanNumberGuard_Holds();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("holds")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getEqualNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getGreaterThanNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getLessThanNumberGuard().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getNumberGuard().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_NumberGuard_Holds();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("assignInitialValues")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getStateMachine().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_StateMachine_AssignInitialValues();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("step")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getStateMachine().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_StateMachine_Step();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getTransition().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_Transition_Fire();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
