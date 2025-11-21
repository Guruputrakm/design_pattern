package com.patterns.decorator2.swiggey.concreatdecorators;

import com.patterns.decorator2.swiggey.DeliveryBase.DeliveryDecorator;
import com.patterns.decorator2.swiggey.DeliveryService.DeliveryService;

public class LiveTrackingDecorator extends DeliveryDecorator {
    public LiveTrackingDecorator(DeliveryService deliveryService) {
        super(deliveryService);
    }

    @Override
    public void delivery(String orderId) {
        System.out.println("Logging the order is present at Restorent "+orderId);
        deliveryService.delivery(orderId);
        System.out.println("Order Delivered");
    }
}
