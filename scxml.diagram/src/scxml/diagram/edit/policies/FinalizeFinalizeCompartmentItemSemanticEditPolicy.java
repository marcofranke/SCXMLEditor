package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Assign4CreateCommand;
import scxml.diagram.edit.commands.Cancel4CreateCommand;
import scxml.diagram.edit.commands.If4CreateCommand;
import scxml.diagram.edit.commands.Log4CreateCommand;
import scxml.diagram.edit.commands.Param6CreateCommand;
import scxml.diagram.edit.commands.Raise4CreateCommand;
import scxml.diagram.edit.commands.Send4CreateCommand;
import scxml.diagram.edit.commands.Validate4CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class FinalizeFinalizeCompartmentItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FinalizeFinalizeCompartmentItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Finalize_3047);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Assign_3048 == req.getElementType()) {
			return getGEFWrapper(new Assign4CreateCommand(req));
		}
		if (ScxmlElementTypes.Cancel_3049 == req.getElementType()) {
			return getGEFWrapper(new Cancel4CreateCommand(req));
		}
		if (ScxmlElementTypes.If_3050 == req.getElementType()) {
			return getGEFWrapper(new If4CreateCommand(req));
		}
		if (ScxmlElementTypes.Log_3051 == req.getElementType()) {
			return getGEFWrapper(new Log4CreateCommand(req));
		}
		if (ScxmlElementTypes.Param_3052 == req.getElementType()) {
			return getGEFWrapper(new Param6CreateCommand(req));
		}
		if (ScxmlElementTypes.Raise_3053 == req.getElementType()) {
			return getGEFWrapper(new Raise4CreateCommand(req));
		}
		if (ScxmlElementTypes.Send_3054 == req.getElementType()) {
			return getGEFWrapper(new Send4CreateCommand(req));
		}
		if (ScxmlElementTypes.Validate_3055 == req.getElementType()) {
			return getGEFWrapper(new Validate4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
