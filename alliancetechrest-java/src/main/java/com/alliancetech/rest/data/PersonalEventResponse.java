package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * PersonalEventResponse.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Mar 17, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents an error that occured while adding or removing an agenda
 * item.
 * 
 * @version Ver 1.0 Mar 17, 2010
 * @author Chris Speir<br>
 * Creation Date: Mar 17, 2010 5:12:10 PM
 */
public class PersonalEventResponse
{
	@SerializedName("errorCode")
	private String errorCode;
	@SerializedName("status")
	private String status;
	@SerializedName("index")
	private String index;
	@SerializedName("id")
	private String id;

	/**
     * Gets the errorCode.
     * 
     * @return String
     */
	public String getErrorCode()
	{
		return errorCode;
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
     * Gets the index.
     * 
     * @return String
     */
	public String getIndex()
	{
		return index;
	}

	/**
     * Gets the status.
     * 
     * @return String
     */
	public String getStatus()
	{
		return status;
	}

	/**
     * Sets the errorCode.
     * 
     * @param errorCode String
     */
	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
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
     * Sets the index.
     * 
     * @param index String
     */
	public void setIndex(String index)
	{
		this.index = index;
	}

	/**
     * Sets the status.
     * 
     * @param status String
     */
	public void setStatus(String status)
	{
		this.status = status;
	}

}
