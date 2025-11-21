package com.patterns.startgey;

public class ClientClass {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentGetway(new SimplePayGateway());
        paymentService.setPolicy(new FestiveDiscount());

        paymentService.pay(20);
    }
}
