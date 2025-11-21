package com.patterns.decorator2.uber;

public class RetryDecorator extends BaseDecorator{

    private final int attempts;
    public RetryDecorator(RideBookService rideBookService, int attempts) {

        super(rideBookService);
        this.attempts =attempts;
    }

    @Override
    public void bookRide(Request req) {
        System.out.println("At Retry Decorator ==> START, with retry "+attempts);
        int attempt =0;
        while (true) {
            if(attempt == attempts)
                break;
            attempt++;
            {
                super.bookRide(req);
                System.out.println("Completed execution in "+attempt+" attempt");
                break;
            }
        }
        System.out.println("At Retry Decorator ==> END");

    }
}
