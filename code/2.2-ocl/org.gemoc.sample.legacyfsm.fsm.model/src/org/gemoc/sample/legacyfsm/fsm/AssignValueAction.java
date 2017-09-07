/**
 */
package org.gemoc.sample.legacyfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.AssignValueAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getAssignValueAction()
 * @model
 * @generated
 */
public interface AssignValueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getAssignValueAction_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.fsm.AssignValueAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // AssignValueAction
