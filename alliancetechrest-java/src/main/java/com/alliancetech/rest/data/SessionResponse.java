package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * RegistrantResponse.java
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
public class SessionResponse
{
	@SerializedName("index")
	private String index;
	@SerializedName("sessionId")
	private String sessionId;
	@SerializedName("status")
	private String status;
	@SerializedName("errorCode")
	private String errorCode;

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
     * Gets the index.
     * 
     * @return String
     */
	public String getIndex()
	{
		return index;
	}

	/**
     * Gets the sessionId.
     * 
     * @return String
     */
	public String getSessionId()
	{
		return sessionId;
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
     * Sets the index.
     * 
     * @param index String
     */
	public void setIndex(String index)
	{
		this.index = index;
	}

	/**
     * Sets the sessionId.
     * 
     * @param sessionId String
     */
	public void setSessionId(String sessionId)
	{
		this.sessionId = sessionId;
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
