package com.ford.dts.ro;

public interface MessageLanguageRO extends DtsBaseSaKeyRO {
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public MessageRO getMessageRO();
	public LanguageLocaleRO getLanguageLocaleRO();
	public String getMessageText();
}
