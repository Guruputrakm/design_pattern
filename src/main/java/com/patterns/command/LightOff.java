package com.patterns.command;

public class LightOff implements Command{

    private final Light l;
    private boolean state;

    public LightOff(Light l) {
        this.l = l;
    }

    @Override
    public void execute() {
        if(!state) {
            System.out.println("Alreay off");
            return;
        }
        l.off();
        state= false;
    }
}
