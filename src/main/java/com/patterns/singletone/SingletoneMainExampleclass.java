package com.patterns.singletone;

public class SingletoneMainExampleclass {
    public static void main(String[] args) {
        System.out.println(SingletoneWithLazy.getInstance());
        System.out.println(SingletoneWithLazy.getInstance());
    }
}
