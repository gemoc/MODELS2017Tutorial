/**
 */
package fsmTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = fsmTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fsm Assign Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Assign Value Action Execute</em>'.
	 * @generated
	 */
	Fsm_AssignValueAction_Execute createFsm_AssignValueAction_Execute();

	/**
	 * Returns a new object of class '<em>Fsm Decrease Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Decrease Value Action Execute</em>'.
	 * @generated
	 */
	Fsm_DecreaseValueAction_Execute createFsm_DecreaseValueAction_Execute();

	/**
	 * Returns a new object of class '<em>Fsm Equal Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Equal Number Guard Holds</em>'.
	 * @generated
	 */
	Fsm_EqualNumberGuard_Holds createFsm_EqualNumberGuard_Holds();

	/**
	 * Returns a new object of class '<em>Fsm Greater Than Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Greater Than Number Guard Holds</em>'.
	 * @generated
	 */
	Fsm_GreaterThanNumberGuard_Holds createFsm_GreaterThanNumberGuard_Holds();

	/**
	 * Returns a new object of class '<em>Fsm Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Guard Holds</em>'.
	 * @generated
	 */
	Fsm_Guard_Holds createFsm_Guard_Holds();

	/**
	 * Returns a new object of class '<em>Fsm Increase Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Increase Value Action Execute</em>'.
	 * @generated
	 */
	Fsm_IncreaseValueAction_Execute createFsm_IncreaseValueAction_Execute();

	/**
	 * Returns a new object of class '<em>Fsm Less Than Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Less Than Number Guard Holds</em>'.
	 * @generated
	 */
	Fsm_LessThanNumberGuard_Holds createFsm_LessThanNumberGuard_Holds();

	/**
	 * Returns a new object of class '<em>Fsm Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Number Guard Holds</em>'.
	 * @generated
	 */
	Fsm_NumberGuard_Holds createFsm_NumberGuard_Holds();

	/**
	 * Returns a new object of class '<em>Fsm State Machine Assign Initial Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Machine Assign Initial Values</em>'.
	 * @generated
	 */
	Fsm_StateMachine_AssignInitialValues createFsm_StateMachine_AssignInitialValues();

	/**
	 * Returns a new object of class '<em>Fsm State Machine Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Machine Step</em>'.
	 * @generated
	 */
	Fsm_StateMachine_Step createFsm_StateMachine_Step();

	/**
	 * Returns a new object of class '<em>Fsm State Machine Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Machine Step Implicit Step</em>'.
	 * @generated
	 */
	Fsm_StateMachine_Step_ImplicitStep createFsm_StateMachine_Step_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Fsm Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Transition Fire</em>'.
	 * @generated
	 */
	Fsm_Transition_Fire createFsm_Transition_Fire();

	/**
	 * Returns a new object of class '<em>Fsm Transition Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Transition Fire Implicit Step</em>'.
	 * @generated
	 */
	Fsm_Transition_Fire_ImplicitStep createFsm_Transition_Fire_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
