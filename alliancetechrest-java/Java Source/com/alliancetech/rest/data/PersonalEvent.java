package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * PersonalEvent.java
 * 
 * (c) Alliance Tech 2012.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * jeff		Jan 16, 2012		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * @version Ver # Jan 16, 2012
 * @author jeff <br>
 * Creation Date: Jan 16, 2012 9:25:33 PM
 */
public class PersonalEvent
{
	@SerializedName("description")
	private String description;
	@SerializedName("title")
	private String title;
	@SerializedName("location")
	private String location;
	@SerializedName("endTime")
	private String endTime;
	@SerializedName("startTime")
	private String startTime;
	@SerializedName("date")
	private String date;
	@SerializedName("id")
	private String id;

	/**
     * Gets the date.
     * 
     * @return String
     */
	public String getDate()
	{
		return date;
	}

	/**
     * Gets the description.
     * 
     * @return String
     */
	public String getDescription()
	{
		return description;
	}

	/**
     * Gets the endTime.
     * 
     * @return String
     */
	public String getEndTime()
	{
		return endTime;
	}

	/**
     * Gets the id.
     * 
     * @return String
     */
	public String getId()
	{
		return id;
	}

	/**
     * Gets the location.
     * 
     * @return String
     */
	public String getLocation()
	{
		return location;
	}

	/**
     * Gets the startTime.
     * 
     * @return String
     */
	public String getStartTime()
	{
		return startTime;
	}

	/**
     * Gets the title.
     * 
     * @return String
     */
	public String getTitle()
	{
		return title;
	}

	/**
     * Sets the date.
     * 
     * @param date String
     */
	public void setDate(String date)
	{
		this.date = date;
	}

	/**
     * Sets the description.
     * 
     * @param description String
     */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
     * Sets the endTime.
     * 
     * @param endTime String
     */
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	/**
     * Sets the id.
     * 
     * @param id String
     */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
     * Sets the location.
     * 
     * @param location String
     */
	public void setLocation(String location)
	{
		this.location = location;
	}

	/**
     * Sets the startTime.
     * 
     * @param startTime String
     */
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	/**
     * Sets the title.
     * 
     * @param title String
     */
	public void setTitle(String title)
	{
		this.title = title;
	}

}
