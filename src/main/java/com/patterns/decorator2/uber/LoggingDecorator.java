package com.patterns.decorator2.uber;

public class LoggingDecorator extends BaseDecorator{
    public LoggingDecorator(RideBookService rideBookService) {
        super(rideBookService);
    }

    @Override
    public void bookRide(Request req) {
        System.out.println("Logging PRE " + req.requestedId());
        super.bookRide(req);            // CALL SUPER to keep chain behavior
        System.out.println("Logging POST " + req.requestedId());
    }
}
