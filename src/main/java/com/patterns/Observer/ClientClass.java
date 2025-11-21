package com.patterns.Observer;

public class ClientClass {
    public static void main(String[] args) {
        PaymentEventBus paymentEventBus = new PaymentEventBus();
        paymentEventBus.addObserver(new EMailEventNotifier());
        PaymentEvent paymentEvent = new PaymentEvent("Payment", "payment");
        paymentEventBus.notify(paymentEvent);
    }
}
