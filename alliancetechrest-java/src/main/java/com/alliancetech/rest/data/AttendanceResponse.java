package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * AttendanceResponse
 * 
 * (c) Alliance Tech 2014.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Gaspar		Jul 24, 2014		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * AttendanceResponse Class Description.
 * 
 * @version Ver # Jul 24, 2014
 * @author Gaspar <br>
 * Creation Date: Jul 24, 2014 4:27:09 PM
 */
public class AttendanceResponse
{
	@SerializedName("customerRegistrantId")
	private String customerRegistrantId;
	@SerializedName("customerSessionId")
	private String customerSessionId;
	@SerializedName("didNotAttend")
	private boolean didNotAttend;
	@SerializedName("duration")
	private int duration;
	@SerializedName("epc")
	private String epc;
	@SerializedName("firstScan")
	private String firstScan;
	@SerializedName("lastModified")
	private String lastModified;
	@SerializedName("lastScan")
	private String lastScan;
	@SerializedName("registrantId")
	private String registrantId;
	@SerializedName("registrantNum")
	private String registrantNum;
	@SerializedName("sessionId")
	private String sessionId;
	@SerializedName("sessionNum")
	private String sessionNum;

	/**
	 * Gets the customerRegistrantId.
	 * 
	 * @return String
	 */
	public String getCustomerRegistrantId()
	{
		return customerRegistrantId;
	}

	/**
	 * Gets the customerSessionId.
	 * 
	 * @return String
	 */
	public String getCustomerSessionId()
	{
		return customerSessionId;
	}

	/**
	 * Gets the duration.
	 * 
	 * @return int
	 */
	public int getDuration()
	{
		return duration;
	}

	/**
	 * Gets the epc.
	 * 
	 * @return String
	 */
	public String getEpc()
	{
		return epc;
	}

	/**
	 * Gets the firstScan.
	 * 
	 * @return String
	 */
	public String getFirstScan()
	{
		return firstScan;
	}

	/**
	 * Gets the lastModified.
	 * 
	 * @return String
	 */
	public String getLastModified()
	{
		return lastModified;
	}

	/**
	 * Gets the lastScan.
	 * 
	 * @return String
	 */
	public String getLastScan()
	{
		return lastScan;
	}

	/**
	 * Gets the registrantId.
	 * 
	 * @return String
	 */
	public String getRegistrantId()
	{
		return registrantId;
	}

	/**
	 * Gets the registrantNum.
	 * 
	 * @return String
	 */
	public String getRegistrantNum()
	{
		return registrantNum;
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
	 * Gets the sessionNum.
	 * 
	 * @return String
	 */
	public String getSessionNum()
	{
		return sessionNum;
	}

	/**
	 * Gets the DidNotAttend.
	 * 
	 * @return boolean
	 */
	public boolean isDidNotAttend()
	{
		return didNotAttend;
	}

	/**
	 * Sets the customerRegistrantId.
	 * 
	 * @param customerRegistrantId String
	 */
	public void setCustomerRegistrantId(String customerRegistrantId)
	{
		this.customerRegistrantId = customerRegistrantId;
	}

	/**
	 * Sets the customerSessionId.
	 * 
	 * @param customerSessionId String
	 */
	public void setCustomerSessionId(String customerSessionId)
	{
		this.customerSessionId = customerSessionId;
	}

	/**
	 * Sets the didNotAttend.
	 * 
	 * @param didNotAttend boolean
	 */
	public void setDidNotAttend(boolean didNotAttend)
	{
		this.didNotAttend = didNotAttend;
	}	

	/**
	 * Sets the duration.
	 * 
	 * @param duration int
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	/**
	 * Sets the epc.
	 * 
	 * @param epc String
	 */
	public void setEpc(String epc)
	{
		this.epc = epc;
	}

	/**
	 * Sets the firstScan.
	 * 
	 * @param firstScan String
	 */
	public void setFirstScan(String firstScan)
	{
		this.firstScan = firstScan;
	}

	/**
	 * Sets the lastModified.
	 * 
	 * @param lastModified String
	 */
	public void setLastModified(String lastModified)
	{
		this.lastModified = lastModified;
	}

	/**
	 * Sets the lastScan.
	 * 
	 * @param lastScan String
	 */
	public void setLastScan(String lastScan)
	{
		this.lastScan = lastScan;
	}

	/**
	 * Sets the registrantId.
	 * 
	 * @param registrantId String
	 */
	public void setRegistrantId(String registrantId)
	{
		this.registrantId = registrantId;
	}

	/**
	 * Sets the registrantNum.
	 * 
	 * @param registrantNum String
	 */
	public void setRegistrantNum(String registrantNum)
	{
		this.registrantNum = registrantNum;
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
	 * Sets the sessionNum.
	 * 
	 * @param sessionNum String
	 */
	public void setSessionNum(String sessionNum)
	{
		this.sessionNum = sessionNum;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("ATTENDANCE [customerRegistrantId=");
		builder.append(customerRegistrantId);
		builder.append(", customerSessionId=");
		builder.append(customerSessionId);
		builder.append(", didNotAttend=");
		builder.append(didNotAttend);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", lastmodified=");
		builder.append(lastModified);
		builder.append(", registrantId=");
		builder.append(registrantId);
		builder.append(", registrantNum=");
		builder.append(registrantNum);
		builder.append(", sessionId=");
		builder.append(sessionId);
		builder.append(", sessionNum=");
		builder.append(sessionNum);
		builder.append("]");
		return builder.toString();
	}
}
