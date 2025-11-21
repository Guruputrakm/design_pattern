package com.patterns.abstarctFactory.client;

import com.patterns.abstarctFactory.factory.ApplienceFactory;
import com.patterns.abstarctFactory.factory.CommercialReffergarortMachineFactory;
import com.patterns.abstarctFactory.factory.DomesticWashingMachineFactory;

public class ApplienceClient {
    public static void main(String[] args) {
        ApplienceFactory applienceFactory = new CommercialReffergarortMachineFactory();
        applienceFactory.callTheFunctionOfApplication();

        applienceFactory = new DomesticWashingMachineFactory();
        applienceFactory.callTheFunctionOfApplication();
    }
}
