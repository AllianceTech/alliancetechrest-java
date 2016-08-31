package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/*
 * Room.java
 * 
 * (c) Alliance Tech 2016.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		       Description
 * ------------ ----------------   -------------------------------------
 * John Ralph	February 2, 2016   Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Room Data.
 *
 * @author John Ralph <br>
 *         Creation Date: February 2, 2016 10:38:52 PM
 * @version Ver 1.0 February 2, 2016
 */
public class Room {
    @SerializedName("attrList")
    private List<Attribute> caAttributes = new ArrayList<Attribute>();

    @SerializedName("capacity")
    private int ciOrder; // Capacity

    @SerializedName("attributeId")
    private String csAttributeId;

    @SerializedName("descr")
    private String csDescr;

    @SerializedName("lastModified")
    private String csLastModified;

    @SerializedName("name")
    private String csName;

    /**
     * Gets the attributeId.
     *
     * @return String
     */
    public String getAttributeId() {
        return csAttributeId;
    }

    /**
     * Sets the Attribute Id.
     *
     * @param attributeId String
     */
    public void setAttributeId(String attributeId) {
        csAttributeId = attributeId;
    }

    /**
     * Get the list of attributes.
     *
     * @return List&gt;Attribute&lt;
     */
    public List<Attribute> getAttributes() {
        return caAttributes;
    }

    /**
     * Sets the Attributes.
     *
     * @param attributes List&gt;Attribute&lt;
     */
    public void setAttributes(List<Attribute> attributes) {
        caAttributes = attributes;
    }

    /**
     * Gets the descr.
     *
     * @return String
     */
    public String getDescr() {
        return csDescr;
    }

    /**
     * Sets the Descr.
     *
     * @param descr String
     */
    public void setDescr(String descr) {
        csDescr = descr;
    }

    /**
     * Gets the lastModified.
     *
     * @return String
     */
    public String getLastModified() {
        return csLastModified;
    }

    /**
     * Sets the Last Modified.
     *
     * @param lastModified String
     */
    public void setLastModified(String lastModified) {
        csLastModified = lastModified;
    }

    /**
     * Gets the name.
     *
     * @return String
     */
    public String getName() {
        return csName;
    }

    /**
     * Sets the Name.
     *
     * @param name String
     */
    public void setName(String name) {
        csName = name;
    }

    /**
     * Gets the capacity.
     *
     * @return int
     */
    public int getOrder() {
        return ciOrder;
    }

    /**
     * Sets the Order.
     *
     * @param order int
     */
    public void setOrder(int order) {
        ciOrder = order;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String lsAttrs = "";

        for (int i = 0; caAttributes != null && i < caAttributes.size(); i++) {
            lsAttrs += " " + caAttributes.get(i).toString();
        }
        StringBuilder builder = new StringBuilder();
        builder.append("ROOM [attributeid=");
        builder.append(csAttributeId);
        builder.append(", descr=");
        builder.append(csDescr);
        builder.append(", lastmodified=");
        builder.append(csLastModified);
        builder.append(", name=");
        builder.append(csName);
        builder.append(lsAttrs.equals("") ? "" : "," + lsAttrs);
        builder.append("]");
        return builder.toString();
    }
}
