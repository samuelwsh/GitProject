/**
 * 
 */
package com.ford.dts.ro;

import java.util.List;


/**
 * @author SKASARLA
 *
 */
public interface ElectronicControlUnitRO extends DtsBaseAuditRO {

	public String getEcuCode();
	public String getEcuName();
	public String getEcuAcronym() ;
	public List<ECUCategoryRO> getEcuCategoryROList();
}
