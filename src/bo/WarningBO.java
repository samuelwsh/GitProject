/**
 * 
 */
package com.ford.dts.bo;

import java.util.List;

import com.ford.dts.ro.ConsumerDisplayImageRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.WarningCategoryRO;
import com.ford.dts.ro.WarningRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class WarningBO extends DtsBaseSaKeyBO implements WarningRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public WarningBO() {
		// TODO Auto-generated constructor stub
	}

	public WarningBO(Long saKey) {
		// TODO Auto-generated constructor stub
		super(saKey);
		
	}
	
	private String warningCode;
	private MessageBO warningNameMessageBO;
	private MessageBO warningMeaningMessageBO;
	private WorkflowStateStatusBO workflowStateStatusBO;
	private ConsumerDisplayImageBO consumerDisplayImageBO;
	private List<WarningCategoryBO> warningCategoryBOList;
	private List<WarningCategoryRO> warningCategoryROList;
	
	/**
	 * @return the warningCode
	 */
	public String getWarningCode() {
		return this.warningCode;
	}
	/**
	 * @param warningCode the warningCode to set
	 */
	public void setWarningCode(String warningCode) {
		this.warningCode = warningCode;
	}
	/**
	 * @return the warningNameMessageBO
	 */
	public MessageBO getWarningNameMessageBO() {
		return this.warningNameMessageBO;
	}
	/**
	 * @return the warningNameMessageRO
	 */
	public MessageRO getWarningNameMessageRO() {
		return this.warningNameMessageBO;
	}
	
	/**
	 * @param warningNameMessageBO the warningNameMessageBO to set
	 */
	public void setWarningNameMessageBO(MessageBO warningNameMessageBO) {
		this.warningNameMessageBO = warningNameMessageBO;
	}
	/**
	 * @return the warningMeaningMessageBO
	 */
	public MessageBO getWarningMeaningMessageBO() {
		return this.warningMeaningMessageBO;
	}
	/**
	 * @return the warningMeaningMessageRO
	 */
	public MessageRO getWarningMeaningMessageRO() {
		return this.warningMeaningMessageBO;
	}
	/**
	 * @param warningMeaningMessageBO the warningMeaningMessageBO to set
	 */
	public void setWarningMeaningMessageBO(MessageBO warningMeaningMessageBO) {
		this.warningMeaningMessageBO = warningMeaningMessageBO;
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
	 * @return the consumerDisplayImageBO
	 */
	public ConsumerDisplayImageBO getConsumerDisplayImageBO() {
		return this.consumerDisplayImageBO;
	}
	/**
	 * @return the consumerDisplayImageRO
	 */
	public ConsumerDisplayImageRO getConsumerDisplayImageRO() {
		return this.consumerDisplayImageBO;
	}
	
	/**
	 * @param consumerDisplayImageBO the consumerDisplayImageBO to set
	 */
	public void setConsumerDisplayImageBO(
			ConsumerDisplayImageBO consumerDisplayImageBO) {
		this.consumerDisplayImageBO = consumerDisplayImageBO;
	}
	
	public List<WarningCategoryBO> getWarningCategoryBOList() {
		return warningCategoryBOList;
	}
	public void setWarningCategoryBOList(
			List<WarningCategoryBO> warningCategoryBOList) {
		this.warningCategoryBOList = warningCategoryBOList;
	}

	public List<WarningCategoryRO> getWarningCategoryROList() {
		return warningCategoryROList = convertList(WarningCategoryRO.class, this.warningCategoryBOList);
	}

    @Override    
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof WarningRO 
        		&& (this.getWarningCode().equals(((WarningRO)obj).getWarningCode()) ||
        				(this.getSaKey() != null && ((WarningRO)obj).getSaKey()!= null &&
        						this.getSaKey().longValue() == ((WarningRO)obj).getSaKey().longValue()) )
        		&& this.getWorkflowStateStatusRO().equals(((WarningRO)obj).getWorkflowStateStatusRO())) 
        
        {
            return true;
        }
        return false;
    }
}
