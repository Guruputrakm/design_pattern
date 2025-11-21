package com.patterns.templatemethod.templates;

import com.patterns.templatemethod.interfaces.*;

public final class StandardPaymentProcessor extends PaymentProcessor{

    public StandardPaymentProcessor(PaymentGateway paymentGateway, Repository repository, EventBus eventBus) {
        super(paymentGateway, repository, a -> Math.round( (a*2) /100.0f),eventBus );
    }

    @Override
    protected void publish(String orderId, int amount, int fee, boolean success) {
        eventBus.publish(new PaymentEven(orderId, amount, fee, success));
    }
}
