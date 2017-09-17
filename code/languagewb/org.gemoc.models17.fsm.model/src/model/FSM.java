/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.FSM#getName <em>Name</em>}</li>
 *   <li>{@link model.FSM#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link model.FSM#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link model.FSM#getInputBuffer <em>Input Buffer</em>}</li>
 *   <li>{@link model.FSM#getOutputBuffer <em>Output Buffer</em>}</li>
 *   <li>{@link model.FSM#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
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
	 * @see model.ModelPackage#getFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link model.State}.
	 * It is bidirectional and its opposite is '{@link model.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see model.ModelPackage#getFSM_OwnedStates()
	 * @see model.State#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link model.Transition}.
	 * It is bidirectional and its opposite is '{@link model.Transition#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see model.ModelPackage#getFSM_OwnedTransitions()
	 * @see model.Transition#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Input Buffer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Buffer#getOutgoingFSM <em>Outgoing FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Buffer</em>' reference.
	 * @see #setInputBuffer(Buffer)
	 * @see model.ModelPackage#getFSM_InputBuffer()
	 * @see model.Buffer#getOutgoingFSM
	 * @model opposite="outgoingFSM"
	 * @generated
	 */
	Buffer getInputBuffer();

	/**
	 * Sets the value of the '{@link model.FSM#getInputBuffer <em>Input Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Buffer</em>' reference.
	 * @see #getInputBuffer()
	 * @generated
	 */
	void setInputBuffer(Buffer value);

	/**
	 * Returns the value of the '<em><b>Output Buffer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Buffer#getIncomingFSM <em>Incoming FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Buffer</em>' reference.
	 * @see #setOutputBuffer(Buffer)
	 * @see model.ModelPackage#getFSM_OutputBuffer()
	 * @see model.Buffer#getIncomingFSM
	 * @model opposite="incomingFSM"
	 * @generated
	 */
	Buffer getOutputBuffer();

	/**
	 * Sets the value of the '{@link model.FSM#getOutputBuffer <em>Output Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Buffer</em>' reference.
	 * @see #getOutputBuffer()
	 * @generated
	 */
	void setOutputBuffer(Buffer value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see model.ModelPackage#getFSM_InitialState()
	 * @model
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link model.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // FSM
