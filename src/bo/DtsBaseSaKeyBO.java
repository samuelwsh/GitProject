// ******************************************************************************
// * Copyright (c) 2010 Ford Motor Company. All Rights Reserved.
// * Original author: Ford Motor Company J2EE Center of Excellence
// *
// * $Workfile:  DtsBaseSaKeyBO.java  $
// * $Revision:   1.0  $
// * $Author:   jburnard  $
// * $Date:   June 05 2012 23:14:18  $
// ******************************************************************************
package com.ford.dts.bo;

import com.ford.it.entity.bo.BaseSaKeyBO;
import com.ford.dts.ro.DtsBaseSaKeyRO;

/**
 * This class Base BO for the JAB application.
 * 
 * @since v. 3.0
 */
public abstract class DtsBaseSaKeyBO extends BaseSaKeyBO
        implements DtsBaseSaKeyRO {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor - No Argument
     */
    public DtsBaseSaKeyBO() {
        super();
    }

    /**
     * Constructor - Primary Key
     * 
     * @param saKey System assigned key.
     */
    public DtsBaseSaKeyBO(final Long saKey) {
        super(saKey);
    }
}