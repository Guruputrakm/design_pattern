package com.patterns.decorator2.uber;

import java.util.Arrays;

public class ClientClas {
    public static void main(String[] args) {
        RideBookService compose = DecortorComposer.compose(new BasicRideBookingService(), Arrays.asList(new SecurityFactory(3),
                new LogginDecoratorFactory(1), new RetryDecoratorFactory(5)));
        compose.bookRide(new Request("Guru", "RajaiNagr","Kadugudi", "123"));
    }
}
