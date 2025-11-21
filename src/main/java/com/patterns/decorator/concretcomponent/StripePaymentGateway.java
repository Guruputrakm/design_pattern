package com.patterns.decorator.concretcomponent;

import com.patterns.decorator.component.Paymentgateway;

public class StripePaymentGateway implements Paymentgateway {
    @Override
    public boolean processPayment(int amount) {
        System.out.println("processed the Stripe payment "+amount);
        return true;
    }
}
