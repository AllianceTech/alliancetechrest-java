package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

public class Association {
    @SerializedName("created")
    private String created;
    @SerializedName("epc")
    private String epc;
    @SerializedName("id")
    private String id;
    @SerializedName("kill")
    private Boolean kill;
    @SerializedName("printerName")
    private String printerName;
    @SerializedName("num")
    private String registrantNum;
    @SerializedName("stationName")
    private String stationName;
    @SerializedName("syncstate")
    private int syncstate;
    @SerializedName("synctries")
    private int syncTries;

    /**
     * Gets the created.
     *
     * @return String
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created.
     *
     * @param created String
     */
    public void setCreated(String created) {
        this.created = created;
    }

    public String getEpc() {
        return epc;
    }

    public void setEpc(String epc) {
        this.epc = epc;
    }

    /**
     * Gets the id.
     *
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getKill() {
        return kill;
    }

    public void setKill(Boolean kill) {
        this.kill = kill;
    }

    /**
     * Gets the printerName.
     *
     * @return String
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the printerName.
     *
     * @param printerName String
     */
    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getRegistrantNum() {
        return registrantNum;
    }

    public void setRegistrantNum(String registrantNum) {
        this.registrantNum = registrantNum;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * Gets the syncstate.
     *
     * @return int
     */
    public int getSyncstate() {
        return syncstate;
    }

    /**
     * Sets the syncstate.
     *
     * @param syncstate int
     */
    public void setSyncstate(int syncstate) {
        this.syncstate = syncstate;
    }

    /**
     * Gets the syncTries.
     *
     * @return int
     */
    public int getSyncTries() {
        return syncTries;
    }

    /**
     * Sets the syncTries.
     *
     * @param syncTries int
     */
    public void setSyncTries(int syncTries) {
        this.syncTries = syncTries;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Association [created=");
        builder.append(created);
        builder.append(", epc=");
        builder.append(epc);
        builder.append(", id=");
        builder.append(id);
        builder.append(", kill=");
        builder.append(kill);
        builder.append(", printerName=");
        builder.append(printerName);
        builder.append(", registrantNum=");
        builder.append(registrantNum);
        builder.append(", stationName=");
        builder.append(stationName);
        builder.append(", syncstate=");
        builder.append(syncstate);
        builder.append(", syncTries=");
        builder.append(syncTries);
        builder.append("]");
        return builder.toString();
    }
}
