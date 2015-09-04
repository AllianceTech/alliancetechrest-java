package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

public class Association
{
	@SerializedName("created")
	private String created;
	@SerializedName("epc")
	private String epc;
	@SerializedName("id")
	private String id;
	@SerializedName("kill")
	private Boolean kill;
	@SerializedName("printerName")
	private String printerName;
	@SerializedName("num")
	private String registrantNum;
	@SerializedName("stationName")
	private String stationName;
	@SerializedName("syncstate")
	private int syncstate;
	@SerializedName("synctries")
	private int syncTries;

	/**
	 * Gets the created.
	 * 
	 * @return String
	 */
	public String getCreated()
	{
		return created;
	}

	public String getEpc()
	{
		return epc;
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

	public Boolean getKill()
	{
		return kill;
	}

	/**
	 * Gets the printerName.
	 * 
	 * @return String
	 */
	public String getPrinterName()
	{
		return printerName;
	}

	public String getRegistrantNum()
	{
		return registrantNum;
	}

	public String getStationName()
	{
		return stationName;
	}

	/**
	 * Gets the syncstate.
	 * 
	 * @return int
	 */
	public int getSyncstate()
	{
		return syncstate;
	}

	/**
	 * Gets the syncTries.
	 * 
	 * @return int
	 */
	public int getSyncTries()
	{
		return syncTries;
	}

	/**
	 * Sets the created.
	 * 
	 * @param created String
	 */
	public void setCreated(String created)
	{
		this.created = created;
	}

	public void setEpc(String epc)
	{
		this.epc = epc;
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

	public void setKill(Boolean kill)
	{
		this.kill = kill;
	}

	/**
	 * Sets the printerName.
	 * 
	 * @param printerName String
	 */
	public void setPrinterName(String printerName)
	{
		this.printerName = printerName;
	}

	public void setRegistrantNum(String registrantNum)
	{
		this.registrantNum = registrantNum;
	}

	public void setStationName(String stationName)
	{
		this.stationName = stationName;
	}

	/**
	 * Sets the syncstate.
	 * 
	 * @param syncstate int
	 */
	public void setSyncstate(int syncstate)
	{
		this.syncstate = syncstate;
	}

	/**
	 * Sets the syncTries.
	 * 
	 * @param syncTries int
	 */
	public void setSyncTries(int syncTries)
	{
		this.syncTries = syncTries;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Association [created=");
		builder.append(created);
		builder.append(", epc=");
		builder.append(epc);
		builder.append(", id=");
		builder.append(id);
		builder.append(", kill=");
		builder.append(kill);
		builder.append(", printerName=");
		builder.append(printerName);
		builder.append(", registrantNum=");
		builder.append(registrantNum);
		builder.append(", stationName=");
		builder.append(stationName);
		builder.append(", syncstate=");
		builder.append(syncstate);
		builder.append(", syncTries=");
		builder.append(syncTries);
		builder.append("]");
		return builder.toString();
	}
}
