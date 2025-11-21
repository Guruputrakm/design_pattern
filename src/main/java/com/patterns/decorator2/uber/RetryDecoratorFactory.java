package com.patterns.decorator2.uber;

public class RetryDecoratorFactory implements DecoratoryFactory{

    private final int prority;

    public RetryDecoratorFactory(int prority) {
        this.prority = prority;
    }

    @Override
    public int prority() {
        return prority;
    }

    @Override
    public RideBookService wrap(RideBookService inner) {
        return new RetryDecorator(inner, 3);
    }
}
