package com.patterns.abstarctFactory1.factories;

import com.patterns.abstarctFactory1.products.Applience1;

public interface ApplienceFactory {

    Applience1 create(ApplienceKey applienceKey);
}
