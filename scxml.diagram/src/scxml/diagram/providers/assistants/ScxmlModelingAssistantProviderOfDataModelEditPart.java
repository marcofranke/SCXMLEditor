package scxml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import scxml.diagram.providers.ScxmlElementTypes;
import scxml.diagram.providers.ScxmlModelingAssistantProvider;

/**
 * @generated
 */
public class ScxmlModelingAssistantProviderOfDataModelEditPart extends ScxmlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ScxmlElementTypes.Data_3061);
		return types;
	}

}
