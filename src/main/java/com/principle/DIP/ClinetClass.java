package com.principle.DIP;

public class ClinetClass {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new SimpleGatewayProcessor());
        System.out.println(paymentProcessor.pay(20));

        PaymentProcessor paymentProcessor1 = new PaymentProcessor(new StripeGatewayProcessor());
        System.out.println(paymentProcessor1.pay(30));
    }
}
