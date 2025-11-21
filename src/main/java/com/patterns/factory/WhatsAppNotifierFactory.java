package com.patterns.factory;

public class WhatsAppNotifierFactory extends NotifierFactory{
    @Override
    public Notifier create() {
        return WhatsappNotifier.getInstance();
    }
}
