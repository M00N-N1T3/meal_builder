package com.builder.factory;

import com.builder.model.Meal;
import com.builder.model.MealBuilder;

public class KidsMeal implements IMeal{
    private String mealType = "Kids Meal";
    private MealBuilder mealBuilder;

    public KidsMeal(){
        this.mealBuilder = new MealBuilder();
        mealBuilder.setDrink("Milk");
        mealBuilder.setDessert("Cookie");
        mealBuilder.setMainDash("Nuggets");
        mealBuilder.setSideDish("Apple");
    }

    @Override
    public MealBuilder getMeal() {
        return mealBuilder;
    }

    @Override
    public String getMealType(){
        return mealType;
    }
}
