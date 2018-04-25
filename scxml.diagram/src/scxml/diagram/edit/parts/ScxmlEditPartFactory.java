package scxml.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import scxml.diagram.part.ScxmlVisualIDRegistry;

/**
 * @generated
 */
public class ScxmlEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ScxmlVisualIDRegistry.getVisualID(view)) {

			case ServiceTemplateEditPart.VISUAL_ID:
				return new ServiceTemplateEditPart(view);

			case StateEditPart.VISUAL_ID:
				return new StateEditPart(view);

			case StateIdEditPart.VISUAL_ID:
				return new StateIdEditPart(view);

			case FinalStateEditPart.VISUAL_ID:
				return new FinalStateEditPart(view);

			case FinalStateIdEditPart.VISUAL_ID:
				return new FinalStateIdEditPart(view);

			case InitialStateEditPart.VISUAL_ID:
				return new InitialStateEditPart(view);

			case ParallelEditPart.VISUAL_ID:
				return new ParallelEditPart(view);

			case ParallelIdEditPart.VISUAL_ID:
				return new ParallelIdEditPart(view);

			case DataModelEditPart.VISUAL_ID:
				return new DataModelEditPart(view);

			case DataModelSchemaEditPart.VISUAL_ID:
				return new DataModelSchemaEditPart(view);

			case ScriptEditPart.VISUAL_ID:
				return new ScriptEditPart(view);

			case State2EditPart.VISUAL_ID:
				return new State2EditPart(view);

			case StateId2EditPart.VISUAL_ID:
				return new StateId2EditPart(view);

			case FinalState2EditPart.VISUAL_ID:
				return new FinalState2EditPart(view);

			case FinalStateId2EditPart.VISUAL_ID:
				return new FinalStateId2EditPart(view);

			case OnEntryEditPart.VISUAL_ID:
				return new OnEntryEditPart(view);

			case Script2EditPart.VISUAL_ID:
				return new Script2EditPart(view);

			case AssignEditPart.VISUAL_ID:
				return new AssignEditPart(view);

			case AssignDataidEditPart.VISUAL_ID:
				return new AssignDataidEditPart(view);

			case AssignExprEditPart.VISUAL_ID:
				return new AssignExprEditPart(view);

			case AssignLocationEditPart.VISUAL_ID:
				return new AssignLocationEditPart(view);

			case CancelEditPart.VISUAL_ID:
				return new CancelEditPart(view);

			case CancelSendidEditPart.VISUAL_ID:
				return new CancelSendidEditPart(view);

			case CancelSendidexprEditPart.VISUAL_ID:
				return new CancelSendidexprEditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfCondEditPart.VISUAL_ID:
				return new IfCondEditPart(view);

			case ElseIfEditPart.VISUAL_ID:
				return new ElseIfEditPart(view);

			case ElseIfCondEditPart.VISUAL_ID:
				return new ElseIfCondEditPart(view);

			case ElseEditPart.VISUAL_ID:
				return new ElseEditPart(view);

			case Assign2EditPart.VISUAL_ID:
				return new Assign2EditPart(view);

			case AssignDataid2EditPart.VISUAL_ID:
				return new AssignDataid2EditPart(view);

			case AssignExpr2EditPart.VISUAL_ID:
				return new AssignExpr2EditPart(view);

			case AssignLocation2EditPart.VISUAL_ID:
				return new AssignLocation2EditPart(view);

			case Cancel2EditPart.VISUAL_ID:
				return new Cancel2EditPart(view);

			case CancelSendid2EditPart.VISUAL_ID:
				return new CancelSendid2EditPart(view);

			case CancelSendidexpr2EditPart.VISUAL_ID:
				return new CancelSendidexpr2EditPart(view);

			case If2EditPart.VISUAL_ID:
				return new If2EditPart(view);

			case IfCond2EditPart.VISUAL_ID:
				return new IfCond2EditPart(view);

			case LogEditPart.VISUAL_ID:
				return new LogEditPart(view);

			case LogLabelEditPart.VISUAL_ID:
				return new LogLabelEditPart(view);

			case ParamEditPart.VISUAL_ID:
				return new ParamEditPart(view);

			case ParamNameEditPart.VISUAL_ID:
				return new ParamNameEditPart(view);

			case ParamExprEditPart.VISUAL_ID:
				return new ParamExprEditPart(view);

			case RaiseEditPart.VISUAL_ID:
				return new RaiseEditPart(view);

			case RaiseEventEditPart.VISUAL_ID:
				return new RaiseEventEditPart(view);

