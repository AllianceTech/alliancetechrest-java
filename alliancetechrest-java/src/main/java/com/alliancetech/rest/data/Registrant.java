package com.alliancetech.rest.data;

import com.alliancetech.rest.UtilityMethods;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * Registrant.java
 * 
 * (c) Alliance Tech 2010.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		 Description
 * ------------ ------------ -------------------------------------------
 * Chris Speir	Aug 21, 2010 Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Contains Registrant data that can be serialized to JSON
 *
 * @author Chris "The Man" Speir<br>
 *         Creation Date: Aug 21, 2010 10:33:35 PM
 * @version Ver 1.0 Aug 21, 2010
 */
public class Registrant {
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
    @SerializedName("address1")
    private String address1;
    @SerializedName("address2")
    private String address2;
    @SerializedName("altPhone")
    private String altPhone;
    @SerializedName("attrList")
    private ArrayList<Attribute> attrList = new ArrayList<Attribute>();
    @SerializedName("blogUrl")
    private String blogUrl;
    @SerializedName("checkinVerAttempts")
    private Integer checkinVerAttempts;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private String country;
    @SerializedName("county")
    private String county;
    @SerializedName("customerId")
    private String customerRegistrantId;
    @SerializedName("department")
    private String department;
    @SerializedName("descr")
    private String descr;
    @SerializedName("deviceLocalId")
    private String deviceLocalId;
    @SerializedName("email")
    private String email;
    @SerializedName("eventMailName")
    private String eventMailName;
    @SerializedName("facebookUrl")
    private String facebookUrl;
    @SerializedName("fax")
    private String fax;
    @SerializedName("first")
    private String first;
    @SerializedName("fullName")
    private String fullName;
    @SerializedName("ignoreAutoGenEPCMode")
    private Boolean ignoreAutoGenEPCMode;
    @SerializedName("imAccount")
    private String iMAccount;
    @SerializedName("last")
    private String last;
    @SerializedName("linkedinUrl")
    private String linkedinUrl;
    @SerializedName("loginId")
    private String loginId;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("nickName")
    private String nickName;
    @SerializedName("optInAttendeeSearch")
    private Boolean optInAttendeeSearch;
    @SerializedName("optInMsgTickler")
    private Boolean optInMsgTickler;
    @SerializedName("optInRFID")
    private Boolean optInRFID;
    @SerializedName("optInTwitterEnrollment")
    private Boolean optInTwitterEnrollment;
    @SerializedName("optInTwitterSessionAttendance")
    private Boolean optInTwitterSessionAttendance;
    @SerializedName("organization")
    private String organization;
    @SerializedName("password")
    private String password;
    @SerializedName("personalEmail")
    private String personalEmail;
    @SerializedName("phone")
    private String phone;
    @SerializedName("postalCode")
    private String postalCode;
    @SerializedName("preFix")
    private String preFix;
    @SerializedName("region")
    private String region;
    @SerializedName("id")
    private String registrantId;
    @SerializedName("num")
    private String registrantNumber;
    @SerializedName("title")
    private String title;
    @SerializedName("twitterAccount")
    private String twitterAccount;
    @SerializedName("url")
    private String url;

    /**
     * Gets the additionalInfo1.
     *
     * @return String
     */
    public String getAdditionalInfo1() {
        return additionalInfo1;
    }

    /**
     * Sets the additionalInfo1.
     *
     * @param additionalInfo1 String
     */
    public void setAdditionalInfo1(String additionalInfo1) {
        this.additionalInfo1 = additionalInfo1;
    }

    /**
     * Gets the additionalInfo2.
     *
     * @return String
     */
    public String getAdditionalInfo2() {
        return additionalInfo2;
    }

    /**
     * Sets the additionalInfo2.
     *
     * @param additionalInfo2 String
     */
    public void setAdditionalInfo2(String additionalInfo2) {
        this.additionalInfo2 = additionalInfo2;
    }

    /**
     * Gets the additionalInfo3.
     *
     * @return String
     */
    public String getAdditionalInfo3() {
        return additionalInfo3;
    }

