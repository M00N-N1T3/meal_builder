package com.builder.model;

/**
 * Represents a single meal order
 */

public class Meal {
    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;

    protected void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    protected void setSideDish(String sideDish){
        this.sideDish = sideDish;
    }

    protected void setDrink(String drink){
        this.drink = drink;
    }

    protected void setDessert(String dessert){
        this.dessert = dessert;
    }

    protected String getMainDish() {
        return mainDish;
    }

    protected String getSideDish() {
        return sideDish;
    }

    protected String getDessert() {
        return dessert;
    }

    protected String getDrink() {
        return drink;
    }

}
