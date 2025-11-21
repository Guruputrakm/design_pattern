package com.patterns.templatemethod.interfaces.impl;


import com.patterns.templatemethod.interfaces.EventBus;
import com.patterns.templatemethod.interfaces.PaymentEven;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public final class SimpleEvent implements EventBus {
    private final List<Consumer<PaymentEven>> subscribers = new CopyOnWriteArrayList<>();

    public void subscribe(Consumer<PaymentEven> c) {
        subscribers.add(c);
    }

    @Override
    public void publish(PaymentEven event) {
        System.out.println("[EVENTBUS] publish ");
        subscribers.stream().forEach( e -> e.accept(event));
    }
}
