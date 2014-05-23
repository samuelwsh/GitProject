//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.rtc.test;

import java.util.Date;

public class SCMChange {

    private String comment;
    private String dateStr;
    private String id;
    private String user;
    private Date date;
    private String name;

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {

        this.comment = comment;
    }

    public String getDateStr() {
        return this.dateStr;
    }

    public void setDateStr(final String dateStr) {

        this.dateStr = dateStr;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(final Date date) {

        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {

        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(final String user) {

        this.user = user;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {

        this.name = name;
    }

}
