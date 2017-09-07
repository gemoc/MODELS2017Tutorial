/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increase Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage#getIncreaseValueAction()
 * @model
 * @generated
 */
public interface IncreaseValueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(int)
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage#getIncreaseValueAction_StepValue()
	 * @model required="true"
	 * @generated
	 */
	int getStepValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // IncreaseValueAction
