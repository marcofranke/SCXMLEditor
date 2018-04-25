package scxml.diagram.providers;

import scxml.diagram.part.ScxmlDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ScxmlDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ScxmlDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
