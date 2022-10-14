package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DailyResponse {


    @JsonProperty("meals")
    private ArrayList<MealsData> dailyMeals;
    @JsonProperty("nutrients")
    private NutrientsData dailyNutrients;


    public ArrayList<MealsData> getDailyMeals() {
        return dailyMeals;
    }

    public void setDailyMeals(ArrayList<MealsData> dailyMeals) {
        this.dailyMeals = dailyMeals;
    }

    public NutrientsData getDailyNutrients() {
        return dailyNutrients;
    }

    public void setDailyNutrients(NutrientsData dailyNutrients) {
        this.dailyNutrients = dailyNutrients;
    }

    @Override
    public String toString() {
        return "DailyResponse{" +
                "dailyMeals=" + dailyMeals +
                ", dailyNutrients=" + dailyNutrients +
                '}';
    }
}
