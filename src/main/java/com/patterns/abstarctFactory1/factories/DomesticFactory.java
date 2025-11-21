package com.patterns.abstarctFactory1.factories;

import com.patterns.abstarctFactory1.products.CommericalReffregerotorMachine;
import com.patterns.abstarctFactory1.products.CommericalWashingMachine;
import com.patterns.abstarctFactory1.products.DomesticReffregerotorMachine;
import com.patterns.abstarctFactory1.products.DomesticWashingMachine;

public class DomesticFactory extends BaseRegistoryFactory{

    public DomesticFactory() {
        registr.put(new ApplienceKey(AppliencesName.FRIDGE), DomesticReffregerotorMachine::new);
        registr.put(new ApplienceKey(AppliencesName.WASHER), DomesticWashingMachine::new);
    }
}
