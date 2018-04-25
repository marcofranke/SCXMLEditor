package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.DataCreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class DataModelDataModelCompartmentItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataModelDataModelCompartmentItemSemanticEditPolicy() {
		super(ScxmlElementTypes.DataModel_2005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Data_3061 == req.getElementType()) {
			return getGEFWrapper(new DataCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