			case SendEditPart.VISUAL_ID:
				return new SendEditPart(view);

			case SendIdEditPart.VISUAL_ID:
				return new SendIdEditPart(view);

			case SendEventEditPart.VISUAL_ID:
				return new SendEventEditPart(view);

			case ValidateEditPart.VISUAL_ID:
				return new ValidateEditPart(view);

			case ValidateLocationEditPart.VISUAL_ID:
				return new ValidateLocationEditPart(view);

			case ValidateSchemaEditPart.VISUAL_ID:
				return new ValidateSchemaEditPart(view);

			case Log2EditPart.VISUAL_ID:
				return new Log2EditPart(view);

			case LogLabel2EditPart.VISUAL_ID:
				return new LogLabel2EditPart(view);

			case Param2EditPart.VISUAL_ID:
				return new Param2EditPart(view);

			case ParamName2EditPart.VISUAL_ID:
				return new ParamName2EditPart(view);

			case ParamExpr2EditPart.VISUAL_ID:
				return new ParamExpr2EditPart(view);

			case Raise2EditPart.VISUAL_ID:
				return new Raise2EditPart(view);

			case RaiseEvent2EditPart.VISUAL_ID:
				return new RaiseEvent2EditPart(view);

			case Send2EditPart.VISUAL_ID:
				return new Send2EditPart(view);

			case SendId2EditPart.VISUAL_ID:
				return new SendId2EditPart(view);

			case SendEvent2EditPart.VISUAL_ID:
				return new SendEvent2EditPart(view);

			case Validate2EditPart.VISUAL_ID:
				return new Validate2EditPart(view);

			case ValidateLocation2EditPart.VISUAL_ID:
				return new ValidateLocation2EditPart(view);

			case ValidateSchema2EditPart.VISUAL_ID:
				return new ValidateSchema2EditPart(view);

			case OnExitEditPart.VISUAL_ID:
				return new OnExitEditPart(view);

			case Script3EditPart.VISUAL_ID:
				return new Script3EditPart(view);

			case Assign3EditPart.VISUAL_ID:
				return new Assign3EditPart(view);

			case AssignDataid3EditPart.VISUAL_ID:
				return new AssignDataid3EditPart(view);

			case AssignExpr3EditPart.VISUAL_ID:
				return new AssignExpr3EditPart(view);

			case AssignLocation3EditPart.VISUAL_ID:
				return new AssignLocation3EditPart(view);

			case Cancel3EditPart.VISUAL_ID:
				return new Cancel3EditPart(view);

			case CancelSendid3EditPart.VISUAL_ID:
				return new CancelSendid3EditPart(view);

			case CancelSendidexpr3EditPart.VISUAL_ID:
				return new CancelSendidexpr3EditPart(view);

			case If3EditPart.VISUAL_ID:
				return new If3EditPart(view);

			case IfCond3EditPart.VISUAL_ID:
				return new IfCond3EditPart(view);

			case Log3EditPart.VISUAL_ID:
				return new Log3EditPart(view);

			case LogLabel3EditPart.VISUAL_ID:
				return new LogLabel3EditPart(view);

			case Param3EditPart.VISUAL_ID:
				return new Param3EditPart(view);

			case ParamName3EditPart.VISUAL_ID:
				return new ParamName3EditPart(view);

			case ParamExpr3EditPart.VISUAL_ID:
				return new ParamExpr3EditPart(view);

			case Raise3EditPart.VISUAL_ID:
				return new Raise3EditPart(view);

			case RaiseEvent3EditPart.VISUAL_ID:
				return new RaiseEvent3EditPart(view);

			case Send3EditPart.VISUAL_ID:
				return new Send3EditPart(view);

			case SendId3EditPart.VISUAL_ID:
				return new SendId3EditPart(view);

			case SendEvent3EditPart.VISUAL_ID:
				return new SendEvent3EditPart(view);

			case Validate3EditPart.VISUAL_ID:
				return new Validate3EditPart(view);

			case ValidateLocation3EditPart.VISUAL_ID:
				return new ValidateLocation3EditPart(view);

			case ValidateSchema3EditPart.VISUAL_ID:
				return new ValidateSchema3EditPart(view);

			case DonedataEditPart.VISUAL_ID:
				return new DonedataEditPart(view);

			case ContentEditPart.VISUAL_ID:
				return new ContentEditPart(view);

			case Content2EditPart.VISUAL_ID:
				return new Content2EditPart(view);

			case Param4EditPart.VISUAL_ID:
				return new Param4EditPart(view);

			case ParamName4EditPart.VISUAL_ID:
				return new ParamName4EditPart(view);

