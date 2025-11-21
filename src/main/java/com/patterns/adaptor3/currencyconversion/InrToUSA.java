package com.patterns.adaptor3.currencyconversion;

public class InrToUSA implements CountryCurrencies{

    @Override
    public double fromToTo(double amount) {
        return amount *85;
    }
}
