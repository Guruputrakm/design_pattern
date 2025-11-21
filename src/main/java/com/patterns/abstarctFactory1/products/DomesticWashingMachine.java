package com.patterns.abstarctFactory1.products;

public class DomesticWashingMachine extends DomesticApplience1{
    @Override
    public void applienceFunc() {
        System.out.println( "This is "+ super.typeOfApplience()+" washing machine Function ");
    }
}
