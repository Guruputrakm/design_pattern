package com.patterns.decorator.clientclass;

import com.patterns.decorator.basedecorator.BaseDecorator;
import com.patterns.decorator.component.Paymentgateway;
import com.patterns.decorator.concretcomponent.PhonepePaymentGateway;
import com.patterns.decorator.decoratorsclasses.LoginingDecorator;
import com.patterns.decorator.decoratorsclasses.RetryDecorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Paymentgateway paymentgateway = new PhonepePaymentGateway();

        BaseDecorator baseDecorator = new LoginingDecorator(new RetryDecorator(paymentgateway, 3));
        baseDecorator.processPayment(10);
    }
}
