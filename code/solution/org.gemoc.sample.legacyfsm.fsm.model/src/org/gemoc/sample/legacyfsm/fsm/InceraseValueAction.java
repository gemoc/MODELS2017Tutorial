/**
 */
package org.gemoc.sample.legacyfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incerase Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.InceraseValueAction#getStepValue <em>Step Value</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.InceraseValueAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getInceraseValueAction()
 * @model
 * @generated
 */
public interface InceraseValueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(long)
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getInceraseValueAction_StepValue()
	 * @model required="true"
	 * @generated
	 */
	long getStepValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.fsm.InceraseValueAction#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(long value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NumberVariable)
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getInceraseValueAction_Target()
	 * @model required="true"
	 * @generated
	 */
	NumberVariable getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.fsm.InceraseValueAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NumberVariable value);

} // InceraseValueAction
