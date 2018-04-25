package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Content3CreateCommand;
import scxml.diagram.edit.commands.FinalizeCreateCommand;
import scxml.diagram.edit.commands.Param5CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class InvokeInvokeCompartmentItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InvokeInvokeCompartmentItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Invoke_3045);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Param_3046 == req.getElementType()) {
			return getGEFWrapper(new Param5CreateCommand(req));
		}
		if (ScxmlElementTypes.Finalize_3047 == req.getElementType()) {
			return getGEFWrapper(new FinalizeCreateCommand(req));
		}
		if (ScxmlElementTypes.Content_3056 == req.getElementType()) {
			return getGEFWrapper(new Content3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
