package com.patterns.templatemethod2;

public class Tea extends Drink{
    @Override
    protected void addIngredient() {
        System.out.println("Adding tea powder and milk");
    }
}
