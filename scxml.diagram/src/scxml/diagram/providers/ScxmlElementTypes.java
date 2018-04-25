package scxml.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import scxml.ScxmlPackage;
import scxml.diagram.edit.parts.Anchor2EditPart;
import scxml.diagram.edit.parts.AnchorEditPart;
import scxml.diagram.edit.parts.Assign2EditPart;
import scxml.diagram.edit.parts.Assign3EditPart;
import scxml.diagram.edit.parts.Assign4EditPart;
import scxml.diagram.edit.parts.AssignEditPart;
import scxml.diagram.edit.parts.Cancel2EditPart;
import scxml.diagram.edit.parts.Cancel3EditPart;
import scxml.diagram.edit.parts.Cancel4EditPart;
import scxml.diagram.edit.parts.CancelEditPart;
import scxml.diagram.edit.parts.Content2EditPart;
import scxml.diagram.edit.parts.Content3EditPart;
import scxml.diagram.edit.parts.ContentEditPart;
import scxml.diagram.edit.parts.DataEditPart;
import scxml.diagram.edit.parts.DataModelEditPart;
import scxml.diagram.edit.parts.DonedataEditPart;
import scxml.diagram.edit.parts.ElseEditPart;
import scxml.diagram.edit.parts.ElseIfEditPart;
import scxml.diagram.edit.parts.FinalState2EditPart;
import scxml.diagram.edit.parts.FinalStateEditPart;
import scxml.diagram.edit.parts.FinalizeEditPart;
import scxml.diagram.edit.parts.HistoryState2EditPart;
import scxml.diagram.edit.parts.HistoryStateEditPart;
import scxml.diagram.edit.parts.If2EditPart;
import scxml.diagram.edit.parts.If3EditPart;
import scxml.diagram.edit.parts.If4EditPart;
import scxml.diagram.edit.parts.IfEditPart;
import scxml.diagram.edit.parts.InitialState2EditPart;
import scxml.diagram.edit.parts.InitialStateEditPart;
import scxml.diagram.edit.parts.InvokeEditPart;
import scxml.diagram.edit.parts.Log2EditPart;
import scxml.diagram.edit.parts.Log3EditPart;
import scxml.diagram.edit.parts.Log4EditPart;
import scxml.diagram.edit.parts.LogEditPart;
import scxml.diagram.edit.parts.OnEntry2EditPart;
import scxml.diagram.edit.parts.OnEntry3EditPart;
import scxml.diagram.edit.parts.OnEntryEditPart;
import scxml.diagram.edit.parts.OnExit2EditPart;
import scxml.diagram.edit.parts.OnExit3EditPart;
import scxml.diagram.edit.parts.OnExitEditPart;
import scxml.diagram.edit.parts.Parallel2EditPart;
import scxml.diagram.edit.parts.Parallel3EditPart;
import scxml.diagram.edit.parts.ParallelEditPart;
import scxml.diagram.edit.parts.Param2EditPart;
import scxml.diagram.edit.parts.Param3EditPart;
import scxml.diagram.edit.parts.Param4EditPart;
import scxml.diagram.edit.parts.Param5EditPart;
import scxml.diagram.edit.parts.Param6EditPart;
import scxml.diagram.edit.parts.ParamEditPart;
import scxml.diagram.edit.parts.Raise2EditPart;
import scxml.diagram.edit.parts.Raise3EditPart;
import scxml.diagram.edit.parts.Raise4EditPart;
import scxml.diagram.edit.parts.RaiseEditPart;
import scxml.diagram.edit.parts.Script2EditPart;
import scxml.diagram.edit.parts.Script3EditPart;
import scxml.diagram.edit.parts.ScriptEditPart;
import scxml.diagram.edit.parts.Send2EditPart;
import scxml.diagram.edit.parts.Send3EditPart;
import scxml.diagram.edit.parts.Send4EditPart;
import scxml.diagram.edit.parts.SendEditPart;
import scxml.diagram.edit.parts.ServiceTemplateEditPart;
import scxml.diagram.edit.parts.State2EditPart;
import scxml.diagram.edit.parts.State3EditPart;
import scxml.diagram.edit.parts.StateEditPart;
import scxml.diagram.edit.parts.TransitionEditPart;
import scxml.diagram.edit.parts.Validate2EditPart;
import scxml.diagram.edit.parts.Validate3EditPart;
import scxml.diagram.edit.parts.Validate4EditPart;
import scxml.diagram.edit.parts.ValidateEditPart;
import scxml.diagram.part.ScxmlDiagramEditorPlugin;

