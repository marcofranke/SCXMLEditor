package scxml.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import scxml.diagram.edit.policies.Parallel3ItemSemanticEditPolicy;
import scxml.diagram.part.ScxmlVisualIDRegistry;

/**
 * @generated
 */
public class Parallel3EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3038;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public Parallel3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Parallel3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new ParallelFigure();
	}

	/**
	* @generated
	*/
	public ParallelFigure getPrimaryShape() {
		return (ParallelFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelId3EditPart) {
			((ParallelId3EditPart) childEditPart).setLabel(getPrimaryShape().getFigureParallelNameFigure());
			return true;
		}
		if (childEditPart instanceof ParallelParallelCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureParallelCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ParallelParallelCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ParallelParallelAttrCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureParallelAttrCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ParallelParallelAttrCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelId3EditPart) {
			return true;
		}
		if (childEditPart instanceof ParallelParallelCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureParallelCompartmentFigure();
			pane.remove(((ParallelParallelCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ParallelParallelAttrCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureParallelAttrCompartmentFigure();
			pane.remove(((ParallelParallelAttrCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ParallelParallelCompartment2EditPart) {
			return getPrimaryShape().getFigureParallelCompartmentFigure();
		}
		if (editPart instanceof ParallelParallelAttrCompartment2EditPart) {
			return getPrimaryShape().getFigureParallelAttrCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ScxmlVisualIDRegistry.getType(ParallelId3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ParallelFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureParallelNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureParallelAttrCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureParallelCompartmentFigure;

		/**
		 * @generated
		 */
		public ParallelFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.darkGreen);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureParallelNameFigure = new WrappingLabel();

			fFigureParallelNameFigure.setText("<...>");

			this.add(fFigureParallelNameFigure, BorderLayout.TOP);

			fFigureParallelCompartmentFigure = new RectangleFigure();

			this.add(fFigureParallelCompartmentFigure, BorderLayout.CENTER);

			fFigureParallelAttrCompartmentFigure = new RectangleFigure();

			this.add(fFigureParallelAttrCompartmentFigure, BorderLayout.TOP);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureParallelNameFigure() {
			return fFigureParallelNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureParallelAttrCompartmentFigure() {
			return fFigureParallelAttrCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureParallelCompartmentFigure() {
			return fFigureParallelCompartmentFigure;
		}

	}

}
