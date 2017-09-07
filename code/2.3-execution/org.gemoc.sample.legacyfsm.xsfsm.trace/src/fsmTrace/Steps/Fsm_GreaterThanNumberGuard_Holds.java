/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Greater Than Number Guard Holds</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_GreaterThanNumberGuard_Holds()
 * @model
 * @generated
 */
public interface Fsm_GreaterThanNumberGuard_Holds extends Fsm_StateMachine_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	GreaterThanNumberGuard getCaller();

} // Fsm_GreaterThanNumberGuard_Holds
