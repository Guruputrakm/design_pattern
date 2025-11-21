package com.patterns.decorator2.example1.decoratorimpls;

import com.patterns.decorator2.example1.component.PaymentGateway2;
import com.patterns.decorator2.example1.decoratorclass.BaseDecorator;

public class LoginDecorator extends BaseDecorator {
    public LoginDecorator(PaymentGateway2 paymentgateway) {
        super(paymentgateway);
    }

    @Override
    public boolean processPayment(int amount) throws InterruptedException {
        System.out.println("LOGGER for amount "+amount);
        boolean b = super.processPayment(amount);
        System.out.println("Exiting Logger for amount "+amount);
        return b;
    }
}
