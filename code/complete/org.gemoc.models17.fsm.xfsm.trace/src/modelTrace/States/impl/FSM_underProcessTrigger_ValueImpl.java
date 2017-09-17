/**
 */
package modelTrace.States.impl;

import java.util.Collection;

import modelTrace.States.FSM_underProcessTrigger_Value;
import modelTrace.States.State;
import modelTrace.States.StatesPackage;

import modelTrace.States.model.ModelPackage;
import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM under Process Trigger Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.impl.FSM_underProcessTrigger_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_underProcessTrigger_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_underProcessTrigger_ValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link modelTrace.States.impl.FSM_underProcessTrigger_ValueImpl#getUnderProcessTrigger <em>Under Process Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSM_underProcessTrigger_ValueImpl extends MinimalEObjectImpl.Container implements FSM_underProcessTrigger_Value {
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
	 * The default value of the '{@link #getUnderProcessTrigger() <em>Under Process Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderProcessTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String UNDER_PROCESS_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderProcessTrigger() <em>Under Process Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderProcessTrigger()
	 * @generated
	 * @ordered
	 */
	protected String underProcessTrigger = UNDER_PROCESS_TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSM_underProcessTrigger_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.FSM_UNDER_PROCESS_TRIGGER_VALUE;
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
	public TracedFSM getParent() {
		if (eContainerFeatureID() != StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT) return null;
		return (TracedFSM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedFSM newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedFSM newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE, TracedFSM.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES, StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnderProcessTrigger() {
		return underProcessTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderProcessTrigger(String newUnderProcessTrigger) {
		String oldUnderProcessTrigger = underProcessTrigger;
		underProcessTrigger = newUnderProcessTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER, oldUnderProcessTrigger, underProcessTrigger));
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedFSM)otherEnd, msgs);
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE, TracedFSM.class, msgs);
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				return getParent();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
				return getStates();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER:
				return getUnderProcessTrigger();
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				setParent((TracedFSM)newValue);
				return;
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER:
				setUnderProcessTrigger((String)newValue);
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				setParent((TracedFSM)null);
				return;
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
				getStates().clear();
				return;
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER:
				setUnderProcessTrigger(UNDER_PROCESS_TRIGGER_EDEFAULT);
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
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES:
				return states != null && !states.isEmpty();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER:
				return UNDER_PROCESS_TRIGGER_EDEFAULT == null ? underProcessTrigger != null : !UNDER_PROCESS_TRIGGER_EDEFAULT.equals(underProcessTrigger);
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
		result.append(" (underProcessTrigger: ");
		result.append(underProcessTrigger);
		result.append(')');
		return result.toString();
	}

} //FSM_underProcessTrigger_ValueImpl
