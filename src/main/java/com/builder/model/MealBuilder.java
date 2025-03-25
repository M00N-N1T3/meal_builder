package com.builder.model;

import com.builder.model.Meal;

public class MealBuilder {

    private final Meal meal;

    public MealBuilder(){
        this.meal = new Meal();
    }

    public void setMainDash(String mainDish){
        meal.setMainDish(mainDish);
    }

    public void setSideDish(String sideDish){
        meal.setSideDish((sideDish));
    }

    public void setDrink(String drink){
        meal.setDrink(drink);
    }

    public void setDessert(String dessert){
        meal.setDessert(dessert);
    }

    public Meal build(){
        return meal;
    }

    public String getDrink(){
        return meal.getDrink();
    }

    public String getDessert(){
        return meal.getDessert();
    }

    public String getSideDish(){
        return meal.getSideDish();
    }

    public String getMainDish(){
        return meal.getMainDish();
    }


}