    /**
     * Sets the additionalInfo3.
     *
     * @param additionalInfo3 String
     */
    public void setAdditionalInfo3(String additionalInfo3) {
        this.additionalInfo3 = additionalInfo3;
    }

    /**
     * Gets the additionalInfo4.
     *
     * @return String
     */
    public String getAdditionalInfo4() {
        return additionalInfo4;
    }

    /**
     * Sets the additionalInfo4.
     *
     * @param additionalInfo4 String
     */
    public void setAdditionalInfo4(String additionalInfo4) {
        this.additionalInfo4 = additionalInfo4;
    }

    /**
     * Gets the additionalInfo5.
     *
     * @return String
     */
    public String getAdditionalInfo5() {
        return additionalInfo5;
    }

    /**
     * Sets the additionalInfo5.
     *
     * @param additionalInfo5 String
     */
    public void setAdditionalInfo5(String additionalInfo5) {
        this.additionalInfo5 = additionalInfo5;
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
     * Gets the altPhone.
     *
     * @return String
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the altPhone.
     *
     * @param altPhone String
     */
    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }

    /**
     * Get attribute by name
     *
     * @param asName String
     * @return Attribute
     */
    private Attribute getAttribute(String asName) {
        Attribute laAttr = null;

        if (UtilityMethods.isValidString(asName)) {
            for (int i = 0; attrList != null && i < attrList.size(); i++) {
                if (attrList.get(i).getName().equals(asName)) {
                    laAttr = attrList.get(i);
                    break;
                }
            }
        }

        return laAttr;
    }

    /**
     * Get attribute val by name, if it's a multiAttribute, only return
     * the first val.
     *
     * @param asName String
     * @return Attribute
     */
    public String getAttributeFirstVal(String asName) {
        String lsVal = null;
        Attribute laAttr = getAttribute(asName);

        if (laAttr != null) {
            lsVal = laAttr.getVal();
        }

        return lsVal;
    }

    /**
     * Gets the attrList.
     *
     * @return ArrayList&gt;Attribute&lt;
     */
    public ArrayList<Attribute> getAttrList() {
        return attrList;
    }

    /**
     * Sets the attrList.
     *
     * @param attrList ArrayList<Attribute>
     */
    public void setAttrList(ArrayList<Attribute> attrList) {
        this.attrList = attrList;
    }

    /**
     * Gets the blogUrl.
     *
     * @return String
     */
    public String getBlogUrl() {
        return blogUrl;
    }

    /**
     * Sets the blogUrl.
     *
     * @param blogUrl String
     */
    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    /**
     * Gets the checkinVerAttempts.
     *
     * @return Integer
     */
    public Integer getCheckinVerAttempts() {
        return checkinVerAttempts;
    }

