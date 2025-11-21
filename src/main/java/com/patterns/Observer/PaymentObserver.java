package com.patterns.Observer;

public interface PaymentObserver {
    public void onEvent(PaymentEvent paymentEvent);
}
