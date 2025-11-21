package com.patterns.decorator.decoratorsclasses;

import com.patterns.decorator.basedecorator.BaseDecorator;
import com.patterns.decorator.component.Paymentgateway;

public class RetryDecorator extends BaseDecorator {

    private final int retry;
    public RetryDecorator(Paymentgateway paymentgateway, int retry) {
        super(paymentgateway);
        this.retry = retry;
    }

    @Override
    public boolean processPayment(int amount) {
        System.out.println("Iniating call for an amount "+amount);
       int attempts = 0;
       while (true) {
           attempts++;
           boolean ok = super
                   .processPayment(amount);
           if(ok || attempts >= retry ) return ok;
           System.out.println("RETRY attempt "+attempts+" failed, retrying");
       }
    }
}
