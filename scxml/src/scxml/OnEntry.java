/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.OnEntry#getScript <em>Script</em>}</li>
 *   <li>{@link scxml.OnEntry#getAssign <em>Assign</em>}</li>
 *   <li>{@link scxml.OnEntry#getCancel <em>Cancel</em>}</li>
 *   <li>{@link scxml.OnEntry#getIf <em>If</em>}</li>
 *   <li>{@link scxml.OnEntry#getLog <em>Log</em>}</li>
 *   <li>{@link scxml.OnEntry#getParam <em>Param</em>}</li>
 *   <li>{@link scxml.OnEntry#getRaise <em>Raise</em>}</li>
 *   <li>{@link scxml.OnEntry#getSend <em>Send</em>}</li>
 *   <li>{@link scxml.OnEntry#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getOnEntry()
 * @model
 * @generated
 */
public interface OnEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(Script)
	 * @see scxml.ScxmlPackage#getOnEntry_Script()
	 * @model containment="true"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link scxml.OnEntry#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Assign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Assign()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assign> getAssign();

	/**
	 * Returns the value of the '<em><b>Cancel</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Cancel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Cancel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cancel> getCancel();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.If}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_If()
	 * @model containment="true"
	 * @generated
	 */
	EList<If> getIf();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Log}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Log()
	 * @model containment="true"
	 * @generated
	 */
	EList<Log> getLog();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getParam();

	/**
	 * Returns the value of the '<em><b>Raise</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Raise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Raise()
	 * @model containment="true"
	 * @generated
	 */
	EList<Raise> getRaise();

	/**
	 * Returns the value of the '<em><b>Send</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Send}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Send()
	 * @model containment="true"
	 * @generated
	 */
	EList<Send> getSend();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Validate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getOnEntry_Validate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validate> getValidate();

} // OnEntry
