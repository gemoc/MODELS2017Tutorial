/**
 */
package modelTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.models17.fsm.xfsm.model.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model State Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelTrace.Steps.StepsPackage#getModel_State_Step()
 * @model
 * @generated
 */
public interface Model_State_Step extends Model_FSM_Run_AbstractSubStep, SpecificStep, SequentialStep<Model_State_Step_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.models17.fsm.xfsm.model.State) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	State getCaller();

} // Model_State_Step
