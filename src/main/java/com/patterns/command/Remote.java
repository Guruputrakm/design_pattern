package com.patterns.command;

public class Remote {

    private LightOn lightOn;
    private LightOff lightOff;

    public Remote(LightOn lightOn, LightOff lightOff) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public void setLightOn(){
        lightOn.execute();
    }

    public void setLightOff() {
        lightOff.execute();
    }




}
