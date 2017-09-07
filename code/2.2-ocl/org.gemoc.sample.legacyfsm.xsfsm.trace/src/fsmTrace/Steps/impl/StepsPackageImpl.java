/**
 */
package fsmTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmTrace.FsmTracePackage;

import fsmTrace.States.StatesPackage;

import fsmTrace.States.impl.StatesPackageImpl;

import fsmTrace.Steps.Fsm_AssignValueAction_Execute;
import fsmTrace.Steps.Fsm_DecreaseValueAction_Execute;
import fsmTrace.Steps.Fsm_EqualNumberGuard_Holds;
import fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds;
import fsmTrace.Steps.Fsm_Guard_Holds;
import fsmTrace.Steps.Fsm_IncreaseValueAction_Execute;
import fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds;
import fsmTrace.Steps.Fsm_NumberGuard_Holds;
import fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues;
import fsmTrace.Steps.Fsm_StateMachine_Step;
import fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep;
import fsmTrace.Steps.Fsm_StateMachine_Step_ImplicitStep;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep;
import fsmTrace.Steps.Fsm_Transition_Fire_ImplicitStep;
import fsmTrace.Steps.RootImplicitStep;
import fsmTrace.Steps.SpecificStep;
import fsmTrace.Steps.StepsFactory;
import fsmTrace.Steps.StepsPackage;

