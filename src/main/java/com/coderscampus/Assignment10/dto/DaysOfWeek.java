package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DaysOfWeek {
    @JsonProperty("monday")
    private DailyResponse monday;
    @JsonProperty("tuesday")
    private DailyResponse tuesday;
    @JsonProperty("wednesday")
    private DailyResponse wednesday;
    @JsonProperty("thursday")
    private DailyResponse thursday;
    @JsonProperty("friday")
    private DailyResponse friday;
    @JsonProperty("saturday")
    private DailyResponse saturday;
    @JsonProperty("sunday")
    private DailyResponse sunday;

    public DailyResponse getMonday() {
        return monday;
    }

    public void setMonday(DailyResponse monday) {
        this.monday = monday;
    }

    public DailyResponse getTuesday() {
        return tuesday;
    }

    public void setTuesday(DailyResponse tuesday) {
        this.tuesday = tuesday;
    }

    public DailyResponse getWednesday() {
        return wednesday;
    }

    public void setWednesday(DailyResponse wednesday) {
        this.wednesday = wednesday;
    }

    public DailyResponse getThursday() {
        return thursday;
    }

    public void setThursday(DailyResponse thursday) {
        this.thursday = thursday;
    }

    public DailyResponse getFriday() {
        return friday;
    }

    public void setFriday(DailyResponse friday) {
        this.friday = friday;
    }

    public DailyResponse getSaturday() {
        return saturday;
    }

    public void setSaturday(DailyResponse saturday) {
        this.saturday = saturday;
    }

    public DailyResponse getSunday() {
        return sunday;
    }

    public void setSunday(DailyResponse sunday) {
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        return "DaysOfWeek{" +
                "monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                '}';
    }
}
