/**
 */
package scxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scxml.Send#getEvent <em>Event</em>}</li>
 *   <li>{@link scxml.Send#getEventexpr <em>Eventexpr</em>}</li>
 *   <li>{@link scxml.Send#getTarget <em>Target</em>}</li>
 *   <li>{@link scxml.Send#getTargetexpr <em>Targetexpr</em>}</li>
 *   <li>{@link scxml.Send#getType <em>Type</em>}</li>
 *   <li>{@link scxml.Send#getTypeexpr <em>Typeexpr</em>}</li>
 *   <li>{@link scxml.Send#getId <em>Id</em>}</li>
 *   <li>{@link scxml.Send#getIdlocation <em>Idlocation</em>}</li>
 *   <li>{@link scxml.Send#getDelay <em>Delay</em>}</li>
 *   <li>{@link scxml.Send#getDelayexpr <em>Delayexpr</em>}</li>
 *   <li>{@link scxml.Send#getNamelist <em>Namelist</em>}</li>
 *   <li>{@link scxml.Send#getHints <em>Hints</em>}</li>
 *   <li>{@link scxml.Send#getHintsexpr <em>Hintsexpr</em>}</li>
 *   <li>{@link scxml.Send#getParam <em>Param</em>}</li>
 *   <li>{@link scxml.Send#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see scxml.ScxmlPackage#getSend()
 * @model
 * @generated
 */
public interface Send extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see scxml.ScxmlPackage#getSend_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link scxml.Send#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Eventexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventexpr</em>' attribute.
	 * @see #setEventexpr(String)
	 * @see scxml.ScxmlPackage#getSend_Eventexpr()
	 * @model
	 * @generated
	 */
	String getEventexpr();

	/**
	 * Sets the value of the '{@link scxml.Send#getEventexpr <em>Eventexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventexpr</em>' attribute.
	 * @see #getEventexpr()
	 * @generated
	 */
	void setEventexpr(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see scxml.ScxmlPackage#getSend_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link scxml.Send#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Targetexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetexpr</em>' attribute.
	 * @see #setTargetexpr(String)
	 * @see scxml.ScxmlPackage#getSend_Targetexpr()
	 * @model
	 * @generated
	 */
	String getTargetexpr();

	/**
	 * Sets the value of the '{@link scxml.Send#getTargetexpr <em>Targetexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetexpr</em>' attribute.
	 * @see #getTargetexpr()
	 * @generated
	 */
	void setTargetexpr(String value);

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
	 * @see scxml.ScxmlPackage#getSend_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link scxml.Send#getType <em>Type</em>}' attribute.
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
	 * @see scxml.ScxmlPackage#getSend_Typeexpr()
	 * @model
	 * @generated
	 */
	String getTypeexpr();

	/**
	 * Sets the value of the '{@link scxml.Send#getTypeexpr <em>Typeexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeexpr</em>' attribute.
	 * @see #getTypeexpr()
	 * @generated
	 */
	void setTypeexpr(String value);

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
	 * @see scxml.ScxmlPackage#getSend_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link scxml.Send#getId <em>Id</em>}' attribute.
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
	 * @see scxml.ScxmlPackage#getSend_Idlocation()
	 * @model
	 * @generated
	 */
	String getIdlocation();

	/**
	 * Sets the value of the '{@link scxml.Send#getIdlocation <em>Idlocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idlocation</em>' attribute.
	 * @see #getIdlocation()
	 * @generated
	 */
	void setIdlocation(String value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(String)
	 * @see scxml.ScxmlPackage#getSend_Delay()
	 * @model
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link scxml.Send#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

	/**
	 * Returns the value of the '<em><b>Delayexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delayexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delayexpr</em>' attribute.
	 * @see #setDelayexpr(String)
	 * @see scxml.ScxmlPackage#getSend_Delayexpr()
	 * @model
	 * @generated
	 */
	String getDelayexpr();

	/**
	 * Sets the value of the '{@link scxml.Send#getDelayexpr <em>Delayexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delayexpr</em>' attribute.
	 * @see #getDelayexpr()
	 * @generated
	 */
	void setDelayexpr(String value);

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
	 * @see scxml.ScxmlPackage#getSend_Namelist()
	 * @model
	 * @generated
	 */
	String getNamelist();

	/**
	 * Sets the value of the '{@link scxml.Send#getNamelist <em>Namelist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namelist</em>' attribute.
	 * @see #getNamelist()
	 * @generated
	 */
	void setNamelist(String value);

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' attribute.
	 * @see #setHints(String)
	 * @see scxml.ScxmlPackage#getSend_Hints()
	 * @model
	 * @generated
	 */
	String getHints();

	/**
	 * Sets the value of the '{@link scxml.Send#getHints <em>Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hints</em>' attribute.
	 * @see #getHints()
	 * @generated
	 */
	void setHints(String value);

	/**
	 * Returns the value of the '<em><b>Hintsexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hintsexpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hintsexpr</em>' attribute.
	 * @see #setHintsexpr(String)
	 * @see scxml.ScxmlPackage#getSend_Hintsexpr()
	 * @model
	 * @generated
	 */
	String getHintsexpr();

	/**
	 * Sets the value of the '{@link scxml.Send#getHintsexpr <em>Hintsexpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hintsexpr</em>' attribute.
	 * @see #getHintsexpr()
	 * @generated
	 */
	void setHintsexpr(String value);

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
	 * @see scxml.ScxmlPackage#getSend_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getParam();

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
	 * @see scxml.ScxmlPackage#getSend_Content()
	 * @model containment="true"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link scxml.Send#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

} // Send
