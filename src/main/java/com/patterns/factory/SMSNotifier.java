package com.patterns.factory;

public class SMSNotifier implements Notifier{

    private static SMSNotifier instance;

    private SMSNotifier() {

    }

    public static SMSNotifier getInstance() {
        synchronized (SMSNotifier.class) {
            if(instance == null){
                instance = new SMSNotifier();
            }
        }
        return instance;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending "+message+" Via SMS");
    }
}
