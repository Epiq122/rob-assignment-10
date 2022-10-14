package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeeklyResponse {
    @JsonProperty("week")
    private DaysOfWeek week;

    public DaysOfWeek getWeek() {
        return week;
    }

    public void setWeek(DaysOfWeek week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "WeeklyResponse{" +
                "week=" + week +
                '}';
    }
}
