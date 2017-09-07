/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Assign Value Action Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_AssignValueAction_Execute()
 * @model
 * @generated
 */
public interface Fsm_AssignValueAction_Execute extends Fsm_Transition_Fire_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	AssignValueAction getCaller();

} // Fsm_AssignValueAction_Execute
