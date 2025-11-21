package com.patterns.singletone;

public class Singletone {
    private static final Singletone instance = new Singletone();

    private Singletone() {

    }

    public static Singletone getInstace() {
        return instance;
    }
}
