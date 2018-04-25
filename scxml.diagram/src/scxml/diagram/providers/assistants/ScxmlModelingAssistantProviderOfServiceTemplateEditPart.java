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
public class ScxmlModelingAssistantProviderOfServiceTemplateEditPart extends ScxmlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ScxmlElementTypes.State_2001);
		types.add(ScxmlElementTypes.FinalState_2002);
		types.add(ScxmlElementTypes.InitialState_2003);
		types.add(ScxmlElementTypes.Parallel_2004);
		types.add(ScxmlElementTypes.DataModel_2005);
		types.add(ScxmlElementTypes.Script_2006);
		return types;
	}

}
