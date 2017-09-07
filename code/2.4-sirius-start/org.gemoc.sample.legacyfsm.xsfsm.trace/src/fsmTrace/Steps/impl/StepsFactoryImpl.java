/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.FSM_ASSIGN_VALUE_ACTION_EXECUTE: return createFsm_AssignValueAction_Execute();
			case StepsPackage.FSM_DECREASE_VALUE_ACTION_EXECUTE: return createFsm_DecreaseValueAction_Execute();
			case StepsPackage.FSM_EQUAL_NUMBER_GUARD_HOLDS: return createFsm_EqualNumberGuard_Holds();
			case StepsPackage.FSM_GREATER_THAN_NUMBER_GUARD_HOLDS: return createFsm_GreaterThanNumberGuard_Holds();
			case StepsPackage.FSM_GUARD_HOLDS: return createFsm_Guard_Holds();
			case StepsPackage.FSM_INCREASE_VALUE_ACTION_EXECUTE: return createFsm_IncreaseValueAction_Execute();
			case StepsPackage.FSM_LESS_THAN_NUMBER_GUARD_HOLDS: return createFsm_LessThanNumberGuard_Holds();
			case StepsPackage.FSM_NUMBER_GUARD_HOLDS: return createFsm_NumberGuard_Holds();
			case StepsPackage.FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES: return createFsm_StateMachine_AssignInitialValues();
			case StepsPackage.FSM_STATE_MACHINE_STEP: return createFsm_StateMachine_Step();
			case StepsPackage.FSM_STATE_MACHINE_STEP_IMPLICIT_STEP: return createFsm_StateMachine_Step_ImplicitStep();
			case StepsPackage.FSM_TRANSITION_FIRE: return createFsm_Transition_Fire();
			case StepsPackage.FSM_TRANSITION_FIRE_IMPLICIT_STEP: return createFsm_Transition_Fire_ImplicitStep();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_AssignValueAction_Execute createFsm_AssignValueAction_Execute() {
		Fsm_AssignValueAction_ExecuteImpl fsm_AssignValueAction_Execute = new Fsm_AssignValueAction_ExecuteImpl();
		return fsm_AssignValueAction_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_DecreaseValueAction_Execute createFsm_DecreaseValueAction_Execute() {
		Fsm_DecreaseValueAction_ExecuteImpl fsm_DecreaseValueAction_Execute = new Fsm_DecreaseValueAction_ExecuteImpl();
		return fsm_DecreaseValueAction_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_EqualNumberGuard_Holds createFsm_EqualNumberGuard_Holds() {
		Fsm_EqualNumberGuard_HoldsImpl fsm_EqualNumberGuard_Holds = new Fsm_EqualNumberGuard_HoldsImpl();
		return fsm_EqualNumberGuard_Holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_GreaterThanNumberGuard_Holds createFsm_GreaterThanNumberGuard_Holds() {
		Fsm_GreaterThanNumberGuard_HoldsImpl fsm_GreaterThanNumberGuard_Holds = new Fsm_GreaterThanNumberGuard_HoldsImpl();
		return fsm_GreaterThanNumberGuard_Holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_Guard_Holds createFsm_Guard_Holds() {
		Fsm_Guard_HoldsImpl fsm_Guard_Holds = new Fsm_Guard_HoldsImpl();
		return fsm_Guard_Holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_IncreaseValueAction_Execute createFsm_IncreaseValueAction_Execute() {
		Fsm_IncreaseValueAction_ExecuteImpl fsm_IncreaseValueAction_Execute = new Fsm_IncreaseValueAction_ExecuteImpl();
		return fsm_IncreaseValueAction_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_LessThanNumberGuard_Holds createFsm_LessThanNumberGuard_Holds() {
		Fsm_LessThanNumberGuard_HoldsImpl fsm_LessThanNumberGuard_Holds = new Fsm_LessThanNumberGuard_HoldsImpl();
		return fsm_LessThanNumberGuard_Holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_NumberGuard_Holds createFsm_NumberGuard_Holds() {
		Fsm_NumberGuard_HoldsImpl fsm_NumberGuard_Holds = new Fsm_NumberGuard_HoldsImpl();
		return fsm_NumberGuard_Holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_StateMachine_AssignInitialValues createFsm_StateMachine_AssignInitialValues() {
		Fsm_StateMachine_AssignInitialValuesImpl fsm_StateMachine_AssignInitialValues = new Fsm_StateMachine_AssignInitialValuesImpl();
		return fsm_StateMachine_AssignInitialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_StateMachine_Step createFsm_StateMachine_Step() {
		Fsm_StateMachine_StepImpl fsm_StateMachine_Step = new Fsm_StateMachine_StepImpl();
		return fsm_StateMachine_Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_StateMachine_Step_ImplicitStep createFsm_StateMachine_Step_ImplicitStep() {
		Fsm_StateMachine_Step_ImplicitStepImpl fsm_StateMachine_Step_ImplicitStep = new Fsm_StateMachine_Step_ImplicitStepImpl();
		return fsm_StateMachine_Step_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_Transition_Fire createFsm_Transition_Fire() {
		Fsm_Transition_FireImpl fsm_Transition_Fire = new Fsm_Transition_FireImpl();
		return fsm_Transition_Fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_Transition_Fire_ImplicitStep createFsm_Transition_Fire_ImplicitStep() {
		Fsm_Transition_Fire_ImplicitStepImpl fsm_Transition_Fire_ImplicitStep = new Fsm_Transition_Fire_ImplicitStepImpl();
		return fsm_Transition_Fire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
