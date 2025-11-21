package com.patterns.decorator2.uber;

public class LogginDecoratorFactory implements DecoratoryFactory {
    private final int prority;

    public LogginDecoratorFactory(int prority) {
        this.prority = prority;
    }

    @Override
    public int prority() {
        return prority;
    }

    @Override
    public RideBookService wrap(RideBookService inner) {
        return new LoggingDecorator(inner);
    }
}
