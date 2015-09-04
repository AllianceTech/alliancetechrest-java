package com.alliancetech.rest.data;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/*
 * Session.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ -------------------------------------------
 * Chris Speir	Feb 12, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents a Session that can be sent or received over the rest api
 * interface.
 * 
 * @version Ver 1.0 Feb 12, 2010
 * @author Chris Speir<br>
 * Creation Date: Feb 12, 2010 2:32:41 PM
 */
public class Session
{
	@SerializedName("active")
	private boolean active;
	@SerializedName("additionalInfo1")
	private String additionalInfo1;
	@SerializedName("additionalInfo2")
	private String additionalInfo2;
	@SerializedName("additionalInfo3")
	private String additionalInfo3;
	@SerializedName("additionalInfo4")
	private String additionalInfo4;
	@SerializedName("additionalInfo5")
	private String additionalInfo5;
	@SerializedName("attrList")
	private ArrayList<Attribute> attrList = new ArrayList<Attribute>();
	@SerializedName("capacity")
	private String capacity;
	@SerializedName("customerId")
	private String customerSessionId;
	@SerializedName("date")
	private String date;
	@SerializedName("desc")
	private String description;
	@SerializedName("end")
	private String endTime;
	@SerializedName("enrollable")
	private boolean enrollable;
	@SerializedName("keywords")
	private String keywords;
	@SerializedName("location")
	private String location;
	@SerializedName("room")
	private String room;
	@SerializedName("scanEnd")
	private String scanEndTime;
	@SerializedName("scanStart")
	private String scanStartTime;
	@SerializedName("id")
	private String sessionId;
	@SerializedName("num")
	private String sessionNumber;
	@SerializedName("sessionRole")
	private String sessionRole;
	@SerializedName("shortTitle")
	private String shortTitle;
	@SerializedName("start")
	private String startTime;
	@SerializedName("status")
	private String simStatus;
	@SerializedName("submissionNum")
	private int submissionNumber;
	@SerializedName("survey")
	private String survey;
	@SerializedName("title")
	private String title;

	/**
	 * Gets the additionalInfo1.
	 * 
	 * @return String
	 */
	public String getAdditionalInfo1()
	{
		return additionalInfo1;
	}

	/**
	 * Gets the additionalInfo2.
	 * 
	 * @return String
	 */
	public String getAdditionalInfo2()
	{
		return additionalInfo2;
	}

	/**
	 * Gets the additionalInfo3.
	 * 
	 * @return String
	 */
	public String getAdditionalInfo3()
	{
		return additionalInfo3;
	}

	/**
	 * Gets the additionalInfo4.
	 * 
	 * @return String
	 */
	public String getAdditionalInfo4()
	{
		return additionalInfo4;
	}

	/**
	 * Gets the additionalInfo5.
	 * 
	 * @return String
	 */
	public String getAdditionalInfo5()
	{
		return additionalInfo5;
	}

	/**
	 * Gets the attrList.
	 * 
	 * @return ArrayList
	 */
	public ArrayList<Attribute> getAttrList()
	{
		return attrList;
	}

	/**
	 * Gets the capacity.
	 * 
	 * @return String
	 */
	public String getCapacity()
	{
		return capacity;
	}

	/**
	 * Gets the CustomerSessionId.
	 * 
	 * @return String
	 */
	public String getCustomerSessionId()
	{
		return customerSessionId;
	}

	/**
	 * Gets the date.
	 * 
	 * @return String
	 */
	public String getDate()
	{
		return date;
	}

	/**
	 * Gets the description.
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Gets the endTime.
	 * 
	 * @return String
	 */
	public String getEndTime()
	{
		return endTime;
	}

	/**
	 * Gets the keywords.
	 * 
	 * @return String
	 */
	public String getKeywords()
	{
		return keywords;
	}

	/**
	 * Gets the location.
	 * 
	 * @return String
	 */
	public String getLocation()
	{
		return location;
	}

	/**
	 * Gets the room.
	 * 
	 * @return String
	 */
	public String getRoom()
	{
		return room;
	}

	/**
	 * Gets the scanEndTime.
	 * 
	 * @return String
	 */
	public String getScanEndTime()
	{
		return scanEndTime;
	}

