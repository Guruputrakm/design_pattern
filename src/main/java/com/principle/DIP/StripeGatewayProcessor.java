package com.principle.DIP;

public class StripeGatewayProcessor implements PaymentGateway{
    @Override
    public boolean processPayment(int amount) {
        System.out.println("StripeGatewayProcessor pay processed payment");
        return true;
    }
}
