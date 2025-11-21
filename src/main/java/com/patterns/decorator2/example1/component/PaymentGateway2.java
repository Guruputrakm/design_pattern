package com.patterns.decorator2.example1.component;

public interface PaymentGateway2 {

    boolean processPayment(int amount) throws InterruptedException;
}
