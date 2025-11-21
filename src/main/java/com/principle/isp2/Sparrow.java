package com.principle.isp2;

public class Sparrow extends FlyingBird{
    @Override
    public String eat() {
        return "sparrow is eating";
    }

    @Override
    public String fly() {
        return "sparrow is flying";
    }
}
