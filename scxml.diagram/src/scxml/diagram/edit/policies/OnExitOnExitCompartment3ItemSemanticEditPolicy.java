package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Assign3CreateCommand;
import scxml.diagram.edit.commands.Cancel3CreateCommand;
import scxml.diagram.edit.commands.If3CreateCommand;
import scxml.diagram.edit.commands.Log3CreateCommand;
import scxml.diagram.edit.commands.Param3CreateCommand;
import scxml.diagram.edit.commands.Raise3CreateCommand;
import scxml.diagram.edit.commands.Script3CreateCommand;
import scxml.diagram.edit.commands.Send3CreateCommand;
import scxml.diagram.edit.commands.Validate3CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class OnExitOnExitCompartment3ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OnExitOnExitCompartment3ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.OnExit_3060);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Script_3024 == req.getElementType()) {
			return getGEFWrapper(new Script3CreateCommand(req));
		}
		if (ScxmlElementTypes.Assign_3025 == req.getElementType()) {
			return getGEFWrapper(new Assign3CreateCommand(req));
		}
		if (ScxmlElementTypes.Cancel_3026 == req.getElementType()) {
			return getGEFWrapper(new Cancel3CreateCommand(req));
		}
		if (ScxmlElementTypes.If_3027 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (ScxmlElementTypes.Log_3028 == req.getElementType()) {
			return getGEFWrapper(new Log3CreateCommand(req));
		}
		if (ScxmlElementTypes.Param_3029 == req.getElementType()) {
			return getGEFWrapper(new Param3CreateCommand(req));
		}
		if (ScxmlElementTypes.Raise_3030 == req.getElementType()) {
			return getGEFWrapper(new Raise3CreateCommand(req));
		}
		if (ScxmlElementTypes.Send_3031 == req.getElementType()) {
			return getGEFWrapper(new Send3CreateCommand(req));
		}
		if (ScxmlElementTypes.Validate_3032 == req.getElementType()) {
			return getGEFWrapper(new Validate3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
