package com.patterns.factory1;

public class BasicBurger implements Burger{
    @Override
    public String prepare() {
        return "Basic Burger";
    }
}
