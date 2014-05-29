package com.ford.dts.ro;



public interface MessageTypeRO extends DtsBaseSaKeyRO {

	
	public String getMessageTypeName();
	public Integer getMaxLength();
	public String getDisplaySeqRequiredFlag();
	public String getMessageEditableFlag();
}
