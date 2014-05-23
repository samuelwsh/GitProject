package com.ford.dts.ro;


public interface WarningDtcFailureTypeMapRO extends DtsBaseSaKeyRO {
	public WarningRO getWarningRO();
	public DiagnosticTroubleCodeRO getDiagnosticTroubleCodeRO();
	public FailureTypeRO getFailureTypeRO();
	public MessageRO getTruncatedMessageRO();
	public MessageRO getSymptomMessageRO() ;
	public MessageRO getSmsTextMessageRO() ;
	public MessageRO getActionMessageRO();
	public SeverityMessageRO getSeverityMessageRO();
	public WorkflowStateStatusRO getWorkflowStateStatusRO() ;
}
