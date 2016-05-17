package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * Attribute.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ -------------------------------------------
 * Chris Speir	Feb 14, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents an attribute which consists of a name and a value.
 * 
 * @version Ver 1.0 Feb 14, 2010
 * @author Chris Speir<br>
 * Creation Date: Feb 14, 2010 8:04:17 PM
 */
public class Attribute
{
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("val")
	private String val;

	/**
     * @param name
     * @param val
     */
	public Attribute(String name, String val)
	{
		super();
		this.name = name;
		this.val = val;
	}

	/**
	 * default constructor in order to serialize with jackson-json
	 * see http://stackoverflow.com/questions/7625783/jsonmappingexception-no-suitable-constructor-found-for-type-simple-type-class
	 */
	public Attribute() {

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
     * Gets the name.
     * 
     * @return String
     */
	public String getName()
	{
		return name;
	}

	/**
     * Gets the val.
     * 
     * @return String
     */
	public String getVal()
	{
		return val;
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
     * Sets the name.
     * 
     * @param name String
     */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
     * Sets the val.
     * 
     * @param val String
     */
	public void setVal(String val)
	{
		this.val = val;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Attribute [id=" + id + ", name=" + name
				+ ", val=" + val + "]";
	}
}
