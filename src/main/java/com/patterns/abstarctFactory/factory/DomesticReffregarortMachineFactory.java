package com.patterns.abstarctFactory.factory;

import com.patterns.abstarctFactory.products.Applience;
import com.patterns.abstarctFactory.products.DomesticReffregarotorMachine;

public class DomesticReffregarortMachineFactory extends ApplienceFactory{
    @Override
    protected Applience createApplience() {
        return new DomesticReffregarotorMachine();
    }
}
