package com.patterns.adaptor;

public class PayAdaptor implements Paymentgateway{
    private final FancyPay fancyPay;

    public PayAdaptor(FancyPay fancyPay) {
        this.fancyPay = fancyPay;
    }

    @Override
    public boolean processPayment(int amount) {
        double amountInRupee = amount/100;
        String s = this.fancyPay.payInRuppes(amountInRupee);

        return "OK".equals(s);
    }
}
