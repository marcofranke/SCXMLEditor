/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.FinalState#getId <em>Id</em>}</li>
 *   <li>{@link scxml.FinalState#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link scxml.FinalState#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link scxml.FinalState#getDonedata <em>Donedata</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see scxml.ScxmlPackage#getFinalState_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link scxml.FinalState#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Onentry</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.OnEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onentry</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getFinalState_Onentry()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnEntry> getOnentry();

	/**
	 * Returns the value of the '<em><b>Onexit</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.OnExit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onexit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onexit</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getFinalState_Onexit()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnExit> getOnexit();

	/**
	 * Returns the value of the '<em><b>Donedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donedata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donedata</em>' containment reference.
	 * @see #setDonedata(Donedata)
	 * @see scxml.ScxmlPackage#getFinalState_Donedata()
	 * @model containment="true"
	 * @generated
	 */
	Donedata getDonedata();

	/**
	 * Sets the value of the '{@link scxml.FinalState#getDonedata <em>Donedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donedata</em>' containment reference.
	 * @see #getDonedata()
	 * @generated
	 */
	void setDonedata(Donedata value);

} // FinalState
