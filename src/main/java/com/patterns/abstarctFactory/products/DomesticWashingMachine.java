package com.patterns.abstarctFactory.products;

public class DomesticWashingMachine extends WashingMachine{
    @Override
    public void applienceFunction() {
        System.out.println("using for running the Domestic machine the name is "+super.getName());
    }
}
