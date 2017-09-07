/**
 */
package fsmTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import fsmTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.FSM_ASSIGN_VALUE_ACTION_EXECUTE: {
				Fsm_AssignValueAction_Execute fsm_AssignValueAction_Execute = (Fsm_AssignValueAction_Execute)theEObject;
				T result = caseFsm_AssignValueAction_Execute(fsm_AssignValueAction_Execute);
				if (result == null) result = caseSmallStep(fsm_AssignValueAction_Execute);
				if (result == null) result = caseFsm_Transition_Fire_AbstractSubStep(fsm_AssignValueAction_Execute);
				if (result == null) result = caseSpecificStep(fsm_AssignValueAction_Execute);
				if (result == null) result = caseStep(fsm_AssignValueAction_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_DECREASE_VALUE_ACTION_EXECUTE: {
				Fsm_DecreaseValueAction_Execute fsm_DecreaseValueAction_Execute = (Fsm_DecreaseValueAction_Execute)theEObject;
				T result = caseFsm_DecreaseValueAction_Execute(fsm_DecreaseValueAction_Execute);
				if (result == null) result = caseSmallStep(fsm_DecreaseValueAction_Execute);
				if (result == null) result = caseFsm_Transition_Fire_AbstractSubStep(fsm_DecreaseValueAction_Execute);
				if (result == null) result = caseSpecificStep(fsm_DecreaseValueAction_Execute);
				if (result == null) result = caseStep(fsm_DecreaseValueAction_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_EQUAL_NUMBER_GUARD_HOLDS: {
				Fsm_EqualNumberGuard_Holds fsm_EqualNumberGuard_Holds = (Fsm_EqualNumberGuard_Holds)theEObject;
				T result = caseFsm_EqualNumberGuard_Holds(fsm_EqualNumberGuard_Holds);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_EqualNumberGuard_Holds);
				if (result == null) result = caseSmallStep(fsm_EqualNumberGuard_Holds);
				if (result == null) result = caseSpecificStep(fsm_EqualNumberGuard_Holds);
				if (result == null) result = caseStep(fsm_EqualNumberGuard_Holds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_GREATER_THAN_NUMBER_GUARD_HOLDS: {
				Fsm_GreaterThanNumberGuard_Holds fsm_GreaterThanNumberGuard_Holds = (Fsm_GreaterThanNumberGuard_Holds)theEObject;
				T result = caseFsm_GreaterThanNumberGuard_Holds(fsm_GreaterThanNumberGuard_Holds);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_GreaterThanNumberGuard_Holds);
				if (result == null) result = caseSmallStep(fsm_GreaterThanNumberGuard_Holds);
				if (result == null) result = caseSpecificStep(fsm_GreaterThanNumberGuard_Holds);
				if (result == null) result = caseStep(fsm_GreaterThanNumberGuard_Holds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_GUARD_HOLDS: {
				Fsm_Guard_Holds fsm_Guard_Holds = (Fsm_Guard_Holds)theEObject;
				T result = caseFsm_Guard_Holds(fsm_Guard_Holds);
				if (result == null) result = caseSmallStep(fsm_Guard_Holds);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_Guard_Holds);
				if (result == null) result = caseSpecificStep(fsm_Guard_Holds);
				if (result == null) result = caseStep(fsm_Guard_Holds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_INCREASE_VALUE_ACTION_EXECUTE: {
				Fsm_IncreaseValueAction_Execute fsm_IncreaseValueAction_Execute = (Fsm_IncreaseValueAction_Execute)theEObject;
				T result = caseFsm_IncreaseValueAction_Execute(fsm_IncreaseValueAction_Execute);
				if (result == null) result = caseSmallStep(fsm_IncreaseValueAction_Execute);
				if (result == null) result = caseFsm_Transition_Fire_AbstractSubStep(fsm_IncreaseValueAction_Execute);
				if (result == null) result = caseSpecificStep(fsm_IncreaseValueAction_Execute);
				if (result == null) result = caseStep(fsm_IncreaseValueAction_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_LESS_THAN_NUMBER_GUARD_HOLDS: {
				Fsm_LessThanNumberGuard_Holds fsm_LessThanNumberGuard_Holds = (Fsm_LessThanNumberGuard_Holds)theEObject;
				T result = caseFsm_LessThanNumberGuard_Holds(fsm_LessThanNumberGuard_Holds);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_LessThanNumberGuard_Holds);
				if (result == null) result = caseSmallStep(fsm_LessThanNumberGuard_Holds);
				if (result == null) result = caseSpecificStep(fsm_LessThanNumberGuard_Holds);
				if (result == null) result = caseStep(fsm_LessThanNumberGuard_Holds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_NUMBER_GUARD_HOLDS: {
				Fsm_NumberGuard_Holds fsm_NumberGuard_Holds = (Fsm_NumberGuard_Holds)theEObject;
				T result = caseFsm_NumberGuard_Holds(fsm_NumberGuard_Holds);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_NumberGuard_Holds);
				if (result == null) result = caseSmallStep(fsm_NumberGuard_Holds);
				if (result == null) result = caseSpecificStep(fsm_NumberGuard_Holds);
				if (result == null) result = caseStep(fsm_NumberGuard_Holds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES: {
				Fsm_StateMachine_AssignInitialValues fsm_StateMachine_AssignInitialValues = (Fsm_StateMachine_AssignInitialValues)theEObject;
				T result = caseFsm_StateMachine_AssignInitialValues(fsm_StateMachine_AssignInitialValues);
				if (result == null) result = caseSpecificStep(fsm_StateMachine_AssignInitialValues);
				if (result == null) result = caseSmallStep(fsm_StateMachine_AssignInitialValues);
				if (result == null) result = caseStep(fsm_StateMachine_AssignInitialValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_STATE_MACHINE_STEP: {
				Fsm_StateMachine_Step fsm_StateMachine_Step = (Fsm_StateMachine_Step)theEObject;
				T result = caseFsm_StateMachine_Step(fsm_StateMachine_Step);
				if (result == null) result = caseSpecificStep(fsm_StateMachine_Step);
				if (result == null) result = caseSequentialStep(fsm_StateMachine_Step);
				if (result == null) result = caseBigStep(fsm_StateMachine_Step);
				if (result == null) result = caseStep(fsm_StateMachine_Step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_STATE_MACHINE_STEP_ABSTRACT_SUB_STEP: {
				Fsm_StateMachine_Step_AbstractSubStep fsm_StateMachine_Step_AbstractSubStep = (Fsm_StateMachine_Step_AbstractSubStep)theEObject;
				T result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_StateMachine_Step_AbstractSubStep);
				if (result == null) result = caseSpecificStep(fsm_StateMachine_Step_AbstractSubStep);
				if (result == null) result = caseStep(fsm_StateMachine_Step_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_STATE_MACHINE_STEP_IMPLICIT_STEP: {
				Fsm_StateMachine_Step_ImplicitStep fsm_StateMachine_Step_ImplicitStep = (Fsm_StateMachine_Step_ImplicitStep)theEObject;
				T result = caseFsm_StateMachine_Step_ImplicitStep(fsm_StateMachine_Step_ImplicitStep);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_StateMachine_Step_ImplicitStep);
				if (result == null) result = caseSmallStep(fsm_StateMachine_Step_ImplicitStep);
				if (result == null) result = caseSpecificStep(fsm_StateMachine_Step_ImplicitStep);
				if (result == null) result = caseStep(fsm_StateMachine_Step_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_TRANSITION_FIRE: {
				Fsm_Transition_Fire fsm_Transition_Fire = (Fsm_Transition_Fire)theEObject;
				T result = caseFsm_Transition_Fire(fsm_Transition_Fire);
				if (result == null) result = caseSequentialStep(fsm_Transition_Fire);
				if (result == null) result = caseFsm_StateMachine_Step_AbstractSubStep(fsm_Transition_Fire);
				if (result == null) result = caseSpecificStep(fsm_Transition_Fire);
				if (result == null) result = caseBigStep(fsm_Transition_Fire);
				if (result == null) result = caseStep(fsm_Transition_Fire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_TRANSITION_FIRE_ABSTRACT_SUB_STEP: {
				Fsm_Transition_Fire_AbstractSubStep fsm_Transition_Fire_AbstractSubStep = (Fsm_Transition_Fire_AbstractSubStep)theEObject;
				T result = caseFsm_Transition_Fire_AbstractSubStep(fsm_Transition_Fire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(fsm_Transition_Fire_AbstractSubStep);
				if (result == null) result = caseStep(fsm_Transition_Fire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FSM_TRANSITION_FIRE_IMPLICIT_STEP: {
				Fsm_Transition_Fire_ImplicitStep fsm_Transition_Fire_ImplicitStep = (Fsm_Transition_Fire_ImplicitStep)theEObject;
				T result = caseFsm_Transition_Fire_ImplicitStep(fsm_Transition_Fire_ImplicitStep);
				if (result == null) result = caseFsm_Transition_Fire_AbstractSubStep(fsm_Transition_Fire_ImplicitStep);
				if (result == null) result = caseSmallStep(fsm_Transition_Fire_ImplicitStep);
				if (result == null) result = caseSpecificStep(fsm_Transition_Fire_ImplicitStep);
				if (result == null) result = caseStep(fsm_Transition_Fire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Assign Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Assign Value Action Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_AssignValueAction_Execute(Fsm_AssignValueAction_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Decrease Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Decrease Value Action Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_DecreaseValueAction_Execute(Fsm_DecreaseValueAction_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Equal Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Equal Number Guard Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_EqualNumberGuard_Holds(Fsm_EqualNumberGuard_Holds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Greater Than Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Greater Than Number Guard Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_GreaterThanNumberGuard_Holds(Fsm_GreaterThanNumberGuard_Holds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Guard Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_Guard_Holds(Fsm_Guard_Holds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Increase Value Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Increase Value Action Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_IncreaseValueAction_Execute(Fsm_IncreaseValueAction_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Less Than Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Less Than Number Guard Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_LessThanNumberGuard_Holds(Fsm_LessThanNumberGuard_Holds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Number Guard Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Number Guard Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_NumberGuard_Holds(Fsm_NumberGuard_Holds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm State Machine Assign Initial Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm State Machine Assign Initial Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_StateMachine_AssignInitialValues(Fsm_StateMachine_AssignInitialValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm State Machine Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm State Machine Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_StateMachine_Step(Fsm_StateMachine_Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm State Machine Step Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm State Machine Step Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_StateMachine_Step_AbstractSubStep(Fsm_StateMachine_Step_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm State Machine Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm State Machine Step Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_StateMachine_Step_ImplicitStep(Fsm_StateMachine_Step_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Transition Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_Transition_Fire(Fsm_Transition_Fire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Transition Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Transition Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_Transition_Fire_AbstractSubStep(Fsm_Transition_Fire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fsm Transition Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fsm Transition Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFsm_Transition_Fire_ImplicitStep(Fsm_Transition_Fire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
