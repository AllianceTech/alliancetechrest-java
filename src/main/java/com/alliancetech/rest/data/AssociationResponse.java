package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

public class AssociationResponse {
    @SerializedName("epc")
    private String epc;

    @SerializedName("index")
    private String index;

    @SerializedName("num")
    private String registrantNum;

    @SerializedName("status")
    private String status;

    public String getEpc() {
        return epc;
    }

    public void setEpc(String epc) {
        this.epc = epc;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRegistrantNum() {
        return registrantNum;
    }

    public void setRegistrantNum(String registrantNum) {
        this.registrantNum = registrantNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AssociationResponse [index=" + index + ", num=" + registrantNum
                + ", epc=" + epc + ", status=" + status + "]";
    }
}