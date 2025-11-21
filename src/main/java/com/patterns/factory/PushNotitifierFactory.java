package com.patterns.factory;

public class PushNotitifierFactory extends NotifierFactory{
    @Override
    public Notifier create() {
        return PushNotifier.getInstance();
    }
}
