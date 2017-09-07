/**
 */
package org.gemoc.sample.legacyfsm.fsm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.sample.legacyfsm.fsm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmFactoryImpl extends EFactoryImpl implements FsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FsmFactory init() {
		try {
			FsmFactory theFsmFactory = (FsmFactory)EPackage.Registry.INSTANCE.getEFactory(FsmPackage.eNS_URI);
			if (theFsmFactory != null) {
				return theFsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactoryImpl() {
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
			case FsmPackage.STATE_MACHINE: return createStateMachine();
			case FsmPackage.STATE: return createState();
			case FsmPackage.TRANSITION: return createTransition();
			case FsmPackage.NUMBER_VARIABLE: return createNumberVariable();
			case FsmPackage.EQUAL_NUMBER_GUARD: return createEqualNumberGuard();
			case FsmPackage.ASSIGN_VALUE_ACTION: return createAssignValueAction();
			case FsmPackage.LESS_THAN_NUMBER_GUARD: return createLessThanNumberGuard();
			case FsmPackage.GREATER_THAN_NUMBER_GUARD: return createGreaterThanNumberGuard();
			case FsmPackage.INCREASE_VALUE_ACTION: return createIncreaseValueAction();
			case FsmPackage.DECREASE_VALUE_ACTION: return createDecreaseValueAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberVariable createNumberVariable() {
		NumberVariableImpl numberVariable = new NumberVariableImpl();
		return numberVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualNumberGuard createEqualNumberGuard() {
		EqualNumberGuardImpl equalNumberGuard = new EqualNumberGuardImpl();
		return equalNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignValueAction createAssignValueAction() {
		AssignValueActionImpl assignValueAction = new AssignValueActionImpl();
		return assignValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanNumberGuard createLessThanNumberGuard() {
		LessThanNumberGuardImpl lessThanNumberGuard = new LessThanNumberGuardImpl();
		return lessThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanNumberGuard createGreaterThanNumberGuard() {
		GreaterThanNumberGuardImpl greaterThanNumberGuard = new GreaterThanNumberGuardImpl();
		return greaterThanNumberGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreaseValueAction createIncreaseValueAction() {
		IncreaseValueActionImpl increaseValueAction = new IncreaseValueActionImpl();
		return increaseValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecreaseValueAction createDecreaseValueAction() {
		DecreaseValueActionImpl decreaseValueAction = new DecreaseValueActionImpl();
		return decreaseValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmPackage getFsmPackage() {
		return (FsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FsmPackage getPackage() {
		return FsmPackage.eINSTANCE;
	}

} //FsmFactoryImpl
