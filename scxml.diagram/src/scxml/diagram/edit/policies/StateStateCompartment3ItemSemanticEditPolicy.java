package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.FinalState2CreateCommand;
import scxml.diagram.edit.commands.HistoryStateCreateCommand;
import scxml.diagram.edit.commands.InitialState2CreateCommand;
import scxml.diagram.edit.commands.Parallel2CreateCommand;
import scxml.diagram.edit.commands.State2CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class StateStateCompartment3ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StateStateCompartment3ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.State_3039);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.State_3001 == req.getElementType()) {
			return getGEFWrapper(new State2CreateCommand(req));
		}
		if (ScxmlElementTypes.FinalState_3002 == req.getElementType()) {
			return getGEFWrapper(new FinalState2CreateCommand(req));
		}
		if (ScxmlElementTypes.Parallel_3037 == req.getElementType()) {
			return getGEFWrapper(new Parallel2CreateCommand(req));
		}
		if (ScxmlElementTypes.InitialState_3040 == req.getElementType()) {
			return getGEFWrapper(new InitialState2CreateCommand(req));
		}
		if (ScxmlElementTypes.HistoryState_3043 == req.getElementType()) {
			return getGEFWrapper(new HistoryStateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
