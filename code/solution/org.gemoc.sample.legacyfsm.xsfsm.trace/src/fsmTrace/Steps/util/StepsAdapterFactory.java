/**
 */
package fsmTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import fsmTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseFsm_AssignValueAction_Execute(Fsm_AssignValueAction_Execute object) {
				return createFsm_AssignValueAction_ExecuteAdapter();
			}
			@Override
			public Adapter caseFsm_DecreaseValueAction_Execute(Fsm_DecreaseValueAction_Execute object) {
				return createFsm_DecreaseValueAction_ExecuteAdapter();
			}
			@Override
			public Adapter caseFsm_EqualNumberGuard_Holds(Fsm_EqualNumberGuard_Holds object) {
				return createFsm_EqualNumberGuard_HoldsAdapter();
			}
			@Override
			public Adapter caseFsm_GreaterThanNumberGuard_Holds(Fsm_GreaterThanNumberGuard_Holds object) {
				return createFsm_GreaterThanNumberGuard_HoldsAdapter();
			}
			@Override
			public Adapter caseFsm_Guard_Holds(Fsm_Guard_Holds object) {
				return createFsm_Guard_HoldsAdapter();
			}
			@Override
			public Adapter caseFsm_IncreaseValueAction_Execute(Fsm_IncreaseValueAction_Execute object) {
				return createFsm_IncreaseValueAction_ExecuteAdapter();
			}
			@Override
			public Adapter caseFsm_LessThanNumberGuard_Holds(Fsm_LessThanNumberGuard_Holds object) {
				return createFsm_LessThanNumberGuard_HoldsAdapter();
			}
			@Override
			public Adapter caseFsm_NumberGuard_Holds(Fsm_NumberGuard_Holds object) {
				return createFsm_NumberGuard_HoldsAdapter();
			}
			@Override
			public Adapter caseFsm_StateMachine_AssignInitialValues(Fsm_StateMachine_AssignInitialValues object) {
				return createFsm_StateMachine_AssignInitialValuesAdapter();
			}
			@Override
			public Adapter caseFsm_StateMachine_Step(Fsm_StateMachine_Step object) {
				return createFsm_StateMachine_StepAdapter();
			}
			@Override
			public Adapter caseFsm_StateMachine_Step_AbstractSubStep(Fsm_StateMachine_Step_AbstractSubStep object) {
				return createFsm_StateMachine_Step_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFsm_StateMachine_Step_ImplicitStep(Fsm_StateMachine_Step_ImplicitStep object) {
				return createFsm_StateMachine_Step_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseFsm_Transition_Fire(Fsm_Transition_Fire object) {
				return createFsm_Transition_FireAdapter();
			}
			@Override
			public Adapter caseFsm_Transition_Fire_AbstractSubStep(Fsm_Transition_Fire_AbstractSubStep object) {
				return createFsm_Transition_Fire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseFsm_Transition_Fire_ImplicitStep(Fsm_Transition_Fire_ImplicitStep object) {
				return createFsm_Transition_Fire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_AssignValueAction_Execute <em>Fsm Assign Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_AssignValueAction_Execute
	 * @generated
	 */
	public Adapter createFsm_AssignValueAction_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_DecreaseValueAction_Execute <em>Fsm Decrease Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_DecreaseValueAction_Execute
	 * @generated
	 */
	public Adapter createFsm_DecreaseValueAction_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_EqualNumberGuard_Holds <em>Fsm Equal Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_EqualNumberGuard_Holds
	 * @generated
	 */
	public Adapter createFsm_EqualNumberGuard_HoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds <em>Fsm Greater Than Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds
	 * @generated
	 */
	public Adapter createFsm_GreaterThanNumberGuard_HoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_Guard_Holds <em>Fsm Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_Guard_Holds
	 * @generated
	 */
	public Adapter createFsm_Guard_HoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_IncreaseValueAction_Execute <em>Fsm Increase Value Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_IncreaseValueAction_Execute
	 * @generated
	 */
	public Adapter createFsm_IncreaseValueAction_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds <em>Fsm Less Than Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds
	 * @generated
	 */
	public Adapter createFsm_LessThanNumberGuard_HoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_NumberGuard_Holds <em>Fsm Number Guard Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_NumberGuard_Holds
	 * @generated
	 */
	public Adapter createFsm_NumberGuard_HoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues <em>Fsm State Machine Assign Initial Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues
	 * @generated
	 */
	public Adapter createFsm_StateMachine_AssignInitialValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_StateMachine_Step <em>Fsm State Machine Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step
	 * @generated
	 */
	public Adapter createFsm_StateMachine_StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep <em>Fsm State Machine Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step_AbstractSubStep
	 * @generated
	 */
	public Adapter createFsm_StateMachine_Step_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_StateMachine_Step_ImplicitStep <em>Fsm State Machine Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Step_ImplicitStep
	 * @generated
	 */
	public Adapter createFsm_StateMachine_Step_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_Transition_Fire <em>Fsm Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire
	 * @generated
	 */
	public Adapter createFsm_Transition_FireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep <em>Fsm Transition Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire_AbstractSubStep
	 * @generated
	 */
	public Adapter createFsm_Transition_Fire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.Fsm_Transition_Fire_ImplicitStep <em>Fsm Transition Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire_ImplicitStep
	 * @generated
	 */
	public Adapter createFsm_Transition_Fire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fsmTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
