/**
 * 
 */
package com.ford.dts.ro.lookup;

import com.ford.dts.ro.DtsBaseRO;
import com.ford.dts.ro.ElectronicControlUnitRO;


/**
 * @author SKASARLA
 *
 */
public interface ElectronicControlUnitCategoryRO extends DtsBaseRO {

	public String getEcuCode();
	public String getEcuName();
	public String getEcuAcronym() ;
	public String getCategoryName() ;
	public Long getCategorySakey();

}
