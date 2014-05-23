/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.WarningCategoryRO;
import com.ford.dts.ro.WorkflowStateRO;
import com.ford.dts.ro.WorkflowStateStatusRO;
import com.ford.dts.ro.WorkflowStatusRO;

/**
 * @author SKASARLA
 *
 */
public class WorkflowStateStatusBO extends DtsBaseSaKeyBO implements
		WorkflowStateStatusRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private WorkflowStateBO workflowStateBO;
	private WorkflowStatusBO workflowStatusBO;
	/**
	 * @return the workflowStateBO
	 */
	public WorkflowStateBO getWorkflowStateBO() {
		return this.workflowStateBO;
	}
	/**
	 * @return the workflowStateRO
	 */
	public WorkflowStateRO getWorkflowStateRO() {
		return this.workflowStateBO;
	}
	/**
	 * @param workflowStateBO the workflowStateBO to set
	 */
	public void setWorkflowStateBO(WorkflowStateBO workflowStateBO) {
		this.workflowStateBO = workflowStateBO;
	}
	/**
	 * @return the workflowStatusBO
	 */
	public WorkflowStatusBO getWorkflowStatusBO() {
		return this.workflowStatusBO;
	}
	
	/**
	 * @return the workflowStatusRO
	 */
	public WorkflowStatusRO getWorkflowStatusRO() {
		return this.workflowStatusBO;
	}
	/**
	 * @param workflowStatusBO the workflowStatusBO to set
	 */
	public void setWorkflowStatusBO(WorkflowStatusBO workflowStatusBO) {
		this.workflowStatusBO = workflowStatusBO;
	}
	/**
	 * 
	 */
	public WorkflowStateStatusBO() {
		// TODO Auto-generated constructor stub
	}
    public WorkflowStateStatusBO(Long saPk) {
        super(saPk);
    }

    @Override    
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof WorkflowStateStatusRO 
        		&& this.getWorkflowStateRO().getStateCode()
        		.equals(((WorkflowStateStatusRO)obj).getWorkflowStateRO().getStateCode())
        		&& this.getWorkflowStatusRO().getStatusCode()
        		.equals(((WorkflowStateStatusRO)obj).getWorkflowStatusRO().getStatusCode())){
        	
            return true;
        }
        
        return false;
    }
    
    
}
