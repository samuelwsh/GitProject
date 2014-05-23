/**
 * 
 */
package com.ford.dts.ro;


import com.ford.dts.ro.WorkflowStateRO;

/**
 * @author SKASARLA
 *
 */
public interface BusinessObjectRO extends DtsBaseAuditRO {

	public String getBusinessObjectName();
	public String getBusinessObjectDescription();
	public WorkflowStateRO getWorkflowStateRO();
}
