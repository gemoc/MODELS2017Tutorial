/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Increase Value Action Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_IncreaseValueAction_Execute()
 * @model
 * @generated
 */
public interface Fsm_IncreaseValueAction_Execute extends SpecificStep, SmallStep, Fsm_Transition_Fire_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IncreaseValueAction getCaller();

} // Fsm_IncreaseValueAction_Execute
