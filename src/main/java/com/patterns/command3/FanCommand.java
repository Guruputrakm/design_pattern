package com.patterns.command3;

public class FanCommand implements ICommand{
    private Fan fan;

    public FanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.on();
    }

    @Override
    public void undo() {
        this.fan.off();
    }
}
