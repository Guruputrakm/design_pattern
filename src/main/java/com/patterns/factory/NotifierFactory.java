package com.patterns.factory;

public abstract class NotifierFactory {

    protected abstract Notifier create();

    public void sendMessage(String message){
        Notifier n = create();
        System.out.println(n.hashCode());
        n.notify(message);
    }

}
