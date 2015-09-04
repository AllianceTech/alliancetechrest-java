package com.alliancetech.rest.data;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/*
 * RegistrantList.java
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
public class RegistrantList
{
	@SerializedName("attrName")
	private ArrayList<String> attrName = new ArrayList<String>();
	@SerializedName("lastModified")
	private String lastModified;
	@SerializedName("registrantList")
	private ArrayList<Registrant> registrantList = new ArrayList<Registrant>();
	@SerializedName("rfidPrinter")
	private String rfidPrinter;

	/**
	 * Gets the attrName.
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getAttrName()
	{
		return attrName;
	}

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
	public ArrayList<Registrant> getRegistrantList()
	{
		return registrantList;
	}

	/**
	 * Gets the rfidPrinter.
	 * 
	 * @return String
	 */
	public String getRfidPrinter()
	{
		return rfidPrinter;
	}

	/**
	 * Sets the attrName.
	 * 
	 * @param attrName ArrayList<String>
	 */
	public void setAttrName(ArrayList<String> attrName)
	{
		this.attrName = attrName;
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
	 * Sets the caRegistrantList.
	 * 
	 * @param caRegistrantList ArrayList
	 */
	public void setRegistrantList(ArrayList<Registrant> caRegistrantList)
	{
		this.registrantList = caRegistrantList;
	}

	/**
	 * Sets the rfidPrinter.
	 * 
	 * @param rfidPrinter String
	 */
	public void setRfidPrinter(String rfidPrinter)
	{
		this.rfidPrinter = rfidPrinter;
	}
}
