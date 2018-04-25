package scxml.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import scxml.diagram.edit.commands.DataModelCreateCommand;
import scxml.diagram.edit.commands.FinalStateCreateCommand;
import scxml.diagram.edit.commands.InitialStateCreateCommand;
import scxml.diagram.edit.commands.ParallelCreateCommand;
import scxml.diagram.edit.commands.ScriptCreateCommand;
import scxml.diagram.edit.commands.StateCreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ServiceTemplateItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServiceTemplateItemSemanticEditPolicy() {
		super(ScxmlElementTypes.ServiceTemplate_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.State_2001 == req.getElementType()) {
			return getGEFWrapper(new StateCreateCommand(req));
		}
		if (ScxmlElementTypes.FinalState_2002 == req.getElementType()) {
			return getGEFWrapper(new FinalStateCreateCommand(req));
		}
		if (ScxmlElementTypes.InitialState_2003 == req.getElementType()) {
			return getGEFWrapper(new InitialStateCreateCommand(req));
		}
		if (ScxmlElementTypes.Parallel_2004 == req.getElementType()) {
			return getGEFWrapper(new ParallelCreateCommand(req));
		}
		if (ScxmlElementTypes.DataModel_2005 == req.getElementType()) {
			return getGEFWrapper(new DataModelCreateCommand(req));
		}
		if (ScxmlElementTypes.Script_2006 == req.getElementType()) {
			return getGEFWrapper(new ScriptCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
