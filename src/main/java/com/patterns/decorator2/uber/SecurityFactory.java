package com.patterns.decorator2.uber;

public class SecurityFactory implements DecoratoryFactory{
    private final int prority;

    public SecurityFactory(int prority) {
        this.prority = prority;
    }

    @Override
    public int prority() {
        return prority;
    }

    @Override
    public RideBookService wrap(RideBookService inner) {
        return new SecurityDecortor(inner);
    }
}
