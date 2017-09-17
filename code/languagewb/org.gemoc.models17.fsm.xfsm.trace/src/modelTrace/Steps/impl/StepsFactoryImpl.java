/**
 */
package modelTrace.Steps.impl;

import modelTrace.Steps.*;

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
			case StepsPackage.MODEL_FSM_RUN: return createModel_FSM_Run();
			case StepsPackage.MODEL_FSM_RUN_IMPLICIT_STEP: return createModel_FSM_Run_ImplicitStep();
			case StepsPackage.MODEL_STATE_STEP: return createModel_State_Step();
			case StepsPackage.MODEL_STATE_STEP_IMPLICIT_STEP: return createModel_State_Step_ImplicitStep();
			case StepsPackage.MODEL_TRANSITION_FIRE: return createModel_Transition_Fire();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.ROOT_INITIALIZE: return createRoot_Initialize();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_FSM_Run createModel_FSM_Run() {
		Model_FSM_RunImpl model_FSM_Run = new Model_FSM_RunImpl();
		return model_FSM_Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_FSM_Run_ImplicitStep createModel_FSM_Run_ImplicitStep() {
		Model_FSM_Run_ImplicitStepImpl model_FSM_Run_ImplicitStep = new Model_FSM_Run_ImplicitStepImpl();
		return model_FSM_Run_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_State_Step createModel_State_Step() {
		Model_State_StepImpl model_State_Step = new Model_State_StepImpl();
		return model_State_Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_State_Step_ImplicitStep createModel_State_Step_ImplicitStep() {
		Model_State_Step_ImplicitStepImpl model_State_Step_ImplicitStep = new Model_State_Step_ImplicitStepImpl();
		return model_State_Step_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_Transition_Fire createModel_Transition_Fire() {
		Model_Transition_FireImpl model_Transition_Fire = new Model_Transition_FireImpl();
		return model_Transition_Fire;
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
	public Root_Initialize createRoot_Initialize() {
		Root_InitializeImpl root_Initialize = new Root_InitializeImpl();
		return root_Initialize;
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
