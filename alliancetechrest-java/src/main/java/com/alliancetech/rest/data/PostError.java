package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * PostError.java
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
public class PostError {
    @SerializedName("id")
    private String csId;
    @SerializedName("error")
    private String csError;

    /**
     * Get the agenda item id.
     *
     * @return String
     */
    public String getId() {
        return csId;
    }

    /**
     * Set the agenda item id.
     *
     * @param asId String
     */
    public void setId(String asId) {
        csId = asId;
    }

    /**
     * Get the agenda item error.
     *
     * @return String
     */
    public String getError() {
        return csError;
    }

    /**
     * Set the agenda item error.
     *
     * @param asError String
     */
    public void setError(String asError) {
        csError = asError;
    }
}
