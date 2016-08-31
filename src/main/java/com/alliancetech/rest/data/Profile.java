package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * UserProfile.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ --------------------------------------------
 * Chris Speir	Mar 20, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Represents a users profile
 *
 * @author Chris Speir<br>
 *         Creation Date: Mar 20, 2010 7:31:02 AM
 * @version Ver 1.0 Mar 20, 2010
 */
public class Profile {
    @SerializedName("userId")
    private String userId;
    @SerializedName("attendeeNum")
    private String attendeeNum;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("title")
    private String title;
    @SerializedName("company")
    private String company;
    @SerializedName("address1")
    private String address1;
    @SerializedName("address2")
    private String address2;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("zipCode")
    private String zipCode;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("loginId")
    private String loginId;
    @SerializedName("password")
    private String password;
    @SerializedName("personalEmail")
    private String personalEmail;
    @SerializedName("website")
    private String website;
    @SerializedName("linkedIn")
    private String linkedIn;
    @SerializedName("facebook")
    private String facebook;
    @SerializedName("twitterUrl")
    private String twitterUrl;
    @SerializedName("blog")
    private String blog;
    @SerializedName("instantMessage")
    private String instantMessage;
    @SerializedName("aboutMe")
    private String aboutMe;
    @SerializedName("isProfileSearchable")
    private boolean isProfileSearchable;
    @SerializedName("isEmailNotify")
    private boolean isEmailNotify;
    @SerializedName("isTwitterDirectMsg")
    private boolean isTwitterDirectMsg;
    @SerializedName("isTwitterSessionAttendance")
    private boolean isTwitterSessionAttendance;
    @SerializedName("isTwitterSessionSelection")
    private boolean isTwitterSessionSelection;
    @SerializedName("twitterUserName")
    private String twitterUserName;
    @SerializedName("twitterOAuthToken")
    private String twitterOAuthToken;
    @SerializedName("twitterOAuthTokenSecret")
    private String twitterOAuthTokenSecret;

    /**
     * Gets the aboutMe.
     *
     * @return String
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * Sets the aboutMe.
     *
     * @param aboutMe String
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * Gets the address1.
     *
     * @return String
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the address1.
     *
     * @param address1 String
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Gets the address2.
     *
     * @return String
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the address2.
     *
     * @param address2 String
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Gets the attendeeNum.
     *
     * @return String
     */
    public String getAttendeeNum() {
        return attendeeNum;
    }

    /**
     * Sets the attendeeNum.
     *
     * @param attendeeNum String
     */
    public void setAttendeeNum(String attendeeNum) {
        this.attendeeNum = attendeeNum;
    }

    /**
     * Gets the blog.
     *
     * @return String
     */
    public String getBlog() {
        return blog;
    }

    /**
     * Sets the blog.
     *
     * @param blog String
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     * Gets the city.
     *
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city String
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the company.
     *
     * @return String
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company.
     *
     * @param company String
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the email.
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the facebook.
     *
     * @return String
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Sets the facebook.
     *
     * @param facebook String
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * Gets the firstName.
     *
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the firstName.
     *
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the instantMessage.
     *
     * @return String
     */
    public String getInstantMessage() {
        return instantMessage;
    }

    /**
     * Sets the instantMessage.
     *
     * @param instantMessage String
     */
    public void setInstantMessage(String instantMessage) {
        this.instantMessage = instantMessage;
    }

    /**
     * Gets the lastName.
     *
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the lastName.
     *
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the linkedIn.
     *
     * @return String
     */
    public String getLinkedIn() {
        return linkedIn;
    }

    /**
     * Sets the linkedIn.
     *
     * @param linkedIn String
     */
    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    /**
     * Gets the loginId.
     *
     * @return String
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the loginId.
     *
     * @param loginId String
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * Gets the password.
     *
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password String
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the personalEmail.
     *
     * @return String
     */
    public String getPersonalEmail() {
        return personalEmail;
    }

