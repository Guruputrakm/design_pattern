package com.patterns.decorator2.uber;

public class BasicRideBookingService implements RideBookService{
    @Override
    public void bookRide(Request req) {
        System.out.println("Booked from "+req.from() +" to "+req.to()+" for the user "+req.user());
    }
}
