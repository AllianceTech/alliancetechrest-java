package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * DefaultResponse.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Jun 15, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Default JSON rest api response
 *
 * @author Chris Speir<br>
 *         Creation Date: Jun 15, 2010 8:27:15 PM
 * @version Ver 1.0 Jun 15, 2010
 */
public class DefaultResponse {
    @SerializedName("errorCode")
    private String errorCode;
    @SerializedName("status")
    private String status;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DefaultResponse [status=");
        builder.append(status);
        builder.append(", errorCode=");
        builder.append(errorCode);
        builder.append("]");
        return builder.toString();
    }

}
