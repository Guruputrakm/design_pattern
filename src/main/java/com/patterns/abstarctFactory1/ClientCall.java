package com.patterns.abstarctFactory1;

import com.patterns.abstarctFactory1.factories.ApplienceFactory;
import com.patterns.abstarctFactory1.factories.ApplienceKey;
import com.patterns.abstarctFactory1.factories.AppliencesName;
import com.patterns.abstarctFactory1.factories.CommericalFactory;
import com.patterns.abstarctFactory1.products.Applience1;

public class ClientCall {
    public static void main(String[] args) {
        ApplienceFactory applienceFactory = new CommericalFactory();

        Applience1 applience1 = applienceFactory.create(new ApplienceKey(AppliencesName.FRIDGE));
        applience1.applienceFunc();
    }
}
