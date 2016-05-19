package com.alliancetech.rest.data;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/*
 * ImageList.java
 * 
 * (c) Alliance Tech 2011.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Jeff S.		04/27/2015	Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * The RESTAPI object for image list data.
 * 
 * @version Ver 4.0
 * @author Jeff Seifert<br>
 * Creation Date: 04/27/2015 14:50
 */
public class ImageList
{
	@SerializedName("imageList")
	private ArrayList<Image> imageList = new ArrayList<Image>();
	@SerializedName("lastModified")
	private String lastModified;

	/**
	 * Add an RegistrantCheckin to the list
	 * 
	 * @param aaRegistrantCheckin RegistrantCheckin
	 */
	public void add(Image aaImage)
	{
		imageList.add(aaImage);
	}

	/**
	 * Gets the Image List.
	 * 
	 * @return ArrayList<Image>
	 */
	public ArrayList<Image> getImageList()
	{
		return imageList;
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
	 * Sets the Image list.
	 * 
	 * @param aaImageList ArrayList<Image>
	 */
	public void setImageList(ArrayList<Image> aaImageList)
	{
		this.imageList = aaImageList;
	}

	/**
	 * Set the last modified timestamp.
	 * 
	 * @param asLastModified String
	 */
	public void setLastModified(String asLastModified)
	{
		this.lastModified = asLastModified;
	}

	/**
	 * Get ImageList size.
	 * 
	 * @return int
	 */
	public int size()
	{
		return imageList.size();
	}
}