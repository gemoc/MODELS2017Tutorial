/**
 */
package modelTrace.Steps;

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
 * @see modelTrace.Steps.StepsFactory
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
	String eNS_URI = "modelTrace_Steps";

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
	StepsPackage eINSTANCE = modelTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.SpecificStep
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 9;

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
	 * The meta object id for the '{@link modelTrace.Steps.impl.Model_FSM_RunImpl <em>Model FSM Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Model_FSM_RunImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run()
	 * @generated
	 */
	int MODEL_FSM_RUN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model FSM Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.Model_FSM_Run_AbstractSubStep <em>Model FSM Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.Model_FSM_Run_AbstractSubStep
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run_AbstractSubStep()
	 * @generated
	 */
	int MODEL_FSM_RUN_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Model FSM Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.impl.Model_FSM_Run_ImplicitStepImpl <em>Model FSM Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Model_FSM_Run_ImplicitStepImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run_ImplicitStep()
	 * @generated
	 */
	int MODEL_FSM_RUN_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_IMPLICIT_STEP__MSEOCCURRENCE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_IMPLICIT_STEP__ENDING_STATE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_IMPLICIT_STEP__STARTING_STATE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Model FSM Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FSM_RUN_IMPLICIT_STEP_FEATURE_COUNT = MODEL_FSM_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.impl.Model_State_StepImpl <em>Model State Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Model_State_StepImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step()
	 * @generated
	 */
	int MODEL_STATE_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP__MSEOCCURRENCE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP__ENDING_STATE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP__STARTING_STATE = MODEL_FSM_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP__SUB_STEPS = MODEL_FSM_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model State Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_FEATURE_COUNT = MODEL_FSM_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.Model_State_Step_AbstractSubStep <em>Model State Step Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.Model_State_Step_AbstractSubStep
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step_AbstractSubStep()
	 * @generated
	 */
	int MODEL_STATE_STEP_ABSTRACT_SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Model State Step Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.impl.Model_State_Step_ImplicitStepImpl <em>Model State Step Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Model_State_Step_ImplicitStepImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step_ImplicitStep()
	 * @generated
	 */
	int MODEL_STATE_STEP_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_IMPLICIT_STEP__MSEOCCURRENCE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_IMPLICIT_STEP__ENDING_STATE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_IMPLICIT_STEP__STARTING_STATE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Model State Step Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STATE_STEP_IMPLICIT_STEP_FEATURE_COUNT = MODEL_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.impl.Model_Transition_FireImpl <em>Model Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Model_Transition_FireImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_Transition_Fire()
	 * @generated
	 */
	int MODEL_TRANSITION_FIRE = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSITION_FIRE__MSEOCCURRENCE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSITION_FIRE__ENDING_STATE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSITION_FIRE__STARTING_STATE = MODEL_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Model Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSITION_FIRE_FEATURE_COUNT = MODEL_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.RootImplicitStepImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 7;

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
	 * The meta object id for the '{@link modelTrace.Steps.impl.Root_InitializeImpl <em>Root Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.Steps.impl.Root_InitializeImpl
	 * @see modelTrace.Steps.impl.StepsPackageImpl#getRoot_Initialize()
	 * @generated
	 */
	int ROOT_INITIALIZE = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_INITIALIZE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_INITIALIZE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_INITIALIZE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Root Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_INITIALIZE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_FSM_Run <em>Model FSM Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model FSM Run</em>'.
	 * @see modelTrace.Steps.Model_FSM_Run
	 * @generated
	 */
	EClass getModel_FSM_Run();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_FSM_Run_AbstractSubStep <em>Model FSM Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model FSM Run Abstract Sub Step</em>'.
	 * @see modelTrace.Steps.Model_FSM_Run_AbstractSubStep
	 * @generated
	 */
	EClass getModel_FSM_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_FSM_Run_ImplicitStep <em>Model FSM Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model FSM Run Implicit Step</em>'.
	 * @see modelTrace.Steps.Model_FSM_Run_ImplicitStep
	 * @generated
	 */
	EClass getModel_FSM_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_State_Step <em>Model State Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model State Step</em>'.
	 * @see modelTrace.Steps.Model_State_Step
	 * @generated
	 */
	EClass getModel_State_Step();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_State_Step_AbstractSubStep <em>Model State Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model State Step Abstract Sub Step</em>'.
	 * @see modelTrace.Steps.Model_State_Step_AbstractSubStep
	 * @generated
	 */
	EClass getModel_State_Step_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_State_Step_ImplicitStep <em>Model State Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model State Step Implicit Step</em>'.
	 * @see modelTrace.Steps.Model_State_Step_ImplicitStep
	 * @generated
	 */
	EClass getModel_State_Step_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Model_Transition_Fire <em>Model Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Transition Fire</em>'.
	 * @see modelTrace.Steps.Model_Transition_Fire
	 * @generated
	 */
	EClass getModel_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see modelTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.Root_Initialize <em>Root Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Initialize</em>'.
	 * @see modelTrace.Steps.Root_Initialize
	 * @generated
	 */
	EClass getRoot_Initialize();

	/**
	 * Returns the meta object for class '{@link modelTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see modelTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link modelTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see modelTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link modelTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see modelTrace.Steps.SpecificStep#getStartingState()
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
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Model_FSM_RunImpl <em>Model FSM Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Model_FSM_RunImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run()
		 * @generated
		 */
		EClass MODEL_FSM_RUN = eINSTANCE.getModel_FSM_Run();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.Model_FSM_Run_AbstractSubStep <em>Model FSM Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.Model_FSM_Run_AbstractSubStep
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run_AbstractSubStep()
		 * @generated
		 */
		EClass MODEL_FSM_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getModel_FSM_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Model_FSM_Run_ImplicitStepImpl <em>Model FSM Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Model_FSM_Run_ImplicitStepImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_FSM_Run_ImplicitStep()
		 * @generated
		 */
		EClass MODEL_FSM_RUN_IMPLICIT_STEP = eINSTANCE.getModel_FSM_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Model_State_StepImpl <em>Model State Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Model_State_StepImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step()
		 * @generated
		 */
		EClass MODEL_STATE_STEP = eINSTANCE.getModel_State_Step();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.Model_State_Step_AbstractSubStep <em>Model State Step Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.Model_State_Step_AbstractSubStep
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step_AbstractSubStep()
		 * @generated
		 */
		EClass MODEL_STATE_STEP_ABSTRACT_SUB_STEP = eINSTANCE.getModel_State_Step_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Model_State_Step_ImplicitStepImpl <em>Model State Step Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Model_State_Step_ImplicitStepImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_State_Step_ImplicitStep()
		 * @generated
		 */
		EClass MODEL_STATE_STEP_IMPLICIT_STEP = eINSTANCE.getModel_State_Step_ImplicitStep();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Model_Transition_FireImpl <em>Model Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Model_Transition_FireImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getModel_Transition_Fire()
		 * @generated
		 */
		EClass MODEL_TRANSITION_FIRE = eINSTANCE.getModel_Transition_Fire();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.RootImplicitStepImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.impl.Root_InitializeImpl <em>Root Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.impl.Root_InitializeImpl
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getRoot_Initialize()
		 * @generated
		 */
		EClass ROOT_INITIALIZE = eINSTANCE.getRoot_Initialize();

		/**
		 * The meta object literal for the '{@link modelTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.Steps.SpecificStep
		 * @see modelTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
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
