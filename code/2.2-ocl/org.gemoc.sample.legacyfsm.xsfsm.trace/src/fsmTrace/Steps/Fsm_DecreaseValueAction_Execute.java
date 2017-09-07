/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Decrease Value Action Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_DecreaseValueAction_Execute()
 * @model
 * @generated
 */
public interface Fsm_DecreaseValueAction_Execute extends Fsm_Transition_Fire_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	DecreaseValueAction getCaller();

} // Fsm_DecreaseValueAction_Execute
