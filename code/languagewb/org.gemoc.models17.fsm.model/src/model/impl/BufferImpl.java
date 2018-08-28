/**
 */
package model.impl;

import model.Buffer;
import model.FSM;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BufferImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link model.impl.BufferImpl#getOutgoingFSM <em>Outgoing FSM</em>}</li>
 *   <li>{@link model.impl.BufferImpl#getIncomingFSM <em>Incoming FSM</em>}</li>
 *   <li>{@link model.impl.BufferImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BufferImpl extends MinimalEObjectImpl.Container implements Buffer {
	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingFSM() <em>Outgoing FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFSM()
	 * @generated
	 * @ordered
	 */
	protected FSM outgoingFSM;

	/**
	 * The cached value of the '{@link #getIncomingFSM() <em>Incoming FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFSM()
	 * @generated
	 * @ordered
	 */
	protected FSM incomingFSM;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOutgoingFSM() {
		if (outgoingFSM != null && outgoingFSM.eIsProxy()) {
			InternalEObject oldOutgoingFSM = (InternalEObject)outgoingFSM;
			outgoingFSM = (FSM)eResolveProxy(oldOutgoingFSM);
			if (outgoingFSM != oldOutgoingFSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BUFFER__OUTGOING_FSM, oldOutgoingFSM, outgoingFSM));
			}
		}
		return outgoingFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetOutgoingFSM() {
		return outgoingFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingFSM(FSM newOutgoingFSM, NotificationChain msgs) {
		FSM oldOutgoingFSM = outgoingFSM;
		outgoingFSM = newOutgoingFSM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__OUTGOING_FSM, oldOutgoingFSM, newOutgoingFSM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingFSM(FSM newOutgoingFSM) {
		if (newOutgoingFSM != outgoingFSM) {
			NotificationChain msgs = null;
			if (outgoingFSM != null)
				msgs = ((InternalEObject)outgoingFSM).eInverseRemove(this, ModelPackage.FSM__INPUT_BUFFER, FSM.class, msgs);
			if (newOutgoingFSM != null)
				msgs = ((InternalEObject)newOutgoingFSM).eInverseAdd(this, ModelPackage.FSM__INPUT_BUFFER, FSM.class, msgs);
			msgs = basicSetOutgoingFSM(newOutgoingFSM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__OUTGOING_FSM, newOutgoingFSM, newOutgoingFSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getIncomingFSM() {
		if (incomingFSM != null && incomingFSM.eIsProxy()) {
			InternalEObject oldIncomingFSM = (InternalEObject)incomingFSM;
			incomingFSM = (FSM)eResolveProxy(oldIncomingFSM);
			if (incomingFSM != oldIncomingFSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BUFFER__INCOMING_FSM, oldIncomingFSM, incomingFSM));
			}
		}
		return incomingFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetIncomingFSM() {
		return incomingFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingFSM(FSM newIncomingFSM, NotificationChain msgs) {
		FSM oldIncomingFSM = incomingFSM;
		incomingFSM = newIncomingFSM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__INCOMING_FSM, oldIncomingFSM, newIncomingFSM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingFSM(FSM newIncomingFSM) {
		if (newIncomingFSM != incomingFSM) {
			NotificationChain msgs = null;
			if (incomingFSM != null)
				msgs = ((InternalEObject)incomingFSM).eInverseRemove(this, ModelPackage.FSM__OUTPUT_BUFFER, FSM.class, msgs);
			if (newIncomingFSM != null)
				msgs = ((InternalEObject)newIncomingFSM).eInverseAdd(this, ModelPackage.FSM__OUTPUT_BUFFER, FSM.class, msgs);
			msgs = basicSetIncomingFSM(newIncomingFSM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__INCOMING_FSM, newIncomingFSM, newIncomingFSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BUFFER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BUFFER__OUTGOING_FSM:
				if (outgoingFSM != null)
					msgs = ((InternalEObject)outgoingFSM).eInverseRemove(this, ModelPackage.FSM__INPUT_BUFFER, FSM.class, msgs);
				return basicSetOutgoingFSM((FSM)otherEnd, msgs);
			case ModelPackage.BUFFER__INCOMING_FSM:
				if (incomingFSM != null)
					msgs = ((InternalEObject)incomingFSM).eInverseRemove(this, ModelPackage.FSM__OUTPUT_BUFFER, FSM.class, msgs);
				return basicSetIncomingFSM((FSM)otherEnd, msgs);
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
			case ModelPackage.BUFFER__OUTGOING_FSM:
				return basicSetOutgoingFSM(null, msgs);
			case ModelPackage.BUFFER__INCOMING_FSM:
				return basicSetIncomingFSM(null, msgs);
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
			case ModelPackage.BUFFER__INITIAL_VALUE:
				return getInitialValue();
			case ModelPackage.BUFFER__OUTGOING_FSM:
				if (resolve) return getOutgoingFSM();
				return basicGetOutgoingFSM();
			case ModelPackage.BUFFER__INCOMING_FSM:
				if (resolve) return getIncomingFSM();
				return basicGetIncomingFSM();
			case ModelPackage.BUFFER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BUFFER__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case ModelPackage.BUFFER__OUTGOING_FSM:
				setOutgoingFSM((FSM)newValue);
				return;
			case ModelPackage.BUFFER__INCOMING_FSM:
				setIncomingFSM((FSM)newValue);
				return;
			case ModelPackage.BUFFER__NAME:
				setName((String)newValue);
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
			case ModelPackage.BUFFER__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ModelPackage.BUFFER__OUTGOING_FSM:
				setOutgoingFSM((FSM)null);
				return;
			case ModelPackage.BUFFER__INCOMING_FSM:
				setIncomingFSM((FSM)null);
				return;
			case ModelPackage.BUFFER__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.BUFFER__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case ModelPackage.BUFFER__OUTGOING_FSM:
				return outgoingFSM != null;
			case ModelPackage.BUFFER__INCOMING_FSM:
				return incomingFSM != null;
			case ModelPackage.BUFFER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BufferImpl
