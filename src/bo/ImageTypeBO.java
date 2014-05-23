/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;

import com.ford.dts.ro.ImageTypeRO;

/**
 * @author SKASARLA
 *
 */
public class ImageTypeBO extends DtsBaseAuditBO implements ImageTypeRO {


	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String imageTypeCode;
	/**
	 * @return the imageTypeCode
	 */
	public String getImageTypeCode() {
		return this.imageTypeCode;
	}
	/**
	 * @param imageTypeCode the imageTypeCode to set
	 */
	public void setImageTypeCode(String imageTypeCode) {
		this.imageTypeCode = imageTypeCode;
	}
	
	/**
	 * 
	 */
	public ImageTypeBO() {
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
