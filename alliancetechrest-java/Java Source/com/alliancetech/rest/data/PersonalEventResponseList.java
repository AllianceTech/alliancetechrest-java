package com.alliancetech.rest.data;

/*
 * PersonalEventResponseList.java
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
 * Response to a my agenda POST.
 * 
 * @version Ver 1.0 Mar 17, 2010
 * @author Chris Speir<br>
 * Creation Date: Mar 17, 2010 5:11:24 PM
 */
public class PersonalEventResponseList
{
	@SerializedName("personalEventResponseList")
	private ArrayList<PersonalEventResponse> personalEventResponseList = new ArrayList<PersonalEventResponse>();

	/**
     * Gets the personalEventResponseList.
     * 
     * @return ArrayList
     */
	public ArrayList<PersonalEventResponse> getPersonalEventResponseList()
	{
		return personalEventResponseList;
	}

	/**
     * Sets the personalEventResponseList.
     * 
     * @param personalEventResponseList ArrayList
     */
	public void setPersonalEventResponseList(ArrayList<PersonalEventResponse> personalEventResponseList)
	{
		this.personalEventResponseList = personalEventResponseList;
	}

}
