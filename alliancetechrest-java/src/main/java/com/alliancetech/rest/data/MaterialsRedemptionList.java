package com.alliancetech.rest.data;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/*
 * MaterialsRedemptionList.java
 * 
 * (c) Alliance Tech 2013.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Gaspar		Aug 29, 2013		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * TODO Add RegistrantMaterialsRedemptionList Class Description.
 * 
 * @version Ver # Aug 29, 2013
 * @author Gaspar <br>
 * Creation Date: Aug 29, 2013 5:04:10 PM
 */
public class MaterialsRedemptionList
{
	@SerializedName("redemptionList")
	private ArrayList<MaterialsRedemption> materialsRedemptionList = new ArrayList<MaterialsRedemption>();

	/**
	 * Gets the materialsRedemptionList.
	 * 
	 * @return ArrayList<MaterialsRedemption>
	 */
	public ArrayList<MaterialsRedemption> getMaterialsRedemptionList()
	{
		return materialsRedemptionList;
	}

	/**
	 * Sets the materialsRedemptionList.
	 * 
	 * @param materialsRedemptionList ArrayList<MaterialsRedemption>
	 */
	public void setMaterialsRedemptionList(
			ArrayList<MaterialsRedemption> materialsRedemptionList)
	{
		this.materialsRedemptionList = materialsRedemptionList;
	}
}
