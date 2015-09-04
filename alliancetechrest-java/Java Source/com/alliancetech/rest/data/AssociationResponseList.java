package com.alliancetech.rest.data;

/*
 * AssociationResponse.java
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
 * Response to a Association POST.
 * 
 * @version Ver 1.0 Mar 17, 2010
 * @author Chris Speir<br>
 * Creation Date: Mar 17, 2010 5:11:24 PM
 */
public class AssociationResponseList
{
	@SerializedName("associationResponseList")
	private ArrayList<AssociationResponse> associationResponseList = new ArrayList<AssociationResponse>();
	@SerializedName("status")
	private String status;

	/**
	 * Gets the carrResponseList.
	 * 
	 * @return ArrayList
	 */
	public ArrayList<AssociationResponse> getResponseList()
	{
		return associationResponseList;
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
	 * Sets the caErrorList.
	 * 
	 * @param aaResponseList ArrayList
	 */
	public void setResponseList(ArrayList<AssociationResponse> aaResponseList)
	{
		this.associationResponseList = aaResponseList;
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("AssociationResponseList [associationResponseList=");
		builder.append(associationResponseList);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
