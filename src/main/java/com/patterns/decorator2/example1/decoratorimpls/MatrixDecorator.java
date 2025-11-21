package com.patterns.decorator2.example1.decoratorimpls;

import com.patterns.decorator2.example1.component.PaymentGateway2;
import com.patterns.decorator2.example1.decoratorclass.BaseDecorator;

public class MatrixDecorator extends BaseDecorator {
    public MatrixDecorator(PaymentGateway2 paymentgateway) {
        super(paymentgateway);
    }

    @Override
    public boolean processPayment(int amount) throws InterruptedException {
        System.out.println("Adding the metric call for amount "+amount);
        boolean b = paymentgateway.processPayment(amount);
        System.out.println("Exiting from the Matrix Decorator class "+amount);
        return b;
    }
}
