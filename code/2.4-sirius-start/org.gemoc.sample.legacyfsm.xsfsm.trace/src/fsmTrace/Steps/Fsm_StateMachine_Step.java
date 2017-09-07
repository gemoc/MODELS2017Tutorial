/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	StateMachine getCaller();

} // Fsm_StateMachine_Step
