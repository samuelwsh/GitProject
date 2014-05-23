/**
 * 
 */
package com.ford.dts.ro;


/**
 * @author SKASARLA
 *
 */
public interface WarningCategoryRO extends DtsBaseSaKeyRO {
	public Integer getDisplaySequence() ;
	public WarningRO getWarningRO();
	public CategoryRO getCategoryRO();
	public WorkflowStateStatusRO getWorkflowStateStatusRO();
	public boolean equals(Object obj);
}
