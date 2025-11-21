package com.patterns.decorator2.uber;

public abstract class BaseDecorator implements RideBookService {

    protected final RideBookService delegate;

    public BaseDecorator(RideBookService rideBookService) {
        this.delegate = rideBookService;
    }

    @Override
    public void bookRide(Request req) {
        delegate.bookRide(req);
    }
}
