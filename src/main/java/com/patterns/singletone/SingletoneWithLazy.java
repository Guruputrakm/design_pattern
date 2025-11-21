package com.patterns.singletone;

public class SingletoneWithLazy {

    private static SingletoneWithLazy instance;

    private SingletoneWithLazy() {

    }

    public static synchronized SingletoneWithLazy getInstance() {
        if(instance == null) {
            instance = new SingletoneWithLazy();
        }
        return instance;
    }

    @Override
    public String toString() {
        return hashCode()+"";
    }
}
