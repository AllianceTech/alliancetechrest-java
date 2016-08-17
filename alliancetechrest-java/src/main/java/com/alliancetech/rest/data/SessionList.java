package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * SessionList.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ -------------------------------------------
 * Chris Speir	Feb 15, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents a list of sessions that can be sent or received over the
 * rest api interface.
 *
 * @author Chris Speir<br>
 *         Creation Date: Feb 15, 2010 11:08:34 AM
 * @version Ver 1.0 Feb 15, 2010
 */
public class SessionList {
    @SerializedName("attrName")
    private ArrayList<String> attrName = new ArrayList<String>();
    @SerializedName("sessionList")
    private ArrayList<Session> carrSessionList = new ArrayList<Session>();

    /**
     * Gets the attrName.
     *
     * @return ArrayList&gt;String&lt;
     */
    public ArrayList<String> getAttrName() {
        return attrName;
    }

    /**
     * Sets the attrName.
     *
     * @param attrName ArrayList&gt;String&lt;
     */
    public void setAttrName(ArrayList<String> attrName) {
        this.attrName = attrName;
    }

    /**
     * Gets the SessionList.
     *
     * @return ArrayList
     */
    public ArrayList<Session> getSessionList() {
        return carrSessionList;
    }

    /**
     * Sets the SessionList.
     *
     * @param sessionList ArrayList
     */
    public void setSessionList(ArrayList<Session> sessionList) {
        carrSessionList = sessionList;
    }

}
