package com.patterns.adaptor;

public class PhonePeAdaptor implements Paymentgateway{

    private final PhonePePay phonePePay;

    public PhonePeAdaptor(PhonePePay phonePePay) {
        this.phonePePay = phonePePay;
    }

    @Override
    public boolean processPayment(int amount) {
        System.out.println("CAlling addpator");
        boolean b = phonePePay.payWithPhonePe(amount);
        System.out.println("Processing is completed with adpator ");
        return b;
    }
}
