package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * PersonalEventList.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Jul 23, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents a list of sessions attended for the purpose of surveys.
 * This object can be converted to JSON and sent over the REST API
 *
 * @author Chris Speir<br>
 *         Creation Date: Jul 23, 2010 10:00:21 AM
 * @version Ver 1.0 Jul 23, 2010
 */
public class PersonalEventList {
    @SerializedName("personalEventList")
    private ArrayList<PersonalEvent> personalEventList = new ArrayList<PersonalEvent>();
    @SerializedName("lastModified")
    private String lastModified;

    /**
     * Gets the lastModified.
     *
     * @return String
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the lastModified.
     *
     * @param lastModified String
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Gets the personalEventList.
     *
     * @return List
     */
    public ArrayList<PersonalEvent> getPersonalEventList() {
        return personalEventList;
    }

    /**
     * Sets the personalEventList.
     *
     * @param personalEventList List
     */
    public void setPersonalEventList(ArrayList<PersonalEvent> personalEventList) {
        this.personalEventList = personalEventList;
    }

}
