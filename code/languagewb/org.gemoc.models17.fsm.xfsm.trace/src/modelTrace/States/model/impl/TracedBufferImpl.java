/**
 */
package modelTrace.States.model.impl;

import java.util.Collection;

import modelTrace.States.Buffer_currentValues_Value;
import modelTrace.States.StatesPackage;

import modelTrace.States.model.ModelPackage;
import modelTrace.States.model.TracedBuffer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.models17.fsm.xfsm.model.Buffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.model.impl.TracedBufferImpl#getCurrentValuesSequence <em>Current Values Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.impl.TracedBufferImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBufferImpl extends MinimalEObjectImpl.Container implements TracedBuffer {
	/**
	 * The cached value of the '{@link #getCurrentValuesSequence() <em>Current Values Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValuesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer_currentValues_Value> currentValuesSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Buffer originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRACED_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer_currentValues_Value> getCurrentValuesSequence() {
		if (currentValuesSequence == null) {
			currentValuesSequence = new EObjectContainmentWithInverseEList<Buffer_currentValues_Value>(Buffer_currentValues_Value.class, this, ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT);
		}
		return currentValuesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Buffer)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Buffer newOriginalObject) {
		Buffer oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentValuesSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				return ((InternalEList<?>)getCurrentValuesSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				return getCurrentValuesSequence();
			case ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				getCurrentValuesSequence().clear();
				getCurrentValuesSequence().addAll((Collection<? extends Buffer_currentValues_Value>)newValue);
				return;
			case ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT:
				setOriginalObject((Buffer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				getCurrentValuesSequence().clear();
				return;
			case ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT:
				setOriginalObject((Buffer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE:
				return currentValuesSequence != null && !currentValuesSequence.isEmpty();
			case ModelPackage.TRACED_BUFFER__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedBufferImpl
