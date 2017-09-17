/**
 */
package modelTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import modelTrace.States.model.TracedFSM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model FSM Run</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelTrace.Steps.StepsPackage#getModel_FSM_Run()
 * @model
 * @generated
 */
public interface Model_FSM_Run extends SpecificStep, SequentialStep<Model_FSM_Run_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (modelTrace.States.model.TracedFSM) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedFSM getCaller();

} // Model_FSM_Run
