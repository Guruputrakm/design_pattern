package com.principle.lsp;

public class BirdsApp {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        System.out.println(sparrow.eat());
        sparrow.fly();

        Bird penguin = new Penguin();
        System.out.println(penguin.eat());
    }
}
