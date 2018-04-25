/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.ServiceTemplate#getTransition <em>Transition</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getState <em>State</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getName <em>Name</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getVersion <em>Version</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getProfile <em>Profile</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getExmode <em>Exmode</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getInitial <em>Initial</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getFinal <em>Final</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getParallel <em>Parallel</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link scxml.ServiceTemplate#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getServiceTemplate()
 * @model
 * @generated
 */
public interface ServiceTemplate extends EObject {
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
	 * @see scxml.ScxmlPackage#getServiceTemplate_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

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
	 * @see scxml.ScxmlPackage#getServiceTemplate_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xmlns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmlns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmlns</em>' attribute.
	 * @see #setXmlns(String)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Xmlns()
	 * @model
	 * @generated
	 */
	String getXmlns();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getXmlns <em>Xmlns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmlns</em>' attribute.
	 * @see #getXmlns()
	 * @generated
	 */
	void setXmlns(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Profile()
	 * @model
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Exmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exmode</em>' attribute.
	 * @see #setExmode(String)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Exmode()
	 * @model
	 * @generated
	 */
	String getExmode();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getExmode <em>Exmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exmode</em>' attribute.
	 * @see #getExmode()
	 * @generated
	 */
	void setExmode(String value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(InitialState)
	 * @see scxml.ScxmlPackage#getServiceTemplate_Initial()
	 * @model containment="true"
	 * @generated
	 */
	InitialState getInitial();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(InitialState value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference list.
	 * The list contents are of type {@link scxml.FinalState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference list.
	 * @see scxml.ScxmlPackage#getServiceTemplate_Final()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinalState> getFinal();

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
	 * @see scxml.ScxmlPackage#getServiceTemplate_Parallel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parallel> getParallel();

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
	 * @see scxml.ScxmlPackage#getServiceTemplate_Datamodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataModel> getDatamodel();

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
	 * @see scxml.ScxmlPackage#getServiceTemplate_Script()
	 * @model containment="true"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link scxml.ServiceTemplate#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // ServiceTemplate
