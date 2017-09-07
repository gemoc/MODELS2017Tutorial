/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fsmTrace.States.fsm.TracedStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm State Machine Assign Initial Values</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_StateMachine_AssignInitialValues()
 * @model
 * @generated
 */
public interface Fsm_StateMachine_AssignInitialValues extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmTrace.States.fsm.TracedStateMachine) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedStateMachine getCaller();

} // Fsm_StateMachine_AssignInitialValues
