package com.patterns.templatemethod.interfaces;

import com.patterns.Observer.PaymentEvent;

public interface EventBus {

    void publish(PaymentEven event);

}
