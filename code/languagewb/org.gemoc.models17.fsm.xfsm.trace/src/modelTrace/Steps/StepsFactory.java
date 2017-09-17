/**
 */
package modelTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = modelTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model FSM Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model FSM Run</em>'.
	 * @generated
	 */
	Model_FSM_Run createModel_FSM_Run();

	/**
	 * Returns a new object of class '<em>Model FSM Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model FSM Run Implicit Step</em>'.
	 * @generated
	 */
	Model_FSM_Run_ImplicitStep createModel_FSM_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Model State Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model State Step</em>'.
	 * @generated
	 */
	Model_State_Step createModel_State_Step();

	/**
	 * Returns a new object of class '<em>Model State Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model State Step Implicit Step</em>'.
	 * @generated
	 */
	Model_State_Step_ImplicitStep createModel_State_Step_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Model Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Transition Fire</em>'.
	 * @generated
	 */
	Model_Transition_Fire createModel_Transition_Fire();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Root Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Initialize</em>'.
	 * @generated
	 */
	Root_Initialize createRoot_Initialize();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