import fsmTrace.impl.FsmTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_AssignValueAction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_DecreaseValueAction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_EqualNumberGuard_HoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_GreaterThanNumberGuard_HoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_Guard_HoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_IncreaseValueAction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_LessThanNumberGuard_HoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_NumberGuard_HoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_AssignInitialValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_Step_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_Step_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_Transition_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_Transition_Fire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_Transition_Fire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fsmTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmTracePackageImpl theFsmTracePackage = (FsmTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) instanceof FsmTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) : FsmTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theFsmTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theFsmTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_AssignValueAction_Execute() {
		return fsm_AssignValueAction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_DecreaseValueAction_Execute() {
		return fsm_DecreaseValueAction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_EqualNumberGuard_Holds() {
		return fsm_EqualNumberGuard_HoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_GreaterThanNumberGuard_Holds() {
		return fsm_GreaterThanNumberGuard_HoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_Guard_Holds() {
		return fsm_Guard_HoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_IncreaseValueAction_Execute() {
		return fsm_IncreaseValueAction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_LessThanNumberGuard_Holds() {
		return fsm_LessThanNumberGuard_HoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_NumberGuard_Holds() {
		return fsm_NumberGuard_HoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_AssignInitialValues() {
		return fsm_StateMachine_AssignInitialValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Step() {
		return fsm_StateMachine_StepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Step_AbstractSubStep() {
		return fsm_StateMachine_Step_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Step_ImplicitStep() {
		return fsm_StateMachine_Step_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_Transition_Fire() {
		return fsm_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_Transition_Fire_AbstractSubStep() {
		return fsm_Transition_Fire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_Transition_Fire_ImplicitStep() {
		return fsm_Transition_Fire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fsm_AssignValueAction_ExecuteEClass = createEClass(FSM_ASSIGN_VALUE_ACTION_EXECUTE);

		fsm_DecreaseValueAction_ExecuteEClass = createEClass(FSM_DECREASE_VALUE_ACTION_EXECUTE);

		fsm_EqualNumberGuard_HoldsEClass = createEClass(FSM_EQUAL_NUMBER_GUARD_HOLDS);

		fsm_GreaterThanNumberGuard_HoldsEClass = createEClass(FSM_GREATER_THAN_NUMBER_GUARD_HOLDS);

		fsm_Guard_HoldsEClass = createEClass(FSM_GUARD_HOLDS);

		fsm_IncreaseValueAction_ExecuteEClass = createEClass(FSM_INCREASE_VALUE_ACTION_EXECUTE);

		fsm_LessThanNumberGuard_HoldsEClass = createEClass(FSM_LESS_THAN_NUMBER_GUARD_HOLDS);

		fsm_NumberGuard_HoldsEClass = createEClass(FSM_NUMBER_GUARD_HOLDS);

		fsm_StateMachine_AssignInitialValuesEClass = createEClass(FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES);

		fsm_StateMachine_StepEClass = createEClass(FSM_STATE_MACHINE_STEP);

		fsm_StateMachine_Step_AbstractSubStepEClass = createEClass(FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP);

		fsm_StateMachine_Step_ImplicitStepEClass = createEClass(FSM_STATE_MACHINE_STEP_IMPLICIT_STEP);

		fsm_Transition_FireEClass = createEClass(FSM_TRANSITION_FIRE);

		fsm_Transition_Fire_AbstractSubStepEClass = createEClass(FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP);

		fsm_Transition_Fire_ImplicitStepEClass = createEClass(FSM_TRANSITION_FIRE_IMPLICIT_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		FsmPackage theFsmPackage = (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fsm_AssignValueAction_ExecuteEClass.getESuperTypes().add(this.getFsm_Transition_Fire_AbstractSubStep());
		fsm_AssignValueAction_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_AssignValueAction_ExecuteEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_DecreaseValueAction_ExecuteEClass.getESuperTypes().add(this.getFsm_Transition_Fire_AbstractSubStep());
		fsm_DecreaseValueAction_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_DecreaseValueAction_ExecuteEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_EqualNumberGuard_HoldsEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_EqualNumberGuard_HoldsEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_EqualNumberGuard_HoldsEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_GreaterThanNumberGuard_HoldsEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_GreaterThanNumberGuard_HoldsEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_GreaterThanNumberGuard_HoldsEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_Guard_HoldsEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_Guard_HoldsEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_Guard_HoldsEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_IncreaseValueAction_ExecuteEClass.getESuperTypes().add(this.getFsm_Transition_Fire_AbstractSubStep());
		fsm_IncreaseValueAction_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_IncreaseValueAction_ExecuteEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_LessThanNumberGuard_HoldsEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_LessThanNumberGuard_HoldsEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_LessThanNumberGuard_HoldsEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_NumberGuard_HoldsEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_NumberGuard_HoldsEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_NumberGuard_HoldsEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_StateMachine_AssignInitialValuesEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_StateMachine_AssignInitialValuesEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		fsm_StateMachine_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getFsm_StateMachine_Step_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		fsm_StateMachine_StepEClass.getEGenericSuperTypes().add(g1);
		fsm_StateMachine_Step_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_StateMachine_Step_ImplicitStepEClass.getESuperTypes().add(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_StateMachine_Step_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getFsm_StateMachine_Step_AbstractSubStep());
		fsm_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		fsm_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getFsm_Transition_Fire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		fsm_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		fsm_Transition_Fire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_Transition_Fire_ImplicitStepEClass.getESuperTypes().add(this.getFsm_Transition_Fire_AbstractSubStep());
		fsm_Transition_Fire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(fsm_AssignValueAction_ExecuteEClass, Fsm_AssignValueAction_Execute.class, "Fsm_AssignValueAction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_AssignValueAction_ExecuteEClass, theFsmPackage.getAssignValueAction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_DecreaseValueAction_ExecuteEClass, Fsm_DecreaseValueAction_Execute.class, "Fsm_DecreaseValueAction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_DecreaseValueAction_ExecuteEClass, theFsmPackage.getDecreaseValueAction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_EqualNumberGuard_HoldsEClass, Fsm_EqualNumberGuard_Holds.class, "Fsm_EqualNumberGuard_Holds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_EqualNumberGuard_HoldsEClass, theFsmPackage.getEqualNumberGuard(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_GreaterThanNumberGuard_HoldsEClass, Fsm_GreaterThanNumberGuard_Holds.class, "Fsm_GreaterThanNumberGuard_Holds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_GreaterThanNumberGuard_HoldsEClass, theFsmPackage.getGreaterThanNumberGuard(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_Guard_HoldsEClass, Fsm_Guard_Holds.class, "Fsm_Guard_Holds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_Guard_HoldsEClass, theFsmPackage.getGuard(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_IncreaseValueAction_ExecuteEClass, Fsm_IncreaseValueAction_Execute.class, "Fsm_IncreaseValueAction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_IncreaseValueAction_ExecuteEClass, theFsmPackage.getIncreaseValueAction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_LessThanNumberGuard_HoldsEClass, Fsm_LessThanNumberGuard_Holds.class, "Fsm_LessThanNumberGuard_Holds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_LessThanNumberGuard_HoldsEClass, theFsmPackage.getLessThanNumberGuard(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_NumberGuard_HoldsEClass, Fsm_NumberGuard_Holds.class, "Fsm_NumberGuard_Holds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_NumberGuard_HoldsEClass, theFsmPackage.getNumberGuard(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_StateMachine_AssignInitialValuesEClass, Fsm_StateMachine_AssignInitialValues.class, "Fsm_StateMachine_AssignInitialValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_StateMachine_AssignInitialValuesEClass, theFsmPackage.getStateMachine(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_StateMachine_StepEClass, Fsm_StateMachine_Step.class, "Fsm_StateMachine_Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_StateMachine_StepEClass, theFsmPackage.getStateMachine(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_StateMachine_Step_AbstractSubStepEClass, Fsm_StateMachine_Step_AbstractSubStep.class, "Fsm_StateMachine_Step_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_StateMachine_Step_ImplicitStepEClass, Fsm_StateMachine_Step_ImplicitStep.class, "Fsm_StateMachine_Step_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_Transition_FireEClass, Fsm_Transition_Fire.class, "Fsm_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_Transition_FireEClass, theFsmPackage.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_Transition_Fire_AbstractSubStepEClass, Fsm_Transition_Fire_AbstractSubStep.class, "Fsm_Transition_Fire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_Transition_Fire_ImplicitStepEClass, Fsm_Transition_Fire_ImplicitStep.class, "Fsm_Transition_Fire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
