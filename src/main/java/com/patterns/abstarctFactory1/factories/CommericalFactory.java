package com.patterns.abstarctFactory1.factories;

import com.patterns.abstarctFactory.products.Applience;
import com.patterns.abstarctFactory1.products.Applience1;
import com.patterns.abstarctFactory1.products.CommericalReffregerotorMachine;
import com.patterns.abstarctFactory1.products.CommericalWashingMachine;

public class CommericalFactory extends BaseRegistoryFactory{

    public CommericalFactory() {
        registr.put(new ApplienceKey(AppliencesName.FRIDGE), CommericalReffregerotorMachine::new);
        registr.put(new ApplienceKey(AppliencesName.WASHER), CommericalWashingMachine::new);
    }
}
