/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.Invoke#getContent <em>Content</em>}</li>
 *   <li>{@link scxml.Invoke#getParam <em>Param</em>}</li>
 *   <li>{@link scxml.Invoke#getType <em>Type</em>}</li>
 *   <li>{@link scxml.Invoke#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link scxml.Invoke#getSrc <em>Src</em>}</li>
 *   <li>{@link scxml.Invoke#getSrcexpr <em>Srcexpr</em>}</li>
 *   <li>{@link scxml.Invoke#getId <em>Id</em>}</li>
 *   <li>{@link scxml.Invoke#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link scxml.Invoke#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link scxml.Invoke#getAutoforward <em>Autoforward</em>}</li>
 *   <li>{@link scxml.Invoke#getFinalize <em>Finalize</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Content)
	 * @see scxml.ScxmlPackage#getInvoke_Content()
	 * @model containment="true"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

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
	 * @see scxml.ScxmlPackage#getInvoke_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getParam();

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
	 * @see scxml.ScxmlPackage#getInvoke_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeexpr</em>' attribute.
	 * @see #setTypeexpr(String)
	 * @see scxml.ScxmlPackage#getInvoke_Typeexpr()
	 * @model
	 * @generated
	 */
	String getTypeexpr();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getTypeexpr <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeexpr</em>' attribute.
	 * @see #getTypeexpr()
	 * @generated
	 */
	void setTypeexpr(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see scxml.ScxmlPackage#getInvoke_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Srcexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srcexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcexpr</em>' attribute.
	 * @see #setSrcexpr(String)
	 * @see scxml.ScxmlPackage#getInvoke_Srcexpr()
	 * @model
	 * @generated
	 */
	String getSrcexpr();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getSrcexpr <em>Srcexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcexpr</em>' attribute.
	 * @see #getSrcexpr()
	 * @generated
	 */
	void setSrcexpr(String value);

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
	 * @see scxml.ScxmlPackage#getInvoke_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idlocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idlocation</em>' attribute.
	 * @see #setIdlocation(String)
	 * @see scxml.ScxmlPackage#getInvoke_Idlocation()
	 * @model
	 * @generated
	 */
	String getIdlocation();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getIdlocation <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idlocation</em>' attribute.
	 * @see #getIdlocation()
	 * @generated
	 */
	void setIdlocation(String value);

	/**
	 * Returns the value of the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namelist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namelist</em>' attribute.
	 * @see #setNamelist(String)
	 * @see scxml.ScxmlPackage#getInvoke_Namelist()
	 * @model
	 * @generated
	 */
	String getNamelist();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getNamelist <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namelist</em>' attribute.
	 * @see #getNamelist()
	 * @generated
	 */
	void setNamelist(String value);

	/**
	 * Returns the value of the '<em><b>Autoforward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoforward</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoforward</em>' attribute.
	 * @see #setAutoforward(String)
	 * @see scxml.ScxmlPackage#getInvoke_Autoforward()
	 * @model
	 * @generated
	 */
	String getAutoforward();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getAutoforward <em>Autoforward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoforward</em>' attribute.
	 * @see #getAutoforward()
	 * @generated
	 */
	void setAutoforward(String value);

	/**
	 * Returns the value of the '<em><b>Finalize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalize</em>' containment reference.
	 * @see #setFinalize(Finalize)
	 * @see scxml.ScxmlPackage#getInvoke_Finalize()
	 * @model containment="true"
	 * @generated
	 */
	Finalize getFinalize();

	/**
	 * Sets the value of the '{@link scxml.Invoke#getFinalize <em>Finalize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalize</em>' containment reference.
	 * @see #getFinalize()
	 * @generated
	 */
	void setFinalize(Finalize value);

} // Invoke
