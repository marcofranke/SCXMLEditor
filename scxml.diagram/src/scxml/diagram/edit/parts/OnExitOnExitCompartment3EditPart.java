package scxml.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import scxml.diagram.edit.policies.OnExitOnExitCompartment3CanonicalEditPolicy;
import scxml.diagram.edit.policies.OnExitOnExitCompartment3ItemSemanticEditPolicy;
import scxml.diagram.part.Messages;
import scxml.diagram.part.ScxmlVisualIDRegistry;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class OnExitOnExitCompartment3EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7027;

	/**
	* @generated
	*/
	public OnExitOnExitCompartment3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.OnExitOnExitCompartment3EditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new OnExitOnExitCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ScxmlVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new OnExitOnExitCompartment3CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ScxmlElementTypes.Script_3024) {
				return this;
			}
			if (type == ScxmlElementTypes.Assign_3025) {
				return this;
			}
			if (type == ScxmlElementTypes.Cancel_3026) {
				return this;
			}
			if (type == ScxmlElementTypes.If_3027) {
				return this;
			}
			if (type == ScxmlElementTypes.Log_3028) {
				return this;
			}
			if (type == ScxmlElementTypes.Param_3029) {
				return this;
			}
			if (type == ScxmlElementTypes.Raise_3030) {
				return this;
			}
			if (type == ScxmlElementTypes.Send_3031) {
				return this;
			}
			if (type == ScxmlElementTypes.Validate_3032) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
