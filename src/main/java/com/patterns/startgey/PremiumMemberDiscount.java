package com.patterns.startgey;

public class PremiumMemberDiscount implements Policy{
    @Override
    public int compute(int amount) {
        return (int) (amount *0.85);
    }
}
