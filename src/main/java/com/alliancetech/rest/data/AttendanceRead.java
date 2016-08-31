package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gguerra on 8/2/16.
 */
public class AttendanceRead {
    @SerializedName("antennaId")
    private Integer antennaId;
    @SerializedName("direction")
    private Integer direction;
    @SerializedName("status")
    private Integer status;
    @SerializedName("epc")
    private String epc;
    @SerializedName("id")
    private String id;
    @SerializedName("ipAddress")
    private String ipAddress;
    @SerializedName("readTimestamp")
    private String readTimestamp;
    @SerializedName("registrantId")
    private String registrantId;
    @SerializedName("registrantNum")
    private String registrantNum;
    @SerializedName("sessionId")
    private String sessionId;
    @SerializedName("sessionNum")
    private String sessionNum;
    @SerializedName("zone")
    private String zone;
    @SerializedName("rooms")
    private List<String> rooms = new ArrayList<String>();
    @SerializedName("reject")
    private Boolean reject;

    public Integer getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(Integer antennaId) {
        this.antennaId = antennaId;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEpc() {
        return epc;
    }

    public void setEpc(String epc) {
        this.epc = epc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getReadTimestamp() {
        return readTimestamp;
    }

    public void setReadTimestamp(String readTimestamp) {
        this.readTimestamp = readTimestamp;
    }

    public String getRegistrantId() {
        return registrantId;
    }

    public void setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
    }

    public String getRegistrantNum() {
        return registrantNum;
    }

    public void setRegistrantNum(String registrantNum) {
        this.registrantNum = registrantNum;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(String sessionNum) {
        this.sessionNum = sessionNum;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public Boolean getReject() {
        return reject;
    }

    public void setReject(Boolean reject) {
        this.reject = reject;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttendanceRead{");
        sb.append("antennaId=").append(antennaId);
        sb.append(", direction=").append(direction);
        sb.append(", status=").append(status);
        sb.append(", epc='").append(epc).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", ipAddress='").append(ipAddress).append('\'');
        sb.append(", readTimestamp='").append(readTimestamp).append('\'');
        sb.append(", registrantId='").append(registrantId).append('\'');
        sb.append(", registrantNum='").append(registrantNum).append('\'');
        sb.append(", sessionId='").append(sessionId).append('\'');
        sb.append(", sessionNum='").append(sessionNum).append('\'');
        sb.append(", zone='").append(zone).append('\'');
        sb.append(", rooms=").append(rooms);
        sb.append(", reject=").append(reject);
        sb.append('}');
        return sb.toString();
    }
}