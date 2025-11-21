package com.patterns.startgey;

public class FestiveDiscount implements Policy{
    @Override
    public int compute(int amount) {
        return (int) (amount * 0.90);
    }
}
