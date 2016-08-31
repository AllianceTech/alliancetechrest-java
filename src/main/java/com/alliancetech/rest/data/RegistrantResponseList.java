package com.alliancetech.rest.data;

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

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Response to a my agenda POST.
 *
 * @author Chris Speir<br>
 *         Creation Date: Mar 17, 2010 5:11:24 PM
 * @version Ver 1.0 Mar 17, 2010
 */
public class RegistrantResponseList {
    @SerializedName("registrantResponseList")
    private ArrayList<RegistrantResponse> registrantResponseList = new ArrayList<RegistrantResponse>();

    /**
     * Gets the carrResponseList.
     *
     * @return ArrayList
     */
    public ArrayList<RegistrantResponse> getResponseList() {
        return registrantResponseList;
    }

    /**
     * Sets the caErrorList.
     *
     * @param aaResponseList ArrayList
     */
    public void setResponseList(ArrayList<RegistrantResponse> aaResponseList) {
        this.registrantResponseList = aaResponseList;
    }
}
