/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.WorkflowStateRO;

/**
 * @author SKASARLA
 *
 */
public class WorkflowStateBO extends DtsBaseAuditBO implements WorkflowStateRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String stateCode;
	private String stateDescription;
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return this.stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the stateDescription
	 */
	public String getStateDescription() {
		return this.stateDescription;
	}
	/**
	 * @param stateDescription the stateDescription to set
	 */
	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}
	/**
	 * 
	 */
	public WorkflowStateBO() {
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
