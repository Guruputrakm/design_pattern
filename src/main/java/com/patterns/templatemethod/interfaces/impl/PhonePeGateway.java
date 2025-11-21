package com.patterns.templatemethod.interfaces.impl;

import com.patterns.templatemethod.interfaces.PaymentGateway;

public final class PhonePeGateway implements PaymentGateway {
    @Override
    public boolean processPayment(int totalAmount) {
        System.out.println("Processing of payment is happening through Phonepe gateway");
        boolean b = totalAmount % 7 != 0;
        System.out.println( b? "Payment Completed": "Paymnet failed");
        return b;
    }
}
