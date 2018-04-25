/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.Parallel#getId <em>Id</em>}</li>
 *   <li>{@link scxml.Parallel#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link scxml.Parallel#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link scxml.Parallel#getParallel <em>Parallel</em>}</li>
 *   <li>{@link scxml.Parallel#getState <em>State</em>}</li>
 *   <li>{@link scxml.Parallel#getHistory <em>History</em>}</li>
 *   <li>{@link scxml.Parallel#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends NamedElement {
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
	 * @see scxml.ScxmlPackage#getParallel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link scxml.Parallel#getId <em>Id</em>}' attribute.
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
	 * @see scxml.ScxmlPackage#getParallel_Onentry()
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
	 * @see scxml.ScxmlPackage#getParallel_Onexit()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnExit> getOnexit();

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Parallel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getParallel_Parallel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parallel> getParallel();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getParallel_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.HistoryState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getParallel_History()
	 * @model containment="true"
	 * @generated
	 */
	EList<HistoryState> getHistory();

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Anchor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getParallel_Anchor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anchor> getAnchor();

} // Parallel
