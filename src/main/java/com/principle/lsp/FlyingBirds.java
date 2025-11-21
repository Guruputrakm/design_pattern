package com.principle.lsp;

public abstract class FlyingBirds implements Bird{
    abstract public String fly();

    @Override
    public String  eat() {
        return "is eating";
    }
}
