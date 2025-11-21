package com.principle.DIP;

public class SimpleGatewayProcessor implements PaymentGateway{
    @Override
    public boolean processPayment(int amount) {
        System.out.println("Simple gateway processed payment");
        return  true;
    }
}
