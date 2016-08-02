package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gguerra on 8/2/16.
 */
public class AttendanceReadList {

    @SerializedName("lastId")
    private String lastId;
    @SerializedName("attendanceReadList")
    private List<AttendanceRead> attendanceReadList = new ArrayList<AttendanceRead>();

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public List<AttendanceRead> getAttendanceReadList() {
        return attendanceReadList;
    }

    public void setAttendanceReadList(List<AttendanceRead> attendanceReadList) {
        this.attendanceReadList = attendanceReadList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttendanceReadList{");
        sb.append("lastId='").append(lastId).append('\'');
        sb.append(", attendanceReadList=").append(attendanceReadList);
        sb.append('}');
        return sb.toString();
    }
}
