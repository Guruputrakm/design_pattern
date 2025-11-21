package com.patterns.adaptor3.currencyconversion;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        CurrencyConvertor currencyConvertor = new CurrencyConvertorAdaptor(Arrays.asList(new InrToRassuia(), new InrToUSA()));
        currencyConvertor.convertCurrency(25);
    }
}
