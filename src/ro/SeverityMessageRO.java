package com.ford.dts.ro;

public interface SeverityMessageRO extends DtsBaseSaKeyRO {
	public Integer getSeverityLevelNumber() ;
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public MessageRO getSeverityLevelMessageRO();
	public MessageRO getSeveritySMSTextMessageRO();
	public MessageRO getSeverityTextMessageRO();
	public MessageRO getSeverityActionMessageRO();
}
