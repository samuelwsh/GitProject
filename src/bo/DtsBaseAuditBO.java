/**
 * 
 */
package com.ford.dts.bo;

import com.ford.dts.ro.DtsBaseAuditRO;
import com.ford.it.entity.bo.BaseAuditBO;

/**
 * This class Base BO for the DTS application.
 * @author SKASARLA
 *
 */
public abstract class DtsBaseAuditBO extends BaseAuditBO implements DtsBaseAuditRO {
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
    // Empty Class.

}
