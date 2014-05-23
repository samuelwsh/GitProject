/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.MessagePropertiesRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class MessagePropertiesBO extends DtsBaseSaKeyBO implements
MessagePropertiesRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private WorkflowStateStatusBO workflowStateStatusBO;
	private MessageBO messageBO;
	private Integer displaySequence;

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
	 * @return the displaySequence
	 */
	public Integer getDisplaySequence() {
		return displaySequence;
	}
	/**
	 * @param displaySequence the displaySequence to set
	 */
	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}
	/**
     * Constructor - No Argument
     */
	public MessagePropertiesBO() {
		// TODO Auto-generated constructor stub
	}
	
	
    /**
     * Constructor - Primary Key
     * 
     * @DTST08_MSG_K 
     */
    public MessagePropertiesBO(Long saPk) {
        super(saPk);
    }
	
}