    /**
     * Sets the checkinVerAttempts.
     *
     * @param checkinVerAttempts Integer
     */
    public void setCheckinVerAttempts(Integer checkinVerAttempts) {
        this.checkinVerAttempts = checkinVerAttempts;
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
     * Gets the country.
     *
     * @return String
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     *
     * @param country String
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the county.
     *
     * @return String
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the county.
     *
     * @param county String
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Gets the customerRegistrantId.
     *
     * @return String
     */
    public String getCustomerRegistrantId() {
        return customerRegistrantId;
    }

    /**
     * Sets the customerRegistrantId.
     *
     * @param asCustomerRegistrantId String
     */
    public void setCustomerRegistrantId(String asCustomerRegistrantId) {
        customerRegistrantId = asCustomerRegistrantId;
    }

    /**
     * Gets the department.
     *
     * @return String
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department.
     *
     * @param department String
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the descr.
     *
     * @return String
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the descr.
     *
     * @param descr String
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * Gets the deviceLocalId.
     *
     * @return String
     */
    public String getDeviceLocalId() {
        return deviceLocalId;
    }

    /**
     * Sets the deviceLocalId.
     *
     * @param deviceLocalId String
     */
    public void setDeviceLocalId(String deviceLocalId) {
        this.deviceLocalId = deviceLocalId;
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
     * Gets the eventMailName.
     *
     * @return String
     */
    public String getEventMailName() {
        return eventMailName;
    }

    /**
     * Gets the facebookUrl.
     *
     * @return String
     */
    public String getFacebookUrl() {
        return facebookUrl;
    }

    /**
     * Sets the facebookUrl.
     *
     * @param facebookUrl String
     */
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    /**
     * Gets the fax.
     *
     * @return String
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     *
     * @param fax String
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets the first.
     *
     * @return String
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the firstName.
     *
     * @param first String
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Gets the fullName.
     *
     * @return String
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the fullName.
     *
     * @param fullName String
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the ignoreAutoGenEPCMode.
     *
     * @return Boolean
     */
    public Boolean getIgnoreAutoGenEPCMode() {
        return ignoreAutoGenEPCMode;
    }

    /**
     * Sets the ignoreAutoGenEPCMode.
     *
     * @param ignoreAutoGenEPCMode Boolean
     */
    public void setIgnoreAutoGenEPCMode(Boolean ignoreAutoGenEPCMode) {
        this.ignoreAutoGenEPCMode = ignoreAutoGenEPCMode;
    }

    /**
     * Gets the iMAccount.
     *
     * @return String
     */
    public String getiMAccount() {
        return iMAccount;
    }

    /**
     * Sets the iMAccount.
     *
     * @param iMAccount String
     */
    public void setiMAccount(String iMAccount) {
        this.iMAccount = iMAccount;
    }

    /**
     * Gets the last.
     *
     * @return String
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the lastName.
     *
     * @param last String
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * Gets the linkedinUrl.
     *
     * @return String
     */
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    /**
     * Sets the linkedinUrl.
     *
     * @param linkedinUrl String
     */
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
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
     * Gets the mobile.
     *
     * @return String
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the mobile.
     *
     * @param mobile String
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets the nickName.
     *
     * @return String
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the nickName.
     *
     * @param nickName String
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Gets the optInAttendeeSearch.
     *
     * @return Boolean
     */
    public Boolean getOptInAttendeeSearch() {
        return optInAttendeeSearch;
    }

    /**
     * Sets the optInAttendeeSearch.
     *
     * @param optInAttendeeSearch Boolean
     */
    public void setOptInAttendeeSearch(Boolean optInAttendeeSearch) {
        this.optInAttendeeSearch = optInAttendeeSearch;
    }

    /**
     * Gets the optInMsgTickler.
     *
     * @return Boolean
     */
    public Boolean getOptInMsgTickler() {
        return optInMsgTickler;
    }

    /**
     * Sets the optInMsgTickler.
     *
     * @param optInMsgTickler Boolean
     */
    public void setOptInMsgTickler(Boolean optInMsgTickler) {
        this.optInMsgTickler = optInMsgTickler;
    }

    /**
     * Gets the optInRFID.
     *
     * @return Boolean
     */
    public Boolean getOptInRFID() {
        return optInRFID;
    }

    /**
     * Sets the optInRFID.
     *
     * @param optInRFID Boolean
     */
    public void setOptInRFID(Boolean optInRFID) {
        this.optInRFID = optInRFID;
    }

    /**
     * Gets the optInTwitterEnrollment.
     *
     * @return Boolean
     */
    public Boolean getOptInTwitterEnrollment() {
        return optInTwitterEnrollment;
    }

    /**
     * Sets the optInTwitterEnrollment.
     *
     * @param optInTwitterEnrollment Boolean
     */
    public void setOptInTwitterEnrollment(Boolean optInTwitterEnrollment) {
        this.optInTwitterEnrollment = optInTwitterEnrollment;
    }

    /**
     * Gets the optInTwitterSessionAttendance.
     *
     * @return Boolean
     */
    public Boolean getOptInTwitterSessionAttendance() {
        return optInTwitterSessionAttendance;
    }

    /**
     * Sets the optInTwitterSessionAttendance.
     *
     * @param optInTwitterSessionAttendance Boolean
     */
    public void setOptInTwitterSessionAttendance(Boolean optInTwitterSessionAttendance) {
        this.optInTwitterSessionAttendance = optInTwitterSessionAttendance;
    }

    /**
     * Gets the organization.
     *
     * @return String
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the organization.
     *
     * @param organization String
     */
    public void setOrganization(String organization) {
        this.organization = organization;
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
     * Gets the postal code.
     *
     * @return String
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set the postal code.
     *
     * @param postalCode String
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the preFix.
     *
     * @return String
     */
    public String getPreFix() {
        return preFix;
    }

    /**
     * Sets the preFix.
     *
     * @param preFix String
     */
    public void setPreFix(String preFix) {
        this.preFix = preFix;
    }

    /**
     * Gets the region.
     *
     * @return String
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region.
     *
     * @param region String
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the userId.
     *
     * @return String
     */
    public String getRegistrantId() {
        return registrantId;
    }

    /**
     * Sets the registrantId.
     *
     * @param registrantId String
     */
    public void setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
    }

    /**
     * Gets the registrantNumber.
     *
     * @return String
     */
    public String getRegistrantNumber() {
        return registrantNumber;
    }

    /**
     * Sets the registrantNumber.
     *
     * @param registrantNum String
     */
    public void setRegistrantNumber(String registrantNum) {
        this.registrantNumber = registrantNum;
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
     * Gets the twitterAccount.
     *
     * @return String
     */
    public String getTwitterAccount() {
        return twitterAccount;
    }

    /**
     * Sets the twitterAccount.
     *
     * @param twitterAccount String
     */
    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

    /**
     * Gets the url.
     *
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url String
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get/add attribute to reg
     *
     * @param asName      String
     * @param asVal       String
     * @param abMultiAttr boolean
     * @return boolean
     */
    public void setAttribute(String asName, String asVal, boolean abMultiAttr) {
        if (UtilityMethods.isValidString(asName) && UtilityMethods.isValidString(asName)) {
            if (abMultiAttr) {
                getAttrList().add(new Attribute(asName, asVal));
            } else {
                Attribute laAttr = getAttribute(asName);
                if (laAttr != null) {
                    laAttr.setVal(asVal);
                } else {
                    getAttrList().add(new Attribute(asName, asVal));
                }
            }
        }

    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String lsAttrs = "";

        for (int i = 0; attrList != null && i < attrList.size(); i++) {
            lsAttrs += " " + attrList.get(i).toString();
        }
        return "Registrant [additionalInfo1=" + additionalInfo1 + ", additionalInfo2="
                + additionalInfo2 + ", additionalInfo3=" + additionalInfo3
                + ", additionalInfo4=" + additionalInfo4 + ", additionalInfo5="
                + additionalInfo5 + ", address1=" + address1 + ", address2=" + address2
                + ", altPhone=" + altPhone + ", attrList=" + attrList + ", blogUrl="
                + blogUrl + ", city=" + city + ", country=" + country + ", county="
                + county + ", customerRegistrantId=" + customerRegistrantId
                + ", department=" + department + ", descr=" + descr + ", email=" + email
                + ", eventMailName=" + eventMailName + ", facebookUrl=" + facebookUrl
                + ", fax=" + fax + ", first=" + first + ", iMAccount=" + iMAccount
                + ", last=" + last + ", linkedinUrl=" + linkedinUrl + ", loginId="
                + loginId + ", mobile=" + mobile + ", nickName=" + nickName
                + ", optInAttendeeSearch=" + optInAttendeeSearch + ", optInMsgTickler="
                + optInMsgTickler + ", optInRFID=" + optInRFID
                + ", optInTwitterEnrollment=" + optInTwitterEnrollment
                + ", optInTwitterSessionAttendance=" + optInTwitterSessionAttendance
                + ", organization=" + organization + ", password=" + password
                + ", personalEmail=" + personalEmail + ", phone=" + phone
                + ", postalCode=" + postalCode + ", preFix=" + preFix + ", region="
                + region + ", registrantId=" + registrantId + ", registrantNum="
                + registrantNumber + ", title=" + title + ", twitterAccount="
                + twitterAccount + ", url=" + url + lsAttrs + "]";
    }
}
