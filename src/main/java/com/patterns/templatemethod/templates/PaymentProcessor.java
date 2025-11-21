package com.patterns.templatemethod.templates;

import com.patterns.templatemethod.interfaces.*;

public abstract class PaymentProcessor {

    protected final PaymentGateway paymentGateway;
    protected final Repository repository;
    protected final FeePolicy feePolicy;
    protected final EventBus eventBus;

    public PaymentProcessor(PaymentGateway paymentGateway, Repository repository, FeePolicy feePolicy, EventBus eventBus) {
        this.paymentGateway = paymentGateway;
        this.repository = repository;
        this.feePolicy = feePolicy;
        this.eventBus = eventBus;
    }

    public final void process(String orderId, int amount) {
        validate(orderId);
        final int fee = computeFee(amount);
        boolean success = executePayment(fee);
        persist(orderId, success, fee, amount);
        hook(orderId, amount, fee, success);
        publish(orderId, amount, fee, success);

    }

    protected void validate(String orderId) {
        System.out.println("Order is validated");
    }

    protected int computeFee(int amount) {
        return feePolicy.computeFee(amount);
    }

    protected boolean executePayment(int fee) {
       return paymentGateway.processPayment(fee);
    }

    protected void persist(String orderId, boolean success, int fee, int amount) {
        repository.save(new PaymentRecord(orderId, amount, fee, success, "persist on status"));
    }

    public void hook(String orderId, int amount, int fee, boolean status) {}

    protected void publish(String orderId, int amount, int fee, boolean success) {
        eventBus.publish(new PaymentEven(orderId, amount, fee, success));
    }
}
