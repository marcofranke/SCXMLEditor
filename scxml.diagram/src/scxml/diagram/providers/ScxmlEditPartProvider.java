package scxml.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import scxml.diagram.edit.parts.ScxmlEditPartFactory;
import scxml.diagram.edit.parts.ServiceTemplateEditPart;
import scxml.diagram.part.ScxmlVisualIDRegistry;

/**
 * @generated
 */
public class ScxmlEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ScxmlEditPartProvider() {
		super(new ScxmlEditPartFactory(), ScxmlVisualIDRegistry.TYPED_INSTANCE, ServiceTemplateEditPart.MODEL_ID);
	}

}
