/**
 */
package scxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.Cancel#getSendid <em>Sendid</em>}</li>
 *   <li>{@link scxml.Cancel#getSendidexpr <em>Sendidexpr</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getCancel()
 * @model
 * @generated
 */
public interface Cancel extends EObject {
	/**
	 * Returns the value of the '<em><b>Sendid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendid</em>' attribute.
	 * @see #setSendid(String)
	 * @see scxml.ScxmlPackage#getCancel_Sendid()
	 * @model
	 * @generated
	 */
	String getSendid();

	/**
	 * Sets the value of the '{@link scxml.Cancel#getSendid <em>Sendid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendid</em>' attribute.
	 * @see #getSendid()
	 * @generated
	 */
	void setSendid(String value);

	/**
	 * Returns the value of the '<em><b>Sendidexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendidexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendidexpr</em>' attribute.
	 * @see #setSendidexpr(String)
	 * @see scxml.ScxmlPackage#getCancel_Sendidexpr()
	 * @model
	 * @generated
	 */
	String getSendidexpr();

	/**
	 * Sets the value of the '{@link scxml.Cancel#getSendidexpr <em>Sendidexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendidexpr</em>' attribute.
	 * @see #getSendidexpr()
	 * @generated
	 */
	void setSendidexpr(String value);

} // Cancel
