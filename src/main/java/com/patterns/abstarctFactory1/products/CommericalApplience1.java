package com.patterns.abstarctFactory1.products;

import com.patterns.abstarctFactory1.enums.ApplienceType;

public abstract class CommericalApplience1 implements Applience1 {

    public String typeOfApplience() {
        return ApplienceType.COMMERICAL.name();
    }
}
