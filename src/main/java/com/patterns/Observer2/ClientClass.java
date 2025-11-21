package com.patterns.Observer2;

import java.util.concurrent.CopyOnWriteArrayList;

public class ClientClass {
    public static void main(String[] args) {
        Observer observer = new EmailObserver();

        Observer observer2 = new EmailObserver();

        Observer observer3 = new EmailObserver();

        Subject subject = new ConcreatSubject(new CopyOnWriteArrayList<>());
        subject.subscribe(observer);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.publish(25);
    }
}
