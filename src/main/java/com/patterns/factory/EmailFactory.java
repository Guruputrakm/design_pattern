package com.patterns.factory;

public class EmailFactory extends NotifierFactory{
    @Override
    public Notifier create() {
        return EmailNotifier.getInstance();
    }
}
