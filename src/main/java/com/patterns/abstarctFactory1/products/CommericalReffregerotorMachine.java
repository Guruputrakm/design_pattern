package com.patterns.abstarctFactory1.products;

public class CommericalReffregerotorMachine extends CommericalApplience1{
    @Override
    public void applienceFunc() {
        System.out.println( "This is "+ super.typeOfApplience()+" Fridge machine Function ");
    }
}
