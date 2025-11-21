package com.principle.DIP;

public class RazopayGatewayProcessor implements PaymentGateway{
    @Override
    public boolean processPayment(int amount) {
        System.out.println("Razo pay processed payment");
        return true;
    }
}
