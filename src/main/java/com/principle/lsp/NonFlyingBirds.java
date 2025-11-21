package com.principle.lsp;

public abstract class NonFlyingBirds implements Bird{

    @Override
    public final String fly() {
        return "";
    }

    @Override
    public String eat() {
        return "is eating";
    }
}
