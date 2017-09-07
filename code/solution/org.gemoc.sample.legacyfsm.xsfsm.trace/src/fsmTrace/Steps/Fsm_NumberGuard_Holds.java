/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Number Guard Holds</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_NumberGuard_Holds()
 * @model
 * @generated
 */
public interface Fsm_NumberGuard_Holds extends Fsm_StateMachine_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	NumberGuard getCaller();

} // Fsm_NumberGuard_Holds
