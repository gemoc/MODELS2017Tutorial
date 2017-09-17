/**
 */
package modelTrace.States.model;

import modelTrace.States.Buffer_currentValues_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.models17.fsm.xfsm.model.Buffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.model.TracedBuffer#getCurrentValuesSequence <em>Current Values Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.TracedBuffer#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.model.ModelPackage#getTracedBuffer()
 * @model
 * @generated
 */
public interface TracedBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.Buffer_currentValues_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Values Sequence</em>' containment reference list.
	 * @see modelTrace.States.model.ModelPackage#getTracedBuffer_CurrentValuesSequence()
	 * @see modelTrace.States.Buffer_currentValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Buffer_currentValues_Value> getCurrentValuesSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Buffer)
	 * @see modelTrace.States.model.ModelPackage#getTracedBuffer_OriginalObject()
	 * @model
	 * @generated
	 */
	Buffer getOriginalObject();

	/**
	 * Sets the value of the '{@link modelTrace.States.model.TracedBuffer#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Buffer value);

} // TracedBuffer
