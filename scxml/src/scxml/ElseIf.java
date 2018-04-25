/**
 */
package scxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.ElseIf#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getElseIf()
 * @model
 * @generated
 */
public interface ElseIf extends EObject {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see #setCond(String)
	 * @see scxml.ScxmlPackage#getElseIf_Cond()
	 * @model
	 * @generated
	 */
	String getCond();

	/**
	 * Sets the value of the '{@link scxml.ElseIf#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(String value);

} // ElseIf
