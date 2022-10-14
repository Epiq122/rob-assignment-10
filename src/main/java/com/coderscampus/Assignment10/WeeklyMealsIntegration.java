package com.coderscampus.Assignment10;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class WeeklyMealsIntegration {


    //https://api.spoonacular.com/mealplanner/generate?timeFrame=day

    //    https://api.spoonacular.com/recipes/716429/information?apiKey=YOUR-API-KEY&includeNutrition=true.

    // TESTING
    @Test
    public void callWeeklyMeals() {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate").queryParam("apiKey"
                , "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("timeFrame", "week").build().toUri();

//        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/recipes/716429/information").queryParam(
//                "apiKey", "7ee517e70bfa4b65b6c6f686cad6cc57").queryParam("includeNutrition", "true").build().toUri();
        ResponseEntity<String> response = rt.getForEntity(uri, String.class);
        System.out.println(response);
    }
}
