package com.patterns.startgey;

public class PaymentService {
    private PaymentGetway paymentGetway;
    private Policy policy;

    public PaymentService() {
    }

    public PaymentService(PaymentGetway paymentGetway, Policy policy) {
        this.paymentGetway = paymentGetway;
        this.policy = policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public void setPaymentGetway(PaymentGetway paymentGetway) {
        this.paymentGetway = paymentGetway;
    }

    public boolean pay(int amount) {
        paymentGetway.processPayment(amount);
        policy.compute(amount);
        return true;
    }
}
