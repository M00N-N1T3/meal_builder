package com.builder.factory;

import com.builder.model.MealBuilder;

public class ChickenMeal implements IMeal {

    private final String mealType = "Chicken Meal";
    private final MealBuilder mealBuilder;

    public ChickenMeal(){
        this.mealBuilder = new MealBuilder();
        mealBuilder.setSideDish("Fries");
        mealBuilder.setMainDash("Grilled Chicken");
        mealBuilder.setDessert("Ice Cream");
        mealBuilder.setDrink("Soda");
    }

    @Override
    public MealBuilder getMeal(){
        return mealBuilder;
    }

    @Override
    public String getMealType(){
        return mealType;
    }

}
