package com.patterns.decorator2.uber;

public class SecurityDecortor extends BaseDecorator{
    public SecurityDecortor(RideBookService rideBookService) {
        super(rideBookService);
    }

    @Override
    public void bookRide(Request req) {
        System.out.println("Booking with security");
        super.bookRide(req);
        System.out.println("Exit Booking with security");
    }
}
