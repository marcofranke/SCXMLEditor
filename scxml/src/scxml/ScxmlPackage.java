/**
 */
package scxml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scxml.ScxmlFactory
 * @model kind="package"
 * @generated
 */
public interface ScxmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scxml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///scxml.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scxml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScxmlPackage eINSTANCE = scxml.impl.ScxmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link scxml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.NamedElementImpl
	 * @see scxml.impl.ScxmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DATAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.StateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DATAMODEL = NAMED_ELEMENT__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION = NAMED_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ONENTRY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ONEXIT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARALLEL = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANCHOR = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INVOKE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scxml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.TransitionImpl
	 * @see scxml.impl.ScxmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COND = 3;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANCHOR = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.AssignImpl
	 * @see scxml.impl.ScxmlPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Dataid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DATAID = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXPR = 2;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ServiceTemplateImpl <em>Service Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ServiceTemplateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getServiceTemplate()
	 * @generated
	 */
	int SERVICE_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Xmlns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__XMLNS = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Exmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__EXMODE = 6;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__INITIAL = 7;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__FINAL = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__DATAMODEL = 10;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE__SCRIPT = 11;

	/**
	 * The number of structural features of the '<em>Service Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Service Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.OnEntryImpl <em>On Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.OnEntryImpl
	 * @see scxml.impl.ScxmlPackageImpl#getOnEntry()
	 * @generated
	 */
	int ON_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__ASSIGN = 1;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__CANCEL = 2;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__IF = 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__LOG = 4;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__PARAM = 5;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__RAISE = 6;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__SEND = 7;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY__VALIDATE = 8;

	/**
	 * The number of structural features of the '<em>On Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>On Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.OnExitImpl <em>On Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.OnExitImpl
	 * @see scxml.impl.ScxmlPackageImpl#getOnExit()
	 * @generated
	 */
	int ON_EXIT = 6;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__ASSIGN = 1;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__CANCEL = 2;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__IF = 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__LOG = 4;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__PARAM = 5;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__RAISE = 6;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__SEND = 7;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT__VALIDATE = 8;

	/**
	 * The number of structural features of the '<em>On Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>On Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.InitialStateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DATAMODEL = NAMED_ELEMENT__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__TRANSITION = NAMED_ELEMENT__TRANSITION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scxml.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.FinalStateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DATAMODEL = NAMED_ELEMENT__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__TRANSITION = NAMED_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ONENTRY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ONEXIT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Donedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DONEDATA = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ParallelImpl
	 * @see scxml.impl.ScxmlPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DATAMODEL = NAMED_ELEMENT__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TRANSITION = NAMED_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ONENTRY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Onexit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ONEXIT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PARALLEL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STATE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ANCHOR = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scxml.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.HistoryStateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 10;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__DATAMODEL = NAMED_ELEMENT__DATAMODEL;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__TRANSITION = NAMED_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scxml.impl.RaiseImpl <em>Raise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.RaiseImpl
	 * @see scxml.impl.ScxmlPackageImpl#getRaise()
	 * @generated
	 */
	int RAISE = 11;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__EVENT = 0;

	/**
	 * The number of structural features of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.IfImpl
	 * @see scxml.impl.ScxmlPackageImpl#getIf()
	 * @generated
	 */
	int IF = 12;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = 0;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = 2;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ASSIGN = 3;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CANCEL = 4;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF = 5;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__LOG = 6;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PARAM = 7;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__RAISE = 8;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SEND = 9;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__VALIDATE = 10;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ElseIfImpl
	 * @see scxml.impl.ScxmlPackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 13;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__COND = 0;

	/**
	 * The number of structural features of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ElseImpl
	 * @see scxml.impl.ScxmlPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 14;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.LogImpl
	 * @see scxml.impl.ScxmlPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__EXPR = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.DataModelImpl
	 * @see scxml.impl.ScxmlPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.DataImpl
	 * @see scxml.impl.ScxmlPackageImpl#getData()
	 * @generated
	 */
	int DATA = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SRC = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXPR = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CONTENT = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ValidateImpl
	 * @see scxml.impl.ScxmlPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ParamImpl
	 * @see scxml.impl.ScxmlPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ScriptImpl
	 * @see scxml.impl.ScxmlPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 20;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.AnchorImpl
	 * @see scxml.impl.ScxmlPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Snapshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__SNAPSHOT = 1;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.SendImpl
	 * @see scxml.impl.ScxmlPackageImpl#getSend()
	 * @generated
	 */
	int SEND = 22;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Eventexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__EVENTEXPR = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Targetexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TARGETEXPR = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TYPEEXPR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ID = 6;

	/**
	 * The feature id for the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__IDLOCATION = 7;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__DELAY = 8;

	/**
	 * The feature id for the '<em><b>Delayexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__DELAYEXPR = 9;

	/**
	 * The feature id for the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__NAMELIST = 10;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__HINTS = 11;

	/**
	 * The feature id for the '<em><b>Hintsexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__HINTSEXPR = 12;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__PARAM = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__CONTENT = 14;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.CancelImpl <em>Cancel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.CancelImpl
	 * @see scxml.impl.ScxmlPackageImpl#getCancel()
	 * @generated
	 */
	int CANCEL = 23;

	/**
	 * The feature id for the '<em><b>Sendid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__SENDID = 0;

	/**
	 * The feature id for the '<em><b>Sendidexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__SENDIDEXPR = 1;

	/**
	 * The number of structural features of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.ContentImpl
	 * @see scxml.impl.ScxmlPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 24;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.DonedataImpl <em>Donedata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.DonedataImpl
	 * @see scxml.impl.ScxmlPackageImpl#getDonedata()
	 * @generated
	 */
	int DONEDATA = 25;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA__PARAM = 1;

	/**
	 * The number of structural features of the '<em>Donedata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Donedata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONEDATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.InvokeImpl
	 * @see scxml.impl.ScxmlPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 26;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Typeexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TYPEEXPR = 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SRC = 4;

	/**
	 * The feature id for the '<em><b>Srcexpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SRCEXPR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ID = 6;

	/**
	 * The feature id for the '<em><b>Idlocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__IDLOCATION = 7;

	/**
	 * The feature id for the '<em><b>Namelist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAMELIST = 8;

	/**
	 * The feature id for the '<em><b>Autoforward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__AUTOFORWARD = 9;

	/**
	 * The feature id for the '<em><b>Finalize</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FINALIZE = 10;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scxml.impl.FinalizeImpl <em>Finalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scxml.impl.FinalizeImpl
	 * @see scxml.impl.ScxmlPackageImpl#getFinalize()
	 * @generated
	 */
	int FINALIZE = 27;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__ASSIGN = 0;

	/**
	 * The feature id for the '<em><b>Cancel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__CANCEL = 1;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__IF = 2;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__LOG = 3;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__PARAM = 4;

	/**
	 * The feature id for the '<em><b>Raise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__RAISE = 5;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__SEND = 6;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__VALIDATE = 7;

	/**
	 * The number of structural features of the '<em>Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link scxml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see scxml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.NamedElement#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datamodel</em>'.
	 * @see scxml.NamedElement#getDatamodel()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Datamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.NamedElement#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see scxml.NamedElement#getTransition()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Transition();

	/**
	 * Returns the meta object for class '{@link scxml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see scxml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link scxml.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.State#getId()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getOnentry <em>Onentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onentry</em>'.
	 * @see scxml.State#getOnentry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Onentry();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getOnexit <em>Onexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onexit</em>'.
	 * @see scxml.State#getOnexit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Onexit();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.State#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see scxml.State#getInitial()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see scxml.State#getState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_State();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final</em>'.
	 * @see scxml.State#getFinal()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see scxml.State#getParallel()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see scxml.State#getHistory()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_History();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchor</em>'.
	 * @see scxml.State#getAnchor()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Anchor();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.State#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoke</em>'.
	 * @see scxml.State#getInvoke()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Invoke();

	/**
	 * Returns the meta object for class '{@link scxml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see scxml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link scxml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see scxml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link scxml.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see scxml.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see scxml.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Transition#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see scxml.Transition#getCond()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Cond();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Transition#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see scxml.Transition#getAnchor()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Anchor();

	/**
	 * Returns the meta object for class '{@link scxml.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see scxml.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Assign#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see scxml.Assign#getLocation()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Location();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Assign#getDataid <em>Dataid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataid</em>'.
	 * @see scxml.Assign#getDataid()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Dataid();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Assign#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see scxml.Assign#getExpr()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Expr();

	/**
	 * Returns the meta object for class '{@link scxml.ServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Template</em>'.
	 * @see scxml.ServiceTemplate
	 * @generated
	 */
	EClass getServiceTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.ServiceTemplate#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see scxml.ServiceTemplate#getTransition()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.ServiceTemplate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see scxml.ServiceTemplate#getState()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_State();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ServiceTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scxml.ServiceTemplate#getName()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ServiceTemplate#getXmlns <em>Xmlns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlns</em>'.
	 * @see scxml.ServiceTemplate#getXmlns()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_Xmlns();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ServiceTemplate#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see scxml.ServiceTemplate#getVersion()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_Version();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ServiceTemplate#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see scxml.ServiceTemplate#getProfile()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_Profile();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ServiceTemplate#getExmode <em>Exmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exmode</em>'.
	 * @see scxml.ServiceTemplate#getExmode()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EAttribute getServiceTemplate_Exmode();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.ServiceTemplate#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see scxml.ServiceTemplate#getInitial()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.ServiceTemplate#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final</em>'.
	 * @see scxml.ServiceTemplate#getFinal()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.ServiceTemplate#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see scxml.ServiceTemplate#getParallel()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.ServiceTemplate#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datamodel</em>'.
	 * @see scxml.ServiceTemplate#getDatamodel()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Datamodel();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.ServiceTemplate#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see scxml.ServiceTemplate#getScript()
	 * @see #getServiceTemplate()
	 * @generated
	 */
	EReference getServiceTemplate_Script();

	/**
	 * Returns the meta object for class '{@link scxml.OnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Entry</em>'.
	 * @see scxml.OnEntry
	 * @generated
	 */
	EClass getOnEntry();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.OnEntry#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see scxml.OnEntry#getScript()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see scxml.OnEntry#getAssign()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel</em>'.
	 * @see scxml.OnEntry#getCancel()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Cancel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see scxml.OnEntry#getIf()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_If();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see scxml.OnEntry#getLog()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.OnEntry#getParam()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getRaise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise</em>'.
	 * @see scxml.OnEntry#getRaise()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Raise();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see scxml.OnEntry#getSend()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnEntry#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see scxml.OnEntry#getValidate()
	 * @see #getOnEntry()
	 * @generated
	 */
	EReference getOnEntry_Validate();

	/**
	 * Returns the meta object for class '{@link scxml.OnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Exit</em>'.
	 * @see scxml.OnExit
	 * @generated
	 */
	EClass getOnExit();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.OnExit#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see scxml.OnExit#getScript()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see scxml.OnExit#getAssign()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel</em>'.
	 * @see scxml.OnExit#getCancel()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Cancel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see scxml.OnExit#getIf()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_If();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see scxml.OnExit#getLog()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.OnExit#getParam()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getRaise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise</em>'.
	 * @see scxml.OnExit#getRaise()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Raise();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see scxml.OnExit#getSend()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.OnExit#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see scxml.OnExit#getValidate()
	 * @see #getOnExit()
	 * @generated
	 */
	EReference getOnExit_Validate();

	/**
	 * Returns the meta object for class '{@link scxml.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see scxml.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link scxml.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see scxml.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the attribute '{@link scxml.FinalState#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.FinalState#getId()
	 * @see #getFinalState()
	 * @generated
	 */
	EAttribute getFinalState_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.FinalState#getOnentry <em>Onentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onentry</em>'.
	 * @see scxml.FinalState#getOnentry()
	 * @see #getFinalState()
	 * @generated
	 */
	EReference getFinalState_Onentry();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.FinalState#getOnexit <em>Onexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onexit</em>'.
	 * @see scxml.FinalState#getOnexit()
	 * @see #getFinalState()
	 * @generated
	 */
	EReference getFinalState_Onexit();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.FinalState#getDonedata <em>Donedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Donedata</em>'.
	 * @see scxml.FinalState#getDonedata()
	 * @see #getFinalState()
	 * @generated
	 */
	EReference getFinalState_Donedata();

	/**
	 * Returns the meta object for class '{@link scxml.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see scxml.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Parallel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.Parallel#getId()
	 * @see #getParallel()
	 * @generated
	 */
	EAttribute getParallel_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getOnentry <em>Onentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onentry</em>'.
	 * @see scxml.Parallel#getOnentry()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Onentry();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getOnexit <em>Onexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onexit</em>'.
	 * @see scxml.Parallel#getOnexit()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Onexit();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see scxml.Parallel#getParallel()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see scxml.Parallel#getState()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_State();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see scxml.Parallel#getHistory()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_History();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Parallel#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anchor</em>'.
	 * @see scxml.Parallel#getAnchor()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Anchor();

	/**
	 * Returns the meta object for class '{@link scxml.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see scxml.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for the attribute '{@link scxml.HistoryState#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.HistoryState#getId()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Id();

	/**
	 * Returns the meta object for the attribute '{@link scxml.HistoryState#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scxml.HistoryState#getType()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Type();

	/**
	 * Returns the meta object for class '{@link scxml.Raise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise</em>'.
	 * @see scxml.Raise
	 * @generated
	 */
	EClass getRaise();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Raise#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see scxml.Raise#getEvent()
	 * @see #getRaise()
	 * @generated
	 */
	EAttribute getRaise_Event();

	/**
	 * Returns the meta object for class '{@link scxml.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see scxml.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link scxml.If#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see scxml.If#getCond()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see scxml.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see scxml.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see scxml.If#getAssign()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel</em>'.
	 * @see scxml.If#getCancel()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Cancel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see scxml.If#getIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_If();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see scxml.If#getLog()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.If#getParam()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getRaise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise</em>'.
	 * @see scxml.If#getRaise()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Raise();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see scxml.If#getSend()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.If#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see scxml.If#getValidate()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Validate();

	/**
	 * Returns the meta object for class '{@link scxml.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see scxml.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for the attribute '{@link scxml.ElseIf#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see scxml.ElseIf#getCond()
	 * @see #getElseIf()
	 * @generated
	 */
	EAttribute getElseIf_Cond();

	/**
	 * Returns the meta object for class '{@link scxml.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see scxml.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for class '{@link scxml.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see scxml.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Log#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see scxml.Log#getLabel()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Label();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Log#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see scxml.Log#getExpr()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Expr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Log#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see scxml.Log#getLevel()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Level();

	/**
	 * Returns the meta object for class '{@link scxml.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see scxml.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link scxml.DataModel#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see scxml.DataModel#getSchema()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.DataModel#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see scxml.DataModel#getData()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Data();

	/**
	 * Returns the meta object for class '{@link scxml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see scxml.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Data#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see scxml.Data#getSrc()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Src();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Data#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see scxml.Data#getExpr()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.Data#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see scxml.Data#getContent()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Content();

	/**
	 * Returns the meta object for class '{@link scxml.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see scxml.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Validate#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see scxml.Validate#getLocation()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Location();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Validate#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see scxml.Validate#getSchema()
	 * @see #getValidate()
	 * @generated
	 */
	EAttribute getValidate_Schema();

	/**
	 * Returns the meta object for class '{@link scxml.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see scxml.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scxml.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Param#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see scxml.Param#getExpr()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Expr();

	/**
	 * Returns the meta object for class '{@link scxml.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see scxml.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for class '{@link scxml.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see scxml.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Anchor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scxml.Anchor#getType()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Type();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Anchor#getSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot</em>'.
	 * @see scxml.Anchor#getSnapshot()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Snapshot();

	/**
	 * Returns the meta object for class '{@link scxml.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see scxml.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see scxml.Send#getEvent()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Event();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getEventexpr <em>Eventexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eventexpr</em>'.
	 * @see scxml.Send#getEventexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Eventexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see scxml.Send#getTarget()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Target();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getTargetexpr <em>Targetexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetexpr</em>'.
	 * @see scxml.Send#getTargetexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Targetexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scxml.Send#getType()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Type();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getTypeexpr <em>Typeexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeexpr</em>'.
	 * @see scxml.Send#getTypeexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Typeexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.Send#getId()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Id();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getIdlocation <em>Idlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idlocation</em>'.
	 * @see scxml.Send#getIdlocation()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Idlocation();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see scxml.Send#getDelay()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Delay();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getDelayexpr <em>Delayexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delayexpr</em>'.
	 * @see scxml.Send#getDelayexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Delayexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getNamelist <em>Namelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namelist</em>'.
	 * @see scxml.Send#getNamelist()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Namelist();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hints</em>'.
	 * @see scxml.Send#getHints()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Hints();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Send#getHintsexpr <em>Hintsexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hintsexpr</em>'.
	 * @see scxml.Send#getHintsexpr()
	 * @see #getSend()
	 * @generated
	 */
	EAttribute getSend_Hintsexpr();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Send#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.Send#getParam()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Param();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.Send#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see scxml.Send#getContent()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Content();

	/**
	 * Returns the meta object for class '{@link scxml.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel</em>'.
	 * @see scxml.Cancel
	 * @generated
	 */
	EClass getCancel();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Cancel#getSendid <em>Sendid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendid</em>'.
	 * @see scxml.Cancel#getSendid()
	 * @see #getCancel()
	 * @generated
	 */
	EAttribute getCancel_Sendid();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Cancel#getSendidexpr <em>Sendidexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendidexpr</em>'.
	 * @see scxml.Cancel#getSendidexpr()
	 * @see #getCancel()
	 * @generated
	 */
	EAttribute getCancel_Sendidexpr();

	/**
	 * Returns the meta object for class '{@link scxml.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see scxml.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Content#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see scxml.Content#getContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Content();

	/**
	 * Returns the meta object for class '{@link scxml.Donedata <em>Donedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donedata</em>'.
	 * @see scxml.Donedata
	 * @generated
	 */
	EClass getDonedata();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.Donedata#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see scxml.Donedata#getContent()
	 * @see #getDonedata()
	 * @generated
	 */
	EReference getDonedata_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Donedata#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.Donedata#getParam()
	 * @see #getDonedata()
	 * @generated
	 */
	EReference getDonedata_Param();

	/**
	 * Returns the meta object for class '{@link scxml.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see scxml.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.Invoke#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see scxml.Invoke#getContent()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Invoke#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.Invoke#getParam()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Param();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scxml.Invoke#getType()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Type();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getTypeexpr <em>Typeexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeexpr</em>'.
	 * @see scxml.Invoke#getTypeexpr()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Typeexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see scxml.Invoke#getSrc()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Src();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getSrcexpr <em>Srcexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srcexpr</em>'.
	 * @see scxml.Invoke#getSrcexpr()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Srcexpr();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see scxml.Invoke#getId()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Id();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getIdlocation <em>Idlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idlocation</em>'.
	 * @see scxml.Invoke#getIdlocation()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Idlocation();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getNamelist <em>Namelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namelist</em>'.
	 * @see scxml.Invoke#getNamelist()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Namelist();

	/**
	 * Returns the meta object for the attribute '{@link scxml.Invoke#getAutoforward <em>Autoforward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoforward</em>'.
	 * @see scxml.Invoke#getAutoforward()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Autoforward();

	/**
	 * Returns the meta object for the containment reference '{@link scxml.Invoke#getFinalize <em>Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finalize</em>'.
	 * @see scxml.Invoke#getFinalize()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Finalize();

	/**
	 * Returns the meta object for class '{@link scxml.Finalize <em>Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize</em>'.
	 * @see scxml.Finalize
	 * @generated
	 */
	EClass getFinalize();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see scxml.Finalize#getAssign()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Assign();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getCancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cancel</em>'.
	 * @see scxml.Finalize#getCancel()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Cancel();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see scxml.Finalize#getIf()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_If();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see scxml.Finalize#getLog()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see scxml.Finalize#getParam()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getRaise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raise</em>'.
	 * @see scxml.Finalize#getRaise()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Raise();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send</em>'.
	 * @see scxml.Finalize#getSend()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link scxml.Finalize#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see scxml.Finalize#getValidate()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Validate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScxmlFactory getScxmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scxml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.NamedElementImpl
		 * @see scxml.impl.ScxmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__DATAMODEL = eINSTANCE.getNamedElement_Datamodel();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__TRANSITION = eINSTANCE.getNamedElement_Transition();

		/**
		 * The meta object literal for the '{@link scxml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.StateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '<em><b>Onentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ONENTRY = eINSTANCE.getState_Onentry();

		/**
		 * The meta object literal for the '<em><b>Onexit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ONEXIT = eINSTANCE.getState_Onexit();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE = eINSTANCE.getState_State();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FINAL = eINSTANCE.getState_Final();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARALLEL = eINSTANCE.getState_Parallel();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HISTORY = eINSTANCE.getState_History();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ANCHOR = eINSTANCE.getState_Anchor();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INVOKE = eINSTANCE.getState_Invoke();

		/**
		 * The meta object literal for the '{@link scxml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.TransitionImpl
		 * @see scxml.impl.ScxmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__COND = eINSTANCE.getTransition_Cond();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ANCHOR = eINSTANCE.getTransition_Anchor();

		/**
		 * The meta object literal for the '{@link scxml.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.AssignImpl
		 * @see scxml.impl.ScxmlPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__LOCATION = eINSTANCE.getAssign_Location();

		/**
		 * The meta object literal for the '<em><b>Dataid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__DATAID = eINSTANCE.getAssign_Dataid();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__EXPR = eINSTANCE.getAssign_Expr();

		/**
		 * The meta object literal for the '{@link scxml.impl.ServiceTemplateImpl <em>Service Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ServiceTemplateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getServiceTemplate()
		 * @generated
		 */
		EClass SERVICE_TEMPLATE = eINSTANCE.getServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__TRANSITION = eINSTANCE.getServiceTemplate_Transition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__STATE = eINSTANCE.getServiceTemplate_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__NAME = eINSTANCE.getServiceTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Xmlns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__XMLNS = eINSTANCE.getServiceTemplate_Xmlns();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__VERSION = eINSTANCE.getServiceTemplate_Version();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__PROFILE = eINSTANCE.getServiceTemplate_Profile();

		/**
		 * The meta object literal for the '<em><b>Exmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TEMPLATE__EXMODE = eINSTANCE.getServiceTemplate_Exmode();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__INITIAL = eINSTANCE.getServiceTemplate_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__FINAL = eINSTANCE.getServiceTemplate_Final();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__PARALLEL = eINSTANCE.getServiceTemplate_Parallel();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__DATAMODEL = eINSTANCE.getServiceTemplate_Datamodel();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TEMPLATE__SCRIPT = eINSTANCE.getServiceTemplate_Script();

		/**
		 * The meta object literal for the '{@link scxml.impl.OnEntryImpl <em>On Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.OnEntryImpl
		 * @see scxml.impl.ScxmlPackageImpl#getOnEntry()
		 * @generated
		 */
		EClass ON_ENTRY = eINSTANCE.getOnEntry();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__SCRIPT = eINSTANCE.getOnEntry_Script();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__ASSIGN = eINSTANCE.getOnEntry_Assign();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__CANCEL = eINSTANCE.getOnEntry_Cancel();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__IF = eINSTANCE.getOnEntry_If();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__LOG = eINSTANCE.getOnEntry_Log();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__PARAM = eINSTANCE.getOnEntry_Param();

		/**
		 * The meta object literal for the '<em><b>Raise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__RAISE = eINSTANCE.getOnEntry_Raise();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__SEND = eINSTANCE.getOnEntry_Send();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ENTRY__VALIDATE = eINSTANCE.getOnEntry_Validate();

		/**
		 * The meta object literal for the '{@link scxml.impl.OnExitImpl <em>On Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.OnExitImpl
		 * @see scxml.impl.ScxmlPackageImpl#getOnExit()
		 * @generated
		 */
		EClass ON_EXIT = eINSTANCE.getOnExit();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__SCRIPT = eINSTANCE.getOnExit_Script();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__ASSIGN = eINSTANCE.getOnExit_Assign();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__CANCEL = eINSTANCE.getOnExit_Cancel();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__IF = eINSTANCE.getOnExit_If();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__LOG = eINSTANCE.getOnExit_Log();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__PARAM = eINSTANCE.getOnExit_Param();

		/**
		 * The meta object literal for the '<em><b>Raise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__RAISE = eINSTANCE.getOnExit_Raise();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__SEND = eINSTANCE.getOnExit_Send();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_EXIT__VALIDATE = eINSTANCE.getOnExit_Validate();

		/**
		 * The meta object literal for the '{@link scxml.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.InitialStateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link scxml.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.FinalStateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_STATE__ID = eINSTANCE.getFinalState_Id();

		/**
		 * The meta object literal for the '<em><b>Onentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE__ONENTRY = eINSTANCE.getFinalState_Onentry();

		/**
		 * The meta object literal for the '<em><b>Onexit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE__ONEXIT = eINSTANCE.getFinalState_Onexit();

		/**
		 * The meta object literal for the '<em><b>Donedata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE__DONEDATA = eINSTANCE.getFinalState_Donedata();

		/**
		 * The meta object literal for the '{@link scxml.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ParallelImpl
		 * @see scxml.impl.ScxmlPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL__ID = eINSTANCE.getParallel_Id();

		/**
		 * The meta object literal for the '<em><b>Onentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__ONENTRY = eINSTANCE.getParallel_Onentry();

		/**
		 * The meta object literal for the '<em><b>Onexit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__ONEXIT = eINSTANCE.getParallel_Onexit();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__PARALLEL = eINSTANCE.getParallel_Parallel();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__STATE = eINSTANCE.getParallel_State();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__HISTORY = eINSTANCE.getParallel_History();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__ANCHOR = eINSTANCE.getParallel_Anchor();

		/**
		 * The meta object literal for the '{@link scxml.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.HistoryStateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getHistoryState()
		 * @generated
		 */
		EClass HISTORY_STATE = eINSTANCE.getHistoryState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY_STATE__ID = eINSTANCE.getHistoryState_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY_STATE__TYPE = eINSTANCE.getHistoryState_Type();

		/**
		 * The meta object literal for the '{@link scxml.impl.RaiseImpl <em>Raise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.RaiseImpl
		 * @see scxml.impl.ScxmlPackageImpl#getRaise()
		 * @generated
		 */
		EClass RAISE = eINSTANCE.getRaise();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAISE__EVENT = eINSTANCE.getRaise_Event();

		/**
		 * The meta object literal for the '{@link scxml.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.IfImpl
		 * @see scxml.impl.ScxmlPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__COND = eINSTANCE.getIf_Cond();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ASSIGN = eINSTANCE.getIf_Assign();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CANCEL = eINSTANCE.getIf_Cancel();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF = eINSTANCE.getIf_If();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__LOG = eINSTANCE.getIf_Log();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__PARAM = eINSTANCE.getIf_Param();

		/**
		 * The meta object literal for the '<em><b>Raise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__RAISE = eINSTANCE.getIf_Raise();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__SEND = eINSTANCE.getIf_Send();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__VALIDATE = eINSTANCE.getIf_Validate();

		/**
		 * The meta object literal for the '{@link scxml.impl.ElseIfImpl <em>Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ElseIfImpl
		 * @see scxml.impl.ScxmlPackageImpl#getElseIf()
		 * @generated
		 */
		EClass ELSE_IF = eINSTANCE.getElseIf();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELSE_IF__COND = eINSTANCE.getElseIf_Cond();

		/**
		 * The meta object literal for the '{@link scxml.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ElseImpl
		 * @see scxml.impl.ScxmlPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '{@link scxml.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.LogImpl
		 * @see scxml.impl.ScxmlPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LABEL = eINSTANCE.getLog_Label();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__EXPR = eINSTANCE.getLog_Expr();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LEVEL = eINSTANCE.getLog_Level();

		/**
		 * The meta object literal for the '{@link scxml.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.DataModelImpl
		 * @see scxml.impl.ScxmlPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__SCHEMA = eINSTANCE.getDataModel_Schema();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATA = eINSTANCE.getDataModel_Data();

		/**
		 * The meta object literal for the '{@link scxml.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.DataImpl
		 * @see scxml.impl.ScxmlPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SRC = eINSTANCE.getData_Src();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__EXPR = eINSTANCE.getData_Expr();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__CONTENT = eINSTANCE.getData_Content();

		/**
		 * The meta object literal for the '{@link scxml.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ValidateImpl
		 * @see scxml.impl.ScxmlPackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__LOCATION = eINSTANCE.getValidate_Location();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE__SCHEMA = eINSTANCE.getValidate_Schema();

		/**
		 * The meta object literal for the '{@link scxml.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ParamImpl
		 * @see scxml.impl.ScxmlPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__EXPR = eINSTANCE.getParam_Expr();

		/**
		 * The meta object literal for the '{@link scxml.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ScriptImpl
		 * @see scxml.impl.ScxmlPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '{@link scxml.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.AnchorImpl
		 * @see scxml.impl.ScxmlPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TYPE = eINSTANCE.getAnchor_Type();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__SNAPSHOT = eINSTANCE.getAnchor_Snapshot();

		/**
		 * The meta object literal for the '{@link scxml.impl.SendImpl <em>Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.SendImpl
		 * @see scxml.impl.ScxmlPackageImpl#getSend()
		 * @generated
		 */
		EClass SEND = eINSTANCE.getSend();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__EVENT = eINSTANCE.getSend_Event();

		/**
		 * The meta object literal for the '<em><b>Eventexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__EVENTEXPR = eINSTANCE.getSend_Eventexpr();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TARGET = eINSTANCE.getSend_Target();

		/**
		 * The meta object literal for the '<em><b>Targetexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TARGETEXPR = eINSTANCE.getSend_Targetexpr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TYPE = eINSTANCE.getSend_Type();

		/**
		 * The meta object literal for the '<em><b>Typeexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__TYPEEXPR = eINSTANCE.getSend_Typeexpr();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__ID = eINSTANCE.getSend_Id();

		/**
		 * The meta object literal for the '<em><b>Idlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__IDLOCATION = eINSTANCE.getSend_Idlocation();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__DELAY = eINSTANCE.getSend_Delay();

		/**
		 * The meta object literal for the '<em><b>Delayexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__DELAYEXPR = eINSTANCE.getSend_Delayexpr();

		/**
		 * The meta object literal for the '<em><b>Namelist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__NAMELIST = eINSTANCE.getSend_Namelist();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__HINTS = eINSTANCE.getSend_Hints();

		/**
		 * The meta object literal for the '<em><b>Hintsexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND__HINTSEXPR = eINSTANCE.getSend_Hintsexpr();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__PARAM = eINSTANCE.getSend_Param();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__CONTENT = eINSTANCE.getSend_Content();

		/**
		 * The meta object literal for the '{@link scxml.impl.CancelImpl <em>Cancel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.CancelImpl
		 * @see scxml.impl.ScxmlPackageImpl#getCancel()
		 * @generated
		 */
		EClass CANCEL = eINSTANCE.getCancel();

		/**
		 * The meta object literal for the '<em><b>Sendid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL__SENDID = eINSTANCE.getCancel_Sendid();

		/**
		 * The meta object literal for the '<em><b>Sendidexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL__SENDIDEXPR = eINSTANCE.getCancel_Sendidexpr();

		/**
		 * The meta object literal for the '{@link scxml.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.ContentImpl
		 * @see scxml.impl.ScxmlPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENT = eINSTANCE.getContent_Content();

		/**
		 * The meta object literal for the '{@link scxml.impl.DonedataImpl <em>Donedata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.DonedataImpl
		 * @see scxml.impl.ScxmlPackageImpl#getDonedata()
		 * @generated
		 */
		EClass DONEDATA = eINSTANCE.getDonedata();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONEDATA__CONTENT = eINSTANCE.getDonedata_Content();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONEDATA__PARAM = eINSTANCE.getDonedata_Param();

		/**
		 * The meta object literal for the '{@link scxml.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.InvokeImpl
		 * @see scxml.impl.ScxmlPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__CONTENT = eINSTANCE.getInvoke_Content();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__PARAM = eINSTANCE.getInvoke_Param();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TYPE = eINSTANCE.getInvoke_Type();

		/**
		 * The meta object literal for the '<em><b>Typeexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TYPEEXPR = eINSTANCE.getInvoke_Typeexpr();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__SRC = eINSTANCE.getInvoke_Src();

		/**
		 * The meta object literal for the '<em><b>Srcexpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__SRCEXPR = eINSTANCE.getInvoke_Srcexpr();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__ID = eINSTANCE.getInvoke_Id();

		/**
		 * The meta object literal for the '<em><b>Idlocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__IDLOCATION = eINSTANCE.getInvoke_Idlocation();

		/**
		 * The meta object literal for the '<em><b>Namelist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__NAMELIST = eINSTANCE.getInvoke_Namelist();

		/**
		 * The meta object literal for the '<em><b>Autoforward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__AUTOFORWARD = eINSTANCE.getInvoke_Autoforward();

		/**
		 * The meta object literal for the '<em><b>Finalize</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FINALIZE = eINSTANCE.getInvoke_Finalize();

		/**
		 * The meta object literal for the '{@link scxml.impl.FinalizeImpl <em>Finalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scxml.impl.FinalizeImpl
		 * @see scxml.impl.ScxmlPackageImpl#getFinalize()
		 * @generated
		 */
		EClass FINALIZE = eINSTANCE.getFinalize();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__ASSIGN = eINSTANCE.getFinalize_Assign();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__CANCEL = eINSTANCE.getFinalize_Cancel();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__IF = eINSTANCE.getFinalize_If();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__LOG = eINSTANCE.getFinalize_Log();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__PARAM = eINSTANCE.getFinalize_Param();

		/**
		 * The meta object literal for the '<em><b>Raise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__RAISE = eINSTANCE.getFinalize_Raise();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__SEND = eINSTANCE.getFinalize_Send();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__VALIDATE = eINSTANCE.getFinalize_Validate();

	}

} //ScxmlPackage
