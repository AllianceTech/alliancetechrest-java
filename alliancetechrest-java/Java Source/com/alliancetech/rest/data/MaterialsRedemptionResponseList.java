package com.alliancetech.rest.data;

/*
 * PostResponse.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Mar 17, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Response to a post of an array of data.
 * 
 * @version Ver 1.0 Mar 17, 2010
 * @author Chris Speir<br>
 * Creation Date: Mar 17, 2010 5:11:24 PM
 */
public class MaterialsRedemptionResponseList
{
	@SerializedName("redemptionErrorList")
	private ArrayList<PostError> caPostErrorList = new ArrayList<PostError>();
	@SerializedName("errorCode")
	private String csErrorCode;
	@SerializedName("status")
	private String csStatus;

	/**
	 * Add an My Agenda error to the list.
	 * 
	 * @param aaPostError PostError
	 */
	public void add(PostError aaPostError)
	{
		caPostErrorList.add(aaPostError);
	}

	/**
	 * Get error code.
	 * 
	 * @return String
	 */
	public String getErrorCode()
	{
		return csErrorCode;
	}

	/**
	 * Gets the caPostErrorList.
	 * 
	 * @return ArrayList<PostError>
	 */
	public ArrayList<PostError> getPostErrorList()
	{
		return caPostErrorList;
	}

	/**
	 * Get status.
	 * 
	 * @return String
	 */
	public String getStatus()
	{
		return csStatus;
	}

	/**
	 * Set error code.
	 * 
	 * @param asErrorCode String
	 */
	public void setErrorCode(String asErrorCode)
	{
		csErrorCode = asErrorCode;
	}

	/**
	 * Sets the caPostErrorList.
	 * 
	 * @param caPostErrorList ArrayList<PostError>
	 */
	public void setPostErrorList(ArrayList<PostError> caPostErrorList)
	{
		this.caPostErrorList = caPostErrorList;
	}

	/**
	 * Set status.
	 * 
	 * @param asStatus String
	 */
	public void setStatus(String asStatus)
	{
		csStatus = asStatus;
	}
}
