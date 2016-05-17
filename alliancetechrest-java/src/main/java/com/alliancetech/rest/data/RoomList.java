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

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * A list of rooms that can be serialized to JSON
 * 
 * @version Ver 1.0 February 2, 2016
 * @author John Ralph <br>
 * Creation Date: February 2, 2016 10:38:52 PM
 */
public class RoomList
{
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
	public String getLastModified()
	{
		return csLastModified;
	}

	/**
     * Gets the Room List.
     * 
     * @return ArrayList
     */
	public ArrayList<Room> getRoomList()
	{
		return caRoomList;
	}

	/**
     * Set the last modified.
     * 
     * @param asLastModified String
     */
	public void setLastModified(String asLastModified)
	{
		csLastModified = asLastModified;
	}

	/**
     * Sets the caRoomList.
     * 
     * @param caRoomList ArrayList
     */
	public void setRoomList(ArrayList<Room> roomList)
	{
		caRoomList = roomList;
	}
}
