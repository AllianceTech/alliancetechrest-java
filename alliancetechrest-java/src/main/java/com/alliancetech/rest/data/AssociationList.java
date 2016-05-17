package com.alliancetech.rest.data;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/*
 * AssociationList.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Aug 23, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Contains a list of registrants. This can be serialized to JSON
 * 
 * @version Ver 1.0 Aug 23, 2010
 * @author Chris Speir<br>
 * Creation Date: Aug 23, 2010 5:23:17 PM
 */
public class AssociationList
{
	@SerializedName("associationList")
	private ArrayList<Association> associationList = new ArrayList<Association>();
	@SerializedName("lastModified")
	private String lastModified;

	/**
     * Get the last modified timestamp
     * 
     * @return String
     */
	public String getLastModified()
	{
		return lastModified;
	}

	/**
     * Gets the caRegistrantList.
     * 
     * @return ArrayList
     */
	public ArrayList<Association> getAssociationList()
	{
		return associationList;
	}

	/**
     * Set the last modified timestamp.
     * 
     * @param asLastModified String
     */
	public void setLastModified(String asLastModified)
	{
		lastModified = asLastModified;
	}

	/**
     * Sets the caAssociationList.
     * 
     * @param caAssociationList ArrayList
     */
	public void setAssociationList(ArrayList<Association> caAssociationList)
	{
		this.associationList = caAssociationList;
	}
}
