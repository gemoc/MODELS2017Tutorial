/**
 */
package model.impl;

import java.util.Collection;

import model.Buffer;
import model.FSM;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SystemImpl#getOwnedFsms <em>Owned Fsms</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getOwnedBuffers <em>Owned Buffers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements model.System {
	/**
	 * The cached value of the '{@link #getOwnedFsms() <em>Owned Fsms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFsms()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM> ownedFsms;

	/**
	 * The cached value of the '{@link #getOwnedBuffers() <em>Owned Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBuffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer> ownedBuffers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM> getOwnedFsms() {
		if (ownedFsms == null) {
			ownedFsms = new EObjectContainmentEList<FSM>(FSM.class, this, ModelPackage.SYSTEM__OWNED_FSMS);
		}
		return ownedFsms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer> getOwnedBuffers() {
		if (ownedBuffers == null) {
			ownedBuffers = new EObjectContainmentEList<Buffer>(Buffer.class, this, ModelPackage.SYSTEM__OWNED_BUFFERS);
		}
		return ownedBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SYSTEM__OWNED_FSMS:
				return ((InternalEList<?>)getOwnedFsms()).basicRemove(otherEnd, msgs);
			case ModelPackage.SYSTEM__OWNED_BUFFERS:
				return ((InternalEList<?>)getOwnedBuffers()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SYSTEM__OWNED_FSMS:
				return getOwnedFsms();
			case ModelPackage.SYSTEM__OWNED_BUFFERS:
				return getOwnedBuffers();
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
			case ModelPackage.SYSTEM__OWNED_FSMS:
				getOwnedFsms().clear();
				getOwnedFsms().addAll((Collection<? extends FSM>)newValue);
				return;
			case ModelPackage.SYSTEM__OWNED_BUFFERS:
				getOwnedBuffers().clear();
				getOwnedBuffers().addAll((Collection<? extends Buffer>)newValue);
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
			case ModelPackage.SYSTEM__OWNED_FSMS:
				getOwnedFsms().clear();
				return;
			case ModelPackage.SYSTEM__OWNED_BUFFERS:
				getOwnedBuffers().clear();
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
			case ModelPackage.SYSTEM__OWNED_FSMS:
				return ownedFsms != null && !ownedFsms.isEmpty();
			case ModelPackage.SYSTEM__OWNED_BUFFERS:
				return ownedBuffers != null && !ownedBuffers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
