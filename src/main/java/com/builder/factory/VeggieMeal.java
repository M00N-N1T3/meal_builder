package com.builder.factory;

import com.builder.model.MealBuilder;

public class VeggieMeal implements IMeal{
    private final MealBuilder mealBuilder;
    private final String mealType = "Veggie Meal";

    public VeggieMeal(){
        this.mealBuilder = new MealBuilder();
        mealBuilder.setDessert("Fruit Cup");
        mealBuilder.setMainDash("Veggie Burger");
        mealBuilder.setDrink("Juice");
        mealBuilder.setSideDish("Salad");
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
