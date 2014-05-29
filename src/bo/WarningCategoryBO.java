/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.CategoryRO;
import com.ford.dts.ro.WarningCategoryRO;
import com.ford.dts.ro.WarningRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class WarningCategoryBO extends DtsBaseSaKeyBO implements
		WarningCategoryRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private Integer displaySequence;
	private WarningBO warningBO;
	private CategoryBO categoryBO;
	private WorkflowStateStatusBO workflowStateStatusBO;
	
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
	 * @return the warningBO
	 */
	public WarningBO getWarningBO() {
		return this.warningBO;
	}

	/**
	 * @return the warningRO
	 */
	public WarningRO getWarningRO() {
		return this.warningBO;
	}

	
	/**
	 * @param warningBO the warningBO to set
	 */
	public void setWarningBO(WarningBO warningBO) {
		this.warningBO = warningBO;
	}

	/**
	 * @return the categoryBO
	 */
	public CategoryBO getCategoryBO() {
		return this.categoryBO;
	}

	/**
	 * @return the categoryRO
	 */
	public CategoryRO getCategoryRO() {
		return this.categoryBO;
	}
	
	/**
	 * @param categoryBO the categoryBO to set
	 */
	public void setCategoryBO(CategoryBO categoryBO) {
		this.categoryBO = categoryBO;
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
	 * 
	 */
	public WarningCategoryBO() {
		// TODO Auto-generated constructor stub
	}
	
	public WarningCategoryBO(Long saKey) {
		// TODO Auto-generated constructor stub
		super(saKey);
	}
	
    @Override    
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof WarningCategoryRO 
        		&& this.getCategoryRO().equals(((WarningCategoryRO)obj).getCategoryRO())
        		&& this.getWarningRO().equals(((WarningCategoryRO)obj).getWarningRO())
        		&& this.getWorkflowStateStatusRO().equals(((WarningCategoryRO)obj).getWorkflowStateStatusRO())
         ) 
        
        {
            return true;
        }
        return false;
    }
}
