package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.DonedataCreateCommand;
import scxml.diagram.edit.commands.OnEntryCreateCommand;
import scxml.diagram.edit.commands.OnExitCreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class FinalStateFinalCompartmentItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FinalStateFinalCompartmentItemSemanticEditPolicy() {
		super(ScxmlElementTypes.FinalState_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.OnEntry_3003 == req.getElementType()) {
			return getGEFWrapper(new OnEntryCreateCommand(req));
		}
		if (ScxmlElementTypes.OnExit_3023 == req.getElementType()) {
			return getGEFWrapper(new OnExitCreateCommand(req));
		}
		if (ScxmlElementTypes.Donedata_3033 == req.getElementType()) {
			return getGEFWrapper(new DonedataCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
