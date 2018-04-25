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
import scxml.Else;
import scxml.ElseIf;
import scxml.If;
import scxml.Log;
import scxml.Param;
import scxml.Raise;
import scxml.ScxmlPackage;
import scxml.Send;
import scxml.Validate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scxml.impl.IfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getElseif <em>Elseif</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getElse <em>Else</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getCancel <em>Cancel</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getIf <em>If</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getLog <em>Log</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getParam <em>Param</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getRaise <em>Raise</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getSend <em>Send</em>}</li>
 *   <li>{@link scxml.impl.IfImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If {
	/**
	 * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected static final String COND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected String cond = COND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected EList<ElseIf> elseif;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Else else_;

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
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(String newCond) {
		String oldCond = cond;
		cond = newCond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.IF__COND, oldCond, cond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElseIf> getElseif() {
		if (elseif == null) {
			elseif = new EObjectContainmentEList<ElseIf>(ElseIf.class, this, ScxmlPackage.IF__ELSEIF);
		}
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Else newElse, NotificationChain msgs) {
		Else oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScxmlPackage.IF__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Else newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.IF__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScxmlPackage.IF__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlPackage.IF__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssign() {
		if (assign == null) {
			assign = new EObjectContainmentEList<Assign>(Assign.class, this, ScxmlPackage.IF__ASSIGN);
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
			cancel = new EObjectContainmentEList<Cancel>(Cancel.class, this, ScxmlPackage.IF__CANCEL);
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
			if_ = new EObjectContainmentEList<If>(If.class, this, ScxmlPackage.IF__IF);
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
			log = new EObjectContainmentEList<Log>(Log.class, this, ScxmlPackage.IF__LOG);
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
			param = new EObjectContainmentEList<Param>(Param.class, this, ScxmlPackage.IF__PARAM);
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
			raise = new EObjectContainmentEList<Raise>(Raise.class, this, ScxmlPackage.IF__RAISE);
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
			send = new EObjectContainmentEList<Send>(Send.class, this, ScxmlPackage.IF__SEND);
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
			validate = new EObjectContainmentEList<Validate>(Validate.class, this, ScxmlPackage.IF__VALIDATE);
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
			case ScxmlPackage.IF__ELSEIF:
				return ((InternalEList<?>)getElseif()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__ELSE:
				return basicSetElse(null, msgs);
			case ScxmlPackage.IF__ASSIGN:
				return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__CANCEL:
				return ((InternalEList<?>)getCancel()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__IF:
				return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__RAISE:
				return ((InternalEList<?>)getRaise()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__SEND:
				return ((InternalEList<?>)getSend()).basicRemove(otherEnd, msgs);
			case ScxmlPackage.IF__VALIDATE:
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
			case ScxmlPackage.IF__COND:
				return getCond();
			case ScxmlPackage.IF__ELSEIF:
				return getElseif();
			case ScxmlPackage.IF__ELSE:
				return getElse();
			case ScxmlPackage.IF__ASSIGN:
				return getAssign();
			case ScxmlPackage.IF__CANCEL:
				return getCancel();
			case ScxmlPackage.IF__IF:
				return getIf();
			case ScxmlPackage.IF__LOG:
				return getLog();
			case ScxmlPackage.IF__PARAM:
				return getParam();
			case ScxmlPackage.IF__RAISE:
				return getRaise();
			case ScxmlPackage.IF__SEND:
				return getSend();
			case ScxmlPackage.IF__VALIDATE:
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
			case ScxmlPackage.IF__COND:
				setCond((String)newValue);
				return;
			case ScxmlPackage.IF__ELSEIF:
				getElseif().clear();
				getElseif().addAll((Collection<? extends ElseIf>)newValue);
				return;
			case ScxmlPackage.IF__ELSE:
				setElse((Else)newValue);
				return;
			case ScxmlPackage.IF__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends Assign>)newValue);
				return;
			case ScxmlPackage.IF__CANCEL:
				getCancel().clear();
				getCancel().addAll((Collection<? extends Cancel>)newValue);
				return;
			case ScxmlPackage.IF__IF:
				getIf().clear();
				getIf().addAll((Collection<? extends If>)newValue);
				return;
			case ScxmlPackage.IF__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends Log>)newValue);
				return;
			case ScxmlPackage.IF__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Param>)newValue);
				return;
			case ScxmlPackage.IF__RAISE:
				getRaise().clear();
				getRaise().addAll((Collection<? extends Raise>)newValue);
				return;
			case ScxmlPackage.IF__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends Send>)newValue);
				return;
			case ScxmlPackage.IF__VALIDATE:
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
			case ScxmlPackage.IF__COND:
				setCond(COND_EDEFAULT);
				return;
			case ScxmlPackage.IF__ELSEIF:
				getElseif().clear();
				return;
			case ScxmlPackage.IF__ELSE:
				setElse((Else)null);
				return;
			case ScxmlPackage.IF__ASSIGN:
				getAssign().clear();
				return;
			case ScxmlPackage.IF__CANCEL:
				getCancel().clear();
				return;
			case ScxmlPackage.IF__IF:
				getIf().clear();
				return;
			case ScxmlPackage.IF__LOG:
				getLog().clear();
				return;
			case ScxmlPackage.IF__PARAM:
				getParam().clear();
				return;
			case ScxmlPackage.IF__RAISE:
				getRaise().clear();
				return;
			case ScxmlPackage.IF__SEND:
				getSend().clear();
				return;
			case ScxmlPackage.IF__VALIDATE:
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
			case ScxmlPackage.IF__COND:
				return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
			case ScxmlPackage.IF__ELSEIF:
				return elseif != null && !elseif.isEmpty();
			case ScxmlPackage.IF__ELSE:
				return else_ != null;
			case ScxmlPackage.IF__ASSIGN:
				return assign != null && !assign.isEmpty();
			case ScxmlPackage.IF__CANCEL:
				return cancel != null && !cancel.isEmpty();
			case ScxmlPackage.IF__IF:
				return if_ != null && !if_.isEmpty();
			case ScxmlPackage.IF__LOG:
				return log != null && !log.isEmpty();
			case ScxmlPackage.IF__PARAM:
				return param != null && !param.isEmpty();
			case ScxmlPackage.IF__RAISE:
				return raise != null && !raise.isEmpty();
			case ScxmlPackage.IF__SEND:
				return send != null && !send.isEmpty();
			case ScxmlPackage.IF__VALIDATE:
				return validate != null && !validate.isEmpty();
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
		result.append(" (cond: ");
		result.append(cond);
		result.append(')');
		return result.toString();
	}

} //IfImpl
