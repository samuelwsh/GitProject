package com.ford.dts.ro;

public interface MessagePropertiesRO extends DtsBaseSaKeyRO {
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public MessageRO getMessageRO();
	public Integer getDisplaySequence();
}
