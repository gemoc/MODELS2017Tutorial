/**
 */
package fsmTrace.States.fsm.impl;

import fsmTrace.States.fsm.FsmPackage;
import fsmTrace.States.fsm.TracedVariable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TracedVariableImpl extends MinimalEObjectImpl.Container implements TracedVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRACED_VARIABLE;
	}

} //TracedVariableImpl
