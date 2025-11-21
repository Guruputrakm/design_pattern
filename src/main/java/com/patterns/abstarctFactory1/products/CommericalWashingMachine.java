package com.patterns.abstarctFactory1.products;

public class CommericalWashingMachine extends CommericalApplience1{
    @Override
    public void applienceFunc() {
        System.out.println( "This is "+ super.typeOfApplience()+" washing machine Function ");
    }
}
