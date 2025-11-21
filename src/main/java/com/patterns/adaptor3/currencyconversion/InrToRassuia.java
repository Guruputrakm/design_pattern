package com.patterns.adaptor3.currencyconversion;

public class InrToRassuia implements CountryCurrencies{
    @Override
    public double fromToTo(double amount) {
        return amount*5;
    }
}
