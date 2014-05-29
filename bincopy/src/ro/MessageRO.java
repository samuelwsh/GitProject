package com.ford.dts.ro;

import java.util.List;

import com.ford.dts.bo.MessageLanguageBO;



/**
 * TODO - Place class description here
 */
public interface MessageRO extends DtsBaseSaKeyRO {

	/**
	 * TODO - Place method description here
	 * @return
	 */
	public MessageTypeRO getMessageTypeRO();
	public List<MessageLanguageRO> getMessageLanguageROList();
	public List<MessagePropertiesRO> getMessagePropertiesROList();
	
}
