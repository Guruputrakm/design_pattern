package com.patterns.decorator2.swiggey.DeliveryServiceimpl;

import com.patterns.decorator2.swiggey.DeliveryService.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public void delivery(String orderId) {
        System.out.println("Deliveried the item "+orderId);
    }
}
