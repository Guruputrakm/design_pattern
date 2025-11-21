package com.patterns.decorator2.swiggey.concreatdecorators;

import com.patterns.decorator2.swiggey.DeliveryBase.DeliveryDecorator;
import com.patterns.decorator2.swiggey.DeliveryService.DeliveryService;

import java.util.Scanner;

public class RatingDecorator extends DeliveryDecorator {
    public RatingDecorator(DeliveryService deliveryService) {
        super(deliveryService);
    }

    @Override
    public void delivery(String orderId) {
        super.delivery(orderId);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the rating for the deliver : ");
        int rating = scanner.nextInt();
        System.out.println("Odered "+orderId+" has been deliveried and rating is "+rating);
    }


}
