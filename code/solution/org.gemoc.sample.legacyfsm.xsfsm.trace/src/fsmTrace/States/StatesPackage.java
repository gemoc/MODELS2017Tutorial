/**
 */
package fsmTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fsmTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = fsmTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.Value
	 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.NumberVariable_value_ValueImpl <em>Number Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.NumberVariable_value_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getNumberVariable_value_Value()
	 * @generated
	 */
	int NUMBER_VARIABLE_VALUE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_VALUE_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Number Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NUMBER_VARIABLE_VALUE_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>State Machine current State Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE_CURRENT_STATE_VALUES = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
	 * @generated
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine current State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.NumberVariable_value_Value <em>Number Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Variable value Value</em>'.
	 * @see fsmTrace.States.NumberVariable_value_Value
	 * @generated
	 */
	EClass getNumberVariable_value_Value();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.NumberVariable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.NumberVariable_value_Value#getParent()
	 * @see #getNumberVariable_value_Value()
	 * @generated
	 */
	EReference getNumberVariable_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.NumberVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.NumberVariable_value_Value#getStates()
	 * @see #getNumberVariable_value_Value()
	 * @generated
	 */
	EReference getNumberVariable_value_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.NumberVariable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fsmTrace.States.NumberVariable_value_Value#getValue()
	 * @see #getNumberVariable_value_Value()
	 * @generated
	 */
	EAttribute getNumberVariable_value_Value_Value();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fsmTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see fsmTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getNumberVariable_value_Values <em>Number Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Number Variable value Values</em>'.
	 * @see fsmTrace.States.State#getNumberVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_NumberVariable_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see fsmTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStateMachine_currentState_Values <em>State Machine current State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine current State Values</em>'.
	 * @see fsmTrace.States.State#getStateMachine_currentState_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine_currentState_Values();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_currentState_Value <em>State Machine current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine current State Value</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value
	 * @generated
	 */
	EClass getStateMachine_currentState_Value();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.StateMachine_currentState_Value#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getCurrentState()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_CurrentState();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.StateMachine_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getParent()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.StateMachine_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getStates()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fsmTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see fsmTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.NumberVariable_value_ValueImpl <em>Number Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.NumberVariable_value_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getNumberVariable_value_Value()
		 * @generated
		 */
		EClass NUMBER_VARIABLE_VALUE_VALUE = eINSTANCE.getNumberVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_VARIABLE_VALUE_VALUE__PARENT = eINSTANCE.getNumberVariable_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_VARIABLE_VALUE_VALUE__STATES = eINSTANCE.getNumberVariable_value_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getNumberVariable_value_Value_Value();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Number Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NUMBER_VARIABLE_VALUE_VALUES = eINSTANCE.getState_NumberVariable_value_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>State Machine current State Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE_CURRENT_STATE_VALUES = eINSTANCE.getState_StateMachine_currentState_Values();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_CURRENT_STATE_VALUE = eINSTANCE.getStateMachine_currentState_Value();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = eINSTANCE.getStateMachine_currentState_Value_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = eINSTANCE.getStateMachine_currentState_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__STATES = eINSTANCE.getStateMachine_currentState_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.Value
		 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
