package com.patterns.command2;

public class ReduceVolumCommand implements Command2{

    private final TV tv;

    public ReduceVolumCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.reduceVolum();
    }
}
