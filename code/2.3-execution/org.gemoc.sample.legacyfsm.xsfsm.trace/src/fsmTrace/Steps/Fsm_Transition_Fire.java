/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_Transition_Fire()
 * @model
 * @generated
 */
public interface Fsm_Transition_Fire extends Fsm_StateMachine_Step_AbstractSubStep, SpecificStep, SequentialStep<Fsm_Transition_Fire_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Transition getCaller();

} // Fsm_Transition_Fire
