package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * SurveyCompletion.java
 *
 * (c) Alliance Tech 2016.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Jeff S.		06/29/2016	Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * SurveyCompletion Class Description.
 *
 * @author Jeff Seifert <br>
 *         Creation Date: 06/29/2016 9:40:00 AM
 * @version Ver # 06/29/2016
 */
public class SurveyCompletion {

    @SerializedName("lastModified")
    private String lastModified;
    @SerializedName("completed")
    private boolean completed;
    @SerializedName("customerRegistrantId")
    private String customerRegistrantId;
    @SerializedName("customerSessionId")
    private String customerSessionId;
    @SerializedName("progressId")
    private String progressId;
    @SerializedName("registrantId")
    private String registrantId;
    @SerializedName("registrantNumber")
    private String registrantNumber;
    @SerializedName("sessionId")
    private String sessionId;
    @SerializedName("sessionNumber")
    private String sessionNumber;
    @SerializedName("surveyId")
    private String surveyId;


    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getCustomerRegistrantId() {
        return customerRegistrantId;
    }

    public void setCustomerRegistrantId(String customerRegistrantId) {
        this.customerRegistrantId = customerRegistrantId;
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public String getProgressId() {
        return progressId;
    }

    public void setProgressId(String progressId) {
        this.progressId = progressId;
    }

    public String getRegistrantId() {
        return registrantId;
    }

    public void setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
    }

    public String getRegistrantNumber() {
        return registrantNumber;
    }

    public void setRegistrantNumber(String registrantNumber) {
        this.registrantNumber = registrantNumber;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(String sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public String toString() {
        return "SurveyCompletion{" +
                "lastModified='" + lastModified + '\'' +
                ", completed=" + completed +
                ", customerRegistrantId='" + customerRegistrantId + '\'' +
                ", customerSessionId='" + customerSessionId + '\'' +
                ", progressId='" + progressId + '\'' +
                ", registrantId='" + registrantId + '\'' +
                ", registrantNumber='" + registrantNumber + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", sessionNumber='" + sessionNumber + '\'' +
                ", surveyId='" + surveyId + '\'' +
                '}';
    }

}
