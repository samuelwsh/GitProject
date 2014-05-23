/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.SeverityMessageRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class SeverityMessageBO extends DtsBaseSaKeyBO implements
		SeverityMessageRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private Integer severityLevelNumber;
	private WorkflowStateStatusBO workflowStateStatusBO;
	private MessageBO severityLevelMessageBO;
	private MessageBO severitySMSTextMessageBO;
	private MessageBO severityTextMessageBO;
	private MessageBO severityActionMessageBO;
	
	
	
	
	/**
	 * Construct a LanguageLocaleBO instance
	 *
	 */
    public SeverityMessageBO(Long saPk) {
        super(saPk);
    }

	
	
	/**
	 * @return the severityLevel Number
	 */
	public Integer getSeverityLevelNumber() {
		return this.severityLevelNumber;
	}


	/**
	 * @param severityLevelNumber the severityLevelNumber to set
	 */
	public void setSeverityLevelNumber(Integer severityLevelNumber) {
		this.severityLevelNumber = severityLevelNumber;
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


	/**
	 * @return the severityLevelMessageBO
	 */
	public MessageBO getSeverityLevelMessageBO() {
		return this.severityLevelMessageBO;
	}

	/**
	 * @return the severityLevelMessageRO
	 */
	public MessageRO getSeverityLevelMessageRO() {
		return this.severityLevelMessageBO;
	}

	/**
	 * @param severityLevelMessageBO the severityLevelMessageBO to set
	 */
	public void setSeverityLevelMessageBO(MessageBO severityLevelMessageBO) {
		this.severityLevelMessageBO = severityLevelMessageBO;
	}


	/**
	 * @return the severitySMSTextMessageBO
	 */
	public MessageBO getSeveritySMSTextMessageBO() {
		return this.severitySMSTextMessageBO;
	}

	/**
	 * @return the severitySMSTextMessageRO
	 */
	public MessageRO getSeveritySMSTextMessageRO() {
		return this.severitySMSTextMessageBO;
	}

	/**
	 * @param severitySMSTextMessageBO the severitySMSTextMessageBO to set
	 */
	public void setSeveritySMSTextMessageBO(MessageBO severitySMSTextMessageBO) {
		this.severitySMSTextMessageBO = severitySMSTextMessageBO;
	}


	/**
	 * @return the severityTextMessageBO
	 */
	public MessageBO getSeverityTextMessageBO() {
		return this.severityTextMessageBO;
	}


	/**
	 * @return the severityTextMessageRO
	 */
	public MessageRO getSeverityTextMessageRO() {
		return this.severityTextMessageBO;
	}


	/**
	 * @param severityTextMessageBO the severityTextMessageBO to set
	 */
	public void setSeverityTextMessageBO(MessageBO severityTextMessageBO) {
		this.severityTextMessageBO = severityTextMessageBO;
	}


	/**
	 * @return the severityActionMessageBO
	 */
	public MessageBO getSeverityActionMessageBO() {
		return this.severityActionMessageBO;
	}

	/**
	 * @return the severityActionMessageRO
	 */
	public MessageRO getSeverityActionMessageRO() {
		return this.severityActionMessageBO;
	}


	/**
	 * @param severityActionMessageBO the severityActionMessageBO to set
	 */
	public void setSeverityActionMessageBO(MessageBO severityActionMessageBO) {
		this.severityActionMessageBO = severityActionMessageBO;
	}


	/**
	 * 
	 */
	public SeverityMessageBO() {
		// TODO Auto-generated constructor stub
	}

}
