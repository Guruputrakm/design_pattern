package com.patterns.adaptor;

public class ClientClass {
    public static void main(String[] args) {
        Paymentgateway paymentgateway = new PayAdaptor(new FancyPay());
        System.out.println(paymentgateway.processPayment(2000));

        Paymentgateway paymentgateway1 = new PhonePeAdaptor(new PhonePePay());
        paymentgateway1.processPayment(250);

    }
}
