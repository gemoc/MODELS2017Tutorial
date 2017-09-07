/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Equal Number Guard Holds</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_EqualNumberGuard_Holds()
 * @model
 * @generated
 */
public interface Fsm_EqualNumberGuard_Holds extends Fsm_StateMachine_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	EqualNumberGuard getCaller();

} // Fsm_EqualNumberGuard_Holds
