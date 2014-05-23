/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.BusinessObjectRO;
import com.ford.dts.ro.WorkflowStateRO;

/**
 * @author SKASARLA
 *
 */
public class BusinessObjectBO extends DtsBaseAuditBO implements BusinessObjectRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String businessObjectName;
	private String businessObjectDescription;
	private WorkflowStateBO workflowStateBO;
	/**
	 * @return the businessObjectName
	 */
	public String getBusinessObjectName() {
		return businessObjectName;
	}
	/**
	 * @param businessObjectName the businessObjectName to set
	 */
	public void setBusinessObjectName(String businessObjectName) {
		this.businessObjectName = businessObjectName;
	}
	/**
	 * @return the businessObjectDescription
	 */
	public String getBusinessObjectDescription() {
		return businessObjectDescription;
	}
	/**
	 * @param businessObjectDescription the businessObjectDescription to set
	 */
	public void setBusinessObjectDescription(String businessObjectDescription) {
		this.businessObjectDescription = businessObjectDescription;
	}
	/**
	 * @return the workflowStateBO
	 */
	public WorkflowStateBO getWorkflowStateBO() {
		return workflowStateBO;
	}
	
	/**
	 * @return the workflowStateRO
	 */
	public WorkflowStateRO getWorkflowStateRO() {
		return workflowStateBO;
	}
	
	/**
	 * @param workflowStateBO the workflowStateBO to set
	 */
	public void setWorkflowStateBO(WorkflowStateBO workflowStateBO) {
		this.workflowStateBO = workflowStateBO;
	}
	@Override
	public LinkedHashMap<String, ?> createPkMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
