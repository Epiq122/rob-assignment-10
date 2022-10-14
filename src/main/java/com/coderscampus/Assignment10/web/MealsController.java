package com.coderscampus.Assignment10.web;

import com.coderscampus.Assignment10.dto.DailyResponse;
import com.coderscampus.Assignment10.dto.WeeklyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class MealsController {
    @GetMapping("mealplanner/daily")
    public ResponseEntity<DailyResponse> getDailyMeals(String numCalories, String diet, String exclusions) {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate").queryParam("apiKey"
                , "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("timeFrame", "daily").build().toUri();

//        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/recipes/716429/information").queryParam(
//                "apiKey", "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("includeNutrition", "true").build().toUri();
//        ResponseEntity<String> response = rt.getForEntity(uri, String.class);
        ResponseEntity<DailyResponse> response = rt.getForEntity(uri, DailyResponse.class);
        System.out.println(response.getBody());
        return response;
    }

    @GetMapping("mealplanner/weekly")
    public ResponseEntity<WeeklyResponse> getWeeklyMeals(String numCalories, String diet, String exclusions) {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate").queryParam("apiKey"
                , "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("timeFrame", "week").queryParam("diet",
                diet != null ? diet : "").build().toUri();

//        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/recipes/716429/information").queryParam(
//                "apiKey", "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("includeNutrition", "true").build().toUri();
//        ResponseEntity<String> response = rt.getForEntity(uri, String.class);
        ResponseEntity<WeeklyResponse> response = rt.getForEntity(uri, WeeklyResponse.class);
        System.out.println(response.getBody());
        return response;
    }

}
