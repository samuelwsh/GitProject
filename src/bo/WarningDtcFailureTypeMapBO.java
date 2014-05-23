/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.DiagnosticTroubleCodeRO;
import com.ford.dts.ro.FailureTypeRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.SeverityMessageRO;
import com.ford.dts.ro.WarningDtcFailureTypeMapRO;
import com.ford.dts.ro.WarningRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class WarningDtcFailureTypeMapBO extends DtsBaseSaKeyBO implements
		WarningDtcFailureTypeMapRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private WarningBO warningBO;
	private DiagnosticTroubleCodeBO diagnosticTroubleCodeBO;
	private FailureTypeBO failureTypeBO;
	private MessageBO truncatedMessageBO;
	private MessageBO symptomMessageBO;
	private MessageBO smsTextMessageBO;
	private MessageBO actionMessageBO;
	private SeverityMessageBO severityMessageBO;
	private WorkflowStateStatusBO workflowStateStatusBO;
	/**
	 * 
	 */
	public WarningDtcFailureTypeMapBO() {
		// TODO Auto-generated constructor stub
	}
	
	public WarningDtcFailureTypeMapBO(long saKey) {
		// TODO Auto-generated constructor stub
		super(saKey);
	}

	
	/**
	 * @return the warningBO
	 */
	public WarningBO getWarningBO() {
		return this.warningBO;
	}
	/**
	 * @return the warningRO
	 */
	public WarningRO getWarningRO() {
		return this.warningBO;
	}
	/**
	 * @param warningBO the warningBO to set
	 */
	public void setWarningBO(WarningBO warningBO) {
		this.warningBO = warningBO;
	}
	/**
	 * @return the diagnosticTroubleCodeBO
	 */
	public DiagnosticTroubleCodeBO getDiagnosticTroubleCodeBO() {
		return this.diagnosticTroubleCodeBO;
	}
	/**
	 * @return the diagnosticTroubleCodeRO
	 */
	public DiagnosticTroubleCodeRO getDiagnosticTroubleCodeRO() {
		return this.diagnosticTroubleCodeBO;
	}
	/**
	 * @param diagnosticTroubleCodeBO the diagnosticTroubleCodeBO to set
	 */
	public void setDiagnosticTroubleCodeBO(
			DiagnosticTroubleCodeBO diagnosticTroubleCodeBO) {
		this.diagnosticTroubleCodeBO = diagnosticTroubleCodeBO;
	}
	/**
	 * @return the failureTypeBO
	 */
	public FailureTypeBO getFailureTypeBO() {
		return this.failureTypeBO;
	}
	/**
	 * @return the failureTypeRO
	 */
	public FailureTypeRO getFailureTypeRO() {
		return this.failureTypeBO;
	}
	/**
	 * @param failureTypeBO the failureTypeBO to set
	 */
	public void setFailureTypeBO(FailureTypeBO failureTypeBO) {
		this.failureTypeBO = failureTypeBO;
	}
	/**
	 * @return the truncatedMessageBO
	 */
	public MessageBO getTruncatedMessageBO() {
		return this.truncatedMessageBO;
	}
	
	/**
	 * @return the truncatedMessageRO
	 */
	public MessageRO getTruncatedMessageRO() {
		return this.truncatedMessageBO;
	}
	
	/**
	 * @param truncatedMessageBO the truncatedMessageBO to set
	 */
	public void setTruncatedMessageBO(MessageBO truncatedMessageBO) {
		this.truncatedMessageBO = truncatedMessageBO;
	}
	/**
	 * @return the symptomMessageBO
	 */
	public MessageBO getSymptomMessageBO() {
		return this.symptomMessageBO;
	}
	
	/**
	 * @return the symptomMessageRO
	 */
	public MessageRO getSymptomMessageRO() {
		return this.symptomMessageBO;
	}
	
	/**
	 * @param symptomMessageBO the symptomMessageBO to set
	 */
	public void setSymptomMessageBO(MessageBO symptomMessageBO) {
		this.symptomMessageBO = symptomMessageBO;
	}
	/**
	 * @return the smsTextMessageBO
	 */
	public MessageBO getSmsTextMessageBO() {
		return this.smsTextMessageBO;
	}
	/**
	 * @return the smsTextMessageRO
	 */
	public MessageRO getSmsTextMessageRO() {
		return this.smsTextMessageBO;
	}
	
	/**
	 * @param smsTextMessageBO the smsTextMessageBO to set
	 */
	public void setSmsTextMessageBO(MessageBO smsTextMessageBO) {
		this.smsTextMessageBO = smsTextMessageBO;
	}
	/**
	 * @return the actionMessageBO
	 */
	public MessageBO getActionMessageBO() {
		return this.actionMessageBO;
	}
	
	/**
	 * @return the actionMessageRO
	 */
	public MessageRO getActionMessageRO() {
		return this.actionMessageBO;
	}
	
	/**
	 * @param actionMessageBO the actionMessageBO to set
	 */
	public void setActionMessageBO(MessageBO actionMessageBO) {
		this.actionMessageBO = actionMessageBO;
	}
	/**
	 * @return the severityMessageBO
	 */
	public SeverityMessageBO getSeverityMessageBO() {
		return this.severityMessageBO;
	}
	
	/**
	 * @return the severityMessageRO
	 */
	public SeverityMessageRO getSeverityMessageRO() {
		return this.severityMessageBO;
	}
	
	/**
	 * @param severityMessageBO the severityMessageBO to set
	 */
	public void setSeverityMessageBO(SeverityMessageBO severityMessageBO) {
		this.severityMessageBO = severityMessageBO;
	}
	/**
	 * @return the workflowStateStatusBO
	 */
	public WorkflowStateStatusBO getWorkflowStateStatusBO() {
		return this.workflowStateStatusBO;
	}
	/**
	 * @return the workflowStateStatusRO
	 */
	public WorkflowStateStatusRO getWorkflowStateStatusRO() {
		return this.workflowStateStatusBO;
	}
	/**
	 * @param workflowStateStatusBO the workflowStateStatusBO to set
	 */
	public void setWorkflowStateStatusBO(WorkflowStateStatusBO workflowStateStatusBO) {
		this.workflowStateStatusBO = workflowStateStatusBO;
	}

	public void setSaKey(Long saKey){
		this.saKey = saKey;
	}
	
	
}
