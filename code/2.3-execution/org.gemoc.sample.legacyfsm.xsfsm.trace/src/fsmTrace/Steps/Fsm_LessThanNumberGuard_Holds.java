/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Less Than Number Guard Holds</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_LessThanNumberGuard_Holds()
 * @model
 * @generated
 */
public interface Fsm_LessThanNumberGuard_Holds extends Fsm_StateMachine_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	LessThanNumberGuard getCaller();

} // Fsm_LessThanNumberGuard_Holds