			case ParamExpr4EditPart.VISUAL_ID:
				return new ParamExpr4EditPart(view);

			case Parallel2EditPart.VISUAL_ID:
				return new Parallel2EditPart(view);

			case ParallelId2EditPart.VISUAL_ID:
				return new ParallelId2EditPart(view);

			case Parallel3EditPart.VISUAL_ID:
				return new Parallel3EditPart(view);

			case ParallelId3EditPart.VISUAL_ID:
				return new ParallelId3EditPart(view);

			case State3EditPart.VISUAL_ID:
				return new State3EditPart(view);

			case StateId3EditPart.VISUAL_ID:
				return new StateId3EditPart(view);

			case InitialState2EditPart.VISUAL_ID:
				return new InitialState2EditPart(view);

			case OnEntry2EditPart.VISUAL_ID:
				return new OnEntry2EditPart(view);

			case OnExit2EditPart.VISUAL_ID:
				return new OnExit2EditPart(view);

			case HistoryStateEditPart.VISUAL_ID:
				return new HistoryStateEditPart(view);

			case HistoryStateIdEditPart.VISUAL_ID:
				return new HistoryStateIdEditPart(view);

			case AnchorEditPart.VISUAL_ID:
				return new AnchorEditPart(view);

			case InvokeEditPart.VISUAL_ID:
				return new InvokeEditPart(view);

			case InvokeIdEditPart.VISUAL_ID:
				return new InvokeIdEditPart(view);

			case Param5EditPart.VISUAL_ID:
				return new Param5EditPart(view);

			case ParamName5EditPart.VISUAL_ID:
				return new ParamName5EditPart(view);

			case ParamExpr5EditPart.VISUAL_ID:
				return new ParamExpr5EditPart(view);

			case FinalizeEditPart.VISUAL_ID:
				return new FinalizeEditPart(view);

			case Assign4EditPart.VISUAL_ID:
				return new Assign4EditPart(view);

			case AssignDataid4EditPart.VISUAL_ID:
				return new AssignDataid4EditPart(view);

			case AssignExpr4EditPart.VISUAL_ID:
				return new AssignExpr4EditPart(view);

			case AssignLocation4EditPart.VISUAL_ID:
				return new AssignLocation4EditPart(view);

			case Cancel4EditPart.VISUAL_ID:
				return new Cancel4EditPart(view);

			case CancelSendid4EditPart.VISUAL_ID:
				return new CancelSendid4EditPart(view);

			case CancelSendidexpr4EditPart.VISUAL_ID:
				return new CancelSendidexpr4EditPart(view);

			case If4EditPart.VISUAL_ID:
				return new If4EditPart(view);

			case IfCond4EditPart.VISUAL_ID:
				return new IfCond4EditPart(view);

			case Log4EditPart.VISUAL_ID:
				return new Log4EditPart(view);

			case LogLabel4EditPart.VISUAL_ID:
				return new LogLabel4EditPart(view);

			case Param6EditPart.VISUAL_ID:
				return new Param6EditPart(view);

			case ParamName6EditPart.VISUAL_ID:
				return new ParamName6EditPart(view);

			case ParamExpr6EditPart.VISUAL_ID:
				return new ParamExpr6EditPart(view);

			case Raise4EditPart.VISUAL_ID:
				return new Raise4EditPart(view);

			case RaiseEvent4EditPart.VISUAL_ID:
				return new RaiseEvent4EditPart(view);

			case Send4EditPart.VISUAL_ID:
				return new Send4EditPart(view);

			case SendId4EditPart.VISUAL_ID:
				return new SendId4EditPart(view);

			case SendEvent4EditPart.VISUAL_ID:
				return new SendEvent4EditPart(view);

			case Validate4EditPart.VISUAL_ID:
				return new Validate4EditPart(view);

			case ValidateLocation4EditPart.VISUAL_ID:
				return new ValidateLocation4EditPart(view);

			case ValidateSchema4EditPart.VISUAL_ID:
				return new ValidateSchema4EditPart(view);

			case Content3EditPart.VISUAL_ID:
				return new Content3EditPart(view);

			case HistoryState2EditPart.VISUAL_ID:
				return new HistoryState2EditPart(view);

			case HistoryStateId2EditPart.VISUAL_ID:
				return new HistoryStateId2EditPart(view);

			case Anchor2EditPart.VISUAL_ID:
				return new Anchor2EditPart(view);

			case OnEntry3EditPart.VISUAL_ID:
				return new OnEntry3EditPart(view);

