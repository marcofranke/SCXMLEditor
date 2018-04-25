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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scxml.DataModel;
import scxml.FinalState;
import scxml.InitialState;
import scxml.Parallel;
import scxml.Script;
import scxml.ScxmlPackage;
import scxml.ServiceTemplate;
import scxml.State;
import scxml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getState <em>State</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getExmode <em>Exmode</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link scxml.impl.ServiceTemplateImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTemplateImpl extends MinimalEObjectImpl.Container implements ServiceTemplate {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

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
	 * The default value of the '{@link #getXmlns() <em>Xmlns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlns()
	 * @generated
	 * @ordered
	 */
	protected static final String XMLNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlns() <em>Xmlns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlns()
	 * @generated
	 * @ordered
	 */
	protected String xmlns = XMLNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExmode() <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExmode()
	 * @generated
	 * @ordered
	 */
	protected static final String EXMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExmode() <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExmode()
	 * @generated
	 * @ordered
	 */
	protected String exmode = EXMODE_EDEFAULT;

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
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModel> datamodel;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.SERVICE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, ScxmlPackage.SERVICE_TEMPLATE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, ScxmlPackage.SERVICE_TEMPLATE__STATE);
		}
		return state;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlns(String newXmlns) {
		String oldXmlns = xmlns;
		xmlns = newXmlns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__XMLNS, oldXmlns, xmlns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExmode() {
		return exmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExmode(String newExmode) {
		String oldExmode = exmode;
		exmode = newExmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__EXMODE, oldExmode, exmode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__INITIAL, oldInitial, newInitial);
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
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SERVICE_TEMPLATE__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SERVICE_TEMPLATE__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalState> getFinal() {
		if (final_ == null) {
			final_ = new EObjectContainmentEList<FinalState>(FinalState.class, this, ScxmlPackage.SERVICE_TEMPLATE__FINAL);
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
			parallel = new EObjectContainmentEList<Parallel>(Parallel.class, this, ScxmlPackage.SERVICE_TEMPLATE__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModel> getDatamodel() {
		if (datamodel == null) {
			datamodel = new EObjectContainmentEList<DataModel>(DataModel.class, this, ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL);
		}
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__SCRIPT, oldScript, newScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SERVICE_TEMPLATE__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.SERVICE_TEMPLATE__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.SERVICE_TEMPLATE__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
				return basicSetInitial(null, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
				return ((InternalEList<?>)getFinal()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
				return ((InternalEList<?>)getDatamodel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				return basicSetScript(null, msgs);
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
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
				return getTransition();
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
				return getState();
			case ScxmlPackage.SERVICE_TEMPLATE__NAME:
				return getName();
			case ScxmlPackage.SERVICE_TEMPLATE__XMLNS:
				return getXmlns();
			case ScxmlPackage.SERVICE_TEMPLATE__VERSION:
				return getVersion();
			case ScxmlPackage.SERVICE_TEMPLATE__PROFILE:
				return getProfile();
			case ScxmlPackage.SERVICE_TEMPLATE__EXMODE:
				return getExmode();
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
				return getInitial();
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
				return getFinal();
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
				return getParallel();
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
				return getDatamodel();
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				return getScript();
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
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__XMLNS:
				setXmlns((String)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__VERSION:
				setVersion((String)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__PROFILE:
				setProfile((String)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__EXMODE:
				setExmode((String)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
				setInitial((InitialState)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends FinalState>)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends Parallel>)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
				getDatamodel().clear();
				getDatamodel().addAll((Collection<? extends DataModel>)newValue);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				setScript((Script)newValue);
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
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
				getTransition().clear();
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
				getState().clear();
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__XMLNS:
				setXmlns(XMLNS_EDEFAULT);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__PROFILE:
				setProfile(PROFILE_EDEFAULT);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__EXMODE:
				setExmode(EXMODE_EDEFAULT);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
				setInitial((InitialState)null);
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
				getFinal().clear();
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
				getParallel().clear();
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
				getDatamodel().clear();
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				setScript((Script)null);
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
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
				return state != null && !state.isEmpty();
			case ScxmlPackage.SERVICE_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScxmlPackage.SERVICE_TEMPLATE__XMLNS:
				return XMLNS_EDEFAULT == null ? xmlns != null : !XMLNS_EDEFAULT.equals(xmlns);
			case ScxmlPackage.SERVICE_TEMPLATE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ScxmlPackage.SERVICE_TEMPLATE__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
			case ScxmlPackage.SERVICE_TEMPLATE__EXMODE:
				return EXMODE_EDEFAULT == null ? exmode != null : !EXMODE_EDEFAULT.equals(exmode);
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
				return initial != null;
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
				return final_ != null && !final_.isEmpty();
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
				return parallel != null && !parallel.isEmpty();
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
				return datamodel != null && !datamodel.isEmpty();
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				return script != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", xmlns: ");
		result.append(xmlns);
		result.append(", version: ");
		result.append(version);
		result.append(", profile: ");
		result.append(profile);
		result.append(", exmode: ");
		result.append(exmode);
		result.append(')');
		return result.toString();
	}

} //ServiceTemplateImpl
