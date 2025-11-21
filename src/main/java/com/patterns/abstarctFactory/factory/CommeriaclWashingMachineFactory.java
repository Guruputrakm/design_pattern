package com.patterns.abstarctFactory.factory;

import com.patterns.abstarctFactory.products.Applience;
import com.patterns.abstarctFactory.products.CommercialWashingMachine;

public class CommeriaclWashingMachineFactory extends ApplienceFactory{
    @Override
    protected Applience createApplience() {
        return new CommercialWashingMachine();
    }
}
