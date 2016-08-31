package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * MaterialsRedemptionList.java
 * 
 * (c) Alliance Tech 2013.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Gaspar		Aug 29, 2013		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * TODO Add RegistrantMaterialsRedemptionList Class Description.
 *
 * @author Gaspar <br>
 *         Creation Date: Aug 29, 2013 5:04:10 PM
 * @version Ver # Aug 29, 2013
 */
public class MaterialsRedemptionList {
    @SerializedName("redemptionList")
    private ArrayList<MaterialsRedemption> materialsRedemptionList = new ArrayList<MaterialsRedemption>();

    /**
     * Gets the materialsRedemptionList.
     *
     * @return ArrayList&gt;MaterialRedemption&lt;
     */
    public ArrayList<MaterialsRedemption> getMaterialsRedemptionList() {
        return materialsRedemptionList;
    }

    /**
     * Sets the materialsRedemptionList.
     *
     * @param materialsRedemptionList ArrayList&gt;MaterialRedemption&lt;
     */
    public void setMaterialsRedemptionList(
            ArrayList<MaterialsRedemption> materialsRedemptionList) {
        this.materialsRedemptionList = materialsRedemptionList;
    }
}
