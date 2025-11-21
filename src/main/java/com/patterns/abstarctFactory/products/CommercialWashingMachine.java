package com.patterns.abstarctFactory.products;

public class CommercialWashingMachine extends WashingMachine{
    @Override
    public void applienceFunction() {
        System.out.println("using for running the Commercial machine the name is "+super.getName());
    }
}
