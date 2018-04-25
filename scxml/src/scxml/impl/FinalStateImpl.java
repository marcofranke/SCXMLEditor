/**
 */
package scxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scxml.Donedata;
import scxml.FinalState;
import scxml.OnEntry;
import scxml.OnExit;
import scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.FinalStateImpl#getId <em>Id</em>}</li>
 *   <li>{@link scxml.impl.FinalStateImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link scxml.impl.FinalStateImpl#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link scxml.impl.FinalStateImpl#getDonedata <em>Donedata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalStateImpl extends NamedElementImpl implements FinalState {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnentry() <em>Onentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnentry()
	 * @generated
	 * @ordered
	 */
	protected EList<OnEntry> onentry;

	/**
	 * The cached value of the '{@link #getOnexit() <em>Onexit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnexit()
	 * @generated
	 * @ordered
	 */
	protected EList<OnExit> onexit;

	/**
	 * The cached value of the '{@link #getDonedata() <em>Donedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonedata()
	 * @generated
	 * @ordered
	 */
	protected Donedata donedata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.FINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.FINAL_STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnEntry> getOnentry() {
		if (onentry == null) {
			onentry = new EObjectContainmentEList<OnEntry>(OnEntry.class, this, ScxmlPackage.FINAL_STATE__ONENTRY);
		}
		return onentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnExit> getOnexit() {
		if (onexit == null) {
			onexit = new EObjectContainmentEList<OnExit>(OnExit.class, this, ScxmlPackage.FINAL_STATE__ONEXIT);
		}
		return onexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donedata getDonedata() {
		return donedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDonedata(Donedata newDonedata, NotificationChain msgs) {
		Donedata oldDonedata = donedata;
		donedata = newDonedata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.FINAL_STATE__DONEDATA, oldDonedata, newDonedata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonedata(Donedata newDonedata) {
		if (newDonedata != donedata) {
			NotificationChain msgs = null;
			if (donedata != null)
				msgs = ((InternalEObject)donedata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.FINAL_STATE__DONEDATA, null, msgs);
			if (newDonedata != null)
				msgs = ((InternalEObject)newDonedata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.FINAL_STATE__DONEDATA, null, msgs);
			msgs = basicSetDonedata(newDonedata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.FINAL_STATE__DONEDATA, newDonedata, newDonedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.FINAL_STATE__ONENTRY:
				return ((InternalEList<?>)getOnentry()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.FINAL_STATE__ONEXIT:
				return ((InternalEList<?>)getOnexit()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return basicSetDonedata(null, msgs);
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
			case ScxmlPackage.FINAL_STATE__ID:
				return getId();
			case ScxmlPackage.FINAL_STATE__ONENTRY:
				return getOnentry();
			case ScxmlPackage.FINAL_STATE__ONEXIT:
				return getOnexit();
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return getDonedata();
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
			case ScxmlPackage.FINAL_STATE__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.FINAL_STATE__ONENTRY:
				getOnentry().clear();
				getOnentry().addAll((Collection<? extends OnEntry>)newValue);
				return;
			case ScxmlPackage.FINAL_STATE__ONEXIT:
				getOnexit().clear();
				getOnexit().addAll((Collection<? extends OnExit>)newValue);
				return;
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				setDonedata((Donedata)newValue);
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
			case ScxmlPackage.FINAL_STATE__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.FINAL_STATE__ONENTRY:
				getOnentry().clear();
				return;
			case ScxmlPackage.FINAL_STATE__ONEXIT:
				getOnexit().clear();
				return;
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				setDonedata((Donedata)null);
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
			case ScxmlPackage.FINAL_STATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.FINAL_STATE__ONENTRY:
				return onentry != null && !onentry.isEmpty();
			case ScxmlPackage.FINAL_STATE__ONEXIT:
				return onexit != null && !onexit.isEmpty();
			case ScxmlPackage.FINAL_STATE__DONEDATA:
				return donedata != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FinalStateImpl