	/**
	 * Gets the scanStartTime.
	 * 
	 * @return String
	 */
	public String getScanStartTime()
	{
		return scanStartTime;
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
	 * Gets the sessionNumber.
	 * 
	 * @return String
	 */
	public String getSessionNumber()
	{
		return sessionNumber;
	}

	/**
	 * Gets the sessionRole.
	 * 
	 * @return String
	 */
	public String getSessionRole()
	{
		return sessionRole;
	}

	/**
	 * Gets the shortTitle.
	 * 
	 * @return String
	 */
	public String getShortTitle()
	{
		return shortTitle;
	}

	/**
	 * Gets the startTime.
	 * 
	 * @return String
	 */
	public String getStartTime()
	{
		return startTime;
	}

	/**
	 * Gets the simStatus.
	 * 
	 * @return String
	 */
	public String getSimStatus()
	{
		return simStatus;
	}

	/**
	 * Gets the submissionNumber.
	 * 
	 * @return int
	 */
	public int getSubmissionNumber()
	{
		return submissionNumber;
	}

	/**
	 * Gets the survey.
	 * 
	 * @return String
	 */
	public String getSurvey()
	{
		return survey;
	}

	/**
	 * Gets the title.
	 * 
	 * @return String
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Gets the active.
	 * 
	 * @return boolean
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Gets the enrollable.
	 * 
	 * @return boolean
	 */
	public boolean isEnrollable()
	{
		return enrollable;
	}

	/**
	 * Sets the active.
	 * 
	 * @param active boolean
	 */
	public void setActive(boolean active)
	{
		this.active = active;
	}

	/**
	 * Sets the additionalInfo1.
	 * 
	 * @param additionalInfo1 String
	 */
	public void setAdditionalInfo1(String additionalInfo1)
	{
		this.additionalInfo1 = additionalInfo1;
	}

	/**
	 * Sets the additionalInfo2.
	 * 
	 * @param additionalInfo2 String
	 */
	public void setAdditionalInfo2(String additionalInfo2)
	{
		this.additionalInfo2 = additionalInfo2;
	}

	/**
	 * Sets the additionalInfo3.
	 * 
	 * @param additionalInfo3 String
	 */
	public void setAdditionalInfo3(String additionalInfo3)
	{
		this.additionalInfo3 = additionalInfo3;
	}

	/**
	 * Sets the additionalInfo4.
	 * 
	 * @param additionalInfo4 String
	 */
	public void setAdditionalInfo4(String additionalInfo4)
	{
		this.additionalInfo4 = additionalInfo4;
	}

	/**
	 * Sets the additionalInfo5.
	 * 
	 * @param additionalInfo5 String
	 */
	public void setAdditionalInfo5(String additionalInfo5)
	{
		this.additionalInfo5 = additionalInfo5;
	}

	/**
	 * Sets the attrList.
	 * 
	 * @param attrList ArrayList
	 */
	public void setAttrList(ArrayList<Attribute> attrList)
	{
		this.attrList = attrList;
	}

	/**
	 * Sets the capacity.
	 * 
	 * @param capacity String
	 */
	public void setCapacity(String capacity)
	{
		this.capacity = capacity;
	}

	/**
	 * Sets the CustomerSessionId.
	 * 
	 * @param customerSessionId String
	 */
	public void setCustomerSessionId(String customerSessionId)
	{
		this.customerSessionId = customerSessionId;
	}

	/**
	 * Sets the date.
	 * 
	 * @param date String
	 */
	public void setDate(String date)
	{
		this.date = date;
	}

	/**
	 * Sets the description.
	 * 
	 * @param description String
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Sets the endTime.
	 * 
	 * @param endTime String
	 */
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	/**
	 * Sets the enrollable.
	 * 
	 * @param enrollable boolean
	 */
	public void setEnrollable(boolean enrollable)
	{
		this.enrollable = enrollable;
	}

	/**
	 * Sets the keywords.
	 * 
	 * @param keywords String
	 */
	public void setKeywords(String keywords)
	{
		this.keywords = keywords;
	}

	/**
	 * Sets the location.
	 * 
	 * @param location String
	 */
	public void setLocation(String location)
	{
		this.location = location;
	}

	/**
	 * Sets the room.
	 * 
	 * @param room String
	 */
	public void setRoom(String room)
	{
		this.room = room;
	}

	/**
	 * Sets the scanEndTime.
	 * 
	 * @param scanEndTime String
	 */
	public void setScanEndTime(String scanEndTime)
	{
		this.scanEndTime = scanEndTime;
	}

	/**
	 * Sets the scanStartTime.
	 * 
	 * @param scanStartTime String
	 */
	public void setScanStartTime(String scanStartTime)
	{
		this.scanStartTime = scanStartTime;
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
	 * Sets the sessionNumber.
	 * 
	 * @param sessionNumber String
	 */
	public void setSessionNumber(String sessionNumber)
	{
		this.sessionNumber = sessionNumber;
	}

	/**
	 * Sets the sessionRole.
	 * 
	 * @param sessionRole String
	 */
	public void setSessionRole(String sessionRole)
	{
		this.sessionRole = sessionRole;
	}

	/**
	 * Sets the shortTitle.
	 * 
	 * @param shortTitle String
	 */
	public void setShortTitle(String shortTitle)
	{
		this.shortTitle = shortTitle;
	}

	/**
	 * Sets the startTime.
	 * 
	 * @param startTime String
	 */
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	/**
	 * Sets the status.
	 * 
	 * @param simStatus String
	 */
	public void setSimStatus(String simStatus)
	{
		this.simStatus = simStatus;
	}

	/**
	 * Sets the submissionNumber.
	 * 
	 * @param submissionNumber int
	 */
	public void setSubmissionNumber(int submissionNumber)
	{
		this.submissionNumber = submissionNumber;
	}

	/**
	 * Sets the survey.
	 * 
	 * @param survey String
	 */
	public void setSurvey(String survey)
	{
		this.survey = survey;
	}

	/**
	 * Sets the title.
	 * 
	 * @param title String
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Session [id=" + sessionId + ", customerId=" + customerSessionId
				+ ", num=" + sessionNumber + ", title=" + title + ", shortTitle="
				+ shortTitle + ", desc=" + description + ", active=" + active + ", date="
				+ date + ", start=" + startTime + ", end=" + endTime + ", scanStart="
				+ scanStartTime + ", scanEnd=" + scanEndTime + ", room=" + room
				+ ", capacity=" + capacity + ", location=" + location + ", status="
				+ simStatus + ", survey=" + survey + ", enrollable=" + enrollable
				+ ", keywords=" + keywords + ", sessionRole=" + sessionRole
				+ ", submissionNumber=" + submissionNumber + ", additionalInfo1="
				+ additionalInfo1 + ", additionalInfo2=" + additionalInfo2
				+ ", additionalInfo3=" + additionalInfo3 + ", additionalInfo4="
				+ additionalInfo4 + ", additionalInfo5=" + additionalInfo5 + "]";
	}
}
