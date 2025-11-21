package com.patterns.templatemethod3;

public class HighValueMiniProcessor extends MiniProcessor{
    public HighValueMiniProcessor(Gateway gateway, Bus bus) {
        super(gateway, bus);
    }

    @Override
    protected void validate(int amount) {
        if(amount > 10000) throw new IllegalArgumentException("Amount is very high can not process");
        return;
    }
}
