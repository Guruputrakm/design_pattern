package com.patterns.factory;

public class WhatsappNotifier implements Notifier{

    private static WhatsappNotifier instance;

    private WhatsappNotifier() {

    }

    public static WhatsappNotifier getInstance() {
        synchronized (WhatsappNotifier.class) {
            if(instance == null){
                instance = new WhatsappNotifier();
            }
        }
        return instance;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending "+message+" Via Whatsapp");
    }
}
