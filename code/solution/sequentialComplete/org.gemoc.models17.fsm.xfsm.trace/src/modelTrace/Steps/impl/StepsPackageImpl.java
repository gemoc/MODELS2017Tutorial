/**
 */
package modelTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import modelTrace.ModelTracePackage;

import modelTrace.States.StatesPackage;

import modelTrace.States.impl.StatesPackageImpl;

import modelTrace.States.model.impl.ModelPackageImpl;

import modelTrace.Steps.Model_FSM_Run;
import modelTrace.Steps.Model_FSM_Run_AbstractSubStep;
import modelTrace.Steps.Model_FSM_Run_ImplicitStep;
import modelTrace.Steps.Model_State_Step;
import modelTrace.Steps.Model_State_Step_AbstractSubStep;
import modelTrace.Steps.Model_State_Step_ImplicitStep;
import modelTrace.Steps.Model_Transition_Fire;
import modelTrace.Steps.RootImplicitStep;
import modelTrace.Steps.Root_Initialize;
import modelTrace.Steps.SpecificStep;
import modelTrace.Steps.StepsFactory;
import modelTrace.Steps.StepsPackage;

import modelTrace.impl.ModelTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.models17.fsm.xfsm.model.ModelPackage;

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
	private EClass model_FSM_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_FSM_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_FSM_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_State_StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_State_Step_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_State_Step_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_Transition_FireEClass = null;

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
	private EClass root_InitializeEClass = null;

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
	 * @see modelTrace.Steps.StepsPackage#eNS_URI
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
		ModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelTracePackageImpl theModelTracePackage = (ModelTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelTracePackage.eNS_URI) instanceof ModelTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelTracePackage.eNS_URI) : ModelTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ModelPackageImpl theModelPackage_1 = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI) : modelTrace.States.model.ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theModelTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theModelPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theModelTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();

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
	public EClass getModel_FSM_Run() {
		return model_FSM_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_FSM_Run_AbstractSubStep() {
		return model_FSM_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_FSM_Run_ImplicitStep() {
		return model_FSM_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_State_Step() {
		return model_State_StepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_State_Step_AbstractSubStep() {
		return model_State_Step_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_State_Step_ImplicitStep() {
		return model_State_Step_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel_Transition_Fire() {
		return model_Transition_FireEClass;
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
	public EClass getRoot_Initialize() {
		return root_InitializeEClass;
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
		model_FSM_RunEClass = createEClass(MODEL_FSM_RUN);

		model_FSM_Run_AbstractSubStepEClass = createEClass(MODEL_FSM_RUN_ABSTRACT_SUB_STEP);

		model_FSM_Run_ImplicitStepEClass = createEClass(MODEL_FSM_RUN_IMPLICIT_STEP);

		model_State_StepEClass = createEClass(MODEL_STATE_STEP);

		model_State_Step_AbstractSubStepEClass = createEClass(MODEL_STATE_STEP_ABSTRACT_SUB_STEP);

		model_State_Step_ImplicitStepEClass = createEClass(MODEL_STATE_STEP_IMPLICIT_STEP);

		model_Transition_FireEClass = createEClass(MODEL_TRANSITION_FIRE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		root_InitializeEClass = createEClass(ROOT_INITIALIZE);

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
		modelTrace.States.model.ModelPackage theModelPackage_1 = (modelTrace.States.model.ModelPackage)EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		model_FSM_RunEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getModel_FSM_Run_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		model_FSM_RunEClass.getEGenericSuperTypes().add(g1);
		model_FSM_Run_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		model_FSM_Run_ImplicitStepEClass.getESuperTypes().add(this.getModel_FSM_Run_AbstractSubStep());
		model_FSM_Run_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getModel_FSM_Run_AbstractSubStep());
		model_State_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		model_State_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getModel_State_Step_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		model_State_StepEClass.getEGenericSuperTypes().add(g1);
		model_State_Step_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		model_State_Step_ImplicitStepEClass.getESuperTypes().add(this.getModel_State_Step_AbstractSubStep());
		model_State_Step_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		model_Transition_FireEClass.getESuperTypes().add(this.getModel_State_Step_AbstractSubStep());
		model_Transition_FireEClass.getESuperTypes().add(this.getSpecificStep());
		model_Transition_FireEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		root_InitializeEClass.getESuperTypes().add(this.getSpecificStep());
		root_InitializeEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(model_FSM_RunEClass, Model_FSM_Run.class, "Model_FSM_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(model_FSM_RunEClass, theModelPackage_1.getTracedFSM(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(model_FSM_Run_AbstractSubStepEClass, Model_FSM_Run_AbstractSubStep.class, "Model_FSM_Run_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model_FSM_Run_ImplicitStepEClass, Model_FSM_Run_ImplicitStep.class, "Model_FSM_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model_State_StepEClass, Model_State_Step.class, "Model_State_Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(model_State_StepEClass, theModelPackage.getState(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(model_State_Step_AbstractSubStepEClass, Model_State_Step_AbstractSubStep.class, "Model_State_Step_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model_State_Step_ImplicitStepEClass, Model_State_Step_ImplicitStep.class, "Model_State_Step_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(model_Transition_FireEClass, Model_Transition_Fire.class, "Model_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(model_Transition_FireEClass, theModelPackage.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(root_InitializeEClass, Root_Initialize.class, "Root_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
