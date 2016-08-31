package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/*
 * SurveyCompletionList.java
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
 * SurveyCompletionList Class Description.
 *
 * @author Jeff Seifert <br>
 *         Creation Date: 06/29/2016 9:40:00 AM
 * @version Ver # 06/29/2016
 */
public class SurveyCompletionList {

    @SerializedName("surveyCompletionList")
    private ArrayList<SurveyCompletion> surveyCompletionList = new ArrayList<SurveyCompletion>();

    public ArrayList<SurveyCompletion> getSurveyCompletionList() {
        return surveyCompletionList;
    }

    public void setSurveyCompletionList(ArrayList<SurveyCompletion> materialsRedemptionList) {
        this.surveyCompletionList = materialsRedemptionList;
    }

}
