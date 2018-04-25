package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.AnchorCreateCommand;
import scxml.diagram.edit.commands.InvokeCreateCommand;
import scxml.diagram.edit.commands.OnEntry2CreateCommand;
import scxml.diagram.edit.commands.OnExit2CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class StateStateAttrCompartment2ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StateStateAttrCompartment2ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.State_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.OnEntry_3041 == req.getElementType()) {
			return getGEFWrapper(new OnEntry2CreateCommand(req));
		}
		if (ScxmlElementTypes.OnExit_3042 == req.getElementType()) {
			return getGEFWrapper(new OnExit2CreateCommand(req));
		}
		if (ScxmlElementTypes.Anchor_3044 == req.getElementType()) {
			return getGEFWrapper(new AnchorCreateCommand(req));
		}
		if (ScxmlElementTypes.Invoke_3045 == req.getElementType()) {
			return getGEFWrapper(new InvokeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
