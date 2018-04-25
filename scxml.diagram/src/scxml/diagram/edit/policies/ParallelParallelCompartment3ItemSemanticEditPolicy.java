package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.HistoryState2CreateCommand;
import scxml.diagram.edit.commands.Parallel3CreateCommand;
import scxml.diagram.edit.commands.State3CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ParallelParallelCompartment3ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ParallelParallelCompartment3ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Parallel_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Parallel_3038 == req.getElementType()) {
			return getGEFWrapper(new Parallel3CreateCommand(req));
		}
		if (ScxmlElementTypes.State_3039 == req.getElementType()) {
			return getGEFWrapper(new State3CreateCommand(req));
		}
		if (ScxmlElementTypes.HistoryState_3057 == req.getElementType()) {
			return getGEFWrapper(new HistoryState2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
