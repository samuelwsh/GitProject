/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.MessageTypeRO;

/**
 * @author SKASARLA
 *
 */
public class MessageTypeBO extends DtsBaseSaKeyBO implements MessageTypeRO {

	
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private String messageTypeName;
	private Integer maxLength;
	private String displaySeqRequiredFlag;
	private String messageEditableFlag;
	
	/**
	 * @return the messageTypeName
	 */
	public String getMessageTypeName() {
		return this.messageTypeName;
	}



	/**
	 * @param messageTypeName the messageTypeName to set
	 */
	public void setMessageTypeName(String messageTypeName) {
		this.messageTypeName = messageTypeName;
	}



	/**
	 * @return the maxLength
	 */
	public Integer getMaxLength() {
		return this.maxLength;
	}



	/**
	 * @param maxLength the maxLength to set
	 */
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}



	/**
	 * @return the displaySeqRequiredFlag
	 */
	public String getDisplaySeqRequiredFlag() {
		return this.displaySeqRequiredFlag;
	}



	/**
	 * @param displaySeqRequiredFlag the displaySeqRequiredFlag to set
	 */
	public void setDisplaySeqRequiredFlag(String displaySeqRequiredFlag) {
		this.displaySeqRequiredFlag = displaySeqRequiredFlag;
	}



	/**
	 * @return the messageEditableFlag
	 */
	public String getMessageEditableFlag() {
		return this.messageEditableFlag;
	}



	/**
	 * @param messageEditableFlag the messageEditableFlag to set
	 */
	public void setMessageEditableFlag(String messageEditableFlag) {
		this.messageEditableFlag = messageEditableFlag;
	}

	/**
     * Constructor - No Argument
     */
	public MessageTypeBO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
    /**
     * Constructor - Primary Key
     * 
     * @param saPk
     */
    public MessageTypeBO(Long saPk) {
        super(saPk);
    }
    
    /**
	 * Construct a MessageTypeBO instance
	 *
	 * @param messageTypeName
	 */
	public MessageTypeBO(String messageTypeName) {
		super();
		this.messageTypeName = messageTypeName;
	}
}
