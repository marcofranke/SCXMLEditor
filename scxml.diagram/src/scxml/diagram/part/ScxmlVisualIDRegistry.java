package scxml.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import scxml.ScxmlPackage;
import scxml.ServiceTemplate;
import scxml.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ScxmlVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "scxml.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ServiceTemplateEditPart.MODEL_ID.equals(view.getType())) {
				return ServiceTemplateEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return scxml.diagram.part.ScxmlVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ScxmlDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ScxmlPackage.eINSTANCE.getServiceTemplate().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ServiceTemplate) domainElement)) {
			return ServiceTemplateEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = scxml.diagram.part.ScxmlVisualIDRegistry.getModelID(containerView);
		if (!ServiceTemplateEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ServiceTemplateEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = scxml.diagram.part.ScxmlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceTemplateEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ServiceTemplateEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return StateEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return InitialStateEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return ParallelEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getDataModel().isSuperTypeOf(domainElement.eClass())) {
				return DataModelEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return ScriptEditPart.VISUAL_ID;
			}
			break;
		case StateStateCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return InitialState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryStateEditPart.VISUAL_ID;
			}
			break;
		case StateStateAttrCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return AnchorEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInvoke().isSuperTypeOf(domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			break;
		case StateStateCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return InitialState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryStateEditPart.VISUAL_ID;
			}
			break;
		case StateStateAttrCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return AnchorEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInvoke().isSuperTypeOf(domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			break;
		case FinalStateFinalCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntryEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExitEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getDonedata().isSuperTypeOf(domainElement.eClass())) {
				return DonedataEditPart.VISUAL_ID;
			}
			break;
		case OnEntryOnEntryCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return AssignEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return CancelEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getElseIf().isSuperTypeOf(domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getElse().isSuperTypeOf(domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return LogEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return ParamEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return RaiseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return SendEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getElseIf().isSuperTypeOf(domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getElse().isSuperTypeOf(domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return LogEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return ParamEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return RaiseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return SendEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			break;
		case OnExitOnExitCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getElseIf().isSuperTypeOf(domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getElse().isSuperTypeOf(domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return LogEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return ParamEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return RaiseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return SendEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			break;
		case DonedataDonedataCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getContent().isSuperTypeOf(domainElement.eClass())) {
				return ContentEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param4EditPart.VISUAL_ID;
			}
			break;
		case ContentContentCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getContent().isSuperTypeOf(domainElement.eClass())) {
				return Content2EditPart.VISUAL_ID;
			}
			break;
		case ContentContentCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getContent().isSuperTypeOf(domainElement.eClass())) {
				return Content2EditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryState2EditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelAttrCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return Anchor2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit3EditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryState2EditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelAttrCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return Anchor2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit3EditPart.VISUAL_ID;
			}
			break;
		case StateStateCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInitialState().isSuperTypeOf(domainElement.eClass())) {
				return InitialState2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryStateEditPart.VISUAL_ID;
			}
			break;
		case StateStateAttrCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return AnchorEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getInvoke().isSuperTypeOf(domainElement.eClass())) {
				return InvokeEditPart.VISUAL_ID;
			}
			break;
		case OnEntryOnEntryCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return AssignEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return CancelEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			break;
		case OnExitOnExitCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			break;
		case InvokeInvokeCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param5EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getFinalize().isSuperTypeOf(domainElement.eClass())) {
				return FinalizeEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getContent().isSuperTypeOf(domainElement.eClass())) {
				return Content3EditPart.VISUAL_ID;
			}
			break;
		case FinalizeFinalizeCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param6EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send4EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate4EditPart.VISUAL_ID;
			}
			break;
		case IfIfCompartment4EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getElseIf().isSuperTypeOf(domainElement.eClass())) {
				return ElseIfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getElse().isSuperTypeOf(domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return LogEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return ParamEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return RaiseEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return SendEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return ValidateEditPart.VISUAL_ID;
			}
			break;
		case ContentContentCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getContent().isSuperTypeOf(domainElement.eClass())) {
				return Content2EditPart.VISUAL_ID;
			}
			break;
		case OnEntryOnEntryCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return AssignEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return CancelEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate2EditPart.VISUAL_ID;
			}
			break;
		case OnExitOnExitCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getScript().isSuperTypeOf(domainElement.eClass())) {
				return Script3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getAssign().isSuperTypeOf(domainElement.eClass())) {
				return Assign3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getCancel().isSuperTypeOf(domainElement.eClass())) {
				return Cancel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getLog().isSuperTypeOf(domainElement.eClass())) {
				return Log3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getParam().isSuperTypeOf(domainElement.eClass())) {
				return Param3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getRaise().isSuperTypeOf(domainElement.eClass())) {
				return Raise3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getSend().isSuperTypeOf(domainElement.eClass())) {
				return Send3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return Validate3EditPart.VISUAL_ID;
			}
			break;
		case FinalStateFinalCompartment2EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntryEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExitEditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getDonedata().isSuperTypeOf(domainElement.eClass())) {
				return DonedataEditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
				return Parallel3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return State3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getHistoryState().isSuperTypeOf(domainElement.eClass())) {
				return HistoryState2EditPart.VISUAL_ID;
			}
			break;
		case ParallelParallelAttrCompartment3EditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getAnchor().isSuperTypeOf(domainElement.eClass())) {
				return Anchor2EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnEntry().isSuperTypeOf(domainElement.eClass())) {
				return OnEntry3EditPart.VISUAL_ID;
			}
			if (ScxmlPackage.eINSTANCE.getOnExit().isSuperTypeOf(domainElement.eClass())) {
				return OnExit3EditPart.VISUAL_ID;
			}
			break;
		case DataModelDataModelCompartmentEditPart.VISUAL_ID:
			if (ScxmlPackage.eINSTANCE.getData().isSuperTypeOf(domainElement.eClass())) {
				return DataEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = scxml.diagram.part.ScxmlVisualIDRegistry.getModelID(containerView);
		if (!ServiceTemplateEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ServiceTemplateEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = scxml.diagram.part.ScxmlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceTemplateEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ServiceTemplateEditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (StateIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateAttrCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalStateEditPart.VISUAL_ID:
			if (FinalStateIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateFinalCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelEditPart.VISUAL_ID:
			if (ParallelIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelAttrCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataModelEditPart.VISUAL_ID:
			if (DataModelSchemaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataModelDataModelCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (StateId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateAttrCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalState2EditPart.VISUAL_ID:
			if (FinalStateId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateFinalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntryEditPart.VISUAL_ID:
			if (OnEntryOnEntryCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssignEditPart.VISUAL_ID:
			if (AssignDataidEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CancelEditPart.VISUAL_ID:
			if (CancelSendidEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelSendidexprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEditPart.VISUAL_ID:
			if (IfCondEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseIfEditPart.VISUAL_ID:
			if (ElseIfCondEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign2EditPart.VISUAL_ID:
			if (AssignDataid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignExpr2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignLocation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cancel2EditPart.VISUAL_ID:
			if (CancelSendid2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelSendidexpr2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If2EditPart.VISUAL_ID:
			if (IfCond2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogEditPart.VISUAL_ID:
			if (LogLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParamEditPart.VISUAL_ID:
			if (ParamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RaiseEditPart.VISUAL_ID:
			if (RaiseEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendEditPart.VISUAL_ID:
			if (SendIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValidateEditPart.VISUAL_ID:
			if (ValidateLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateSchemaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Log2EditPart.VISUAL_ID:
			if (LogLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Param2EditPart.VISUAL_ID:
			if (ParamName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExpr2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Raise2EditPart.VISUAL_ID:
			if (RaiseEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Send2EditPart.VISUAL_ID:
			if (SendId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate2EditPart.VISUAL_ID:
			if (ValidateLocation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateSchema2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExitEditPart.VISUAL_ID:
			if (OnExitOnExitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign3EditPart.VISUAL_ID:
			if (AssignDataid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignExpr3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignLocation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cancel3EditPart.VISUAL_ID:
			if (CancelSendid3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelSendidexpr3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If3EditPart.VISUAL_ID:
			if (IfCond3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Log3EditPart.VISUAL_ID:
			if (LogLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Param3EditPart.VISUAL_ID:
			if (ParamName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExpr3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Raise3EditPart.VISUAL_ID:
			if (RaiseEvent3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Send3EditPart.VISUAL_ID:
			if (SendId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEvent3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate3EditPart.VISUAL_ID:
			if (ValidateLocation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateSchema3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DonedataEditPart.VISUAL_ID:
			if (DonedataDonedataCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentEditPart.VISUAL_ID:
			if (ContentContentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Content2EditPart.VISUAL_ID:
			if (ContentContentCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Param4EditPart.VISUAL_ID:
			if (ParamName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExpr4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Parallel2EditPart.VISUAL_ID:
			if (ParallelId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelAttrCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Parallel3EditPart.VISUAL_ID:
			if (ParallelId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelParallelAttrCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case State3EditPart.VISUAL_ID:
			if (StateId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStateAttrCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntry2EditPart.VISUAL_ID:
			if (OnEntryOnEntryCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExit2EditPart.VISUAL_ID:
			if (OnExitOnExitCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HistoryStateEditPart.VISUAL_ID:
			if (HistoryStateIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InvokeEditPart.VISUAL_ID:
			if (InvokeIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeInvokeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Param5EditPart.VISUAL_ID:
			if (ParamName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExpr5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalizeEditPart.VISUAL_ID:
			if (FinalizeFinalizeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assign4EditPart.VISUAL_ID:
			if (AssignDataid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignExpr4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignLocation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cancel4EditPart.VISUAL_ID:
			if (CancelSendid4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelSendidexpr4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If4EditPart.VISUAL_ID:
			if (IfCond4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Log4EditPart.VISUAL_ID:
			if (LogLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Param6EditPart.VISUAL_ID:
			if (ParamName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamExpr6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Raise4EditPart.VISUAL_ID:
			if (RaiseEvent4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Send4EditPart.VISUAL_ID:
			if (SendId4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEvent4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Validate4EditPart.VISUAL_ID:
			if (ValidateLocation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateSchema4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Content3EditPart.VISUAL_ID:
			if (ContentContentCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HistoryState2EditPart.VISUAL_ID:
			if (HistoryStateId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntry3EditPart.VISUAL_ID:
			if (OnEntryOnEntryCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExit3EditPart.VISUAL_ID:
			if (OnExitOnExitCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataEditPart.VISUAL_ID:
			if (DataExprEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataSrcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateCompartmentEditPart.VISUAL_ID:
			if (State2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Parallel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateAttrCompartmentEditPart.VISUAL_ID:
			if (OnEntry2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnchorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateCompartment2EditPart.VISUAL_ID:
			if (State2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Parallel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateAttrCompartment2EditPart.VISUAL_ID:
			if (OnEntry2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnchorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalStateFinalCompartmentEditPart.VISUAL_ID:
			if (OnEntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DonedataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntryOnEntryCompartmentEditPart.VISUAL_ID:
			if (Script2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartmentEditPart.VISUAL_ID:
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RaiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment2EditPart.VISUAL_ID:
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RaiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExitOnExitCompartmentEditPart.VISUAL_ID:
			if (Script3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment3EditPart.VISUAL_ID:
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RaiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DonedataDonedataCompartmentEditPart.VISUAL_ID:
			if (ContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentContentCompartmentEditPart.VISUAL_ID:
			if (Content2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentContentCompartment2EditPart.VISUAL_ID:
			if (Content2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelCompartmentEditPart.VISUAL_ID:
			if (Parallel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelAttrCompartmentEditPart.VISUAL_ID:
			if (Anchor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEntry3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelCompartment2EditPart.VISUAL_ID:
			if (Parallel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelAttrCompartment2EditPart.VISUAL_ID:
			if (Anchor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEntry3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateCompartment3EditPart.VISUAL_ID:
			if (State2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Parallel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateStateAttrCompartment3EditPart.VISUAL_ID:
			if (OnEntry2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnchorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvokeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntryOnEntryCompartment2EditPart.VISUAL_ID:
			if (Script2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExitOnExitCompartment2EditPart.VISUAL_ID:
			if (Script3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InvokeInvokeCompartmentEditPart.VISUAL_ID:
			if (Param5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalizeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Content3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalizeFinalizeCompartmentEditPart.VISUAL_ID:
			if (Assign4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfCompartment4EditPart.VISUAL_ID:
			if (ElseIfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RaiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentContentCompartment3EditPart.VISUAL_ID:
			if (Content2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnEntryOnEntryCompartment3EditPart.VISUAL_ID:
			if (Script2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssignEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CancelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnExitOnExitCompartment3EditPart.VISUAL_ID:
			if (Script3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Assign3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cancel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Log3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Param3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Raise3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Send3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Validate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalStateFinalCompartment2EditPart.VISUAL_ID:
			if (OnEntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DonedataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelCompartment3EditPart.VISUAL_ID:
			if (Parallel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HistoryState2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelParallelAttrCompartment3EditPart.VISUAL_ID:
			if (Anchor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnEntry3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnExit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataModelDataModelCompartmentEditPart.VISUAL_ID:
			if (DataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ScxmlPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ServiceTemplate element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case StateStateCompartmentEditPart.VISUAL_ID:
		case StateStateAttrCompartmentEditPart.VISUAL_ID:
		case StateStateCompartment2EditPart.VISUAL_ID:
		case StateStateAttrCompartment2EditPart.VISUAL_ID:
		case FinalStateFinalCompartmentEditPart.VISUAL_ID:
		case OnEntryOnEntryCompartmentEditPart.VISUAL_ID:
		case IfIfCompartmentEditPart.VISUAL_ID:
		case IfIfCompartment2EditPart.VISUAL_ID:
		case OnExitOnExitCompartmentEditPart.VISUAL_ID:
		case IfIfCompartment3EditPart.VISUAL_ID:
		case DonedataDonedataCompartmentEditPart.VISUAL_ID:
		case ContentContentCompartmentEditPart.VISUAL_ID:
		case ContentContentCompartment2EditPart.VISUAL_ID:
		case ParallelParallelCompartmentEditPart.VISUAL_ID:
		case ParallelParallelAttrCompartmentEditPart.VISUAL_ID:
		case ParallelParallelCompartment2EditPart.VISUAL_ID:
		case ParallelParallelAttrCompartment2EditPart.VISUAL_ID:
		case StateStateCompartment3EditPart.VISUAL_ID:
		case StateStateAttrCompartment3EditPart.VISUAL_ID:
		case OnEntryOnEntryCompartment2EditPart.VISUAL_ID:
		case OnExitOnExitCompartment2EditPart.VISUAL_ID:
		case InvokeInvokeCompartmentEditPart.VISUAL_ID:
		case FinalizeFinalizeCompartmentEditPart.VISUAL_ID:
		case IfIfCompartment4EditPart.VISUAL_ID:
		case ContentContentCompartment3EditPart.VISUAL_ID:
		case OnEntryOnEntryCompartment3EditPart.VISUAL_ID:
		case OnExitOnExitCompartment3EditPart.VISUAL_ID:
		case FinalStateFinalCompartment2EditPart.VISUAL_ID:
		case ParallelParallelCompartment3EditPart.VISUAL_ID:
		case ParallelParallelAttrCompartment3EditPart.VISUAL_ID:
		case DataModelDataModelCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ServiceTemplateEditPart.VISUAL_ID:
			return false;
		case InitialStateEditPart.VISUAL_ID:
		case ScriptEditPart.VISUAL_ID:
		case Script2EditPart.VISUAL_ID:
		case AssignEditPart.VISUAL_ID:
		case CancelEditPart.VISUAL_ID:
		case ElseIfEditPart.VISUAL_ID:
		case ElseEditPart.VISUAL_ID:
		case Assign2EditPart.VISUAL_ID:
		case Cancel2EditPart.VISUAL_ID:
		case LogEditPart.VISUAL_ID:
		case ParamEditPart.VISUAL_ID:
		case RaiseEditPart.VISUAL_ID:
		case SendEditPart.VISUAL_ID:
		case ValidateEditPart.VISUAL_ID:
		case Log2EditPart.VISUAL_ID:
		case Param2EditPart.VISUAL_ID:
		case Raise2EditPart.VISUAL_ID:
		case Send2EditPart.VISUAL_ID:
		case Validate2EditPart.VISUAL_ID:
		case Script3EditPart.VISUAL_ID:
		case Assign3EditPart.VISUAL_ID:
		case Cancel3EditPart.VISUAL_ID:
		case Log3EditPart.VISUAL_ID:
		case Param3EditPart.VISUAL_ID:
		case Raise3EditPart.VISUAL_ID:
		case Send3EditPart.VISUAL_ID:
		case Validate3EditPart.VISUAL_ID:
		case Param4EditPart.VISUAL_ID:
		case InitialState2EditPart.VISUAL_ID:
		case HistoryStateEditPart.VISUAL_ID:
		case AnchorEditPart.VISUAL_ID:
		case Param5EditPart.VISUAL_ID:
		case Assign4EditPart.VISUAL_ID:
		case Cancel4EditPart.VISUAL_ID:
		case Log4EditPart.VISUAL_ID:
		case Param6EditPart.VISUAL_ID:
		case Raise4EditPart.VISUAL_ID:
		case Send4EditPart.VISUAL_ID:
		case Validate4EditPart.VISUAL_ID:
		case HistoryState2EditPart.VISUAL_ID:
		case Anchor2EditPart.VISUAL_ID:
		case DataEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return scxml.diagram.part.ScxmlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
