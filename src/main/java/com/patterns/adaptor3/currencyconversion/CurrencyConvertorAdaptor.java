package com.patterns.adaptor3.currencyconversion;

import java.util.List;

public class CurrencyConvertorAdaptor implements CurrencyConvertor {

    List<CountryCurrencies> adaptor;

    public CurrencyConvertorAdaptor(List<CountryCurrencies> adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public void convertCurrency(double amount) {
        adaptor.stream().forEach(countryCurrencies -> {
            double v = countryCurrencies.fromToTo(amount);
            System.out.println(countryCurrencies.getClass().getName()+" for this from amount "+amount+" and the converted amount is "+v);
        });
    }
}
