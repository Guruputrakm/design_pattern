package com.patterns.command;

public class LightOn implements Command{
    private final Light l;
    private boolean state;
    public LightOn(Light l) {
        this.l = l;
    }

    @Override
    public void execute() {
        if(state) {
            System.out.println("already light is on");
            return;
        }
        l.on();
        state=true;
    }
}
