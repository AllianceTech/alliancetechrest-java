package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * AttendanceResponseList.java
 * 
 * (c) Alliance Tech 2014.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Gaspar		Jul 24, 2014		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * AttendanceResponseList Class Description.
 *
 * @author Gaspar <br>
 *         Creation Date: Jul 24, 2014 4:25:02 PM
 * @version Ver # Jul 24, 2014
 */
public class AttendanceResponseList {
    @SerializedName("lastModified")
    private String lastModified;
    @SerializedName("attendance")
    private ArrayList<AttendanceResponse> attendanceResponseList = new ArrayList<AttendanceResponse>();

    /**
     * Gets the AttendanceResponse List.
     *
     * @return ArrayList
     */
    public ArrayList<AttendanceResponse> getAttendanceResponseList() {
        return attendanceResponseList;
    }

    /**
     * Sets the AttendanceResponseList.
     *
     * @param caAttendanceResponseList ArrayList
     */
    public void setAttendanceResponseList(ArrayList<AttendanceResponse> caAttendanceResponseList) {
        attendanceResponseList = caAttendanceResponseList;
    }

    /**
     * Gets the lastModified.
     *
     * @return String
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the lastModified.
     *
     * @param lastModified String
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}
