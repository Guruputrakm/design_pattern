package com.patterns.Observer;

public class EMailEventNotifier implements PaymentObserver{
    @Override
    public void onEvent(PaymentEvent paymentEvent) {
        System.out.println(paymentEvent);
        System.out.println("email notifier");
    }
}
