//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.rtc.test;

public class RTCSnapshot extends SCMChange {

    private String baselineUUID;

    public String getBaselineUUID() {
        return this.baselineUUID;
    }

    public void setBaselineUUID(final String baselineUUID) {

        this.baselineUUID = baselineUUID;
    }

}
