package scxml.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import scxml.ScxmlPackage;
import scxml.diagram.edit.parts.AssignDataid2EditPart;
import scxml.diagram.edit.parts.AssignDataid3EditPart;
import scxml.diagram.edit.parts.AssignDataid4EditPart;
import scxml.diagram.edit.parts.AssignDataidEditPart;
import scxml.diagram.edit.parts.AssignExpr2EditPart;
import scxml.diagram.edit.parts.AssignExpr3EditPart;
import scxml.diagram.edit.parts.AssignExpr4EditPart;
import scxml.diagram.edit.parts.AssignExprEditPart;
import scxml.diagram.edit.parts.AssignLocation2EditPart;
import scxml.diagram.edit.parts.AssignLocation3EditPart;
import scxml.diagram.edit.parts.AssignLocation4EditPart;
import scxml.diagram.edit.parts.AssignLocationEditPart;
import scxml.diagram.edit.parts.CancelSendid2EditPart;
import scxml.diagram.edit.parts.CancelSendid3EditPart;
import scxml.diagram.edit.parts.CancelSendid4EditPart;
import scxml.diagram.edit.parts.CancelSendidEditPart;
import scxml.diagram.edit.parts.CancelSendidexpr2EditPart;
import scxml.diagram.edit.parts.CancelSendidexpr3EditPart;
import scxml.diagram.edit.parts.CancelSendidexpr4EditPart;
import scxml.diagram.edit.parts.CancelSendidexprEditPart;
import scxml.diagram.edit.parts.DataExprEditPart;
import scxml.diagram.edit.parts.DataIdEditPart;
import scxml.diagram.edit.parts.DataModelSchemaEditPart;
import scxml.diagram.edit.parts.DataSrcEditPart;
import scxml.diagram.edit.parts.ElseIfCondEditPart;
import scxml.diagram.edit.parts.FinalStateId2EditPart;
import scxml.diagram.edit.parts.FinalStateIdEditPart;
import scxml.diagram.edit.parts.HistoryStateId2EditPart;
import scxml.diagram.edit.parts.HistoryStateIdEditPart;
import scxml.diagram.edit.parts.IfCond2EditPart;
import scxml.diagram.edit.parts.IfCond3EditPart;
import scxml.diagram.edit.parts.IfCond4EditPart;
import scxml.diagram.edit.parts.IfCondEditPart;
import scxml.diagram.edit.parts.InvokeIdEditPart;
import scxml.diagram.edit.parts.LogLabel2EditPart;
import scxml.diagram.edit.parts.LogLabel3EditPart;
import scxml.diagram.edit.parts.LogLabel4EditPart;
import scxml.diagram.edit.parts.LogLabelEditPart;
import scxml.diagram.edit.parts.ParallelId2EditPart;
import scxml.diagram.edit.parts.ParallelId3EditPart;
import scxml.diagram.edit.parts.ParallelIdEditPart;
import scxml.diagram.edit.parts.ParamExpr2EditPart;
import scxml.diagram.edit.parts.ParamExpr3EditPart;
import scxml.diagram.edit.parts.ParamExpr4EditPart;
import scxml.diagram.edit.parts.ParamExpr5EditPart;
import scxml.diagram.edit.parts.ParamExpr6EditPart;
import scxml.diagram.edit.parts.ParamExprEditPart;
import scxml.diagram.edit.parts.ParamName2EditPart;
import scxml.diagram.edit.parts.ParamName3EditPart;
import scxml.diagram.edit.parts.ParamName4EditPart;
import scxml.diagram.edit.parts.ParamName5EditPart;
import scxml.diagram.edit.parts.ParamName6EditPart;
import scxml.diagram.edit.parts.ParamNameEditPart;
import scxml.diagram.edit.parts.RaiseEvent2EditPart;
import scxml.diagram.edit.parts.RaiseEvent3EditPart;
import scxml.diagram.edit.parts.RaiseEvent4EditPart;
import scxml.diagram.edit.parts.RaiseEventEditPart;
import scxml.diagram.edit.parts.SendEvent2EditPart;
import scxml.diagram.edit.parts.SendEvent3EditPart;
import scxml.diagram.edit.parts.SendEvent4EditPart;
import scxml.diagram.edit.parts.SendEventEditPart;
import scxml.diagram.edit.parts.SendId2EditPart;
import scxml.diagram.edit.parts.SendId3EditPart;
import scxml.diagram.edit.parts.SendId4EditPart;
import scxml.diagram.edit.parts.SendIdEditPart;
import scxml.diagram.edit.parts.StateId2EditPart;
import scxml.diagram.edit.parts.StateId3EditPart;
import scxml.diagram.edit.parts.StateIdEditPart;
import scxml.diagram.edit.parts.TransitionEventEditPart;
import scxml.diagram.edit.parts.ValidateLocation2EditPart;
import scxml.diagram.edit.parts.ValidateLocation3EditPart;
import scxml.diagram.edit.parts.ValidateLocation4EditPart;
import scxml.diagram.edit.parts.ValidateLocationEditPart;
import scxml.diagram.edit.parts.ValidateSchema2EditPart;
import scxml.diagram.edit.parts.ValidateSchema3EditPart;
import scxml.diagram.edit.parts.ValidateSchema4EditPart;
import scxml.diagram.edit.parts.ValidateSchemaEditPart;
import scxml.diagram.parsers.MessageFormatParser;
import scxml.diagram.part.ScxmlVisualIDRegistry;

