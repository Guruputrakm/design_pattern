package com.patterns.command;

public class DeskLight implements Light{
    @Override
    public void on() {
        System.out.println("ON");
    }

    @Override
    public void off() {
        System.out.println("OFF");
    }
}
