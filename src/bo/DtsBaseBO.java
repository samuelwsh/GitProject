/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.DtsBaseRO;
import com.ford.it.entity.bo.BaseBO;

/**
 * A BaseBO for DTS application
 * @author SKASARLA
 *
 */
public abstract class DtsBaseBO extends BaseBO implements DtsBaseRO {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.formatPk();
    }
    // Empty base class
}
