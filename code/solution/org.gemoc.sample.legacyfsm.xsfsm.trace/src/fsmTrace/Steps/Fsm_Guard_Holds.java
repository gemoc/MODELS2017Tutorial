/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Guard Holds</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_Guard_Holds()
 * @model
 * @generated
 */
public interface Fsm_Guard_Holds extends SpecificStep, SmallStep, Fsm_StateMachine_Step_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Guard getCaller();

} // Fsm_Guard_Holds