/**
 * @generated
 */
public class ScxmlElementTypes {

	/**
	* @generated
	*/
	private ScxmlElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ScxmlDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ServiceTemplate_1000 = getElementType("scxml.diagram.ServiceTemplate_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType State_2001 = getElementType("scxml.diagram.State_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalState_2002 = getElementType("scxml.diagram.FinalState_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialState_2003 = getElementType("scxml.diagram.InitialState_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parallel_2004 = getElementType("scxml.diagram.Parallel_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataModel_2005 = getElementType("scxml.diagram.DataModel_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Script_2006 = getElementType("scxml.diagram.Script_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType State_3001 = getElementType("scxml.diagram.State_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalState_3002 = getElementType("scxml.diagram.FinalState_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnEntry_3003 = getElementType("scxml.diagram.OnEntry_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Script_3004 = getElementType("scxml.diagram.Script_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assign_3005 = getElementType("scxml.diagram.Assign_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cancel_3006 = getElementType("scxml.diagram.Cancel_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3007 = getElementType("scxml.diagram.If_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ElseIf_3008 = getElementType("scxml.diagram.ElseIf_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Else_3009 = getElementType("scxml.diagram.Else_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assign_3010 = getElementType("scxml.diagram.Assign_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cancel_3011 = getElementType("scxml.diagram.Cancel_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3012 = getElementType("scxml.diagram.If_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Log_3013 = getElementType("scxml.diagram.Log_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3014 = getElementType("scxml.diagram.Param_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Raise_3015 = getElementType("scxml.diagram.Raise_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Send_3016 = getElementType("scxml.diagram.Send_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Validate_3017 = getElementType("scxml.diagram.Validate_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Log_3018 = getElementType("scxml.diagram.Log_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3019 = getElementType("scxml.diagram.Param_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Raise_3020 = getElementType("scxml.diagram.Raise_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Send_3021 = getElementType("scxml.diagram.Send_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Validate_3022 = getElementType("scxml.diagram.Validate_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnExit_3023 = getElementType("scxml.diagram.OnExit_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Script_3024 = getElementType("scxml.diagram.Script_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assign_3025 = getElementType("scxml.diagram.Assign_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cancel_3026 = getElementType("scxml.diagram.Cancel_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3027 = getElementType("scxml.diagram.If_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Log_3028 = getElementType("scxml.diagram.Log_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3029 = getElementType("scxml.diagram.Param_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Raise_3030 = getElementType("scxml.diagram.Raise_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Send_3031 = getElementType("scxml.diagram.Send_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Validate_3032 = getElementType("scxml.diagram.Validate_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Donedata_3033 = getElementType("scxml.diagram.Donedata_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Content_3034 = getElementType("scxml.diagram.Content_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Content_3035 = getElementType("scxml.diagram.Content_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3036 = getElementType("scxml.diagram.Param_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parallel_3037 = getElementType("scxml.diagram.Parallel_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parallel_3038 = getElementType("scxml.diagram.Parallel_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType State_3039 = getElementType("scxml.diagram.State_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialState_3040 = getElementType("scxml.diagram.InitialState_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnEntry_3041 = getElementType("scxml.diagram.OnEntry_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnExit_3042 = getElementType("scxml.diagram.OnExit_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HistoryState_3043 = getElementType("scxml.diagram.HistoryState_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Anchor_3044 = getElementType("scxml.diagram.Anchor_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Invoke_3045 = getElementType("scxml.diagram.Invoke_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3046 = getElementType("scxml.diagram.Param_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Finalize_3047 = getElementType("scxml.diagram.Finalize_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assign_3048 = getElementType("scxml.diagram.Assign_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cancel_3049 = getElementType("scxml.diagram.Cancel_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3050 = getElementType("scxml.diagram.If_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Log_3051 = getElementType("scxml.diagram.Log_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Param_3052 = getElementType("scxml.diagram.Param_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Raise_3053 = getElementType("scxml.diagram.Raise_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Send_3054 = getElementType("scxml.diagram.Send_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Validate_3055 = getElementType("scxml.diagram.Validate_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Content_3056 = getElementType("scxml.diagram.Content_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HistoryState_3057 = getElementType("scxml.diagram.HistoryState_3057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Anchor_3058 = getElementType("scxml.diagram.Anchor_3058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnEntry_3059 = getElementType("scxml.diagram.OnEntry_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OnExit_3060 = getElementType("scxml.diagram.OnExit_3060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Data_3061 = getElementType("scxml.diagram.Data_3061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transition_4001 = getElementType("scxml.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServiceTemplate_1000, ScxmlPackage.eINSTANCE.getServiceTemplate());

			elements.put(State_2001, ScxmlPackage.eINSTANCE.getState());

			elements.put(FinalState_2002, ScxmlPackage.eINSTANCE.getFinalState());

			elements.put(InitialState_2003, ScxmlPackage.eINSTANCE.getInitialState());

			elements.put(Parallel_2004, ScxmlPackage.eINSTANCE.getParallel());

			elements.put(DataModel_2005, ScxmlPackage.eINSTANCE.getDataModel());

			elements.put(Script_2006, ScxmlPackage.eINSTANCE.getScript());

			elements.put(State_3001, ScxmlPackage.eINSTANCE.getState());

			elements.put(FinalState_3002, ScxmlPackage.eINSTANCE.getFinalState());

			elements.put(OnEntry_3003, ScxmlPackage.eINSTANCE.getOnEntry());

			elements.put(Script_3004, ScxmlPackage.eINSTANCE.getScript());

			elements.put(Assign_3005, ScxmlPackage.eINSTANCE.getAssign());

			elements.put(Cancel_3006, ScxmlPackage.eINSTANCE.getCancel());

			elements.put(If_3007, ScxmlPackage.eINSTANCE.getIf());

			elements.put(ElseIf_3008, ScxmlPackage.eINSTANCE.getElseIf());

			elements.put(Else_3009, ScxmlPackage.eINSTANCE.getElse());

			elements.put(Assign_3010, ScxmlPackage.eINSTANCE.getAssign());

			elements.put(Cancel_3011, ScxmlPackage.eINSTANCE.getCancel());

			elements.put(If_3012, ScxmlPackage.eINSTANCE.getIf());

			elements.put(Log_3013, ScxmlPackage.eINSTANCE.getLog());

			elements.put(Param_3014, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Raise_3015, ScxmlPackage.eINSTANCE.getRaise());

			elements.put(Send_3016, ScxmlPackage.eINSTANCE.getSend());

			elements.put(Validate_3017, ScxmlPackage.eINSTANCE.getValidate());

			elements.put(Log_3018, ScxmlPackage.eINSTANCE.getLog());

			elements.put(Param_3019, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Raise_3020, ScxmlPackage.eINSTANCE.getRaise());

			elements.put(Send_3021, ScxmlPackage.eINSTANCE.getSend());

			elements.put(Validate_3022, ScxmlPackage.eINSTANCE.getValidate());

			elements.put(OnExit_3023, ScxmlPackage.eINSTANCE.getOnExit());

			elements.put(Script_3024, ScxmlPackage.eINSTANCE.getScript());

			elements.put(Assign_3025, ScxmlPackage.eINSTANCE.getAssign());

			elements.put(Cancel_3026, ScxmlPackage.eINSTANCE.getCancel());

			elements.put(If_3027, ScxmlPackage.eINSTANCE.getIf());

			elements.put(Log_3028, ScxmlPackage.eINSTANCE.getLog());

			elements.put(Param_3029, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Raise_3030, ScxmlPackage.eINSTANCE.getRaise());

			elements.put(Send_3031, ScxmlPackage.eINSTANCE.getSend());

			elements.put(Validate_3032, ScxmlPackage.eINSTANCE.getValidate());

			elements.put(Donedata_3033, ScxmlPackage.eINSTANCE.getDonedata());

			elements.put(Content_3034, ScxmlPackage.eINSTANCE.getContent());

			elements.put(Content_3035, ScxmlPackage.eINSTANCE.getContent());

			elements.put(Param_3036, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Parallel_3037, ScxmlPackage.eINSTANCE.getParallel());

			elements.put(Parallel_3038, ScxmlPackage.eINSTANCE.getParallel());

			elements.put(State_3039, ScxmlPackage.eINSTANCE.getState());

			elements.put(InitialState_3040, ScxmlPackage.eINSTANCE.getInitialState());

			elements.put(OnEntry_3041, ScxmlPackage.eINSTANCE.getOnEntry());

			elements.put(OnExit_3042, ScxmlPackage.eINSTANCE.getOnExit());

			elements.put(HistoryState_3043, ScxmlPackage.eINSTANCE.getHistoryState());

			elements.put(Anchor_3044, ScxmlPackage.eINSTANCE.getAnchor());

			elements.put(Invoke_3045, ScxmlPackage.eINSTANCE.getInvoke());

			elements.put(Param_3046, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Finalize_3047, ScxmlPackage.eINSTANCE.getFinalize());

			elements.put(Assign_3048, ScxmlPackage.eINSTANCE.getAssign());

			elements.put(Cancel_3049, ScxmlPackage.eINSTANCE.getCancel());

			elements.put(If_3050, ScxmlPackage.eINSTANCE.getIf());

			elements.put(Log_3051, ScxmlPackage.eINSTANCE.getLog());

			elements.put(Param_3052, ScxmlPackage.eINSTANCE.getParam());

			elements.put(Raise_3053, ScxmlPackage.eINSTANCE.getRaise());

			elements.put(Send_3054, ScxmlPackage.eINSTANCE.getSend());

			elements.put(Validate_3055, ScxmlPackage.eINSTANCE.getValidate());

			elements.put(Content_3056, ScxmlPackage.eINSTANCE.getContent());

			elements.put(HistoryState_3057, ScxmlPackage.eINSTANCE.getHistoryState());

			elements.put(Anchor_3058, ScxmlPackage.eINSTANCE.getAnchor());

			elements.put(OnEntry_3059, ScxmlPackage.eINSTANCE.getOnEntry());

			elements.put(OnExit_3060, ScxmlPackage.eINSTANCE.getOnExit());

			elements.put(Data_3061, ScxmlPackage.eINSTANCE.getData());

			elements.put(Transition_4001, ScxmlPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServiceTemplate_1000);
			KNOWN_ELEMENT_TYPES.add(State_2001);
			KNOWN_ELEMENT_TYPES.add(FinalState_2002);
			KNOWN_ELEMENT_TYPES.add(InitialState_2003);
			KNOWN_ELEMENT_TYPES.add(Parallel_2004);
			KNOWN_ELEMENT_TYPES.add(DataModel_2005);
			KNOWN_ELEMENT_TYPES.add(Script_2006);
			KNOWN_ELEMENT_TYPES.add(State_3001);
			KNOWN_ELEMENT_TYPES.add(FinalState_3002);
			KNOWN_ELEMENT_TYPES.add(OnEntry_3003);
			KNOWN_ELEMENT_TYPES.add(Script_3004);
			KNOWN_ELEMENT_TYPES.add(Assign_3005);
			KNOWN_ELEMENT_TYPES.add(Cancel_3006);
			KNOWN_ELEMENT_TYPES.add(If_3007);
			KNOWN_ELEMENT_TYPES.add(ElseIf_3008);
			KNOWN_ELEMENT_TYPES.add(Else_3009);
			KNOWN_ELEMENT_TYPES.add(Assign_3010);
			KNOWN_ELEMENT_TYPES.add(Cancel_3011);
			KNOWN_ELEMENT_TYPES.add(If_3012);
			KNOWN_ELEMENT_TYPES.add(Log_3013);
			KNOWN_ELEMENT_TYPES.add(Param_3014);
			KNOWN_ELEMENT_TYPES.add(Raise_3015);
			KNOWN_ELEMENT_TYPES.add(Send_3016);
			KNOWN_ELEMENT_TYPES.add(Validate_3017);
			KNOWN_ELEMENT_TYPES.add(Log_3018);
			KNOWN_ELEMENT_TYPES.add(Param_3019);
			KNOWN_ELEMENT_TYPES.add(Raise_3020);
			KNOWN_ELEMENT_TYPES.add(Send_3021);
			KNOWN_ELEMENT_TYPES.add(Validate_3022);
			KNOWN_ELEMENT_TYPES.add(OnExit_3023);
			KNOWN_ELEMENT_TYPES.add(Script_3024);
			KNOWN_ELEMENT_TYPES.add(Assign_3025);
			KNOWN_ELEMENT_TYPES.add(Cancel_3026);
			KNOWN_ELEMENT_TYPES.add(If_3027);
			KNOWN_ELEMENT_TYPES.add(Log_3028);
			KNOWN_ELEMENT_TYPES.add(Param_3029);
			KNOWN_ELEMENT_TYPES.add(Raise_3030);
			KNOWN_ELEMENT_TYPES.add(Send_3031);
			KNOWN_ELEMENT_TYPES.add(Validate_3032);
			KNOWN_ELEMENT_TYPES.add(Donedata_3033);
			KNOWN_ELEMENT_TYPES.add(Content_3034);
			KNOWN_ELEMENT_TYPES.add(Content_3035);
			KNOWN_ELEMENT_TYPES.add(Param_3036);
			KNOWN_ELEMENT_TYPES.add(Parallel_3037);
			KNOWN_ELEMENT_TYPES.add(Parallel_3038);
			KNOWN_ELEMENT_TYPES.add(State_3039);
			KNOWN_ELEMENT_TYPES.add(InitialState_3040);
			KNOWN_ELEMENT_TYPES.add(OnEntry_3041);
			KNOWN_ELEMENT_TYPES.add(OnExit_3042);
			KNOWN_ELEMENT_TYPES.add(HistoryState_3043);
			KNOWN_ELEMENT_TYPES.add(Anchor_3044);
			KNOWN_ELEMENT_TYPES.add(Invoke_3045);
			KNOWN_ELEMENT_TYPES.add(Param_3046);
			KNOWN_ELEMENT_TYPES.add(Finalize_3047);
			KNOWN_ELEMENT_TYPES.add(Assign_3048);
			KNOWN_ELEMENT_TYPES.add(Cancel_3049);
			KNOWN_ELEMENT_TYPES.add(If_3050);
			KNOWN_ELEMENT_TYPES.add(Log_3051);
			KNOWN_ELEMENT_TYPES.add(Param_3052);
			KNOWN_ELEMENT_TYPES.add(Raise_3053);
			KNOWN_ELEMENT_TYPES.add(Send_3054);
			KNOWN_ELEMENT_TYPES.add(Validate_3055);
			KNOWN_ELEMENT_TYPES.add(Content_3056);
			KNOWN_ELEMENT_TYPES.add(HistoryState_3057);
			KNOWN_ELEMENT_TYPES.add(Anchor_3058);
			KNOWN_ELEMENT_TYPES.add(OnEntry_3059);
			KNOWN_ELEMENT_TYPES.add(OnExit_3060);
			KNOWN_ELEMENT_TYPES.add(Data_3061);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ServiceTemplateEditPart.VISUAL_ID:
			return ServiceTemplate_1000;
		case StateEditPart.VISUAL_ID:
			return State_2001;
		case FinalStateEditPart.VISUAL_ID:
			return FinalState_2002;
		case InitialStateEditPart.VISUAL_ID:
			return InitialState_2003;
		case ParallelEditPart.VISUAL_ID:
			return Parallel_2004;
		case DataModelEditPart.VISUAL_ID:
			return DataModel_2005;
		case ScriptEditPart.VISUAL_ID:
			return Script_2006;
		case State2EditPart.VISUAL_ID:
			return State_3001;
		case FinalState2EditPart.VISUAL_ID:
			return FinalState_3002;
		case OnEntryEditPart.VISUAL_ID:
			return OnEntry_3003;
		case Script2EditPart.VISUAL_ID:
			return Script_3004;
		case AssignEditPart.VISUAL_ID:
			return Assign_3005;
		case CancelEditPart.VISUAL_ID:
			return Cancel_3006;
		case IfEditPart.VISUAL_ID:
			return If_3007;
		case ElseIfEditPart.VISUAL_ID:
			return ElseIf_3008;
		case ElseEditPart.VISUAL_ID:
			return Else_3009;
		case Assign2EditPart.VISUAL_ID:
			return Assign_3010;
		case Cancel2EditPart.VISUAL_ID:
			return Cancel_3011;
		case If2EditPart.VISUAL_ID:
			return If_3012;
		case LogEditPart.VISUAL_ID:
			return Log_3013;
		case ParamEditPart.VISUAL_ID:
			return Param_3014;
		case RaiseEditPart.VISUAL_ID:
			return Raise_3015;
		case SendEditPart.VISUAL_ID:
			return Send_3016;
		case ValidateEditPart.VISUAL_ID:
			return Validate_3017;
		case Log2EditPart.VISUAL_ID:
			return Log_3018;
		case Param2EditPart.VISUAL_ID:
			return Param_3019;
		case Raise2EditPart.VISUAL_ID:
			return Raise_3020;
		case Send2EditPart.VISUAL_ID:
			return Send_3021;
		case Validate2EditPart.VISUAL_ID:
			return Validate_3022;
		case OnExitEditPart.VISUAL_ID:
			return OnExit_3023;
		case Script3EditPart.VISUAL_ID:
			return Script_3024;
		case Assign3EditPart.VISUAL_ID:
			return Assign_3025;
		case Cancel3EditPart.VISUAL_ID:
			return Cancel_3026;
		case If3EditPart.VISUAL_ID:
			return If_3027;
		case Log3EditPart.VISUAL_ID:
			return Log_3028;
		case Param3EditPart.VISUAL_ID:
			return Param_3029;
		case Raise3EditPart.VISUAL_ID:
			return Raise_3030;
		case Send3EditPart.VISUAL_ID:
			return Send_3031;
		case Validate3EditPart.VISUAL_ID:
			return Validate_3032;
		case DonedataEditPart.VISUAL_ID:
			return Donedata_3033;
		case ContentEditPart.VISUAL_ID:
			return Content_3034;
		case Content2EditPart.VISUAL_ID:
			return Content_3035;
		case Param4EditPart.VISUAL_ID:
			return Param_3036;
		case Parallel2EditPart.VISUAL_ID:
			return Parallel_3037;
		case Parallel3EditPart.VISUAL_ID:
			return Parallel_3038;
		case State3EditPart.VISUAL_ID:
			return State_3039;
		case InitialState2EditPart.VISUAL_ID:
			return InitialState_3040;
		case OnEntry2EditPart.VISUAL_ID:
			return OnEntry_3041;
		case OnExit2EditPart.VISUAL_ID:
			return OnExit_3042;
		case HistoryStateEditPart.VISUAL_ID:
			return HistoryState_3043;
		case AnchorEditPart.VISUAL_ID:
			return Anchor_3044;
		case InvokeEditPart.VISUAL_ID:
			return Invoke_3045;
		case Param5EditPart.VISUAL_ID:
			return Param_3046;
		case FinalizeEditPart.VISUAL_ID:
			return Finalize_3047;
		case Assign4EditPart.VISUAL_ID:
			return Assign_3048;
		case Cancel4EditPart.VISUAL_ID:
			return Cancel_3049;
		case If4EditPart.VISUAL_ID:
			return If_3050;
		case Log4EditPart.VISUAL_ID:
			return Log_3051;
		case Param6EditPart.VISUAL_ID:
			return Param_3052;
		case Raise4EditPart.VISUAL_ID:
			return Raise_3053;
		case Send4EditPart.VISUAL_ID:
			return Send_3054;
		case Validate4EditPart.VISUAL_ID:
			return Validate_3055;
		case Content3EditPart.VISUAL_ID:
			return Content_3056;
		case HistoryState2EditPart.VISUAL_ID:
			return HistoryState_3057;
		case Anchor2EditPart.VISUAL_ID:
			return Anchor_3058;
		case OnEntry3EditPart.VISUAL_ID:
			return OnEntry_3059;
		case OnExit3EditPart.VISUAL_ID:
			return OnExit_3060;
		case DataEditPart.VISUAL_ID:
			return Data_3061;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return scxml.diagram.providers.ScxmlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return scxml.diagram.providers.ScxmlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return scxml.diagram.providers.ScxmlElementTypes.getElement(elementTypeAdapter);
		}
	};

}
