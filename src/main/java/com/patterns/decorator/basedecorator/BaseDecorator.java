package com.patterns.decorator.basedecorator;

import com.patterns.decorator.component.Paymentgateway;

public abstract class BaseDecorator implements Paymentgateway {

    protected final Paymentgateway deligate;

    public BaseDecorator(Paymentgateway paymentgateway) {
        this.deligate = paymentgateway;
    }

    @Override
    public boolean processPayment(int amount)  {
        System.out.println("delegating call to sub decorator");
        boolean b = deligate.processPayment(amount);
        System.out.println("Completed the delegation call");
        return b;

    }
}
