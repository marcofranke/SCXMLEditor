package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Anchor2CreateCommand;
import scxml.diagram.edit.commands.OnEntry3CreateCommand;
import scxml.diagram.edit.commands.OnExit3CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ParallelParallelAttrCompartment2ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ParallelParallelAttrCompartment2ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Parallel_3038);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Anchor_3058 == req.getElementType()) {
			return getGEFWrapper(new Anchor2CreateCommand(req));
		}
		if (ScxmlElementTypes.OnEntry_3059 == req.getElementType()) {
			return getGEFWrapper(new OnEntry3CreateCommand(req));
		}
		if (ScxmlElementTypes.OnExit_3060 == req.getElementType()) {
			return getGEFWrapper(new OnExit3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
