package com.builder.factory;

import com.builder.model.Meal;


public class MealBuilderFactory {

    public static Meal getMeal(String mealType){
        return switch (mealType.toLowerCase()){
            case "veggie meal" -> new VeggieMeal().getMeal().build();
            case "kids meal" -> new KidsMeal().getMeal().build();
            default -> new ChickenMeal().getMeal().build();
        };
    }
}
