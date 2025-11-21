package com.patterns.decorator2.swiggey.DeliveryBase;

import com.patterns.decorator2.swiggey.DeliveryService.DeliveryService;

public abstract class DeliveryDecorator implements DeliveryService {

    protected DeliveryService deliveryService;

    public DeliveryDecorator(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public void delivery(String orderId) {
        System.out.println("Base Delivery Decorator");
        deliveryService.delivery("121");
        System.out.println("Exit from Base Delivery Decorator");
    }
}
