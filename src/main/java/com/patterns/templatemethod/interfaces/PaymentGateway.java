package com.patterns.templatemethod.interfaces;

public interface PaymentGateway {

    boolean processPayment(int totalAmount);
}
