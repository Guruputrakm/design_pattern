package com.principle.DIP;

public class PaymentProcessor {

    private final PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public  String pay(int amount) {
       return (paymentGateway.processPayment(amount) ? " Processing done": "Failed to process");
    }
}
