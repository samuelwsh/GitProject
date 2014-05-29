/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.DiagnosticTroubleCodeRO;

/**
 * @author SKASARLA
 *
 */
public class DiagnosticTroubleCodeBO extends DtsBaseAuditBO implements DiagnosticTroubleCodeRO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dtcCode;
	private String dtcName;
	
	/**
	 * @return the dtcCode
	 */
	public String getDtcCode() {
		return this.dtcCode;
	}
	/**
	 * @param dtcCode the dtcCode to set
	 */
	public void setDtcCode(String dtcCode) {
		this.dtcCode = dtcCode;
	}
	/**
	 * @return the dtcName
	 */
	public String getDtcName() {
		return this.dtcName;
	}
	/**
	 * @param dtcName the dtcName to set
	 */
	public void setDtcName(String dtcName) {
		this.dtcName = dtcName;
	}
	
	/**
	 * 
	 */
	public DiagnosticTroubleCodeBO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see com.ford.it.entity.ro.BaseRO#createPkMap()
	 */
	@Override
	public LinkedHashMap<String, ?> createPkMap() {				
		return null;		
	
	}
	
	public DiagnosticTroubleCodeBO(String dtcCode) {
		super();
		this.dtcCode = dtcCode;
	}

}
