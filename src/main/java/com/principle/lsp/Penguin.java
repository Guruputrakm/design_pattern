package com.principle.lsp;

public class Penguin extends NonFlyingBirds{
    @Override
    public String eat() {
        return "Penguin is "+super.eat();
    }

}
