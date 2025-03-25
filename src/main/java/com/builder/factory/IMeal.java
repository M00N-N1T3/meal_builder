package com.builder.factory;


import com.builder.model.MealBuilder;

public interface IMeal {
    public MealBuilder getMeal();
    public String getMealType();
}
