package com.patterns.startgey2;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("No flying");
    }
}
