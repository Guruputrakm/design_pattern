package com.patterns.factory;

public class SMSFactory extends NotifierFactory{
    @Override
    public Notifier create() {
        return SMSNotifier.getInstance();
    }
}
