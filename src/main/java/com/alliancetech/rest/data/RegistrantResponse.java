package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * RegistrantResponse.java
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
public class RegistrantResponse {
    @SerializedName("num")
    private String registrantNum;
    @SerializedName("errorCode")
    private String errorCode;
    @SerializedName("index")
    private String index;
    @SerializedName("status")
    private String status;
    @SerializedName("id")
    private String registrantId;

    /**
     * Gets the registrantNum.
     *
     * @return String
     */
    public String getRegistrantNum() {
        return registrantNum;
    }

    /**
     * Sets the registrantNum.
     *
     * @param registrantNum String
     */
    public void setRegistrantNum(String registrantNum) {
        this.registrantNum = registrantNum;
    }

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

    /**
     * Gets the registrantId.
     *
     * @return String
     */
    public String getRegistrantId() {
        return registrantId;
    }

    /**
     * Sets the registrantId.
     *
     * @param registrantId String
     */
    public void setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RegistrantResponse [index=" + index + ", num=" + registrantNum
                + ", id=" + registrantId + ", status=" + status + ", errorCode="
                + errorCode + "]";
    }
}
