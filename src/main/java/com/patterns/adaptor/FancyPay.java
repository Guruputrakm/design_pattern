package com.patterns.adaptor;

public class FancyPay {

    public String payInRuppes(double amount) {
        return amount > 0 ?"OK" : "FAILED";
    }
}
