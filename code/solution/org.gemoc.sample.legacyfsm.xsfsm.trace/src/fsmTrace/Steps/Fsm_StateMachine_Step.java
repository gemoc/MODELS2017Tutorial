/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fsmTrace.States.fsm.TracedStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm State Machine Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_StateMachine_Step()
 * @model
 * @generated
 */
public interface Fsm_StateMachine_Step extends SpecificStep, SequentialStep<Fsm_StateMachine_Step_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmTrace.States.fsm.TracedStateMachine) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedStateMachine getCaller();

} // Fsm_StateMachine_Step
