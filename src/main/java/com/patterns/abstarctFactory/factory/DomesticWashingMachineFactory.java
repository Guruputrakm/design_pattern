package com.patterns.abstarctFactory.factory;

import com.patterns.abstarctFactory.products.Applience;
import com.patterns.abstarctFactory.products.DomesticWashingMachine;

public class DomesticWashingMachineFactory extends ApplienceFactory{
    @Override
    protected Applience createApplience() {
        return new DomesticWashingMachine();
    }
}
