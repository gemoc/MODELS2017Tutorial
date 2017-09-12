/**
 */
package modelTrace.States.impl;

import java.util.Collection;

import modelTrace.States.Buffer_currentValues_Value;
import modelTrace.States.State;
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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer current Values Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.impl.Buffer_currentValues_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link modelTrace.States.impl.Buffer_currentValues_ValueImpl#getCurrentValues <em>Current Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.Buffer_currentValues_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.impl.Buffer_currentValues_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Buffer_currentValues_ValueImpl extends MinimalEObjectImpl.Container implements Buffer_currentValues_Value {
	/**
	 * The cached value of the '{@link #getCurrentValues() <em>Current Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> currentValues;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Buffer_currentValues_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BUFFER_CURRENT_VALUES_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCurrentValues() {
		if (currentValues == null) {
			currentValues = new EDataTypeEList<String>(String.class, this, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES);
		}
		return currentValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBuffer getParent() {
		if (eContainerFeatureID() != StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT) return null;
		return (TracedBuffer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedBuffer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedBuffer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE, TracedBuffer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES, StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES);
		}
		return states;
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
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedBuffer)otherEnd, msgs);
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.TRACED_BUFFER__CURRENT_VALUES_SEQUENCE, TracedBuffer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES:
				return getCurrentValues();
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				return getParent();
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				return getStates();
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
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES:
				getCurrentValues().clear();
				getCurrentValues().addAll((Collection<? extends String>)newValue);
				return;
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				setParent((TracedBuffer)newValue);
				return;
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES:
				getCurrentValues().clear();
				return;
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				setParent((TracedBuffer)null);
				return;
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES:
				return currentValues != null && !currentValues.isEmpty();
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentValues: ");
		result.append(currentValues);
		result.append(')');
		return result.toString();
	}

} //Buffer_currentValues_ValueImpl
