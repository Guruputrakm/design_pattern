package com.patterns.command3;

public class Fan {
    private final String name;
    private boolean status;

    public Fan(String name) {
        this.name = name;
        this.status = false;
    }

    public void on(){
        System.out.println("The Fan "+name+" is On ");
        status = true;
    }

    public void off() {
        System.out.println("The Fan "+name+" is off ");
        status = false;
    }
}
