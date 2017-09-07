/**
 */
package org.gemoc.sample.legacyfsm.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.Guard#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getGuard()
 * @model abstract="true"
 * @generated
 */
public interface Guard extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getGuard_Not()
	 * @model default="false"
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.fsm.Guard#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // Guard
