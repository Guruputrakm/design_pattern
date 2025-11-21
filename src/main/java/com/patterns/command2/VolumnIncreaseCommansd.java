package com.patterns.command2;

public class VolumnIncreaseCommansd implements Command2{
    private final TV tv;

    public VolumnIncreaseCommansd(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.increaseVolum();
    }
}
