package com.patterns.decorator.decoratorsclasses;

import com.patterns.decorator.basedecorator.BaseDecorator;
import com.patterns.decorator.component.Paymentgateway;

public class LoginingDecorator extends BaseDecorator {
    public LoginingDecorator(Paymentgateway paymentgateway) {
        super(paymentgateway);
    }

    @Override
    public boolean processPayment(int amount) {
        System.out.println("LOG request "+amount);
        boolean b = super.processPayment(amount);
        System.out.println("LOG response "+b);
        return b;
    }
}
