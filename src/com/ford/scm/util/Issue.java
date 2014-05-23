//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.util;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Issue implements Serializable {
    private String issueNum;
    private String transNum;
    private String shortDescription;
    private String submittedBy;
    private long dateSubmitted;

    public Issue() {
    };

    public Issue(final String issueNum, final String transNum,
            final String shortDescription, final String submittedBy,
            final long dateSubmitted) {

        super();
        this.issueNum = issueNum;
        this.transNum = transNum;
        this.shortDescription = shortDescription;
        this.submittedBy = submittedBy;
        this.dateSubmitted = dateSubmitted;
    };

    public String getIssueNum() {
        return this.issueNum;
    }

    public void setIssueNum(final String issueNum) {

        this.issueNum = issueNum;
    }

    public String getTransNum() {
        return this.transNum;
    }

    public void setTransNum(final String transNum) {

        this.transNum = transNum;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(final String shortDescription) {

        this.shortDescription = shortDescription;
    }

    public String getSubmittedBy() {
        return this.submittedBy;
    }

    public void setSubmittedBy(final String submittedBy) {

        this.submittedBy = submittedBy;
    }

    public long getDateSubmitted() {
        return this.dateSubmitted;
    }

    public void setDateSubmitted(final long dateSubmitted) {

        this.dateSubmitted = dateSubmitted;
    }

}
