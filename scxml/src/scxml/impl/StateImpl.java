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
import scxml.FinalState;
import scxml.HistoryState;
import scxml.InitialState;
import scxml.Invoke;
import scxml.OnEntry;
import scxml.OnExit;
import scxml.Parallel;
import scxml.ScxmlPackage;
import scxml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.StateImpl#getId <em>Id</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getState <em>State</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getHistory <em>History</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link scxml.impl.StateImpl#getInvoke <em>Invoke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
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
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected InitialState initial;

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
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalState> final_;

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
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoke> invoke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnEntry> getOnentry() {
		if (onentry == null) {
			onentry = new EObjectContainmentEList<OnEntry>(OnEntry.class, this, ScxmlPackage.STATE__ONENTRY);
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
			onexit = new EObjectContainmentEList<OnExit>(OnExit.class, this, ScxmlPackage.STATE__ONEXIT);
		}
		return onexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(InitialState newInitial, NotificationChain msgs) {
		InitialState oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(InitialState newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.STATE__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.STATE__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, ScxmlPackage.STATE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalState> getFinal() {
		if (final_ == null) {
			final_ = new EObjectContainmentEList<FinalState>(FinalState.class, this, ScxmlPackage.STATE__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parallel> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<Parallel>(Parallel.class, this, ScxmlPackage.STATE__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryState> getHistory() {
		if (history == null) {
			history = new EObjectContainmentEList<HistoryState>(HistoryState.class, this, ScxmlPackage.STATE__HISTORY);
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
			anchor = new EObjectContainmentEList<Anchor>(Anchor.class, this, ScxmlPackage.STATE__ANCHOR);
		}
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invoke> getInvoke() {
		if (invoke == null) {
			invoke = new EObjectContainmentEList<Invoke>(Invoke.class, this, ScxmlPackage.STATE__INVOKE);
		}
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.STATE__ONENTRY:
				return ((InternalEList<?>)getOnentry()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__ONEXIT:
				return ((InternalEList<?>)getOnexit()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__INITIAL:
				return basicSetInitial(null, msgs);
			case ScxmlPackage.STATE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__FINAL:
				return ((InternalEList<?>)getFinal()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__ANCHOR:
				return ((InternalEList<?>)getAnchor()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.STATE__INVOKE:
				return ((InternalEList<?>)getInvoke()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.STATE__ID:
				return getId();
			case ScxmlPackage.STATE__ONENTRY:
				return getOnentry();
			case ScxmlPackage.STATE__ONEXIT:
				return getOnexit();
			case ScxmlPackage.STATE__INITIAL:
				return getInitial();
			case ScxmlPackage.STATE__STATE:
				return getState();
			case ScxmlPackage.STATE__FINAL:
				return getFinal();
			case ScxmlPackage.STATE__PARALLEL:
				return getParallel();
			case ScxmlPackage.STATE__HISTORY:
				return getHistory();
			case ScxmlPackage.STATE__ANCHOR:
				return getAnchor();
			case ScxmlPackage.STATE__INVOKE:
				return getInvoke();
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
			case ScxmlPackage.STATE__ID:
				setId((String)newValue);
				return;
			case ScxmlPackage.STATE__ONENTRY:
				getOnentry().clear();
				getOnentry().addAll((Collection<? extends OnEntry>)newValue);
				return;
			case ScxmlPackage.STATE__ONEXIT:
				getOnexit().clear();
				getOnexit().addAll((Collection<? extends OnExit>)newValue);
				return;
			case ScxmlPackage.STATE__INITIAL:
				setInitial((InitialState)newValue);
				return;
			case ScxmlPackage.STATE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case ScxmlPackage.STATE__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends FinalState>)newValue);
				return;
			case ScxmlPackage.STATE__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends Parallel>)newValue);
				return;
			case ScxmlPackage.STATE__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends HistoryState>)newValue);
				return;
			case ScxmlPackage.STATE__ANCHOR:
				getAnchor().clear();
				getAnchor().addAll((Collection<? extends Anchor>)newValue);
				return;
			case ScxmlPackage.STATE__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection<? extends Invoke>)newValue);
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
			case ScxmlPackage.STATE__ID:
				setId(ID_EDEFAULT);
				return;
			case ScxmlPackage.STATE__ONENTRY:
				getOnentry().clear();
				return;
			case ScxmlPackage.STATE__ONEXIT:
				getOnexit().clear();
				return;
			case ScxmlPackage.STATE__INITIAL:
				setInitial((InitialState)null);
				return;
			case ScxmlPackage.STATE__STATE:
				getState().clear();
				return;
			case ScxmlPackage.STATE__FINAL:
				getFinal().clear();
				return;
			case ScxmlPackage.STATE__PARALLEL:
				getParallel().clear();
				return;
			case ScxmlPackage.STATE__HISTORY:
				getHistory().clear();
				return;
			case ScxmlPackage.STATE__ANCHOR:
				getAnchor().clear();
				return;
			case ScxmlPackage.STATE__INVOKE:
				getInvoke().clear();
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
			case ScxmlPackage.STATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScxmlPackage.STATE__ONENTRY:
				return onentry != null && !onentry.isEmpty();
			case ScxmlPackage.STATE__ONEXIT:
				return onexit != null && !onexit.isEmpty();
			case ScxmlPackage.STATE__INITIAL:
				return initial != null;
			case ScxmlPackage.STATE__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.STATE__FINAL:
				return final_ != null && !final_.isEmpty();
			case ScxmlPackage.STATE__PARALLEL:
				return parallel != null && !parallel.isEmpty();
			case ScxmlPackage.STATE__HISTORY:
				return history != null && !history.isEmpty();
			case ScxmlPackage.STATE__ANCHOR:
				return anchor != null && !anchor.isEmpty();
			case ScxmlPackage.STATE__INVOKE:
				return invoke != null && !invoke.isEmpty();
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

} //StateImpl
