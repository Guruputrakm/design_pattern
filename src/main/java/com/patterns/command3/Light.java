package com.patterns.command3;

public class Light {

    private String name;
    private boolean status;

    public Light(String name) {
        this.name = name;
        this.status = false;
    }

    public void on() {
        System.out.println("The light "+name+" is on now ");
        status = true;
    }

    public void off(){
        System.out.println("The light "+name+ " is off now ");
        status = false;
    }

}
