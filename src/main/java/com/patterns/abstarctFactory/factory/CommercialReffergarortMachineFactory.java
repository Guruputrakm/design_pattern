package com.patterns.abstarctFactory.factory;

import com.patterns.abstarctFactory.products.Applience;
import com.patterns.abstarctFactory.products.CommercialReffregarotorMachine;

public class CommercialReffergarortMachineFactory extends ApplienceFactory{
    @Override
    public Applience createApplience() {
        return new CommercialReffregarotorMachine();
    }
}