			case OnExit3EditPart.VISUAL_ID:
				return new OnExit3EditPart(view);

			case DataEditPart.VISUAL_ID:
				return new DataEditPart(view);

			case DataExprEditPart.VISUAL_ID:
				return new DataExprEditPart(view);

			case DataIdEditPart.VISUAL_ID:
				return new DataIdEditPart(view);

			case DataSrcEditPart.VISUAL_ID:
				return new DataSrcEditPart(view);

			case StateStateCompartmentEditPart.VISUAL_ID:
				return new StateStateCompartmentEditPart(view);

			case StateStateAttrCompartmentEditPart.VISUAL_ID:
				return new StateStateAttrCompartmentEditPart(view);

			case StateStateCompartment2EditPart.VISUAL_ID:
				return new StateStateCompartment2EditPart(view);

			case StateStateAttrCompartment2EditPart.VISUAL_ID:
				return new StateStateAttrCompartment2EditPart(view);

			case FinalStateFinalCompartmentEditPart.VISUAL_ID:
				return new FinalStateFinalCompartmentEditPart(view);

			case OnEntryOnEntryCompartmentEditPart.VISUAL_ID:
				return new OnEntryOnEntryCompartmentEditPart(view);

			case IfIfCompartmentEditPart.VISUAL_ID:
				return new IfIfCompartmentEditPart(view);

			case IfIfCompartment2EditPart.VISUAL_ID:
				return new IfIfCompartment2EditPart(view);

			case OnExitOnExitCompartmentEditPart.VISUAL_ID:
				return new OnExitOnExitCompartmentEditPart(view);

			case IfIfCompartment3EditPart.VISUAL_ID:
				return new IfIfCompartment3EditPart(view);

			case DonedataDonedataCompartmentEditPart.VISUAL_ID:
				return new DonedataDonedataCompartmentEditPart(view);

			case ContentContentCompartmentEditPart.VISUAL_ID:
				return new ContentContentCompartmentEditPart(view);

			case ContentContentCompartment2EditPart.VISUAL_ID:
				return new ContentContentCompartment2EditPart(view);

			case ParallelParallelCompartmentEditPart.VISUAL_ID:
				return new ParallelParallelCompartmentEditPart(view);

			case ParallelParallelAttrCompartmentEditPart.VISUAL_ID:
				return new ParallelParallelAttrCompartmentEditPart(view);

			case ParallelParallelCompartment2EditPart.VISUAL_ID:
				return new ParallelParallelCompartment2EditPart(view);

			case ParallelParallelAttrCompartment2EditPart.VISUAL_ID:
				return new ParallelParallelAttrCompartment2EditPart(view);

			case StateStateCompartment3EditPart.VISUAL_ID:
				return new StateStateCompartment3EditPart(view);

			case StateStateAttrCompartment3EditPart.VISUAL_ID:
				return new StateStateAttrCompartment3EditPart(view);

			case OnEntryOnEntryCompartment2EditPart.VISUAL_ID:
				return new OnEntryOnEntryCompartment2EditPart(view);

			case OnExitOnExitCompartment2EditPart.VISUAL_ID:
				return new OnExitOnExitCompartment2EditPart(view);

			case InvokeInvokeCompartmentEditPart.VISUAL_ID:
				return new InvokeInvokeCompartmentEditPart(view);

			case FinalizeFinalizeCompartmentEditPart.VISUAL_ID:
				return new FinalizeFinalizeCompartmentEditPart(view);

			case IfIfCompartment4EditPart.VISUAL_ID:
				return new IfIfCompartment4EditPart(view);

			case ContentContentCompartment3EditPart.VISUAL_ID:
				return new ContentContentCompartment3EditPart(view);

			case OnEntryOnEntryCompartment3EditPart.VISUAL_ID:
				return new OnEntryOnEntryCompartment3EditPart(view);

			case OnExitOnExitCompartment3EditPart.VISUAL_ID:
				return new OnExitOnExitCompartment3EditPart(view);

			case FinalStateFinalCompartment2EditPart.VISUAL_ID:
				return new FinalStateFinalCompartment2EditPart(view);

			case ParallelParallelCompartment3EditPart.VISUAL_ID:
				return new ParallelParallelCompartment3EditPart(view);

			case ParallelParallelAttrCompartment3EditPart.VISUAL_ID:
				return new ParallelParallelAttrCompartment3EditPart(view);

			case DataModelDataModelCompartmentEditPart.VISUAL_ID:
				return new DataModelDataModelCompartmentEditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionEventEditPart.VISUAL_ID:
				return new TransitionEventEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
