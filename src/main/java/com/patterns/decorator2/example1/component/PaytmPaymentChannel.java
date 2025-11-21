package com.patterns.decorator2.example1.component;


public class PaytmPaymentChannel implements PaymentGateway2 {
    @Override
    public boolean processPayment(int amount) throws InterruptedException {
        System.out.println("Intiating payment for ruppees "+amount);
        Thread.sleep(5000);
        System.out.println("payment processed completed ");
        return true;
    }
}
