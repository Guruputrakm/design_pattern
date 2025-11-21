package com.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentEventBus {
    List<PaymentObserver> observerList;

    public PaymentEventBus() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(PaymentObserver paymentObserver) {
        observerList.add(paymentObserver);
    }

    public void deleteObserver(PaymentObserver paymentObserver) {
        observerList.remove(paymentObserver);
    }

    public void notify(PaymentEvent paymentEvent) {
        observerList.stream().forEach(paymentObserver -> paymentObserver.onEvent(paymentEvent));
    }
}
