package scxml.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import scxml.Anchor;
import scxml.Assign;
import scxml.Cancel;
import scxml.Content;
import scxml.Data;
import scxml.DataModel;
import scxml.Donedata;
import scxml.Else;
import scxml.ElseIf;
import scxml.FinalState;
import scxml.Finalize;
import scxml.HistoryState;
import scxml.If;
import scxml.InitialState;
import scxml.Invoke;
import scxml.Log;
import scxml.NamedElement;
import scxml.OnEntry;
import scxml.OnExit;
import scxml.Parallel;
import scxml.Param;
import scxml.Raise;
import scxml.Script;
import scxml.ScxmlPackage;
import scxml.Send;
import scxml.ServiceTemplate;
import scxml.State;
import scxml.Transition;
import scxml.Validate;
import scxml.diagram.edit.parts.*;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ScxmlDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getSemanticChildren(View view) {
		switch (ScxmlVisualIDRegistry.getVisualID(view)) {
		case ServiceTemplateEditPart.VISUAL_ID:
			return getServiceTemplate_1000SemanticChildren(view);
		case StateStateCompartmentEditPart.VISUAL_ID:
			return getStateStateCompartment_7001SemanticChildren(view);
		case StateStateAttrCompartmentEditPart.VISUAL_ID:
			return getStateStateAttrCompartment_7002SemanticChildren(view);
		case StateStateCompartment2EditPart.VISUAL_ID:
			return getStateStateCompartment_7003SemanticChildren(view);
		case StateStateAttrCompartment2EditPart.VISUAL_ID:
			return getStateStateAttrCompartment_7004SemanticChildren(view);
		case FinalStateFinalCompartmentEditPart.VISUAL_ID:
			return getFinalStateFinalCompartment_7005SemanticChildren(view);
		case OnEntryOnEntryCompartmentEditPart.VISUAL_ID:
			return getOnEntryOnEntryCompartment_7006SemanticChildren(view);
		case IfIfCompartmentEditPart.VISUAL_ID:
			return getIfIfCompartment_7007SemanticChildren(view);
		case IfIfCompartment2EditPart.VISUAL_ID:
			return getIfIfCompartment_7008SemanticChildren(view);
		case OnExitOnExitCompartmentEditPart.VISUAL_ID:
			return getOnExitOnExitCompartment_7009SemanticChildren(view);
		case IfIfCompartment3EditPart.VISUAL_ID:
			return getIfIfCompartment_7010SemanticChildren(view);
		case DonedataDonedataCompartmentEditPart.VISUAL_ID:
			return getDonedataDonedataCompartment_7011SemanticChildren(view);
		case ContentContentCompartmentEditPart.VISUAL_ID:
			return getContentContentCompartment_7012SemanticChildren(view);
		case ContentContentCompartment2EditPart.VISUAL_ID:
			return getContentContentCompartment_7013SemanticChildren(view);
		case ParallelParallelCompartmentEditPart.VISUAL_ID:
			return getParallelParallelCompartment_7014SemanticChildren(view);
		case ParallelParallelAttrCompartmentEditPart.VISUAL_ID:
			return getParallelParallelAttrCompartment_7015SemanticChildren(view);
		case ParallelParallelCompartment2EditPart.VISUAL_ID:
			return getParallelParallelCompartment_7016SemanticChildren(view);
		case ParallelParallelAttrCompartment2EditPart.VISUAL_ID:
			return getParallelParallelAttrCompartment_7017SemanticChildren(view);
		case StateStateCompartment3EditPart.VISUAL_ID:
			return getStateStateCompartment_7018SemanticChildren(view);
		case StateStateAttrCompartment3EditPart.VISUAL_ID:
			return getStateStateAttrCompartment_7019SemanticChildren(view);
		case OnEntryOnEntryCompartment2EditPart.VISUAL_ID:
			return getOnEntryOnEntryCompartment_7020SemanticChildren(view);
		case OnExitOnExitCompartment2EditPart.VISUAL_ID:
			return getOnExitOnExitCompartment_7021SemanticChildren(view);
		case InvokeInvokeCompartmentEditPart.VISUAL_ID:
			return getInvokeInvokeCompartment_7022SemanticChildren(view);
		case FinalizeFinalizeCompartmentEditPart.VISUAL_ID:
			return getFinalizeFinalizeCompartment_7023SemanticChildren(view);
		case IfIfCompartment4EditPart.VISUAL_ID:
			return getIfIfCompartment_7024SemanticChildren(view);
		case ContentContentCompartment3EditPart.VISUAL_ID:
			return getContentContentCompartment_7025SemanticChildren(view);
		case OnEntryOnEntryCompartment3EditPart.VISUAL_ID:
			return getOnEntryOnEntryCompartment_7026SemanticChildren(view);
		case OnExitOnExitCompartment3EditPart.VISUAL_ID:
			return getOnExitOnExitCompartment_7027SemanticChildren(view);
		case FinalStateFinalCompartment2EditPart.VISUAL_ID:
			return getFinalStateFinalCompartment_7028SemanticChildren(view);
		case ParallelParallelCompartment3EditPart.VISUAL_ID:
			return getParallelParallelCompartment_7029SemanticChildren(view);
		case ParallelParallelAttrCompartment3EditPart.VISUAL_ID:
			return getParallelParallelAttrCompartment_7030SemanticChildren(view);
		case DataModelDataModelCompartmentEditPart.VISUAL_ID:
			return getDataModelDataModelCompartment_7031SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getServiceTemplate_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceTemplate modelElement = (ServiceTemplate) view.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFinal().iterator(); it.hasNext();) {
			FinalState childElement = (FinalState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalStateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InitialState childElement = modelElement.getInitial();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitialStateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParallelEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDatamodel().iterator(); it.hasNext();) {
			DataModel childElement = (DataModel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataModelEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ScriptEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFinal().iterator(); it.hasNext();) {
			FinalState childElement = (FinalState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InitialState childElement = modelElement.getInitial();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitialState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryStateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateAttrCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AnchorEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInvoke().iterator(); it.hasNext();) {
			Invoke childElement = (Invoke) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFinal().iterator(); it.hasNext();) {
			FinalState childElement = (FinalState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InitialState childElement = modelElement.getInitial();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitialState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryStateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateAttrCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AnchorEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInvoke().iterator(); it.hasNext();) {
			Invoke childElement = (Invoke) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getFinalStateFinalCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FinalState modelElement = (FinalState) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntryEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExitEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Donedata childElement = modelElement.getDonedata();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DonedataEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnEntryOnEntryCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnEntry modelElement = (OnEntry) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssignEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CancelEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getIfIfCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElseif().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParamEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RaiseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getIfIfCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElseif().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParamEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RaiseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnExitOnExitCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnExit modelElement = (OnExit) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getIfIfCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElseif().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParamEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RaiseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getDonedataDonedataCompartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Donedata modelElement = (Donedata) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Content childElement = modelElement.getContent();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContentEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getContentContentCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Content modelElement = (Content) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContent().iterator(); it.hasNext();) {
			Content childElement = (Content) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Content2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getContentContentCompartment_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Content modelElement = (Content) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContent().iterator(); it.hasNext();) {
			Content childElement = (Content) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Content2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelCompartment_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelAttrCompartment_7015SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Anchor2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelCompartment_7016SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelAttrCompartment_7017SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Anchor2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateCompartment_7018SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFinal().iterator(); it.hasNext();) {
			FinalState childElement = (FinalState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InitialState childElement = modelElement.getInitial();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitialState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryStateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getStateStateAttrCompartment_7019SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		State modelElement = (State) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AnchorEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInvoke().iterator(); it.hasNext();) {
			Invoke childElement = (Invoke) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InvokeEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnEntryOnEntryCompartment_7020SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnEntry modelElement = (OnEntry) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssignEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CancelEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnExitOnExitCompartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnExit modelElement = (OnExit) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getInvokeInvokeCompartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Invoke modelElement = (Invoke) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param5EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Finalize childElement = modelElement.getFinalize();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalizeEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		{
			Content childElement = modelElement.getContent();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Content3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getFinalizeFinalizeCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Finalize modelElement = (Finalize) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param6EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate4EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getIfIfCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElseif().iterator(); it.hasNext();) {
			ElseIf childElement = (ElseIf) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseIfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Else childElement = modelElement.getElse();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParamEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RaiseEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValidateEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getContentContentCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Content modelElement = (Content) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContent().iterator(); it.hasNext();) {
			Content childElement = (Content) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Content2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnEntryOnEntryCompartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnEntry modelElement = (OnEntry) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssignEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CancelEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getOnExitOnExitCompartment_7027SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OnExit modelElement = (OnExit) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		{
			Script childElement = modelElement.getScript();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Script3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getAssign().iterator(); it.hasNext();) {
			Assign childElement = (Assign) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assign3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCancel().iterator(); it.hasNext();) {
			Cancel childElement = (Cancel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Cancel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIf().iterator(); it.hasNext();) {
			If childElement = (If) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLog().iterator(); it.hasNext();) {
			Log childElement = (Log) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Log3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParam().iterator(); it.hasNext();) {
			Param childElement = (Param) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Param3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRaise().iterator(); it.hasNext();) {
			Raise childElement = (Raise) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Raise3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSend().iterator(); it.hasNext();) {
			Send childElement = (Send) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Send3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getValidate().iterator(); it.hasNext();) {
			Validate childElement = (Validate) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Validate3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getFinalStateFinalCompartment_7028SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FinalState modelElement = (FinalState) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntryEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExitEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Donedata childElement = modelElement.getDonedata();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DonedataEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelCompartment_7029SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParallel().iterator(); it.hasNext();) {
			Parallel childElement = (Parallel) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Parallel3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == State3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHistory().iterator(); it.hasNext();) {
			HistoryState childElement = (HistoryState) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HistoryState2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getParallelParallelAttrCompartment_7030SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Parallel modelElement = (Parallel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnchor().iterator(); it.hasNext();) {
			Anchor childElement = (Anchor) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Anchor2EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnentry().iterator(); it.hasNext();) {
			OnEntry childElement = (OnEntry) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnEntry3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOnexit().iterator(); it.hasNext();) {
			OnExit childElement = (OnExit) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OnExit3EditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlNodeDescriptor> getDataModelDataModelCompartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataModel modelElement = (DataModel) containerView.getElement();
		LinkedList<ScxmlNodeDescriptor> result = new LinkedList<ScxmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			Data childElement = (Data) it.next();
			int visualID = ScxmlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataEditPart.VISUAL_ID) {
				result.add(new ScxmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ScxmlLinkDescriptor> getContainedLinks(View view) {
		switch (ScxmlVisualIDRegistry.getVisualID(view)) {
		case ServiceTemplateEditPart.VISUAL_ID:
			return getServiceTemplate_1000ContainedLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2002ContainedLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2003ContainedLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_2004ContainedLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_2005ContainedLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_2006ContainedLinks(view);
		case State2EditPart.VISUAL_ID:
			return getState_3001ContainedLinks(view);
		case FinalState2EditPart.VISUAL_ID:
			return getFinalState_3002ContainedLinks(view);
		case OnEntryEditPart.VISUAL_ID:
			return getOnEntry_3003ContainedLinks(view);
		case Script2EditPart.VISUAL_ID:
			return getScript_3004ContainedLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3005ContainedLinks(view);
		case CancelEditPart.VISUAL_ID:
			return getCancel_3006ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3007ContainedLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3008ContainedLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3009ContainedLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3010ContainedLinks(view);
		case Cancel2EditPart.VISUAL_ID:
			return getCancel_3011ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3012ContainedLinks(view);
		case LogEditPart.VISUAL_ID:
			return getLog_3013ContainedLinks(view);
		case ParamEditPart.VISUAL_ID:
			return getParam_3014ContainedLinks(view);
		case RaiseEditPart.VISUAL_ID:
			return getRaise_3015ContainedLinks(view);
		case SendEditPart.VISUAL_ID:
			return getSend_3016ContainedLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3017ContainedLinks(view);
		case Log2EditPart.VISUAL_ID:
			return getLog_3018ContainedLinks(view);
		case Param2EditPart.VISUAL_ID:
			return getParam_3019ContainedLinks(view);
		case Raise2EditPart.VISUAL_ID:
			return getRaise_3020ContainedLinks(view);
		case Send2EditPart.VISUAL_ID:
			return getSend_3021ContainedLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3022ContainedLinks(view);
		case OnExitEditPart.VISUAL_ID:
			return getOnExit_3023ContainedLinks(view);
		case Script3EditPart.VISUAL_ID:
			return getScript_3024ContainedLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3025ContainedLinks(view);
		case Cancel3EditPart.VISUAL_ID:
			return getCancel_3026ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3027ContainedLinks(view);
		case Log3EditPart.VISUAL_ID:
			return getLog_3028ContainedLinks(view);
		case Param3EditPart.VISUAL_ID:
			return getParam_3029ContainedLinks(view);
		case Raise3EditPart.VISUAL_ID:
			return getRaise_3030ContainedLinks(view);
		case Send3EditPart.VISUAL_ID:
			return getSend_3031ContainedLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3032ContainedLinks(view);
		case DonedataEditPart.VISUAL_ID:
			return getDonedata_3033ContainedLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3034ContainedLinks(view);
		case Content2EditPart.VISUAL_ID:
			return getContent_3035ContainedLinks(view);
		case Param4EditPart.VISUAL_ID:
			return getParam_3036ContainedLinks(view);
		case Parallel2EditPart.VISUAL_ID:
			return getParallel_3037ContainedLinks(view);
		case Parallel3EditPart.VISUAL_ID:
			return getParallel_3038ContainedLinks(view);
		case State3EditPart.VISUAL_ID:
			return getState_3039ContainedLinks(view);
		case InitialState2EditPart.VISUAL_ID:
			return getInitialState_3040ContainedLinks(view);
		case OnEntry2EditPart.VISUAL_ID:
			return getOnEntry_3041ContainedLinks(view);
		case OnExit2EditPart.VISUAL_ID:
			return getOnExit_3042ContainedLinks(view);
		case HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_3043ContainedLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3044ContainedLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3045ContainedLinks(view);
		case Param5EditPart.VISUAL_ID:
			return getParam_3046ContainedLinks(view);
		case FinalizeEditPart.VISUAL_ID:
			return getFinalize_3047ContainedLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3048ContainedLinks(view);
		case Cancel4EditPart.VISUAL_ID:
			return getCancel_3049ContainedLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3050ContainedLinks(view);
		case Log4EditPart.VISUAL_ID:
			return getLog_3051ContainedLinks(view);
		case Param6EditPart.VISUAL_ID:
			return getParam_3052ContainedLinks(view);
		case Raise4EditPart.VISUAL_ID:
			return getRaise_3053ContainedLinks(view);
		case Send4EditPart.VISUAL_ID:
			return getSend_3054ContainedLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3055ContainedLinks(view);
		case Content3EditPart.VISUAL_ID:
			return getContent_3056ContainedLinks(view);
		case HistoryState2EditPart.VISUAL_ID:
			return getHistoryState_3057ContainedLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3058ContainedLinks(view);
		case OnEntry3EditPart.VISUAL_ID:
			return getOnEntry_3059ContainedLinks(view);
		case OnExit3EditPart.VISUAL_ID:
			return getOnExit_3060ContainedLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_3061ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ScxmlLinkDescriptor> getIncomingLinks(View view) {
		switch (ScxmlVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2002IncomingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2003IncomingLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_2004IncomingLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_2005IncomingLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_2006IncomingLinks(view);
		case State2EditPart.VISUAL_ID:
			return getState_3001IncomingLinks(view);
		case FinalState2EditPart.VISUAL_ID:
			return getFinalState_3002IncomingLinks(view);
		case OnEntryEditPart.VISUAL_ID:
			return getOnEntry_3003IncomingLinks(view);
		case Script2EditPart.VISUAL_ID:
			return getScript_3004IncomingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3005IncomingLinks(view);
		case CancelEditPart.VISUAL_ID:
			return getCancel_3006IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3007IncomingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3008IncomingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3009IncomingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3010IncomingLinks(view);
		case Cancel2EditPart.VISUAL_ID:
			return getCancel_3011IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3012IncomingLinks(view);
		case LogEditPart.VISUAL_ID:
			return getLog_3013IncomingLinks(view);
		case ParamEditPart.VISUAL_ID:
			return getParam_3014IncomingLinks(view);
		case RaiseEditPart.VISUAL_ID:
			return getRaise_3015IncomingLinks(view);
		case SendEditPart.VISUAL_ID:
			return getSend_3016IncomingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3017IncomingLinks(view);
		case Log2EditPart.VISUAL_ID:
			return getLog_3018IncomingLinks(view);
		case Param2EditPart.VISUAL_ID:
			return getParam_3019IncomingLinks(view);
		case Raise2EditPart.VISUAL_ID:
			return getRaise_3020IncomingLinks(view);
		case Send2EditPart.VISUAL_ID:
			return getSend_3021IncomingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3022IncomingLinks(view);
		case OnExitEditPart.VISUAL_ID:
			return getOnExit_3023IncomingLinks(view);
		case Script3EditPart.VISUAL_ID:
			return getScript_3024IncomingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3025IncomingLinks(view);
		case Cancel3EditPart.VISUAL_ID:
			return getCancel_3026IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3027IncomingLinks(view);
		case Log3EditPart.VISUAL_ID:
			return getLog_3028IncomingLinks(view);
		case Param3EditPart.VISUAL_ID:
			return getParam_3029IncomingLinks(view);
		case Raise3EditPart.VISUAL_ID:
			return getRaise_3030IncomingLinks(view);
		case Send3EditPart.VISUAL_ID:
			return getSend_3031IncomingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3032IncomingLinks(view);
		case DonedataEditPart.VISUAL_ID:
			return getDonedata_3033IncomingLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3034IncomingLinks(view);
		case Content2EditPart.VISUAL_ID:
			return getContent_3035IncomingLinks(view);
		case Param4EditPart.VISUAL_ID:
			return getParam_3036IncomingLinks(view);
		case Parallel2EditPart.VISUAL_ID:
			return getParallel_3037IncomingLinks(view);
		case Parallel3EditPart.VISUAL_ID:
			return getParallel_3038IncomingLinks(view);
		case State3EditPart.VISUAL_ID:
			return getState_3039IncomingLinks(view);
		case InitialState2EditPart.VISUAL_ID:
			return getInitialState_3040IncomingLinks(view);
		case OnEntry2EditPart.VISUAL_ID:
			return getOnEntry_3041IncomingLinks(view);
		case OnExit2EditPart.VISUAL_ID:
			return getOnExit_3042IncomingLinks(view);
		case HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_3043IncomingLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3044IncomingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3045IncomingLinks(view);
		case Param5EditPart.VISUAL_ID:
			return getParam_3046IncomingLinks(view);
		case FinalizeEditPart.VISUAL_ID:
			return getFinalize_3047IncomingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3048IncomingLinks(view);
		case Cancel4EditPart.VISUAL_ID:
			return getCancel_3049IncomingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3050IncomingLinks(view);
		case Log4EditPart.VISUAL_ID:
			return getLog_3051IncomingLinks(view);
		case Param6EditPart.VISUAL_ID:
			return getParam_3052IncomingLinks(view);
		case Raise4EditPart.VISUAL_ID:
			return getRaise_3053IncomingLinks(view);
		case Send4EditPart.VISUAL_ID:
			return getSend_3054IncomingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3055IncomingLinks(view);
		case Content3EditPart.VISUAL_ID:
			return getContent_3056IncomingLinks(view);
		case HistoryState2EditPart.VISUAL_ID:
			return getHistoryState_3057IncomingLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3058IncomingLinks(view);
		case OnEntry3EditPart.VISUAL_ID:
			return getOnEntry_3059IncomingLinks(view);
		case OnExit3EditPart.VISUAL_ID:
			return getOnExit_3060IncomingLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_3061IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ScxmlLinkDescriptor> getOutgoingLinks(View view) {
		switch (ScxmlVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case FinalStateEditPart.VISUAL_ID:
			return getFinalState_2002OutgoingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2003OutgoingLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_2004OutgoingLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_2005OutgoingLinks(view);
		case ScriptEditPart.VISUAL_ID:
			return getScript_2006OutgoingLinks(view);
		case State2EditPart.VISUAL_ID:
			return getState_3001OutgoingLinks(view);
		case FinalState2EditPart.VISUAL_ID:
			return getFinalState_3002OutgoingLinks(view);
		case OnEntryEditPart.VISUAL_ID:
			return getOnEntry_3003OutgoingLinks(view);
		case Script2EditPart.VISUAL_ID:
			return getScript_3004OutgoingLinks(view);
		case AssignEditPart.VISUAL_ID:
			return getAssign_3005OutgoingLinks(view);
		case CancelEditPart.VISUAL_ID:
			return getCancel_3006OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3007OutgoingLinks(view);
		case ElseIfEditPart.VISUAL_ID:
			return getElseIf_3008OutgoingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_3009OutgoingLinks(view);
		case Assign2EditPart.VISUAL_ID:
			return getAssign_3010OutgoingLinks(view);
		case Cancel2EditPart.VISUAL_ID:
			return getCancel_3011OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3012OutgoingLinks(view);
		case LogEditPart.VISUAL_ID:
			return getLog_3013OutgoingLinks(view);
		case ParamEditPart.VISUAL_ID:
			return getParam_3014OutgoingLinks(view);
		case RaiseEditPart.VISUAL_ID:
			return getRaise_3015OutgoingLinks(view);
		case SendEditPart.VISUAL_ID:
			return getSend_3016OutgoingLinks(view);
		case ValidateEditPart.VISUAL_ID:
			return getValidate_3017OutgoingLinks(view);
		case Log2EditPart.VISUAL_ID:
			return getLog_3018OutgoingLinks(view);
		case Param2EditPart.VISUAL_ID:
			return getParam_3019OutgoingLinks(view);
		case Raise2EditPart.VISUAL_ID:
			return getRaise_3020OutgoingLinks(view);
		case Send2EditPart.VISUAL_ID:
			return getSend_3021OutgoingLinks(view);
		case Validate2EditPart.VISUAL_ID:
			return getValidate_3022OutgoingLinks(view);
		case OnExitEditPart.VISUAL_ID:
			return getOnExit_3023OutgoingLinks(view);
		case Script3EditPart.VISUAL_ID:
			return getScript_3024OutgoingLinks(view);
		case Assign3EditPart.VISUAL_ID:
			return getAssign_3025OutgoingLinks(view);
		case Cancel3EditPart.VISUAL_ID:
			return getCancel_3026OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3027OutgoingLinks(view);
		case Log3EditPart.VISUAL_ID:
			return getLog_3028OutgoingLinks(view);
		case Param3EditPart.VISUAL_ID:
			return getParam_3029OutgoingLinks(view);
		case Raise3EditPart.VISUAL_ID:
			return getRaise_3030OutgoingLinks(view);
		case Send3EditPart.VISUAL_ID:
			return getSend_3031OutgoingLinks(view);
		case Validate3EditPart.VISUAL_ID:
			return getValidate_3032OutgoingLinks(view);
		case DonedataEditPart.VISUAL_ID:
			return getDonedata_3033OutgoingLinks(view);
		case ContentEditPart.VISUAL_ID:
			return getContent_3034OutgoingLinks(view);
		case Content2EditPart.VISUAL_ID:
			return getContent_3035OutgoingLinks(view);
		case Param4EditPart.VISUAL_ID:
			return getParam_3036OutgoingLinks(view);
		case Parallel2EditPart.VISUAL_ID:
			return getParallel_3037OutgoingLinks(view);
		case Parallel3EditPart.VISUAL_ID:
			return getParallel_3038OutgoingLinks(view);
		case State3EditPart.VISUAL_ID:
			return getState_3039OutgoingLinks(view);
		case InitialState2EditPart.VISUAL_ID:
			return getInitialState_3040OutgoingLinks(view);
		case OnEntry2EditPart.VISUAL_ID:
			return getOnEntry_3041OutgoingLinks(view);
		case OnExit2EditPart.VISUAL_ID:
			return getOnExit_3042OutgoingLinks(view);
		case HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_3043OutgoingLinks(view);
		case AnchorEditPart.VISUAL_ID:
			return getAnchor_3044OutgoingLinks(view);
		case InvokeEditPart.VISUAL_ID:
			return getInvoke_3045OutgoingLinks(view);
		case Param5EditPart.VISUAL_ID:
			return getParam_3046OutgoingLinks(view);
		case FinalizeEditPart.VISUAL_ID:
			return getFinalize_3047OutgoingLinks(view);
		case Assign4EditPart.VISUAL_ID:
			return getAssign_3048OutgoingLinks(view);
		case Cancel4EditPart.VISUAL_ID:
			return getCancel_3049OutgoingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3050OutgoingLinks(view);
		case Log4EditPart.VISUAL_ID:
			return getLog_3051OutgoingLinks(view);
		case Param6EditPart.VISUAL_ID:
			return getParam_3052OutgoingLinks(view);
		case Raise4EditPart.VISUAL_ID:
			return getRaise_3053OutgoingLinks(view);
		case Send4EditPart.VISUAL_ID:
			return getSend_3054OutgoingLinks(view);
		case Validate4EditPart.VISUAL_ID:
			return getValidate_3055OutgoingLinks(view);
		case Content3EditPart.VISUAL_ID:
			return getContent_3056OutgoingLinks(view);
		case HistoryState2EditPart.VISUAL_ID:
			return getHistoryState_3057OutgoingLinks(view);
		case Anchor2EditPart.VISUAL_ID:
			return getAnchor_3058OutgoingLinks(view);
		case OnEntry3EditPart.VISUAL_ID:
			return getOnEntry_3059OutgoingLinks(view);
		case OnExit3EditPart.VISUAL_ID:
			return getOnExit_3060OutgoingLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_3061OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getServiceTemplate_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_2001ContainedLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_2002ContainedLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_2003ContainedLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_2004ContainedLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDataModel_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3001ContainedLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_3002ContainedLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElseIf_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElse_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDonedata_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3037ContainedLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3038ContainedLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3039ContainedLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_3040ContainedLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3043ContainedLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInvoke_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalize_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3057ContainedLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getData_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getTransition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_2001IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_2002IncomingLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_2003IncomingLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_2004IncomingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDataModel_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3001IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_3002IncomingLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElseIf_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElse_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDonedata_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3037IncomingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3038IncomingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3039IncomingLinks(View view) {
		State modelElement = (State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_3040IncomingLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3043IncomingLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInvoke_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalize_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3057IncomingLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getData_3061IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_2001OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_2002OutgoingLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_2003OutgoingLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_2004OutgoingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDataModel_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3001OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalState_3002OutgoingLinks(View view) {
		FinalState modelElement = (FinalState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElseIf_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getElse_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getScript_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getDonedata_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3037OutgoingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParallel_3038OutgoingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getState_3039OutgoingLinks(View view) {
		State modelElement = (State) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInitialState_3040OutgoingLinks(View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3043OutgoingLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getInvoke_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getFinalize_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAssign_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getCancel_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getIf_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getLog_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getParam_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getRaise_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getSend_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getValidate_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getContent_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getHistoryState_3057OutgoingLinks(View view) {
		HistoryState modelElement = (HistoryState) view.getElement();
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getAnchor_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnEntry_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getOnExit_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getData_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScxmlLinkDescriptor> getTransition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ScxmlLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			NamedElement container) {
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		for (Iterator<?> links = container.getTransition().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ScxmlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			NamedElement dst = link.getTarget();
			result.add(new ScxmlLinkDescriptor(container, dst, link, ScxmlElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScxmlLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(NamedElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScxmlLinkDescriptor> result = new LinkedList<ScxmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ScxmlPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != ScxmlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof NamedElement) {
				continue;
			}
			NamedElement container = (NamedElement) link.eContainer();
			result.add(new ScxmlLinkDescriptor(container, target, link, ScxmlElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ScxmlNodeDescriptor> getSemanticChildren(View view) {
			return ScxmlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ScxmlLinkDescriptor> getContainedLinks(View view) {
			return ScxmlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ScxmlLinkDescriptor> getIncomingLinks(View view) {
			return ScxmlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ScxmlLinkDescriptor> getOutgoingLinks(View view) {
			return ScxmlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
