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

import scxml.Assign;
import scxml.Cancel;
import scxml.If;
import scxml.Log;
import scxml.OnExit;
import scxml.Param;
import scxml.Raise;
import scxml.Script;
import scxml.ScxmlPackage;
import scxml.Send;
import scxml.Validate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.OnExitImpl#getScript <em>Script</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getIf <em>If</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getLog <em>Log</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getParam <em>Param</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getRaise <em>Raise</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getSend <em>Send</em>}</li>
 *   <li>{@link scxml.impl.OnExitImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnExitImpl extends MinimalEObjectImpl.Container implements OnExit {
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
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected EList<Assign> assign;

	/**
	 * The cached value of the '{@link #getCancel() <em>Cancel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel()
	 * @generated
	 * @ordered
	 */
	protected EList<Cancel> cancel;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<If> if_;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<Log> log;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Param> param;

	/**
	 * The cached value of the '{@link #getRaise() <em>Raise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaise()
	 * @generated
	 * @ordered
	 */
	protected EList<Raise> raise;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected EList<Send> send;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected EList<Validate> validate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnExitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.ON_EXIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.ON_EXIT__SCRIPT, oldScript, newScript);
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
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.ON_EXIT__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.ON_EXIT__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.ON_EXIT__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssign() {
		if (assign == null) {
			assign = new EObjectContainmentEList<Assign>(Assign.class, this, ScxmlPackage.ON_EXIT__ASSIGN);
		}
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cancel> getCancel() {
		if (cancel == null) {
			cancel = new EObjectContainmentEList<Cancel>(Cancel.class, this, ScxmlPackage.ON_EXIT__CANCEL);
		}
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<If>(If.class, this, ScxmlPackage.ON_EXIT__IF);
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Log> getLog() {
		if (log == null) {
			log = new EObjectContainmentEList<Log>(Log.class, this, ScxmlPackage.ON_EXIT__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<Param>(Param.class, this, ScxmlPackage.ON_EXIT__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Raise> getRaise() {
		if (raise == null) {
			raise = new EObjectContainmentEList<Raise>(Raise.class, this, ScxmlPackage.ON_EXIT__RAISE);
		}
		return raise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Send> getSend() {
		if (send == null) {
			send = new EObjectContainmentEList<Send>(Send.class, this, ScxmlPackage.ON_EXIT__SEND);
		}
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validate> getValidate() {
		if (validate == null) {
			validate = new EObjectContainmentEList<Validate>(Validate.class, this, ScxmlPackage.ON_EXIT__VALIDATE);
		}
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScxmlPackage.ON_EXIT__SCRIPT:
				return basicSetScript(null, msgs);
			case ScxmlPackage.ON_EXIT__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__CANCEL:
				return ((InternalEList<?>)getCancel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__RAISE:
				return ((InternalEList<?>)getRaise()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__SEND:
				return ((InternalEList<?>)getSend()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.ON_EXIT__VALIDATE:
				return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
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
			case ScxmlPackage.ON_EXIT__SCRIPT:
				return getScript();
			case ScxmlPackage.ON_EXIT__ASSIGN:
				return getAssign();
			case ScxmlPackage.ON_EXIT__CANCEL:
				return getCancel();
			case ScxmlPackage.ON_EXIT__IF:
				return getIf();
			case ScxmlPackage.ON_EXIT__LOG:
				return getLog();
			case ScxmlPackage.ON_EXIT__PARAM:
				return getParam();
			case ScxmlPackage.ON_EXIT__RAISE:
				return getRaise();
			case ScxmlPackage.ON_EXIT__SEND:
				return getSend();
			case ScxmlPackage.ON_EXIT__VALIDATE:
				return getValidate();
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
			case ScxmlPackage.ON_EXIT__SCRIPT:
				setScript((Script)newValue);
				return;
			case ScxmlPackage.ON_EXIT__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__CANCEL:
				getCancel().clear();
				getCancel().addAll((Collection<? extends Cancel>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends Log>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Param>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__RAISE:
				getRaise().clear();
				getRaise().addAll((Collection<? extends Raise>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends Send>)newValue);
				return;
			case ScxmlPackage.ON_EXIT__VALIDATE:
				getValidate().clear();
				getValidate().addAll((Collection<? extends Validate>)newValue);
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
			case ScxmlPackage.ON_EXIT__SCRIPT:
				setScript((Script)null);
				return;
			case ScxmlPackage.ON_EXIT__ASSIGN:
				getAssign().clear();
				return;
			case ScxmlPackage.ON_EXIT__CANCEL:
				getCancel().clear();
				return;
			case ScxmlPackage.ON_EXIT__IF:
				getIf().clear();
				return;
			case ScxmlPackage.ON_EXIT__LOG:
				getLog().clear();
				return;
			case ScxmlPackage.ON_EXIT__PARAM:
				getParam().clear();
				return;
			case ScxmlPackage.ON_EXIT__RAISE:
				getRaise().clear();
				return;
			case ScxmlPackage.ON_EXIT__SEND:
				getSend().clear();
				return;
			case ScxmlPackage.ON_EXIT__VALIDATE:
				getValidate().clear();
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
			case ScxmlPackage.ON_EXIT__SCRIPT:
				return script != null;
			case ScxmlPackage.ON_EXIT__ASSIGN:
				return assign != null && !assign.isEmpty();
			case ScxmlPackage.ON_EXIT__CANCEL:
				return cancel != null && !cancel.isEmpty();
			case ScxmlPackage.ON_EXIT__IF:
				return if_ != null && !if_.isEmpty();
			case ScxmlPackage.ON_EXIT__LOG:
				return log != null && !log.isEmpty();
			case ScxmlPackage.ON_EXIT__PARAM:
				return param != null && !param.isEmpty();
			case ScxmlPackage.ON_EXIT__RAISE:
				return raise != null && !raise.isEmpty();
			case ScxmlPackage.ON_EXIT__SEND:
				return send != null && !send.isEmpty();
			case ScxmlPackage.ON_EXIT__VALIDATE:
				return validate != null && !validate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OnExitImpl
