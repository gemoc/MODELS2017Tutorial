/**
 */
package org.gemoc.models17.fsm.xfsm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.State#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.State#getFsm <em>Fsm</em>}</li>
 * </ul>
 *
 * @see org.gemoc.models17.fsm.xfsm.model.ModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.models17.fsm.xfsm.model.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.models17.fsm.xfsm.model.Transition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.gemoc.models17.fsm.xfsm.model.ModelPackage#getState_Incoming()
	 * @see org.gemoc.models17.fsm.xfsm.model.Transition#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.models17.fsm.xfsm.model.ModelPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsm.model.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.models17.fsm.xfsm.model.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.models17.fsm.xfsm.model.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.gemoc.models17.fsm.xfsm.model.ModelPackage#getState_Outgoing()
	 * @see org.gemoc.models17.fsm.xfsm.model.Transition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.models17.fsm.xfsm.model.FSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' container reference.
	 * @see #setFsm(FSM)
	 * @see org.gemoc.models17.fsm.xfsm.model.ModelPackage#getState_Fsm()
	 * @see org.gemoc.models17.fsm.xfsm.model.FSM#getOwnedStates
	 * @model opposite="ownedStates" transient="false"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsm.model.State#getFsm <em>Fsm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' container reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step(String inputString);

} // State
