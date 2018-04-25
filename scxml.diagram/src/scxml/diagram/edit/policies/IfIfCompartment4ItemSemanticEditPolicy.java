package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Assign2CreateCommand;
import scxml.diagram.edit.commands.Cancel2CreateCommand;
import scxml.diagram.edit.commands.ElseCreateCommand;
import scxml.diagram.edit.commands.ElseIfCreateCommand;
import scxml.diagram.edit.commands.If2CreateCommand;
import scxml.diagram.edit.commands.LogCreateCommand;
import scxml.diagram.edit.commands.ParamCreateCommand;
import scxml.diagram.edit.commands.RaiseCreateCommand;
import scxml.diagram.edit.commands.SendCreateCommand;
import scxml.diagram.edit.commands.ValidateCreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class IfIfCompartment4ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfCompartment4ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.If_3050);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.ElseIf_3008 == req.getElementType()) {
			return getGEFWrapper(new ElseIfCreateCommand(req));
		}
		if (ScxmlElementTypes.Else_3009 == req.getElementType()) {
			return getGEFWrapper(new ElseCreateCommand(req));
		}
		if (ScxmlElementTypes.Assign_3010 == req.getElementType()) {
			return getGEFWrapper(new Assign2CreateCommand(req));
		}
		if (ScxmlElementTypes.Cancel_3011 == req.getElementType()) {
			return getGEFWrapper(new Cancel2CreateCommand(req));
		}
		if (ScxmlElementTypes.If_3012 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (ScxmlElementTypes.Log_3013 == req.getElementType()) {
			return getGEFWrapper(new LogCreateCommand(req));
		}
		if (ScxmlElementTypes.Param_3014 == req.getElementType()) {
			return getGEFWrapper(new ParamCreateCommand(req));
		}
		if (ScxmlElementTypes.Raise_3015 == req.getElementType()) {
			return getGEFWrapper(new RaiseCreateCommand(req));
		}
		if (ScxmlElementTypes.Send_3016 == req.getElementType()) {
			return getGEFWrapper(new SendCreateCommand(req));
		}
		if (ScxmlElementTypes.Validate_3017 == req.getElementType()) {
			return getGEFWrapper(new ValidateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
