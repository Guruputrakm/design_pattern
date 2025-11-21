package com.principle.isp2;

public class BirdsApp {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        System.out.println(bird.eat());
        System.out.println(((FlyingBird) bird).fly());

        Bird penguin = new Penguin();
        System.out.println(penguin.eat());
        System.out.println(((NonFlyable) bird).eat());
    }
}
