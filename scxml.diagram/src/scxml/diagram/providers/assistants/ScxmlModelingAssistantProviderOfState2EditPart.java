package scxml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import scxml.diagram.edit.parts.FinalState2EditPart;
import scxml.diagram.edit.parts.FinalStateEditPart;
import scxml.diagram.edit.parts.HistoryState2EditPart;
import scxml.diagram.edit.parts.HistoryStateEditPart;
import scxml.diagram.edit.parts.InitialState2EditPart;
import scxml.diagram.edit.parts.InitialStateEditPart;
import scxml.diagram.edit.parts.Parallel2EditPart;
import scxml.diagram.edit.parts.Parallel3EditPart;
import scxml.diagram.edit.parts.ParallelEditPart;
import scxml.diagram.edit.parts.State2EditPart;
import scxml.diagram.edit.parts.State3EditPart;
import scxml.diagram.edit.parts.StateEditPart;
import scxml.diagram.providers.ScxmlElementTypes;
import scxml.diagram.providers.ScxmlModelingAssistantProvider;

/**
 * @generated
 */
public class ScxmlModelingAssistantProviderOfState2EditPart extends ScxmlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((State2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(State2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ScxmlElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((State2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(State2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StateEditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof FinalStateEditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InitialStateEditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ParallelEditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof State2EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof FinalState2EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Parallel2EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Parallel3EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof State3EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InitialState2EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof HistoryStateEditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof HistoryState2EditPart) {
			types.add(ScxmlElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((State2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(State2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ScxmlElementTypes.Transition_4001) {
			types.add(ScxmlElementTypes.State_2001);
			types.add(ScxmlElementTypes.FinalState_2002);
			types.add(ScxmlElementTypes.InitialState_2003);
			types.add(ScxmlElementTypes.Parallel_2004);
			types.add(ScxmlElementTypes.State_3001);
			types.add(ScxmlElementTypes.FinalState_3002);
			types.add(ScxmlElementTypes.Parallel_3037);
			types.add(ScxmlElementTypes.Parallel_3038);
			types.add(ScxmlElementTypes.State_3039);
			types.add(ScxmlElementTypes.InitialState_3040);
			types.add(ScxmlElementTypes.HistoryState_3043);
			types.add(ScxmlElementTypes.HistoryState_3057);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((State2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(State2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ScxmlElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((State2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(State2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ScxmlElementTypes.Transition_4001) {
			types.add(ScxmlElementTypes.State_2001);
			types.add(ScxmlElementTypes.FinalState_2002);
			types.add(ScxmlElementTypes.InitialState_2003);
			types.add(ScxmlElementTypes.Parallel_2004);
			types.add(ScxmlElementTypes.State_3001);
			types.add(ScxmlElementTypes.FinalState_3002);
			types.add(ScxmlElementTypes.Parallel_3037);
			types.add(ScxmlElementTypes.Parallel_3038);
			types.add(ScxmlElementTypes.State_3039);
			types.add(ScxmlElementTypes.InitialState_3040);
			types.add(ScxmlElementTypes.HistoryState_3043);
			types.add(ScxmlElementTypes.HistoryState_3057);
		}
		return types;
	}

}
