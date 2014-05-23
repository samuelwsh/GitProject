package com.ford.dts.bo;

import java.util.List;

import com.ford.dts.ro.CategoryRO;
import com.ford.dts.ro.ConsumerDisplayImageRO;
import com.ford.dts.ro.ECUCategoryRO;
import com.ford.dts.ro.MessageRO;
import com.ford.dts.ro.WarningCategoryRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * TODO - Place class description here
 */
public class CategoryBO extends DtsBaseSaKeyBO implements CategoryRO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer displaySequence;
	private MessageBO categoryNameMessageBO;
	private MessageBO categoryAboutMessageBO;
	private ConsumerDisplayImageBO consumerDisplayImageBO;
	private WorkflowStateStatusBO workflowStateStatusBO;
	private List<WarningCategoryBO> warningCategoryBOList;
	private List<WarningCategoryRO> warningCategoryROList;
	private List<ECUCategoryBO> ecuCategoryBOList;
	private List<ECUCategoryRO> ecuCategoryROList;
	/**
	 * @return the warningCategoryBOList
	 */
	public List<WarningCategoryBO> getWarningCategoryBOList() {
		return warningCategoryBOList;
	}

	/**
	 * @return the warningCategoryBOList
	 */
	public List<WarningCategoryRO> getWarningCategoryROList() {
		return warningCategoryROList = convertList(WarningCategoryRO.class, this.warningCategoryBOList);
		
	}
	/**
	 * @param warningCategoryBOList the warningCategoryBOList to set
	 */
	public void setWarningCategoryBOList(
			List<WarningCategoryBO> warningCategoryBOList) {
		this.warningCategoryBOList = warningCategoryBOList;
	}


	/**
	 * @return the ecuCategoryBOList
	 */
	public List<ECUCategoryBO> getEcuCategoryBOList() {
		return ecuCategoryBOList;
	}

	/**
	 * @return the ecuCategoryROList
	 */
	public List<ECUCategoryRO> getEcuCategoryROList() {
		return ecuCategoryROList = convertList(ECUCategoryRO.class, this.ecuCategoryBOList);
		
	}

	/**
	 * @param ecuCategoryBOList the ecuCategoryBOList to set
	 */
	public void setEcuCategoryBOList(List<ECUCategoryBO> ecuCategoryBOList) {
		this.ecuCategoryBOList = ecuCategoryBOList;
	}


	/**
	 * @return the displaySequence
	 */
	public Integer getDisplaySequence() {
		return this.displaySequence;
	}


	/**
	 * @param displaySequence the displaySequence to set
	 */
	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}


	/**
	 * @return the categoryNameMessageBO
	 */
	public MessageBO getCategoryNameMessageBO() {
		return this.categoryNameMessageBO;
	}

	/**
	 * @return the categoryNameMessageRO
	 */
	public MessageRO getCategoryNameMessageRO() {
		return this.categoryNameMessageBO;
	}

	/**
	 * @param categoryNameMessageBO the categoryNameMessageBO to set
	 */
	public void setCategoryNameMessageBO(MessageBO categoryNameMessageBO) {
		this.categoryNameMessageBO = categoryNameMessageBO;
	}


	/**
	 * @return the categoryAboutMessageBO
	 */
	public MessageBO getCategoryAboutMessageBO() {
		return this.categoryAboutMessageBO;
	}

	/**
	 * @return the categoryAboutMessageRO
	 */
	public MessageRO getCategoryAboutMessageRO() {
		return this.categoryAboutMessageBO;
	}

	/**
	 * @param categoryAboutMessageBO the categoryAboutMessageBO to set
	 */
	public void setCategoryAboutMessageBO(MessageBO categoryAboutMessageBO) {
		this.categoryAboutMessageBO = categoryAboutMessageBO;
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
     * Constructor - No Argument
     */
	public CategoryBO() {
		super();
	}

	
    /**
     * Constructor - Primary Key
     * 
     * @param saPk
     */
    public CategoryBO(Long saPk) {
        super(saPk);
    }
    @Override    
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof CategoryRO 
        		&& this.getSaKey().longValue()==
        			(((CategoryRO)obj).getSaKey().longValue())) 
        
        {
            return true;
        }
        return false;
    }
}
