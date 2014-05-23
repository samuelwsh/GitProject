/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.LanguageLocaleRO;
import com.ford.dts.ro.MessageLanguageRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class MessageLanguageBO extends DtsBaseSaKeyBO implements
		MessageLanguageRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private WorkflowStateStatusBO workflowStateStatusBO;
	private MessageBO messageBO;
	private LanguageLocaleBO languageLocaleBO;
	private String messageText;
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
	/**
	 * @return the messageBO
	 */
	public MessageBO getMessageBO() {
		return this.messageBO;
	}
	/**
	 * @return the messageRO
	 */
	public MessageRO getMessageRO() {
		return this.messageBO;
	}
	
	/**
	 * @param messageBO the messageBO to set
	 */
	public void setMessageBO(MessageBO messageBO) {
		this.messageBO = messageBO;
	}
	/**
	 * @return the languageLocaleBO
	 */
	public LanguageLocaleBO getLanguageLocaleBO() {
		return this.languageLocaleBO;
	}
	
	/**
	 * @return the languageLocaleRO
	 */
	public LanguageLocaleRO getLanguageLocaleRO() {
		return this.languageLocaleBO;
	}
	
	/**
	 * @param languageLocaleBO the languageLocaleBO to set
	 */
	public void setLanguageLocaleBO(LanguageLocaleBO languageLocaleBO) {
		this.languageLocaleBO = languageLocaleBO;
	}
	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return this.messageText;
	}
	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	/**
     * Constructor - No Argument
     */
	public MessageLanguageBO() {
		// TODO Auto-generated constructor stub
	}
	
	
    /**
     * Constructor - Primary Key
     * 
     * @DTST08_MSG_K 
     */
    public MessageLanguageBO(Long saPk) {
        super(saPk);
    }
	
}
