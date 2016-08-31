package com.alliancetech.rest.data;

/*
 * RoomList.java
 * 
 * (c) Alliance Tech 2016.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		       Description
 * ------------ ----------------   -------------------------------------
 * John Ralph	February 2, 2016   Created Class.
 * ---------------------------------------------------------------------
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * A list of rooms that can be serialized to JSON
 *
 * @author John Ralph <br>
 *         Creation Date: February 2, 2016 10:38:52 PM
 * @version Ver 1.0 February 2, 2016
 */
public class RoomList {
    @SerializedName("lastModified")
    @Expose
    private String csLastModified;
    @SerializedName("roomList")
    @Expose
    private ArrayList<Room> caRoomList = new ArrayList<Room>();

    /**
     * Get last modified.
     *
     * @return String
     */
    public String getLastModified() {
        return csLastModified;
    }

    /**
     * Set the last modified.
     *
     * @param asLastModified String
     */
    public void setLastModified(String asLastModified) {
        csLastModified = asLastModified;
    }

    /**
     * Gets the Room List.
     *
     * @return ArrayList
     */
    public ArrayList<Room> getRoomList() {
        return caRoomList;
    }

    /**
     * Sets the caRoomList.
     *
     * @param roomList ArrayList
     */
    public void setRoomList(ArrayList<Room> roomList) {
        caRoomList = roomList;
    }
}
