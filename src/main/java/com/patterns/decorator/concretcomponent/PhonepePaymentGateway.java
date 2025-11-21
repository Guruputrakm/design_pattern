package com.patterns.decorator.concretcomponent;

import com.patterns.decorator.component.Paymentgateway;

public class PhonepePaymentGateway implements Paymentgateway {
    @Override
    public boolean processPayment(int amount) {
        System.out.println("processed the PhonePe payment "+amount);
        return true;
    }
}
