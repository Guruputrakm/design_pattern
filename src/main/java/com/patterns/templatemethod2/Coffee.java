package com.patterns.templatemethod2;

public class Coffee extends Drink{
    @Override
    protected void addIngredient() {
        System.out.println("Adding coffee power with milk");
    }
}
