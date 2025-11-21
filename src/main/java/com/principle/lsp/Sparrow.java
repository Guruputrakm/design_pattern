package com.principle.lsp;

public class Sparrow extends FlyingBirds{
    @Override
    public String fly() {
        return "Flying";
    }

    @Override
    public String eat() {
        return "the sparrow is "+super.eat();
    }
}
