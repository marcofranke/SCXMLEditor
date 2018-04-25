/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.NamedElement#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link scxml.NamedElement#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.DataModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getNamedElement_Datamodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataModel> getDatamodel();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getNamedElement_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // NamedElement
