package com.patterns.factory;

public class PushNotifier implements Notifier{

    private static PushNotifier instance;

    private PushNotifier() {

    }

    public static PushNotifier getInstance() {
        synchronized (PushNotifier.class) {
            if(instance == null){
                instance = new PushNotifier();
            }
        }
        return instance;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending "+message+" Via PUSH notifier");
    }
}
