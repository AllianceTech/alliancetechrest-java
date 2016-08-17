package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.Vector;

/*
 * RegistrantMaterialsRedemption.java
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
 * T RegistrantMaterialsRedemption
 *
 * @author Gaspar <br>
 *         Creation Date: Aug 29, 2013 4:37:25 PM
 * @version Ver # Aug 29, 2013
 */
public class MaterialsRedemption {
    @SerializedName("deleted")
    private boolean deleted;
    @SerializedName("customerId")
    private String customerRegistrantId;
    @SerializedName("deviceName")
    private String deviceName;
    @SerializedName("id")
    private String id;
    @SerializedName("location")
    private String location;
    @SerializedName("locationId")
    private String locationId;
    @SerializedName("redemptionTimestamp")
    private String redemptionTimestamp;
    @SerializedName("registrantId")
    private String registrantId;
    @SerializedName("num")
    private String registrantNumber;
    @SerializedName("surveyId")
    private String surveyId;
    @SerializedName("materialsList")
    private Vector<MaterialAttr> materials = new Vector<MaterialAttr>();

    /**
     */
    public MaterialsRedemption() {
        super();
    }

    public void addMaterial(String asId, String asName) {
        if (this.getMaterials() == null) {
            this.setMaterials(new Vector<MaterialAttr>());
        }
        this.getMaterials().add(new MaterialAttr(asId, asName));
    }

    /**
     * Gets the CustomerRegistrantId.
     *
     * @return String
     */
    public String getCustomerRegistrantId() {
        return customerRegistrantId;
    }

    /**
     * Sets the CustomerRegistrantId.
     *
     * @param customerRegistrantId String
     */
    public void setCustomerRegistrantId(String customerRegistrantId) {
        this.customerRegistrantId = customerRegistrantId;
    }

    /**
     * Gets the csDeviceName.
     *
     * @return String
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the csDeviceName.
     *
     * @param csDeviceName String
     */
    public void setDeviceName(String csDeviceName) {
        this.deviceName = csDeviceName;
    }

    /**
     * Gets the csId.
     *
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the csId.
     *
     * @param csId String
     */
    public void setId(String csId) {
        this.id = csId;
    }

    /**
     * Gets the Location.
     *
     * @return String
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the Location.
     *
     * @param location String
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the csLocationId.
     *
     * @return String
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the csLocationId.
     *
     * @param csLocationId String
     */
    public void setLocationId(String csLocationId) {
        this.locationId = csLocationId;
    }

    /**
     * Gets the chtMaterials.
     *
     * @return Vector<MaterialAttr>
     */
    public Vector<MaterialAttr> getMaterials() {
        return materials;
    }

    /**
     * Sets the chtMaterials.
     *
     * @param avMaterials Vector<MaterialAttr>
     */
    public void setMaterials(Vector<MaterialAttr> avMaterials) {
        this.materials = avMaterials;
    }

    /**
     * Gets the csRedemptionTimestamp.
     *
     * @return String
     */
    public String getRedemptionTimestamp() {
        return redemptionTimestamp;
    }

    /**
     * Sets the csRedemptionTimestamp.
     *
     * @param csRedemptionTimestamp String
     */
    public void setRedemptionTimestamp(String csRedemptionTimestamp) {
        this.redemptionTimestamp = csRedemptionTimestamp;
    }

    /**
     * Gets the csRegistrantId.
     *
     * @return String
     */
    public String getRegistrantId() {
        return registrantId;
    }

    /**
     * Sets the csRegistrantId.
     *
     * @param csRegistrantId String
     */
    public void setRegistrantId(String csRegistrantId) {
        this.registrantId = csRegistrantId;
    }

    /**
     * Gets the RegistrantNumber.
     *
     * @return String
     */
    public String getRegistrantNumber() {
        return registrantNumber;
    }

    /**
     * Sets the RegistrantNumber.
     *
     * @param registrantNumber String
     */
    public void setRegistrantNumber(String registrantNumber) {
        this.registrantNumber = registrantNumber;
    }

    /**
     * Retrieves the SurveyId
     *
     * @return String
     */
    public String getSurveyId() {
        return surveyId;
    }

    /**
     * Sets the Survey Id
     *
     * @param asSurveyId
     */
    public void setSurveyId(String asSurveyId) {
        this.surveyId = asSurveyId;
    }

    /**
     * Gets the cbDeleted.
     *
     * @return boolean
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the cbDeleted.
     *
     * @param cbDeleted boolean
     */
    public void setDeleted(boolean cbDeleted) {
        this.deleted = cbDeleted;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RegistrantMaterialsRedemption [isDeleted()=");
        builder.append(isDeleted());
        builder.append(", getDeviceName()=");
        builder.append(getDeviceName());
        builder.append(", getLocationId()=");
        builder.append(getLocationId());
        builder.append(", getId()=");
        builder.append(getId());
        builder.append(", getRedemptionTimestamp()=");
        builder.append(getRedemptionTimestamp());
        builder.append(", getRegistrantId()=");
        builder.append(getRegistrantId());
        builder.append(", getMaterials()=");
        builder.append(getMaterials());
        builder.append("]");
        return builder.toString();
    }

}
