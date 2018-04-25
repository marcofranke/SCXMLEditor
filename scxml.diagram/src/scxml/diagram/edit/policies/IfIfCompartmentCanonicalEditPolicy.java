package scxml.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import scxml.ScxmlPackage;
import scxml.diagram.edit.parts.Assign2EditPart;
import scxml.diagram.edit.parts.Cancel2EditPart;
import scxml.diagram.edit.parts.ElseEditPart;
import scxml.diagram.edit.parts.ElseIfEditPart;
import scxml.diagram.edit.parts.If2EditPart;
import scxml.diagram.edit.parts.LogEditPart;
import scxml.diagram.edit.parts.ParamEditPart;
import scxml.diagram.edit.parts.RaiseEditPart;
import scxml.diagram.edit.parts.SendEditPart;
import scxml.diagram.edit.parts.ValidateEditPart;
import scxml.diagram.part.ScxmlDiagramUpdater;
import scxml.diagram.part.ScxmlNodeDescriptor;
import scxml.diagram.part.ScxmlVisualIDRegistry;

/**
 * @generated
 */
public class IfIfCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	* @generated
	*/
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	* @generated
	*/
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	* @generated
	*/
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Elseif());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Else());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Assign());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Cancel());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_If());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Log());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Param());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Raise());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Send());
			myFeaturesToSynchronize.add(ScxmlPackage.eINSTANCE.getIf_Validate());
		}
		return myFeaturesToSynchronize;
	}

	/**
	* @generated
	*/
	@SuppressWarnings("rawtypes")

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<ScxmlNodeDescriptor> childDescriptors = ScxmlDiagramUpdater
				.getIfIfCompartment_7007SemanticChildren(viewObject);
		for (ScxmlNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = ScxmlVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ElseIfEditPart.VISUAL_ID:
		case ElseEditPart.VISUAL_ID:
		case Assign2EditPart.VISUAL_ID:
		case Cancel2EditPart.VISUAL_ID:
		case If2EditPart.VISUAL_ID:
		case LogEditPart.VISUAL_ID:
		case ParamEditPart.VISUAL_ID:
		case RaiseEditPart.VISUAL_ID:
		case SendEditPart.VISUAL_ID:
		case ValidateEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<ScxmlNodeDescriptor> childDescriptors = ScxmlDiagramUpdater
				.getIfIfCompartment_7007SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<ScxmlNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator
				.hasNext();) {
			ScxmlNodeDescriptor next = descriptorsIterator.next();
			String hint = ScxmlVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (ScxmlNodeDescriptor next : childDescriptors) {
			String hint = ScxmlVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
