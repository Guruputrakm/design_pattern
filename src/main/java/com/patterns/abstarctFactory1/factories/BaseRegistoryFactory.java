package com.patterns.abstarctFactory1.factories;

import com.patterns.abstarctFactory1.products.Applience1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public abstract class BaseRegistoryFactory implements ApplienceFactory {
    protected final Map<ApplienceKey, Supplier<? extends Applience1>> registr = new HashMap<>();

    @Override
    public Applience1 create(ApplienceKey applienceKey) {
        Supplier<? extends Applience1> supplier = registr.get(applienceKey);
        if(supplier == null){
            throw new IllegalArgumentException(" No prod is registered");
        }
        return supplier.get();
    }
}
