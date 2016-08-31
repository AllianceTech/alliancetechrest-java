package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * PersonalEventResponse.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Mar 17, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents an error that occured while adding or removing an agenda
 * item.
 *
 * @author Chris Speir<br>
 *         Creation Date: Mar 17, 2010 5:12:10 PM
 * @version Ver 1.0 Mar 17, 2010
 */
public class PersonalEventResponse {
    @SerializedName("errorCode")
    private String errorCode;
    @SerializedName("status")
    private String status;
    @SerializedName("index")
    private String index;
    @SerializedName("id")
    private String id;

    /**
     * Gets the errorCode.
     *
     * @return String
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the errorCode.
     *
     * @param errorCode String
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the id.
     *
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the index.
     *
     * @return String
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the index.
     *
     * @param index String
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * Gets the status.
     *
     * @return String
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status String
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
