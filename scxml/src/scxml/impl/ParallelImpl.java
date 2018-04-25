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

import scxml.Anchor;
import scxml.HistoryState;
import scxml.OnEntry;
import scxml.OnExit;
import scxml.Parallel;
import scxml.ScxmlPackage;
import scxml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.ParallelImpl#getId <em>Id</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getState <em>State</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getHistory <em>History</em>}</li>
 *   <li>{@link scxml.impl.ParallelImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelImpl extends NamedElementImpl implements Parallel {
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
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected EList<Parallel> parallel;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoryState> history;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected EList<Anchor> anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.PARALLEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.PARALLEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnEntry> getOnentry() {
		if (onentry == null) {
			onentry = new EObjectContainmentEList<OnEntry>(OnEntry.class, this, ScxmlPackage.PARALLEL__ONENTRY);
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
			onexit = new EObjectContainmentEList<OnExit>(OnExit.class, this, ScxmlPackage.PARALLEL__ONEXIT);
		}
		return onexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parallel> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<Parallel>(Parallel.class, this, ScxmlPackage.PARALLEL__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, ScxmlPackage.PARALLEL__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryState> getHistory() {
		if (history == null) {
			history = new EObjectContainmentEList<HistoryState>(HistoryState.class, this, ScxmlPackage.PARALLEL__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anchor> getAnchor() {
		if (anchor == null) {
			anchor = new EObjectContainmentEList<Anchor>(Anchor.class, this, ScxmlPackage.PARALLEL__ANCHOR);
		}
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.PARALLEL__ONENTRY:
				return ((InternalEList<?>)getOnentry()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.PARALLEL__ONEXIT:
				return ((InternalEList<?>)getOnexit()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.PARALLEL__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.PARALLEL__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.PARALLEL__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.PARALLEL__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.PARALLEL__ID:
				return getId();
			case ScxmlPackage.PARALLEL__ONENTRY:
				return getOnentry();
			case ScxmlPackage.PARALLEL__ONEXIT:
				return getOnexit();
			case ScxmlPackage.PARALLEL__PARALLEL:
				return getParallel();
			case ScxmlPackage.PARALLEL__STATE:
				return getState();
			case ScxmlPackage.PARALLEL__HISTORY:
				return getHistory();
			case ScxmlPackage.PARALLEL__ANCHOR:
				return getAnchor();
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
			case ScxmlPackage.PARALLEL__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.PARALLEL__ONENTRY:
				getOnentry().clear();
				getOnentry().addAll((Collection<? extends OnEntry>)newValue);
				return;
			case ScxmlPackage.PARALLEL__ONEXIT:
				getOnexit().clear();
				getOnexit().addAll((Collection<? extends OnExit>)newValue);
				return;
			case ScxmlPackage.PARALLEL__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends Parallel>)newValue);
				return;
			case ScxmlPackage.PARALLEL__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case ScxmlPackage.PARALLEL__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends HistoryState>)newValue);
				return;
			case ScxmlPackage.PARALLEL__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends Anchor>)newValue);
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
			case ScxmlPackage.PARALLEL__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.PARALLEL__ONENTRY:
				getOnentry().clear();
				return;
			case ScxmlPackage.PARALLEL__ONEXIT:
				getOnexit().clear();
				return;
			case ScxmlPackage.PARALLEL__PARALLEL:
				getParallel().clear();
				return;
			case ScxmlPackage.PARALLEL__STATE:
				getState().clear();
				return;
			case ScxmlPackage.PARALLEL__HISTORY:
				getHistory().clear();
				return;
			case ScxmlPackage.PARALLEL__ANCHOR:
				getAnchor().clear();
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
			case ScxmlPackage.PARALLEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.PARALLEL__ONENTRY:
				return onentry != null && !onentry.isEmpty();
			case ScxmlPackage.PARALLEL__ONEXIT:
				return onexit != null && !onexit.isEmpty();
			case ScxmlPackage.PARALLEL__PARALLEL:
				return parallel != null && !parallel.isEmpty();
			case ScxmlPackage.PARALLEL__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.PARALLEL__HISTORY:
				return history != null && !history.isEmpty();
			case ScxmlPackage.PARALLEL__ANCHOR:
				return anchor != null && !anchor.isEmpty();
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

} //ParallelImpl
