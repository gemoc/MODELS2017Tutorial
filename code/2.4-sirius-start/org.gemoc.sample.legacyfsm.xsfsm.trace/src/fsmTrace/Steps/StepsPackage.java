/**
 */
package fsmTrace.Steps;

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
 * @see fsmTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = fsmTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.SpecificStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep <em>Fsm Transition Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire_AbstractSubStep()
	 * @generated
	 */
	int FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Transition Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_AssignValueAction_ExecuteImpl <em>Fsm Assign Value Action Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_AssignValueAction_ExecuteImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_AssignValueAction_Execute()
	 * @generated
	 */
	int FSM_ASSIGN_VALUE_ACTION_EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_ASSIGN_VALUE_ACTION_EXECUTE__MSEOCCURRENCE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_ASSIGN_VALUE_ACTION_EXECUTE__ENDING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_ASSIGN_VALUE_ACTION_EXECUTE__STARTING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Assign Value Action Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_ASSIGN_VALUE_ACTION_EXECUTE_FEATURE_COUNT = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_DecreaseValueAction_ExecuteImpl <em>Fsm Decrease Value Action Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_DecreaseValueAction_ExecuteImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_DecreaseValueAction_Execute()
	 * @generated
	 */
	int FSM_DECREASE_VALUE_ACTION_EXECUTE = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_DECREASE_VALUE_ACTION_EXECUTE__MSEOCCURRENCE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_DECREASE_VALUE_ACTION_EXECUTE__ENDING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_DECREASE_VALUE_ACTION_EXECUTE__STARTING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Decrease Value Action Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_DECREASE_VALUE_ACTION_EXECUTE_FEATURE_COUNT = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep <em>Fsm State Machine Step Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step_AbstractSubStep()
	 * @generated
	 */
	int FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Step Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_EqualNumberGuard_HoldsImpl <em>Fsm Equal Number Guard Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_EqualNumberGuard_HoldsImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_EqualNumberGuard_Holds()
	 * @generated
	 */
	int FSM_EQUAL_NUMBER_GUARD_HOLDS = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EQUAL_NUMBER_GUARD_HOLDS__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EQUAL_NUMBER_GUARD_HOLDS__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EQUAL_NUMBER_GUARD_HOLDS__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Equal Number Guard Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EQUAL_NUMBER_GUARD_HOLDS_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_GreaterThanNumberGuard_HoldsImpl <em>Fsm Greater Than Number Guard Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_GreaterThanNumberGuard_HoldsImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_GreaterThanNumberGuard_Holds()
	 * @generated
	 */
	int FSM_GREATER_THAN_NUMBER_GUARD_HOLDS = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GREATER_THAN_NUMBER_GUARD_HOLDS__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GREATER_THAN_NUMBER_GUARD_HOLDS__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GREATER_THAN_NUMBER_GUARD_HOLDS__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Greater Than Number Guard Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_Guard_HoldsImpl <em>Fsm Guard Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_Guard_HoldsImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Guard_Holds()
	 * @generated
	 */
	int FSM_GUARD_HOLDS = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GUARD_HOLDS__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GUARD_HOLDS__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GUARD_HOLDS__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Guard Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_GUARD_HOLDS_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_IncreaseValueAction_ExecuteImpl <em>Fsm Increase Value Action Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_IncreaseValueAction_ExecuteImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_IncreaseValueAction_Execute()
	 * @generated
	 */
	int FSM_INCREASE_VALUE_ACTION_EXECUTE = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_INCREASE_VALUE_ACTION_EXECUTE__MSEOCCURRENCE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_INCREASE_VALUE_ACTION_EXECUTE__ENDING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_INCREASE_VALUE_ACTION_EXECUTE__STARTING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Increase Value Action Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_INCREASE_VALUE_ACTION_EXECUTE_FEATURE_COUNT = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_LessThanNumberGuard_HoldsImpl <em>Fsm Less Than Number Guard Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_LessThanNumberGuard_HoldsImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_LessThanNumberGuard_Holds()
	 * @generated
	 */
	int FSM_LESS_THAN_NUMBER_GUARD_HOLDS = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_LESS_THAN_NUMBER_GUARD_HOLDS__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_LESS_THAN_NUMBER_GUARD_HOLDS__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_LESS_THAN_NUMBER_GUARD_HOLDS__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Less Than Number Guard Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_LESS_THAN_NUMBER_GUARD_HOLDS_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_NumberGuard_HoldsImpl <em>Fsm Number Guard Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_NumberGuard_HoldsImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_NumberGuard_Holds()
	 * @generated
	 */
	int FSM_NUMBER_GUARD_HOLDS = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_NUMBER_GUARD_HOLDS__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_NUMBER_GUARD_HOLDS__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_NUMBER_GUARD_HOLDS__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Number Guard Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_NUMBER_GUARD_HOLDS_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_AssignInitialValuesImpl <em>Fsm State Machine Assign Initial Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_AssignInitialValuesImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_AssignInitialValues()
	 * @generated
	 */
	int FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Assign Initial Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_StepImpl <em>Fsm State Machine Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_StepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step()
	 * @generated
	 */
	int FSM_STATE_MACHINE_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_Step_ImplicitStepImpl <em>Fsm State Machine Step Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_Step_ImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step_ImplicitStep()
	 * @generated
	 */
	int FSM_STATE_MACHINE_STEP_IMPLICIT_STEP = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_IMPLICIT_STEP__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_IMPLICIT_STEP__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_IMPLICIT_STEP__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Step Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_STEP_IMPLICIT_STEP_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
	 * @generated
	 */
	int FSM_TRANSITION_FIRE = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__MSEOCCURRENCE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__ENDING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__STARTING_STATE = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__SUB_STEPS = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_FEATURE_COUNT = FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_Transition_Fire_ImplicitStepImpl <em>Fsm Transition Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_Transition_Fire_ImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire_ImplicitStep()
	 * @generated
	 */
	int FSM_TRANSITION_FIRE_IMPLICIT_STEP = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_IMPLICIT_STEP__ENDING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_IMPLICIT_STEP__STARTING_STATE = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Transition Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_IMPLICIT_STEP_FEATURE_COUNT = FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_AssignValueAction_Execute <em>Fsm Assign Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Assign Value Action Execute</em>'.
	 * @see fsmTrace.Steps.Fsm_AssignValueAction_Execute
	 * @generated
	 */
	EClass getFsm_AssignValueAction_Execute();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_DecreaseValueAction_Execute <em>Fsm Decrease Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Decrease Value Action Execute</em>'.
	 * @see fsmTrace.Steps.Fsm_DecreaseValueAction_Execute
	 * @generated
	 */
	EClass getFsm_DecreaseValueAction_Execute();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_EqualNumberGuard_Holds <em>Fsm Equal Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Equal Number Guard Holds</em>'.
	 * @see fsmTrace.Steps.Fsm_EqualNumberGuard_Holds
	 * @generated
	 */
	EClass getFsm_EqualNumberGuard_Holds();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds <em>Fsm Greater Than Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Greater Than Number Guard Holds</em>'.
	 * @see fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds
	 * @generated
	 */
	EClass getFsm_GreaterThanNumberGuard_Holds();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Guard_Holds <em>Fsm Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Guard Holds</em>'.
	 * @see fsmTrace.Steps.Fsm_Guard_Holds
	 * @generated
	 */
	EClass getFsm_Guard_Holds();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_IncreaseValueAction_Execute <em>Fsm Increase Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Increase Value Action Execute</em>'.
	 * @see fsmTrace.Steps.Fsm_IncreaseValueAction_Execute
	 * @generated
	 */
	EClass getFsm_IncreaseValueAction_Execute();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds <em>Fsm Less Than Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Less Than Number Guard Holds</em>'.
	 * @see fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds
	 * @generated
	 */
	EClass getFsm_LessThanNumberGuard_Holds();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_NumberGuard_Holds <em>Fsm Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Number Guard Holds</em>'.
	 * @see fsmTrace.Steps.Fsm_NumberGuard_Holds
	 * @generated
	 */
	EClass getFsm_NumberGuard_Holds();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues <em>Fsm State Machine Assign Initial Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Assign Initial Values</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues
	 * @generated
	 */
	EClass getFsm_StateMachine_AssignInitialValues();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Step <em>Fsm State Machine Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Step</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step
	 * @generated
	 */
	EClass getFsm_StateMachine_Step();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep <em>Fsm State Machine Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Step Abstract Sub Step</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep
	 * @generated
	 */
	EClass getFsm_StateMachine_Step_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Step_ImplicitStep <em>Fsm State Machine Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Step Implicit Step</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step_ImplicitStep
	 * @generated
	 */
	EClass getFsm_StateMachine_Step_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Transition_Fire <em>Fsm Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Transition Fire</em>'.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire
	 * @generated
	 */
	EClass getFsm_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep <em>Fsm Transition Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Transition Fire Abstract Sub Step</em>'.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep
	 * @generated
	 */
	EClass getFsm_Transition_Fire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Transition_Fire_ImplicitStep <em>Fsm Transition Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Transition Fire Implicit Step</em>'.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire_ImplicitStep
	 * @generated
	 */
	EClass getFsm_Transition_Fire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see fsmTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see fsmTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see fsmTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see fsmTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_AssignValueAction_ExecuteImpl <em>Fsm Assign Value Action Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_AssignValueAction_ExecuteImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_AssignValueAction_Execute()
		 * @generated
		 */
		EClass FSM_ASSIGN_VALUE_ACTION_EXECUTE = eINSTANCE.getFsm_AssignValueAction_Execute();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_DecreaseValueAction_ExecuteImpl <em>Fsm Decrease Value Action Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_DecreaseValueAction_ExecuteImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_DecreaseValueAction_Execute()
		 * @generated
		 */
		EClass FSM_DECREASE_VALUE_ACTION_EXECUTE = eINSTANCE.getFsm_DecreaseValueAction_Execute();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_EqualNumberGuard_HoldsImpl <em>Fsm Equal Number Guard Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_EqualNumberGuard_HoldsImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_EqualNumberGuard_Holds()
		 * @generated
		 */
		EClass FSM_EQUAL_NUMBER_GUARD_HOLDS = eINSTANCE.getFsm_EqualNumberGuard_Holds();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_GreaterThanNumberGuard_HoldsImpl <em>Fsm Greater Than Number Guard Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_GreaterThanNumberGuard_HoldsImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_GreaterThanNumberGuard_Holds()
		 * @generated
		 */
		EClass FSM_GREATER_THAN_NUMBER_GUARD_HOLDS = eINSTANCE.getFsm_GreaterThanNumberGuard_Holds();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_Guard_HoldsImpl <em>Fsm Guard Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_Guard_HoldsImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Guard_Holds()
		 * @generated
		 */
		EClass FSM_GUARD_HOLDS = eINSTANCE.getFsm_Guard_Holds();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_IncreaseValueAction_ExecuteImpl <em>Fsm Increase Value Action Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_IncreaseValueAction_ExecuteImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_IncreaseValueAction_Execute()
		 * @generated
		 */
		EClass FSM_INCREASE_VALUE_ACTION_EXECUTE = eINSTANCE.getFsm_IncreaseValueAction_Execute();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_LessThanNumberGuard_HoldsImpl <em>Fsm Less Than Number Guard Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_LessThanNumberGuard_HoldsImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_LessThanNumberGuard_Holds()
		 * @generated
		 */
		EClass FSM_LESS_THAN_NUMBER_GUARD_HOLDS = eINSTANCE.getFsm_LessThanNumberGuard_Holds();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_NumberGuard_HoldsImpl <em>Fsm Number Guard Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_NumberGuard_HoldsImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_NumberGuard_Holds()
		 * @generated
		 */
		EClass FSM_NUMBER_GUARD_HOLDS = eINSTANCE.getFsm_NumberGuard_Holds();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_AssignInitialValuesImpl <em>Fsm State Machine Assign Initial Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_AssignInitialValuesImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_AssignInitialValues()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES = eINSTANCE.getFsm_StateMachine_AssignInitialValues();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_StepImpl <em>Fsm State Machine Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_StepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_STEP = eINSTANCE.getFsm_StateMachine_Step();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep <em>Fsm State Machine Step Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP = eINSTANCE.getFsm_StateMachine_Step_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_Step_ImplicitStepImpl <em>Fsm State Machine Step Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_Step_ImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Step_ImplicitStep()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_STEP_IMPLICIT_STEP = eINSTANCE.getFsm_StateMachine_Step_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
		 * @generated
		 */
		EClass FSM_TRANSITION_FIRE = eINSTANCE.getFsm_Transition_Fire();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep <em>Fsm Transition Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getFsm_Transition_Fire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_Transition_Fire_ImplicitStepImpl <em>Fsm Transition Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_Transition_Fire_ImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire_ImplicitStep()
		 * @generated
		 */
		EClass FSM_TRANSITION_FIRE_IMPLICIT_STEP = eINSTANCE.getFsm_Transition_Fire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.SpecificStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
