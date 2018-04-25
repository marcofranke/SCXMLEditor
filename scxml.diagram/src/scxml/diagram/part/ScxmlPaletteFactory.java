
package scxml.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ScxmlPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createScxml1Group());
	}

	/**
	* Creates "scxml" palette tool group
	* @generated
	*/
	private PaletteContainer createScxml1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Scxml1Group_title);
		paletteContainer.setId("createScxml1Group"); //$NON-NLS-1$
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createAssign3CreationTool());
		paletteContainer.add(createOnEntry4CreationTool());
		paletteContainer.add(createOnExit5CreationTool());
		paletteContainer.add(createInitialState6CreationTool());
		paletteContainer.add(createFinalState7CreationTool());
		paletteContainer.add(createParallel8CreationTool());
		paletteContainer.add(createHistoryState9CreationTool());
		paletteContainer.add(createRaise10CreationTool());
		paletteContainer.add(createIf11CreationTool());
		paletteContainer.add(createElseIf12CreationTool());
		paletteContainer.add(createElse13CreationTool());
		paletteContainer.add(createLog14CreationTool());
		paletteContainer.add(createDataModel15CreationTool());
		paletteContainer.add(createData16CreationTool());
		paletteContainer.add(createValidate17CreationTool());
		paletteContainer.add(createParam18CreationTool());
		paletteContainer.add(createScript19CreationTool());
		paletteContainer.add(createAnchor20CreationTool());
		paletteContainer.add(createSend21CreationTool());
		paletteContainer.add(createCancel22CreationTool());
		paletteContainer.add(createContent23CreationTool());
		paletteContainer.add(createDonedata24CreationTool());
		paletteContainer.add(createInvoke25CreationTool());
		paletteContainer.add(createFinalize26CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createState1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.State_2001);
		types.add(ScxmlElementTypes.State_3001);
		types.add(ScxmlElementTypes.State_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.State1CreationTool_title,
				Messages.State1CreationTool_desc, types);
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.State_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Transition_4001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssign3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Assign_3005);
		types.add(ScxmlElementTypes.Assign_3010);
		types.add(ScxmlElementTypes.Assign_3025);
		types.add(ScxmlElementTypes.Assign_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Assign3CreationTool_title,
				Messages.Assign3CreationTool_desc, types);
		entry.setId("createAssign3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Assign_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOnEntry4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.OnEntry_3003);
		types.add(ScxmlElementTypes.OnEntry_3041);
		types.add(ScxmlElementTypes.OnEntry_3059);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OnEntry4CreationTool_title,
				Messages.OnEntry4CreationTool_desc, types);
		entry.setId("createOnEntry4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.OnEntry_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOnExit5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.OnExit_3023);
		types.add(ScxmlElementTypes.OnExit_3042);
		types.add(ScxmlElementTypes.OnExit_3060);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OnExit5CreationTool_title,
				Messages.OnExit5CreationTool_desc, types);
		entry.setId("createOnExit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.OnExit_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitialState6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ScxmlElementTypes.InitialState_3040);
		types.add(ScxmlElementTypes.InitialState_2003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialState6CreationTool_title,
				Messages.InitialState6CreationTool_desc, types);
		entry.setId("createInitialState6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.InitialState_3040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalState7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ScxmlElementTypes.FinalState_3002);
		types.add(ScxmlElementTypes.FinalState_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FinalState7CreationTool_title,
				Messages.FinalState7CreationTool_desc, types);
		entry.setId("createFinalState7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.FinalState_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParallel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.Parallel_3037);
		types.add(ScxmlElementTypes.Parallel_3038);
		types.add(ScxmlElementTypes.Parallel_2004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parallel8CreationTool_title,
				Messages.Parallel8CreationTool_desc, types);
		entry.setId("createParallel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Parallel_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHistoryState9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ScxmlElementTypes.HistoryState_3043);
		types.add(ScxmlElementTypes.HistoryState_3057);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HistoryState9CreationTool_title,
				Messages.HistoryState9CreationTool_desc, types);
		entry.setId("createHistoryState9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.HistoryState_3043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRaise10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Raise_3015);
		types.add(ScxmlElementTypes.Raise_3020);
		types.add(ScxmlElementTypes.Raise_3030);
		types.add(ScxmlElementTypes.Raise_3053);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Raise10CreationTool_title,
				Messages.Raise10CreationTool_desc, types);
		entry.setId("createRaise10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Raise_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIf11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.If_3007);
		types.add(ScxmlElementTypes.If_3012);
		types.add(ScxmlElementTypes.If_3027);
		types.add(ScxmlElementTypes.If_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.If11CreationTool_title,
				Messages.If11CreationTool_desc, types);
		entry.setId("createIf11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.If_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createElseIf12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ElseIf12CreationTool_title,
				Messages.ElseIf12CreationTool_desc, Collections.singletonList(ScxmlElementTypes.ElseIf_3008));
		entry.setId("createElseIf12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.ElseIf_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createElse13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Else13CreationTool_title,
				Messages.Else13CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Else_3009));
		entry.setId("createElse13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Else_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLog14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Log_3013);
		types.add(ScxmlElementTypes.Log_3018);
		types.add(ScxmlElementTypes.Log_3028);
		types.add(ScxmlElementTypes.Log_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Log14CreationTool_title,
				Messages.Log14CreationTool_desc, types);
		entry.setId("createLog14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Log_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataModel15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataModel15CreationTool_title,
				Messages.DataModel15CreationTool_desc, Collections.singletonList(ScxmlElementTypes.DataModel_2005));
		entry.setId("createDataModel15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.DataModel_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createData16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Data16CreationTool_title,
				Messages.Data16CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Data_3061));
		entry.setId("createData16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Data_3061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValidate17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Validate_3017);
		types.add(ScxmlElementTypes.Validate_3022);
		types.add(ScxmlElementTypes.Validate_3032);
		types.add(ScxmlElementTypes.Validate_3055);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Validate17CreationTool_title,
				Messages.Validate17CreationTool_desc, types);
		entry.setId("createValidate17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Validate_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParam18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ScxmlElementTypes.Param_3014);
		types.add(ScxmlElementTypes.Param_3019);
		types.add(ScxmlElementTypes.Param_3029);
		types.add(ScxmlElementTypes.Param_3036);
		types.add(ScxmlElementTypes.Param_3046);
		types.add(ScxmlElementTypes.Param_3052);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Param18CreationTool_title,
				Messages.Param18CreationTool_desc, types);
		entry.setId("createParam18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Param_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScript19CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.Script_3004);
		types.add(ScxmlElementTypes.Script_3024);
		types.add(ScxmlElementTypes.Script_2006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Script19CreationTool_title,
				Messages.Script19CreationTool_desc, types);
		entry.setId("createScript19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Script_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnchor20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ScxmlElementTypes.Anchor_3044);
		types.add(ScxmlElementTypes.Anchor_3058);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Anchor20CreationTool_title,
				Messages.Anchor20CreationTool_desc, types);
		entry.setId("createAnchor20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Anchor_3044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSend21CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Send_3016);
		types.add(ScxmlElementTypes.Send_3021);
		types.add(ScxmlElementTypes.Send_3031);
		types.add(ScxmlElementTypes.Send_3054);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Send21CreationTool_title,
				Messages.Send21CreationTool_desc, types);
		entry.setId("createSend21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Send_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCancel22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ScxmlElementTypes.Cancel_3006);
		types.add(ScxmlElementTypes.Cancel_3011);
		types.add(ScxmlElementTypes.Cancel_3026);
		types.add(ScxmlElementTypes.Cancel_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cancel22CreationTool_title,
				Messages.Cancel22CreationTool_desc, types);
		entry.setId("createCancel22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Cancel_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScxmlElementTypes.Content_3034);
		types.add(ScxmlElementTypes.Content_3035);
		types.add(ScxmlElementTypes.Content_3056);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content23CreationTool_title,
				Messages.Content23CreationTool_desc, types);
		entry.setId("createContent23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Content_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDonedata24CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Donedata24CreationTool_title,
				Messages.Donedata24CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Donedata_3033));
		entry.setId("createDonedata24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Donedata_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInvoke25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Invoke25CreationTool_title,
				Messages.Invoke25CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Invoke_3045));
		entry.setId("createInvoke25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Invoke_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalize26CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Finalize26CreationTool_title,
				Messages.Finalize26CreationTool_desc, Collections.singletonList(ScxmlElementTypes.Finalize_3047));
		entry.setId("createFinalize26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ScxmlElementTypes.getImageDescriptor(ScxmlElementTypes.Finalize_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
