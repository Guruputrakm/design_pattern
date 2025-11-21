package com.patterns.command;

public class DemoCommand {
    public static void main(String[] args) {

        Light deskLight = new DeskLight();

        Remote remote = new Remote(new LightOn(deskLight), new LightOff(deskLight));

        remote.setLightOff();
        remote.setLightOn();
        remote.setLightOn();
        remote.setLightOff();

    }
}
