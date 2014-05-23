/**
 * 
 */
package com.ford.dts.ro;

import java.util.List;

import com.ford.dts.ro.ConsumerDisplayImageRO;
import com.ford.dts.ro.MessageRO;

/**
 * @author SKASARLA
 *
 */
public interface CategoryRO extends DtsBaseSaKeyRO {

	public Integer getDisplaySequence();
	public MessageRO getCategoryNameMessageRO();
	public MessageRO getCategoryAboutMessageRO();
	public ConsumerDisplayImageRO getConsumerDisplayImageRO() ;
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public List<WarningCategoryRO> getWarningCategoryROList();
	public List<ECUCategoryRO> getEcuCategoryROList();
}
