/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.WorkflowStateStatusMovementRO;
import com.ford.dts.ro.WorkflowStateStatusRO;

/**
 * @author SKASARLA
 *
 */
public class WorkflowStateStatusMovementBO extends DtsBaseAuditBO implements
		WorkflowStateStatusMovementRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private WorkflowStateStatusBO fromWorkflowStateStatusBO;
	private WorkflowStateStatusBO toWorkflowStateStatusBO;
	/**
	 * @return the fromWorkflowStateStatusBO
	 */
	public WorkflowStateStatusBO getFromWorkflowStateStatusBO() {
		return this.fromWorkflowStateStatusBO;
	}
	
	/**
	 * @return the fromWorkflowStateStatusRO
	 */
	public WorkflowStateStatusRO getFromWorkflowStateStatusRO() {
		return this.fromWorkflowStateStatusBO;
	}
	
	/**
	 * @param fromWorkflowStateStatusBO the fromWorkflowStateStatusBO to set
	 */
	public void setFromWorkflowStateStatusBO(
			WorkflowStateStatusBO fromWorkflowStateStatusBO) {
		this.fromWorkflowStateStatusBO = fromWorkflowStateStatusBO;
	}
	/**
	 * @return the toWorkflowStateStatusBO
	 */
	public WorkflowStateStatusBO getToWorkflowStateStatusBO() {
		return this.toWorkflowStateStatusBO;
	}
	
	/**
	 * @return the toWorkflowStateStatusRO
	 */
	public WorkflowStateStatusRO getToWorkflowStateStatusRO() {
		return this.toWorkflowStateStatusBO;
	}
	
	/**
	 * @param toWorkflowStateStatusBO the toWorkflowStateStatusBO to set
	 */
	public void setToWorkflowStateStatusBO(
			WorkflowStateStatusBO toWorkflowStateStatusBO) {
		this.toWorkflowStateStatusBO = toWorkflowStateStatusBO;
	}
	/**
	 * 
	 */
	public WorkflowStateStatusMovementBO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see com.ford.it.entity.ro.BaseRO#createPkMap()
	 */
	@Override
	public LinkedHashMap<String, ?> createPkMap() {
		
		return null;
	}

}
