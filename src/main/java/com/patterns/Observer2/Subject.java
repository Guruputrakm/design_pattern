package com.patterns.Observer2;

public interface Subject {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void publish(int temp);
}
