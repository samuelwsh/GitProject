/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.CategoryRO;
import com.ford.dts.ro.ECUCategoryRO;
import com.ford.dts.ro.ElectronicControlUnitRO;

/**
 * @author SKASARLA
 *
 */
public class ECUCategoryBO extends DtsBaseSaKeyBO implements ECUCategoryRO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ElectronicControlUnitBO electronicControlUnitBO;
	private CategoryBO categoryBO;
	
	
	/**
	 * 
	 */
	public ECUCategoryBO() {
		// TODO Auto-generated constructor stub
	}

	
	public ECUCategoryBO(Long sakey) {
		// TODO Auto-generated constructor stub
		super(sakey);
	}

	
	/**
	 * @return the electronicControlUnitBO
	 */
	public ElectronicControlUnitBO getElectronicControlUnitBO() {
		return this.electronicControlUnitBO;
	}

	/**
	 * @return the electronicControlUnitRO
	 */
	public ElectronicControlUnitRO getElectronicControlUnitRO() {
		return this.electronicControlUnitBO;
	}
	/**
	 * @param electronicControlUnitBO the electronicControlUnitBO to set
	 */
	public void setElectronicControlUnitBO(
			ElectronicControlUnitBO electronicControlUnitBO) {
		this.electronicControlUnitBO = electronicControlUnitBO;
	}

	/**
	 * @return the categoryBO
	 */
	public CategoryBO getCategoryBO() {
		return this.categoryBO;
	}

	/**
	 * @return the categoryBO
	 */
	public CategoryRO getCategoryRO() {
		return this.categoryBO;
	}
	/**
	 * @param categoryBO the categoryBO to set
	 */
	public void setCategoryBO(CategoryBO categoryBO) {
		this.categoryBO = categoryBO;
	}

	
}
