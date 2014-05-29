/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.FailureTypeRO;

/**
 * @author SKASARLA
 * 
 */
public class FailureTypeBO extends DtsBaseAuditBO implements FailureTypeRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String failureTypeCode;

	/**
	 * @return the failureTypeCode
	 */
	public String getFailureTypeCode() {
		return this.failureTypeCode;
	}

	/**
	 * @param failureTypeCode
	 *            the failureTypeCode to set
	 */
	public void setFailureTypeCode(String failureTypeCode) {
		this.failureTypeCode = failureTypeCode;
	}

	/**
	 * 
	 */
	public FailureTypeBO() {
		// TODO Auto-generated constructor stub
	}

	public FailureTypeBO(String failureCode) {
		super();
		this.failureTypeCode = failureCode;
	}

	/**
	 * @see com.ford.it.entity.ro.BaseRO#createPkMap()
	 */
	@Override
	public LinkedHashMap<String, ?> createPkMap() {
		return null;

	}

}
