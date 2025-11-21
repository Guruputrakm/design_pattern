package com.patterns.startgey;

public class SimplePayGateway implements PaymentGetway{
    @Override
    public double processPayment(int amount) {
        System.out.println("processed Simple pay gateway");
        return 1.0;
    }
}
