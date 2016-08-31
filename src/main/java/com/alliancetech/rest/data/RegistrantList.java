package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * RegistrantList.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Aug 23, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Contains a list of registrants. This can be serialized to JSON
 *
 * @author Chris Speir<br>
 *         Creation Date: Aug 23, 2010 5:23:17 PM
 * @version Ver 1.0 Aug 23, 2010
 */
public class RegistrantList {
    @SerializedName("attrName")
    private ArrayList<String> attrName = new ArrayList<String>();
    @SerializedName("lastModified")
    private String lastModified;
    @SerializedName("registrantList")
    private ArrayList<Registrant> registrantList = new ArrayList<Registrant>();
    @SerializedName("rfidPrinter")
    private String rfidPrinter;

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
     * Get the last modified timestamp
     *
     * @return String
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Set the last modified timestamp.
     *
     * @param asLastModified String
     */
    public void setLastModified(String asLastModified) {
        lastModified = asLastModified;
    }

    /**
     * Gets the caRegistrantList.
     *
     * @return ArrayList&gt;Registrant&lt;
     */
    public ArrayList<Registrant> getRegistrantList() {
        return registrantList;
    }

    /**
     * Sets the caRegistrantList.
     *
     * @param caRegistrantList ArrayList
     */
    public void setRegistrantList(ArrayList<Registrant> caRegistrantList) {
        this.registrantList = caRegistrantList;
    }

    /**
     * Gets the rfidPrinter.
     *
     * @return String
     */
    public String getRfidPrinter() {
        return rfidPrinter;
    }

    /**
     * Sets the rfidPrinter.
     *
     * @param rfidPrinter String
     */
    public void setRfidPrinter(String rfidPrinter) {
        this.rfidPrinter = rfidPrinter;
    }
}
