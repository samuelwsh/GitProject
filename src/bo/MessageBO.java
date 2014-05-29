/**
 * 
 */
package com.ford.dts.bo;

import java.util.List;

import com.ford.dts.ro.MessageLanguageRO;
import com.ford.dts.ro.MessagePropertiesRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.MessageTypeRO;

/**
 * @author SKASARLA
 *
 */
public class MessageBO extends DtsBaseSaKeyBO implements MessageRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private MessageTypeBO messageTypeBO;
	private MessageLanguageBO messageLanguageBO;
	
	private List<MessageLanguageBO> messageLanguageBOList;
	private List<MessageLanguageRO> messageLanguageROList;
	
	private List<MessagePropertiesBO> messagePropertiesBOList;
	private List<MessagePropertiesRO> messagePropertiesROList;

	/**
	 * @return the messageTypeBO
	 */
	public MessageTypeBO getMessageTypeBO() {
		return this.messageTypeBO;
	}
	
	/**
	 * @return the messageTypeRO
	 */
	public MessageTypeRO getMessageTypeRO() {
		return this.messageTypeBO;
	}
	
	/**
	 * @param messageTypeBO the messageTypeBO to set
	 */
	public void setMessageTypeBO(MessageTypeBO messageTypeBO) {
		this.messageTypeBO = messageTypeBO;
	}
	


	public MessageLanguageBO getMessageLanguageBO() {
		return messageLanguageBO;
	}

	public void setMessageLanguageBO(MessageLanguageBO messageLanguageBO) {
		this.messageLanguageBO = messageLanguageBO;
	}

	public List<MessageLanguageBO> getMessageLanguageBOList() {
		return messageLanguageBOList;
	}

	public void setMessageLanguageBOList(
			List<MessageLanguageBO> messageLanguageBOList) {
		this.messageLanguageBOList = messageLanguageBOList;
	}

	
	
	public List<MessageLanguageRO> getMessageLanguageROList() {
		return messageLanguageROList = convertList(MessageLanguageRO.class, this.messageLanguageBOList);
	}



	public List<MessagePropertiesBO> getMessagePropertiesBOList() {
		return messagePropertiesBOList;
	}

	public void setMessagePropertiesBOList(
			List<MessagePropertiesBO> messagePropertiesBOList) {
		this.messagePropertiesBOList = messagePropertiesBOList;
	}

	public List<MessagePropertiesRO> getMessagePropertiesROList() {
		return messagePropertiesROList = convertList(MessagePropertiesRO.class, this.messagePropertiesBOList);
	}

	/**
     * Constructor - No Argument
     */
	public MessageBO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
    /**
     * Constructor - Primary Key
     * 
     * @param saPk
     */
    public MessageBO(Long saPk) {
        super(saPk);
    }
}
