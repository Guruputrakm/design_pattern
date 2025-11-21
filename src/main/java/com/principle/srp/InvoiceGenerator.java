package com.principle.srp;

public class InvoiceGenerator {
    private Ordermanager ordermanager;

    public InvoiceGenerator(Ordermanager ordermanager) {
        this.ordermanager = ordermanager;
    }

    public void generateInvoice(Order order) {
        Order order1 = ordermanager.getOrders().stream().filter(o -> o.getOrderId() == order.getOrderId()).findFirst().get();
        prepareReport(order1);
    }

    private void prepareReport(Order order1) {
    }
}
