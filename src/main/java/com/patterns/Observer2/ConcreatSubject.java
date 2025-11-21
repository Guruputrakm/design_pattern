package com.patterns.Observer2;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcreatSubject implements Subject{

    private final  CopyOnWriteArrayList<Observer> observers;

    public ConcreatSubject(CopyOnWriteArrayList<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish(int temp) {
        observers.stream().forEach(observer -> observer.onEvent(temp));
    }
}
