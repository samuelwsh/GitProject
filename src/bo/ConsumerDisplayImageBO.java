package com.ford.dts.bo;

import com.ford.dts.ro.ConsumerDisplayImageRO;
import com.ford.dts.ro.ImageTypeRO;

/**
 * TODO - Place class description here
 */
public class ConsumerDisplayImageBO extends DtsBaseSaKeyBO implements
		ConsumerDisplayImageRO {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String imageFileName;
	private ImageTypeBO imageTypeBO;

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return this.imageFileName;
	}

	/**
	 * @param imageFileName
	 *            the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the imageTypeBO
	 */
	public ImageTypeBO getImageTypeBO() {
		return this.imageTypeBO;
	}

	/**
	 * @return the imageTypeRO
	 */
	public ImageTypeRO getImageTypeRO() {
		return this.imageTypeBO;
	}

	/**
	 * @param imageTypeBO
	 *            the imageTypeBO to set
	 */
	public void setImageTypeBO(ImageTypeBO imageTypeBO) {
		this.imageTypeBO = imageTypeBO;
	}

	/**
	 * 
	 */
	public ConsumerDisplayImageBO() {
		// TODO Auto-generated constructor stub
	}

	public ConsumerDisplayImageBO(String imageFileName) {
		// TODO Auto-generated constructor stub
		super();
		this.imageFileName = imageFileName;
	}
	
	public ConsumerDisplayImageBO(Long saKey) {
		// TODO Auto-generated constructor stub
		super(saKey);
	}

	
	
}