    /**
     * Sets the personalEmail.
     *
     * @param personalEmail String
     */
    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    /**
     * Gets the phone.
     *
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     *
     * @param phone String
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the state.
     *
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state String
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the title.
     *
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title String
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the twitterOAuthToken.
     *
     * @return String
     */
    public String getTwitterOAuthToken() {
        return twitterOAuthToken;
    }

    /**
     * Sets the twitterOAuthToken.
     *
     * @param twitterOAuthToken String
     */
    public void setTwitterOAuthToken(String twitterOAuthToken) {
        this.twitterOAuthToken = twitterOAuthToken;
    }

    /**
     * Gets the twitterOAuthTokenSecret.
     *
     * @return String
     */
    public String getTwitterOAuthTokenSecret() {
        return twitterOAuthTokenSecret;
    }

    /**
     * Sets the twitterOAuthTokenSecret.
     *
     * @param twitterOAuthTokenSecret String
     */
    public void setTwitterOAuthTokenSecret(String twitterOAuthTokenSecret) {
        this.twitterOAuthTokenSecret = twitterOAuthTokenSecret;
    }

    /**
     * Gets the twitterUrl.
     *
     * @return String
     */
    public String getTwitterUrl() {
        return twitterUrl;
    }

    /**
     * Sets the twitterUrl.
     *
     * @param twitterUrl String
     */
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    /**
     * Gets the twitterUserName.
     *
     * @return String
     */
    public String getTwitterUserName() {
        return twitterUserName;
    }

    /**
     * Sets the twitterUserName.
     *
     * @param twitterUserName String
     */
    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }

    /**
     * Gets the userId.
     *
     * @return String
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId.
     *
     * @param userId String
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the website.
     *
     * @return String
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website.
     *
     * @param website String
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Gets the zipCode.
     *
     * @return String
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zipCode.
     *
     * @param zipCode String
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Gets the isEmailNotify.
     *
     * @return boolean
     */
    public boolean isEmailNotify() {
        return isEmailNotify;
    }

    /**
     * Sets the isEmailNotify.
     *
     * @param isEmailNotify boolean
     */
    public void setEmailNotify(boolean isEmailNotify) {
        this.isEmailNotify = isEmailNotify;
    }

    /**
     * Gets the isProfileSearchable.
     *
     * @return boolean
     */
    public boolean isProfileSearchable() {
        return isProfileSearchable;
    }

    /**
     * Sets the isProfileSearchable.
     *
     * @param isProfileSearchable boolean
     */
    public void setProfileSearchable(boolean isProfileSearchable) {
        this.isProfileSearchable = isProfileSearchable;
    }

    /**
     * Gets the isTwitterDirectMsg.
     *
     * @return boolean
     */
    public boolean isTwitterDirectMsg() {
        return isTwitterDirectMsg;
    }

    /**
     * Sets the isTwitterDirectMsg.
     *
     * @param isTwitterDirectMsg boolean
     */
    public void setTwitterDirectMsg(boolean isTwitterDirectMsg) {
        this.isTwitterDirectMsg = isTwitterDirectMsg;
    }

    /**
     * Gets the isTwitterSessionAttendance.
     *
     * @return boolean
     */
    public boolean isTwitterSessionAttendance() {
        return isTwitterSessionAttendance;
    }

    /**
     * Sets the isTwitterSessionAttendance.
     *
     * @param isTwitterSessionAttendance boolean
     */
    public void setTwitterSessionAttendance(boolean isTwitterSessionAttendance) {
        this.isTwitterSessionAttendance = isTwitterSessionAttendance;
    }

    /**
     * Gets the isTwitterSessionSelection.
     *
     * @return boolean
     */
    public boolean isTwitterSessionSelection() {
        return isTwitterSessionSelection;
    }

    /**
     * Sets the isTwitterSessionSelection.
     *
     * @param isTwitterSessionSelection boolean
     */
    public void setTwitterSessionSelection(boolean isTwitterSessionSelection) {
        this.isTwitterSessionSelection = isTwitterSessionSelection;
    }

}
