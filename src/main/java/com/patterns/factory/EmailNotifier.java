package com.patterns.factory;

public class EmailNotifier implements Notifier{
    private static EmailNotifier instance;

    private EmailNotifier() {

    }

    public static EmailNotifier getInstance() {
        synchronized (EmailNotifier.class) {
            if(instance == null){
                instance = new EmailNotifier();
            }
        }
        return instance;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending "+message+" Via EMAIL");
    }
}
