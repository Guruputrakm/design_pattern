package com.patterns.templatemethod;

import com.patterns.templatemethod.interfaces.EventBus;
import com.patterns.templatemethod.interfaces.PaymentGateway;
import com.patterns.templatemethod.interfaces.Repository;
import com.patterns.templatemethod.interfaces.impl.InmemoryRepo;
import com.patterns.templatemethod.interfaces.impl.PhonePeGateway;
import com.patterns.templatemethod.interfaces.impl.SimpleEvent;
import com.patterns.templatemethod.templates.PaymentProcessor;
import com.patterns.templatemethod.templates.StandardPaymentProcessor;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PhonePeGateway();
        Repository repository = new InmemoryRepo();
        SimpleEvent eventBus = new SimpleEvent();
        eventBus.subscribe(e -> System.out.println("[Email] Payment " + (e.success() ? "OK" : "FAILED") + " for " + e.orderId()));
        eventBus.subscribe(e -> System.out.println("[Analytics] amount=" + e.amount() + " fee=" + e.fee()));

        PaymentProcessor paymentProcessor = new StandardPaymentProcessor(paymentGateway, repository,eventBus);
        paymentProcessor.process("order-13", 5000);
    }
}
