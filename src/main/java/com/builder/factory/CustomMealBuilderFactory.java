package com.builder.factory;

import com.builder.model.MealBuilder;

public class CustomMealBuilderFactory {

    private final String mealType = "Custom Meal";
    private final MealBuilder mealBuilder;

    public CustomMealBuilderFactory(){
        this.mealBuilder = new MealBuilder();
    }


}
