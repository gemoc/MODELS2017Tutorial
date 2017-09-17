/**
 */
package modelTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = modelTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Buffer current Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer current Values Value</em>'.
	 * @generated
	 */
	Buffer_currentValues_Value createBuffer_currentValues_Value();

	/**
	 * Returns a new object of class '<em>FSM consummed String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM consummed String Value</em>'.
	 * @generated
	 */
	FSM_consummedString_Value createFSM_consummedString_Value();

	/**
	 * Returns a new object of class '<em>FSM current State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM current State Value</em>'.
	 * @generated
	 */
	FSM_currentState_Value createFSM_currentState_Value();

	/**
	 * Returns a new object of class '<em>FSM produced String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM produced String Value</em>'.
	 * @generated
	 */
	FSM_producedString_Value createFSM_producedString_Value();

	/**
	 * Returns a new object of class '<em>FSM under Process Trigger Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM under Process Trigger Value</em>'.
	 * @generated
	 */
	FSM_underProcessTrigger_Value createFSM_underProcessTrigger_Value();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
