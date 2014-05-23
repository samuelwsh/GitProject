/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.LanguageLocaleRO;

/**
 * @author SKASARLA
 *
 */
public class LanguageLocaleBO extends DtsBaseSaKeyBO implements
		LanguageLocaleRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String languageCode;
	private String countryCode;
	private String regionCode;
	private String defaultFlag;
	
	
	/**
	 * Construct a LanguageLocaleBO instance
	 *
	 */
    public LanguageLocaleBO(Long saPk) {
        super(saPk);
    }

	
	public LanguageLocaleBO() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return this.languageCode;
	}


	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}


	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return this.countryCode;
	}


	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return this.regionCode;
	}


	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}


	/**
	 * @return the defaultFlag
	 */
	public String getDefaultFlag() {
		return this.defaultFlag;
	}


	/**
	 * @param defaultFlag the defaultFlag to set
	 */
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

}
