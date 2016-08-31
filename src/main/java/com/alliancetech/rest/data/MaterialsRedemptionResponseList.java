package com.alliancetech.rest.data;

/*
 * PostResponse.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Mar 17, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Response to a post of an array of data.
 *
 * @author Chris Speir<br>
 *         Creation Date: Mar 17, 2010 5:11:24 PM
 * @version Ver 1.0 Mar 17, 2010
 */
public class MaterialsRedemptionResponseList {
    @SerializedName("redemptionErrorList")
    private ArrayList<PostError> caPostErrorList = new ArrayList<PostError>();
    @SerializedName("errorCode")
    private String csErrorCode;
    @SerializedName("status")
    private String csStatus;

    /**
     * Add an My Agenda error to the list.
     *
     * @param aaPostError PostError
     */
    public void add(PostError aaPostError) {
        caPostErrorList.add(aaPostError);
    }

    /**
     * Get error code.
     *
     * @return String
     */
    public String getErrorCode() {
        return csErrorCode;
    }

    /**
     * Set error code.
     *
     * @param asErrorCode String
     */
    public void setErrorCode(String asErrorCode) {
        csErrorCode = asErrorCode;
    }

    /**
     * Gets the caPostErrorList.
     *
     * @return ArrayList&gt;PostError&lt;
     */
    public ArrayList<PostError> getPostErrorList() {
        return caPostErrorList;
    }

    /**
     * Sets the caPostErrorList.
     *
     * @param caPostErrorList ArrayList&gt;PostError&lt;
     */
    public void setPostErrorList(ArrayList<PostError> caPostErrorList) {
        this.caPostErrorList = caPostErrorList;
    }

    /**
     * Get status.
     *
     * @return String
     */
    public String getStatus() {
        return csStatus;
    }

    /**
     * Set status.
     *
     * @param asStatus String
     */
    public void setStatus(String asStatus) {
        csStatus = asStatus;
    }
}
