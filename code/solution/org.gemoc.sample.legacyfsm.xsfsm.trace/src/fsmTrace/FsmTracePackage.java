/**
 */
package fsmTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see fsmTrace.FsmTraceFactory
 * @model kind="package"
 * @generated
 */
public interface FsmTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsmTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsmTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmTracePackage eINSTANCE = fsmTrace.impl.FsmTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.impl.SpecificTraceImpl
	 * @see fsmTrace.impl.FsmTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Fsm Assign Value Action Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fsm Decrease Value Action Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fsm Equal Number Guard Holds Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fsm Greater Than Number Guard Holds Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fsm Guard Holds Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fsm Increase Value Action Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fsm Less Than Number Guard Holds Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fsm Number Guard Holds Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fsm State Machine Assign Initial Values Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fsm State Machine Step Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fsm traced Number Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES = TracePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fsm traced State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES = TracePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fsm traced States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_STATES = TracePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fsm traced Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS = TracePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 16;


	/**
	 * Returns the meta object for class '{@link fsmTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see fsmTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_AssignValueAction_Execute_Sequence <em>Fsm Assign Value Action Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Assign Value Action Execute Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_AssignValueAction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_AssignValueAction_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_DecreaseValueAction_Execute_Sequence <em>Fsm Decrease Value Action Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Decrease Value Action Execute Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_DecreaseValueAction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_DecreaseValueAction_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_EqualNumberGuard_Holds_Sequence <em>Fsm Equal Number Guard Holds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Equal Number Guard Holds Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_EqualNumberGuard_Holds_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_EqualNumberGuard_Holds_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_GreaterThanNumberGuard_Holds_Sequence <em>Fsm Greater Than Number Guard Holds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Greater Than Number Guard Holds Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_GreaterThanNumberGuard_Holds_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_GreaterThanNumberGuard_Holds_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_Guard_Holds_Sequence <em>Fsm Guard Holds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Guard Holds Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_Guard_Holds_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_Guard_Holds_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_IncreaseValueAction_Execute_Sequence <em>Fsm Increase Value Action Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Increase Value Action Execute Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_IncreaseValueAction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_IncreaseValueAction_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_LessThanNumberGuard_Holds_Sequence <em>Fsm Less Than Number Guard Holds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Less Than Number Guard Holds Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_LessThanNumberGuard_Holds_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_LessThanNumberGuard_Holds_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_NumberGuard_Holds_Sequence <em>Fsm Number Guard Holds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Number Guard Holds Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_NumberGuard_Holds_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_NumberGuard_Holds_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_StateMachine_AssignInitialValues_Sequence <em>Fsm State Machine Assign Initial Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm State Machine Assign Initial Values Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_StateMachine_AssignInitialValues_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_StateMachine_AssignInitialValues_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_StateMachine_Step_Sequence <em>Fsm State Machine Step Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm State Machine Step Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_StateMachine_Step_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_StateMachine_Step_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Transition Fire Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedNumberVariables <em>Fsm traced Number Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced Number Variables</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedNumberVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedNumberVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedStateMachines <em>Fsm traced State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced State Machines</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedStateMachines()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedStateMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedStates <em>Fsm traced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced States</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedStates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedStates();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedTransitions <em>Fsm traced Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced Transitions</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedTransitions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see fsmTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmTraceFactory getFsmTraceFactory();

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
		 * The meta object literal for the '{@link fsmTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.impl.SpecificTraceImpl
		 * @see fsmTrace.impl.FsmTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Fsm Assign Value Action Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_AssignValueAction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Decrease Value Action Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_DecreaseValueAction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Equal Number Guard Holds Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_EqualNumberGuard_Holds_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Greater Than Number Guard Holds Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_GreaterThanNumberGuard_Holds_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Guard Holds Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_Guard_Holds_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Increase Value Action Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_IncreaseValueAction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Less Than Number Guard Holds Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_LessThanNumberGuard_Holds_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Number Guard Holds Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_NumberGuard_Holds_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm State Machine Assign Initial Values Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_StateMachine_AssignInitialValues_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm State Machine Step Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_StateMachine_Step_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm traced Number Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES = eINSTANCE.getSpecificTrace_Fsm_tracedNumberVariables();

		/**
		 * The meta object literal for the '<em><b>Fsm traced State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES = eINSTANCE.getSpecificTrace_Fsm_tracedStateMachines();

		/**
		 * The meta object literal for the '<em><b>Fsm traced States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_STATES = eINSTANCE.getSpecificTrace_Fsm_tracedStates();

		/**
		 * The meta object literal for the '<em><b>Fsm traced Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS = eINSTANCE.getSpecificTrace_Fsm_tracedTransitions();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //FsmTracePackage
