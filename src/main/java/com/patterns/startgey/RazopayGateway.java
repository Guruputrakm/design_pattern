package com.patterns.startgey;

public class RazopayGateway implements PaymentGetway{
    @Override
    public double processPayment(int amount) {
        System.out.println("processed Razopay payment gateway");
        return 1.0;
    }
}
