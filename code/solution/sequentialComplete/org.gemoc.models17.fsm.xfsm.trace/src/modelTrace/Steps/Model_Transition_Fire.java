/**
 */
package modelTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.models17.fsm.xfsm.model.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelTrace.Steps.StepsPackage#getModel_Transition_Fire()
 * @model
 * @generated
 */
public interface Model_Transition_Fire extends Model_State_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.models17.fsm.xfsm.model.Transition) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Transition getCaller();

} // Model_Transition_Fire
