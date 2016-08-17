package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * MaterialAttr.java
 * 
 * (c) Alliance Tech 2013.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Gaspar		Sep 9, 2013		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * MaterialAttr Class
 *
 * @author Gaspar <br>
 *         Creation Date: Sep 9, 2013 4:54:37 PM
 * @version Ver # Sep 9, 2013
 */
public class MaterialAttr {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    /**
     */
    public MaterialAttr() {
        super();
    }

    /**
     * @param asName Name
     */
    public MaterialAttr(String asName) {
        this(null, asName);
    }

    /**
     * @param asId   ID
     * @param asName Name
     */
    public MaterialAttr(String asId, String asName) {
        super();
        this.id = asId;
        this.name = asName;
    }

    /**
     * Gets the Id.
     *
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the Id.
     *
     * @param asId String
     */
    public void setId(String asId) {
        this.id = asId;
    }

    /**
     * Gets the Name.
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Name.
     *
     * @param asName String
     */
    public void setName(String asName) {
        this.name = asName;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MaterialAttr [Id=");
        builder.append(id);
        builder.append(", Name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}
