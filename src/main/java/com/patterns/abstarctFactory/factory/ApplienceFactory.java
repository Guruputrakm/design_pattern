package com.patterns.abstarctFactory.factory;

import com.patterns.abstarctFactory.products.Applience;

public abstract class ApplienceFactory {

    protected abstract Applience createApplience();

    public void callTheFunctionOfApplication() {
        Applience applience = createApplience();
        applience.applienceFunction();
    }
}
