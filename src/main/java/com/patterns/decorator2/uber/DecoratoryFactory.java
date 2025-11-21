package com.patterns.decorator2.uber;

public interface DecoratoryFactory {

    int prority();
    RideBookService wrap(RideBookService inner);
}
