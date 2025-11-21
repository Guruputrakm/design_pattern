package com.patterns.factory1;

public class PremiumBurger implements Burger{
    @Override
    public String prepare() {
        return "Premium Burger";
    }
}
