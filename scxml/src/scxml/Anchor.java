/**
 */
package scxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.Anchor#getType <em>Type</em>}</li>
 *   <li>{@link scxml.Anchor#getSnapshot <em>Snapshot</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see scxml.ScxmlPackage#getAnchor_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link scxml.Anchor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Snapshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snapshot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snapshot</em>' attribute.
	 * @see #setSnapshot(String)
	 * @see scxml.ScxmlPackage#getAnchor_Snapshot()
	 * @model
	 * @generated
	 */
	String getSnapshot();

	/**
	 * Sets the value of the '{@link scxml.Anchor#getSnapshot <em>Snapshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot</em>' attribute.
	 * @see #getSnapshot()
	 * @generated
	 */
	void setSnapshot(String value);

} // Anchor
