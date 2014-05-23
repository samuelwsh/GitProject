/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.WorkflowStatusRO;

/**
 * @author SKASARLA
 * 
 */
public class WorkflowStatusBO extends DtsBaseAuditBO implements
		WorkflowStatusRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String statusCode;
	private String statusDescription;

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return this.statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return this.statusDescription;
	}

	/**
	 * @param statusDescription
	 *            the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * 
	 */
	public WorkflowStatusBO() {
		super();

	}

	
	/**
	 * Construct a WorkflowStatusBO instance
	 * @param statusDescription  
	 * 
	 */
	public WorkflowStatusBO(String statusDescription) {
		super();

		this.statusDescription = statusDescription;
	}

	

	/**
	 * @see com.ford.it.entity.ro.BaseRO#createPkMap()
	 */
	@Override
	public LinkedHashMap<String, ?> createPkMap() {

		return null;
	}

}
