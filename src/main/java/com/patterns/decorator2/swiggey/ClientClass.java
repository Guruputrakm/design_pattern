package com.patterns.decorator2.swiggey;

import com.patterns.decorator2.swiggey.DeliveryBase.DeliveryDecorator;
import com.patterns.decorator2.swiggey.DeliveryService.DeliveryService;
import com.patterns.decorator2.swiggey.DeliveryServiceimpl.DeliveryServiceImpl;
import com.patterns.decorator2.swiggey.concreatdecorators.LiveTrackingDecorator;
import com.patterns.decorator2.swiggey.concreatdecorators.RatingDecorator;

public class ClientClass {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryServiceImpl();

        DeliveryDecorator decorator = new RatingDecorator(new LiveTrackingDecorator(deliveryService));
        decorator.delivery("121");
    }
}
