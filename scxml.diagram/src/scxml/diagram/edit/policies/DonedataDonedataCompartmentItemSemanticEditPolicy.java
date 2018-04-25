package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.ContentCreateCommand;
import scxml.diagram.edit.commands.Param4CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class DonedataDonedataCompartmentItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DonedataDonedataCompartmentItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Donedata_3033);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Content_3034 == req.getElementType()) {
			return getGEFWrapper(new ContentCreateCommand(req));
		}
		if (ScxmlElementTypes.Param_3036 == req.getElementType()) {
			return getGEFWrapper(new Param4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
