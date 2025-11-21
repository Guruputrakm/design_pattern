package com.principle.srp;

public class PaymentProcessor {
    private Ordermanager ordermanager;

    public PaymentProcessor(Ordermanager ordermanager) {
        this.ordermanager = ordermanager;
    }

    public void payOrder(Order order ) {
        Order order1 = ordermanager.getOrders().stream().filter(o -> o.getOrderId() == order.getOrderId()).findFirst().get();
        processPaymet(order1);
    }

    private void processPaymet(Order order1) {
    }
}
