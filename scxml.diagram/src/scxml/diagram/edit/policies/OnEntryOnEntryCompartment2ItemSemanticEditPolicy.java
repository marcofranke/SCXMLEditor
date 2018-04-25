package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.AssignCreateCommand;
import scxml.diagram.edit.commands.CancelCreateCommand;
import scxml.diagram.edit.commands.IfCreateCommand;
import scxml.diagram.edit.commands.Log2CreateCommand;
import scxml.diagram.edit.commands.Param2CreateCommand;
import scxml.diagram.edit.commands.Raise2CreateCommand;
import scxml.diagram.edit.commands.Script2CreateCommand;
import scxml.diagram.edit.commands.Send2CreateCommand;
import scxml.diagram.edit.commands.Validate2CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class OnEntryOnEntryCompartment2ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OnEntryOnEntryCompartment2ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.OnEntry_3041);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Script_3004 == req.getElementType()) {
			return getGEFWrapper(new Script2CreateCommand(req));
		}
		if (ScxmlElementTypes.Assign_3005 == req.getElementType()) {
			return getGEFWrapper(new AssignCreateCommand(req));
		}
		if (ScxmlElementTypes.Cancel_3006 == req.getElementType()) {
			return getGEFWrapper(new CancelCreateCommand(req));
		}
		if (ScxmlElementTypes.If_3007 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (ScxmlElementTypes.Log_3018 == req.getElementType()) {
			return getGEFWrapper(new Log2CreateCommand(req));
		}
		if (ScxmlElementTypes.Param_3019 == req.getElementType()) {
			return getGEFWrapper(new Param2CreateCommand(req));
		}
		if (ScxmlElementTypes.Raise_3020 == req.getElementType()) {
			return getGEFWrapper(new Raise2CreateCommand(req));
		}
		if (ScxmlElementTypes.Send_3021 == req.getElementType()) {
			return getGEFWrapper(new Send2CreateCommand(req));
		}
		if (ScxmlElementTypes.Validate_3022 == req.getElementType()) {
			return getGEFWrapper(new Validate2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
