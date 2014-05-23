/**
 * 
 */
package com.ford.dts.ro;

import java.util.List;


/**
 * @author SKASARLA
 *
 */
public interface WarningRO extends DtsBaseSaKeyRO {
	public String getWarningCode();
	public MessageRO getWarningNameMessageRO();
	public MessageRO getWarningMeaningMessageRO();
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public ConsumerDisplayImageRO getConsumerDisplayImageRO() ;
	public List<WarningCategoryRO> getWarningCategoryROList();
}
