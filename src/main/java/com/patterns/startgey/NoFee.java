package com.patterns.startgey;

public class NoFee implements Policy{
    @Override
    public int compute(int amount) {
        return amount;
    }
}