/**
 * @generated
 */
public class ScxmlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser stateId_5070Parser;

	/**
	* @generated
	*/
	private IParser getStateId_5070Parser() {
		if (stateId_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateId_5070Parser = parser;
		}
		return stateId_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser finalStateId_5071Parser;

	/**
	* @generated
	*/
	private IParser getFinalStateId_5071Parser() {
		if (finalStateId_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getFinalState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finalStateId_5071Parser = parser;
		}
		return finalStateId_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser parallelId_5072Parser;

	/**
	* @generated
	*/
	private IParser getParallelId_5072Parser() {
		if (parallelId_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParallel_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parallelId_5072Parser = parser;
		}
		return parallelId_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser dataModelSchema_5076Parser;

	/**
	* @generated
	*/
	private IParser getDataModelSchema_5076Parser() {
		if (dataModelSchema_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getDataModel_Schema() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataModelSchema_5076Parser = parser;
		}
		return dataModelSchema_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser stateId_5069Parser;

	/**
	* @generated
	*/
	private IParser getStateId_5069Parser() {
		if (stateId_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateId_5069Parser = parser;
		}
		return stateId_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser finalStateId_5046Parser;

	/**
	* @generated
	*/
	private IParser getFinalStateId_5046Parser() {
		if (finalStateId_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getFinalState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finalStateId_5046Parser = parser;
		}
		return finalStateId_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser assignDataid_5001Parser;

	/**
	* @generated
	*/
	private IParser getAssignDataid_5001Parser() {
		if (assignDataid_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Dataid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignDataid_5001Parser = parser;
		}
		return assignDataid_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser assignExpr_5002Parser;

	/**
	* @generated
	*/
	private IParser getAssignExpr_5002Parser() {
		if (assignExpr_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignExpr_5002Parser = parser;
		}
		return assignExpr_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser assignLocation_5003Parser;

	/**
	* @generated
	*/
	private IParser getAssignLocation_5003Parser() {
		if (assignLocation_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignLocation_5003Parser = parser;
		}
		return assignLocation_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendid_5004Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendid_5004Parser() {
		if (cancelSendid_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendid_5004Parser = parser;
		}
		return cancelSendid_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendidexpr_5005Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendidexpr_5005Parser() {
		if (cancelSendidexpr_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendidexpr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendidexpr_5005Parser = parser;
		}
		return cancelSendidexpr_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser ifCond_5021Parser;

	/**
	* @generated
	*/
	private IParser getIfCond_5021Parser() {
		if (ifCond_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getIf_Cond() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifCond_5021Parser = parser;
		}
		return ifCond_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser elseIfCond_5006Parser;

	/**
	* @generated
	*/
	private IParser getElseIfCond_5006Parser() {
		if (elseIfCond_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getElseIf_Cond() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elseIfCond_5006Parser = parser;
		}
		return elseIfCond_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser assignDataid_5007Parser;

	/**
	* @generated
	*/
	private IParser getAssignDataid_5007Parser() {
		if (assignDataid_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Dataid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignDataid_5007Parser = parser;
		}
		return assignDataid_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser assignExpr_5008Parser;

	/**
	* @generated
	*/
	private IParser getAssignExpr_5008Parser() {
		if (assignExpr_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignExpr_5008Parser = parser;
		}
		return assignExpr_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser assignLocation_5009Parser;

	/**
	* @generated
	*/
	private IParser getAssignLocation_5009Parser() {
		if (assignLocation_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignLocation_5009Parser = parser;
		}
		return assignLocation_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendid_5010Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendid_5010Parser() {
		if (cancelSendid_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendid_5010Parser = parser;
		}
		return cancelSendid_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendidexpr_5011Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendidexpr_5011Parser() {
		if (cancelSendidexpr_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendidexpr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendidexpr_5011Parser = parser;
		}
		return cancelSendidexpr_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser ifCond_5020Parser;

	/**
	* @generated
	*/
	private IParser getIfCond_5020Parser() {
		if (ifCond_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getIf_Cond() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifCond_5020Parser = parser;
		}
		return ifCond_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser logLabel_5012Parser;

	/**
	* @generated
	*/
	private IParser getLogLabel_5012Parser() {
		if (logLabel_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getLog_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logLabel_5012Parser = parser;
		}
		return logLabel_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5013Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5013Parser() {
		if (paramName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5013Parser = parser;
		}
		return paramName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5014Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5014Parser() {
		if (paramExpr_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5014Parser = parser;
		}
		return paramExpr_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser raiseEvent_5015Parser;

	/**
	* @generated
	*/
	private IParser getRaiseEvent_5015Parser() {
		if (raiseEvent_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getRaise_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raiseEvent_5015Parser = parser;
		}
		return raiseEvent_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser sendId_5016Parser;

	/**
	* @generated
	*/
	private IParser getSendId_5016Parser() {
		if (sendId_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendId_5016Parser = parser;
		}
		return sendId_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser sendEvent_5017Parser;

	/**
	* @generated
	*/
	private IParser getSendEvent_5017Parser() {
		if (sendEvent_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendEvent_5017Parser = parser;
		}
		return sendEvent_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser validateLocation_5018Parser;

	/**
	* @generated
	*/
	private IParser getValidateLocation_5018Parser() {
		if (validateLocation_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateLocation_5018Parser = parser;
		}
		return validateLocation_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser validateSchema_5019Parser;

	/**
	* @generated
	*/
	private IParser getValidateSchema_5019Parser() {
		if (validateSchema_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Schema() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateSchema_5019Parser = parser;
		}
		return validateSchema_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser logLabel_5022Parser;

	/**
	* @generated
	*/
	private IParser getLogLabel_5022Parser() {
		if (logLabel_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getLog_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logLabel_5022Parser = parser;
		}
		return logLabel_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5023Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5023Parser() {
		if (paramName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5023Parser = parser;
		}
		return paramName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5024Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5024Parser() {
		if (paramExpr_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5024Parser = parser;
		}
		return paramExpr_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser raiseEvent_5025Parser;

	/**
	* @generated
	*/
	private IParser getRaiseEvent_5025Parser() {
		if (raiseEvent_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getRaise_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raiseEvent_5025Parser = parser;
		}
		return raiseEvent_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser sendId_5026Parser;

	/**
	* @generated
	*/
	private IParser getSendId_5026Parser() {
		if (sendId_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendId_5026Parser = parser;
		}
		return sendId_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser sendEvent_5027Parser;

	/**
	* @generated
	*/
	private IParser getSendEvent_5027Parser() {
		if (sendEvent_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendEvent_5027Parser = parser;
		}
		return sendEvent_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser validateLocation_5028Parser;

	/**
	* @generated
	*/
	private IParser getValidateLocation_5028Parser() {
		if (validateLocation_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateLocation_5028Parser = parser;
		}
		return validateLocation_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser validateSchema_5029Parser;

	/**
	* @generated
	*/
	private IParser getValidateSchema_5029Parser() {
		if (validateSchema_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Schema() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateSchema_5029Parser = parser;
		}
		return validateSchema_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser assignDataid_5030Parser;

	/**
	* @generated
	*/
	private IParser getAssignDataid_5030Parser() {
		if (assignDataid_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Dataid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignDataid_5030Parser = parser;
		}
		return assignDataid_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser assignExpr_5031Parser;

	/**
	* @generated
	*/
	private IParser getAssignExpr_5031Parser() {
		if (assignExpr_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignExpr_5031Parser = parser;
		}
		return assignExpr_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser assignLocation_5032Parser;

	/**
	* @generated
	*/
	private IParser getAssignLocation_5032Parser() {
		if (assignLocation_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignLocation_5032Parser = parser;
		}
		return assignLocation_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendid_5033Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendid_5033Parser() {
		if (cancelSendid_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendid_5033Parser = parser;
		}
		return cancelSendid_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendidexpr_5034Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendidexpr_5034Parser() {
		if (cancelSendidexpr_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendidexpr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendidexpr_5034Parser = parser;
		}
		return cancelSendidexpr_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser ifCond_5035Parser;

	/**
	* @generated
	*/
	private IParser getIfCond_5035Parser() {
		if (ifCond_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getIf_Cond() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifCond_5035Parser = parser;
		}
		return ifCond_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser logLabel_5036Parser;

	/**
	* @generated
	*/
	private IParser getLogLabel_5036Parser() {
		if (logLabel_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getLog_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logLabel_5036Parser = parser;
		}
		return logLabel_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5037Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5037Parser() {
		if (paramName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5037Parser = parser;
		}
		return paramName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5038Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5038Parser() {
		if (paramExpr_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5038Parser = parser;
		}
		return paramExpr_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser raiseEvent_5039Parser;

	/**
	* @generated
	*/
	private IParser getRaiseEvent_5039Parser() {
		if (raiseEvent_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getRaise_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raiseEvent_5039Parser = parser;
		}
		return raiseEvent_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser sendId_5040Parser;

	/**
	* @generated
	*/
	private IParser getSendId_5040Parser() {
		if (sendId_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendId_5040Parser = parser;
		}
		return sendId_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser sendEvent_5041Parser;

	/**
	* @generated
	*/
	private IParser getSendEvent_5041Parser() {
		if (sendEvent_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendEvent_5041Parser = parser;
		}
		return sendEvent_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser validateLocation_5042Parser;

	/**
	* @generated
	*/
	private IParser getValidateLocation_5042Parser() {
		if (validateLocation_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateLocation_5042Parser = parser;
		}
		return validateLocation_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser validateSchema_5043Parser;

	/**
	* @generated
	*/
	private IParser getValidateSchema_5043Parser() {
		if (validateSchema_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Schema() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateSchema_5043Parser = parser;
		}
		return validateSchema_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5044Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5044Parser() {
		if (paramName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5044Parser = parser;
		}
		return paramName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5045Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5045Parser() {
		if (paramExpr_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5045Parser = parser;
		}
		return paramExpr_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser parallelId_5068Parser;

	/**
	* @generated
	*/
	private IParser getParallelId_5068Parser() {
		if (parallelId_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParallel_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parallelId_5068Parser = parser;
		}
		return parallelId_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser parallelId_5067Parser;

	/**
	* @generated
	*/
	private IParser getParallelId_5067Parser() {
		if (parallelId_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParallel_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parallelId_5067Parser = parser;
		}
		return parallelId_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser stateId_5065Parser;

	/**
	* @generated
	*/
	private IParser getStateId_5065Parser() {
		if (stateId_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateId_5065Parser = parser;
		}
		return stateId_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser historyStateId_5047Parser;

	/**
	* @generated
	*/
	private IParser getHistoryStateId_5047Parser() {
		if (historyStateId_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getHistoryState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			historyStateId_5047Parser = parser;
		}
		return historyStateId_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser invokeId_5064Parser;

	/**
	* @generated
	*/
	private IParser getInvokeId_5064Parser() {
		if (invokeId_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getInvoke_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			invokeId_5064Parser = parser;
		}
		return invokeId_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5048Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5048Parser() {
		if (paramName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5048Parser = parser;
		}
		return paramName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5049Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5049Parser() {
		if (paramExpr_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5049Parser = parser;
		}
		return paramExpr_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser assignDataid_5050Parser;

	/**
	* @generated
	*/
	private IParser getAssignDataid_5050Parser() {
		if (assignDataid_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Dataid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignDataid_5050Parser = parser;
		}
		return assignDataid_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser assignExpr_5051Parser;

	/**
	* @generated
	*/
	private IParser getAssignExpr_5051Parser() {
		if (assignExpr_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignExpr_5051Parser = parser;
		}
		return assignExpr_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser assignLocation_5052Parser;

	/**
	* @generated
	*/
	private IParser getAssignLocation_5052Parser() {
		if (assignLocation_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getAssign_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assignLocation_5052Parser = parser;
		}
		return assignLocation_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendid_5053Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendid_5053Parser() {
		if (cancelSendid_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendid() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendid_5053Parser = parser;
		}
		return cancelSendid_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser cancelSendidexpr_5054Parser;

	/**
	* @generated
	*/
	private IParser getCancelSendidexpr_5054Parser() {
		if (cancelSendidexpr_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getCancel_Sendidexpr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cancelSendidexpr_5054Parser = parser;
		}
		return cancelSendidexpr_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser ifCond_5055Parser;

	/**
	* @generated
	*/
	private IParser getIfCond_5055Parser() {
		if (ifCond_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getIf_Cond() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifCond_5055Parser = parser;
		}
		return ifCond_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser logLabel_5056Parser;

	/**
	* @generated
	*/
	private IParser getLogLabel_5056Parser() {
		if (logLabel_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getLog_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logLabel_5056Parser = parser;
		}
		return logLabel_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser paramName_5057Parser;

	/**
	* @generated
	*/
	private IParser getParamName_5057Parser() {
		if (paramName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramName_5057Parser = parser;
		}
		return paramName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser paramExpr_5058Parser;

	/**
	* @generated
	*/
	private IParser getParamExpr_5058Parser() {
		if (paramExpr_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getParam_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			paramExpr_5058Parser = parser;
		}
		return paramExpr_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser raiseEvent_5059Parser;

	/**
	* @generated
	*/
	private IParser getRaiseEvent_5059Parser() {
		if (raiseEvent_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getRaise_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			raiseEvent_5059Parser = parser;
		}
		return raiseEvent_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser sendId_5060Parser;

	/**
	* @generated
	*/
	private IParser getSendId_5060Parser() {
		if (sendId_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendId_5060Parser = parser;
		}
		return sendId_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser sendEvent_5061Parser;

	/**
	* @generated
	*/
	private IParser getSendEvent_5061Parser() {
		if (sendEvent_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getSend_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendEvent_5061Parser = parser;
		}
		return sendEvent_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser validateLocation_5062Parser;

	/**
	* @generated
	*/
	private IParser getValidateLocation_5062Parser() {
		if (validateLocation_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateLocation_5062Parser = parser;
		}
		return validateLocation_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser validateSchema_5063Parser;

	/**
	* @generated
	*/
	private IParser getValidateSchema_5063Parser() {
		if (validateSchema_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getValidate_Schema() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validateSchema_5063Parser = parser;
		}
		return validateSchema_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser historyStateId_5066Parser;

	/**
	* @generated
	*/
	private IParser getHistoryStateId_5066Parser() {
		if (historyStateId_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getHistoryState_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			historyStateId_5066Parser = parser;
		}
		return historyStateId_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser dataExpr_5073Parser;

	/**
	* @generated
	*/
	private IParser getDataExpr_5073Parser() {
		if (dataExpr_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getData_Expr() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataExpr_5073Parser = parser;
		}
		return dataExpr_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser dataId_5074Parser;

	/**
	* @generated
	*/
	private IParser getDataId_5074Parser() {
		if (dataId_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getData_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataId_5074Parser = parser;
		}
		return dataId_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser dataSrc_5075Parser;

	/**
	* @generated
	*/
	private IParser getDataSrc_5075Parser() {
		if (dataSrc_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getData_Src() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataSrc_5075Parser = parser;
		}
		return dataSrc_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionEvent_6001Parser;

	/**
	* @generated
	*/
	private IParser getTransitionEvent_6001Parser() {
		if (transitionEvent_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ScxmlPackage.eINSTANCE.getTransition_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionEvent_6001Parser = parser;
		}
		return transitionEvent_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateIdEditPart.VISUAL_ID:
			return getStateId_5070Parser();
		case FinalStateIdEditPart.VISUAL_ID:
			return getFinalStateId_5071Parser();
		case ParallelIdEditPart.VISUAL_ID:
			return getParallelId_5072Parser();
		case DataModelSchemaEditPart.VISUAL_ID:
			return getDataModelSchema_5076Parser();
		case StateId2EditPart.VISUAL_ID:
			return getStateId_5069Parser();
		case FinalStateId2EditPart.VISUAL_ID:
			return getFinalStateId_5046Parser();
		case AssignDataidEditPart.VISUAL_ID:
			return getAssignDataid_5001Parser();
		case AssignExprEditPart.VISUAL_ID:
			return getAssignExpr_5002Parser();
		case AssignLocationEditPart.VISUAL_ID:
			return getAssignLocation_5003Parser();
		case CancelSendidEditPart.VISUAL_ID:
			return getCancelSendid_5004Parser();
		case CancelSendidexprEditPart.VISUAL_ID:
			return getCancelSendidexpr_5005Parser();
		case IfCondEditPart.VISUAL_ID:
			return getIfCond_5021Parser();
		case ElseIfCondEditPart.VISUAL_ID:
			return getElseIfCond_5006Parser();
		case AssignDataid2EditPart.VISUAL_ID:
			return getAssignDataid_5007Parser();
		case AssignExpr2EditPart.VISUAL_ID:
			return getAssignExpr_5008Parser();
		case AssignLocation2EditPart.VISUAL_ID:
			return getAssignLocation_5009Parser();
		case CancelSendid2EditPart.VISUAL_ID:
			return getCancelSendid_5010Parser();
		case CancelSendidexpr2EditPart.VISUAL_ID:
			return getCancelSendidexpr_5011Parser();
		case IfCond2EditPart.VISUAL_ID:
			return getIfCond_5020Parser();
		case LogLabelEditPart.VISUAL_ID:
			return getLogLabel_5012Parser();
		case ParamNameEditPart.VISUAL_ID:
			return getParamName_5013Parser();
		case ParamExprEditPart.VISUAL_ID:
			return getParamExpr_5014Parser();
		case RaiseEventEditPart.VISUAL_ID:
			return getRaiseEvent_5015Parser();
		case SendIdEditPart.VISUAL_ID:
			return getSendId_5016Parser();
		case SendEventEditPart.VISUAL_ID:
			return getSendEvent_5017Parser();
		case ValidateLocationEditPart.VISUAL_ID:
			return getValidateLocation_5018Parser();
		case ValidateSchemaEditPart.VISUAL_ID:
			return getValidateSchema_5019Parser();
		case LogLabel2EditPart.VISUAL_ID:
			return getLogLabel_5022Parser();
		case ParamName2EditPart.VISUAL_ID:
			return getParamName_5023Parser();
		case ParamExpr2EditPart.VISUAL_ID:
			return getParamExpr_5024Parser();
		case RaiseEvent2EditPart.VISUAL_ID:
			return getRaiseEvent_5025Parser();
		case SendId2EditPart.VISUAL_ID:
			return getSendId_5026Parser();
		case SendEvent2EditPart.VISUAL_ID:
			return getSendEvent_5027Parser();
		case ValidateLocation2EditPart.VISUAL_ID:
			return getValidateLocation_5028Parser();
		case ValidateSchema2EditPart.VISUAL_ID:
			return getValidateSchema_5029Parser();
		case AssignDataid3EditPart.VISUAL_ID:
			return getAssignDataid_5030Parser();
		case AssignExpr3EditPart.VISUAL_ID:
			return getAssignExpr_5031Parser();
		case AssignLocation3EditPart.VISUAL_ID:
			return getAssignLocation_5032Parser();
		case CancelSendid3EditPart.VISUAL_ID:
			return getCancelSendid_5033Parser();
		case CancelSendidexpr3EditPart.VISUAL_ID:
			return getCancelSendidexpr_5034Parser();
		case IfCond3EditPart.VISUAL_ID:
			return getIfCond_5035Parser();
		case LogLabel3EditPart.VISUAL_ID:
			return getLogLabel_5036Parser();
		case ParamName3EditPart.VISUAL_ID:
			return getParamName_5037Parser();
		case ParamExpr3EditPart.VISUAL_ID:
			return getParamExpr_5038Parser();
		case RaiseEvent3EditPart.VISUAL_ID:
			return getRaiseEvent_5039Parser();
		case SendId3EditPart.VISUAL_ID:
			return getSendId_5040Parser();
		case SendEvent3EditPart.VISUAL_ID:
			return getSendEvent_5041Parser();
		case ValidateLocation3EditPart.VISUAL_ID:
			return getValidateLocation_5042Parser();
		case ValidateSchema3EditPart.VISUAL_ID:
			return getValidateSchema_5043Parser();
		case ParamName4EditPart.VISUAL_ID:
			return getParamName_5044Parser();
		case ParamExpr4EditPart.VISUAL_ID:
			return getParamExpr_5045Parser();
		case ParallelId2EditPart.VISUAL_ID:
			return getParallelId_5068Parser();
		case ParallelId3EditPart.VISUAL_ID:
			return getParallelId_5067Parser();
		case StateId3EditPart.VISUAL_ID:
			return getStateId_5065Parser();
		case HistoryStateIdEditPart.VISUAL_ID:
			return getHistoryStateId_5047Parser();
		case InvokeIdEditPart.VISUAL_ID:
			return getInvokeId_5064Parser();
		case ParamName5EditPart.VISUAL_ID:
			return getParamName_5048Parser();
		case ParamExpr5EditPart.VISUAL_ID:
			return getParamExpr_5049Parser();
		case AssignDataid4EditPart.VISUAL_ID:
			return getAssignDataid_5050Parser();
		case AssignExpr4EditPart.VISUAL_ID:
			return getAssignExpr_5051Parser();
		case AssignLocation4EditPart.VISUAL_ID:
			return getAssignLocation_5052Parser();
		case CancelSendid4EditPart.VISUAL_ID:
			return getCancelSendid_5053Parser();
		case CancelSendidexpr4EditPart.VISUAL_ID:
			return getCancelSendidexpr_5054Parser();
		case IfCond4EditPart.VISUAL_ID:
			return getIfCond_5055Parser();
		case LogLabel4EditPart.VISUAL_ID:
			return getLogLabel_5056Parser();
		case ParamName6EditPart.VISUAL_ID:
			return getParamName_5057Parser();
		case ParamExpr6EditPart.VISUAL_ID:
			return getParamExpr_5058Parser();
		case RaiseEvent4EditPart.VISUAL_ID:
			return getRaiseEvent_5059Parser();
		case SendId4EditPart.VISUAL_ID:
			return getSendId_5060Parser();
		case SendEvent4EditPart.VISUAL_ID:
			return getSendEvent_5061Parser();
		case ValidateLocation4EditPart.VISUAL_ID:
			return getValidateLocation_5062Parser();
		case ValidateSchema4EditPart.VISUAL_ID:
			return getValidateSchema_5063Parser();
		case HistoryStateId2EditPart.VISUAL_ID:
			return getHistoryStateId_5066Parser();
		case DataExprEditPart.VISUAL_ID:
			return getDataExpr_5073Parser();
		case DataIdEditPart.VISUAL_ID:
			return getDataId_5074Parser();
		case DataSrcEditPart.VISUAL_ID:
			return getDataSrc_5075Parser();
		case TransitionEventEditPart.VISUAL_ID:
			return getTransitionEvent_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ScxmlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ScxmlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ScxmlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
