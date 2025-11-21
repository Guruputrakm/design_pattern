package com.patterns.decorator2.example1.decoratorclass;


import com.patterns.decorator2.example1.component.PaymentGateway2;

public class BaseDecorator implements PaymentGateway2 {

    protected PaymentGateway2 paymentgateway;

    public BaseDecorator(PaymentGateway2 paymentgateway) {
        this.paymentgateway = paymentgateway;
    }

    @Override
    public boolean processPayment(int amount) throws InterruptedException {
        System.out.println("In Base decorator");
        var status = paymentgateway.processPayment(amount);
        System.out.println("exiting from base decoretor");
        return status;
    }
}
