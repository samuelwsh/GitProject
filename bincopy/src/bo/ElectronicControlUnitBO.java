/**
 * 
 */
package com.ford.dts.bo;

import java.util.LinkedHashMap;
import java.util.List;

import com.ford.dts.ro.ECUCategoryRO;
import com.ford.dts.ro.ElectronicControlUnitRO;

/**
 * @author SKASARLA
 * 
 */
public class ElectronicControlUnitBO extends DtsBaseAuditBO
        implements ElectronicControlUnitRO {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    private String ecuCode;
    private String ecuName;
    private String ecuAcronym;
    private List<ECUCategoryBO> ecuCategoryBOList;
    private List<ECUCategoryRO> ecuCategoryROList;

    public ElectronicControlUnitBO(final String ecuCode) {
        this.ecuCode = ecuCode;
    }

    /**
     * @return the ecuCode
     */
    public String getEcuCode() {
        return this.ecuCode;
    }

    /**
     * @param ecuCode the ecuCode to set
     */
    public void setEcuCode(final String ecuCode) {
        this.ecuCode = ecuCode;
    }

    /**
     * @return the ecuName
     */
    public String getEcuName() {
        return this.ecuName;
    }

    /**
     * @param ecuName the ecuName to set
     */
    public void setEcuName(final String ecuName) {
        this.ecuName = ecuName;
    }

    /**
     * @return the ecuAcronym
     */
    public String getEcuAcronym() {
        return this.ecuAcronym;
    }

    /**
     * @param ecuAcronym the ecuAcronym to set
     */
    public void setEcuAcronym(final String ecuAcronym) {
        this.ecuAcronym = ecuAcronym;
    }

    /**
	 * 
	 */
    public ElectronicControlUnitBO() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see com.ford.it.entity.ro.BaseRO#createPkMap()
     */
    @Override
    public LinkedHashMap<String, ?> createPkMap() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ECUCategoryBO> getEcuCategoryBOList() {
        return ecuCategoryBOList;
    }

    public void setEcuCategoryBOList(final List<ECUCategoryBO> ecuCategoryBOList) {
        this.ecuCategoryBOList = ecuCategoryBOList;
    }

    public List<ECUCategoryRO> getEcuCategoryROList() {
        this.ecuCategoryROList =
                convertList(ECUCategoryRO.class, this.ecuCategoryBOList);
        return ecuCategoryROList;
    }

    public void setEcuCategoryROList(final List<ECUCategoryRO> ecuCategoryROList) {
        this.ecuCategoryROList =
                convertList(ECUCategoryRO.class, this.ecuCategoryBOList);
    }

}
