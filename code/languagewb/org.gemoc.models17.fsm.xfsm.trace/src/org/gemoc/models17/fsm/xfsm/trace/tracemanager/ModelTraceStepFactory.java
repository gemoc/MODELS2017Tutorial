
package org.gemoc.models17.fsm.xfsm.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ModelTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (stepRule.equalsIgnoreCase(".initialize")) {
			step = modelTrace.Steps.StepsFactory.eINSTANCE.createRoot_Initialize();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("run")
				&& (ec.getClassifierID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE.getFSM()
						.getClassifierID()))

		{
			step = modelTrace.Steps.StepsFactory.eINSTANCE.createModel_FSM_Run();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("step")
				&& (ec.getClassifierID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE.getState()
						.getClassifierID()))

		{
			step = modelTrace.Steps.StepsFactory.eINSTANCE.createModel_State_Step();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE.getTransition()
						.getClassifierID()))

		{
			step = modelTrace.Steps.StepsFactory.eINSTANCE.createModel_Transition_Fire();
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
