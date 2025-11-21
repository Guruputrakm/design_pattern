package com.patterns.factory;

public class ClientNotifierClass {
    public static void main(String[] args) {
        NotifierFactory notifierFactory = new SMSFactory();
        notifierFactory.sendMessage("Hello, Good morning");

        notifierFactory = new PushNotitifierFactory();
       notifierFactory.sendMessage("This is new Message");

       notifierFactory = new WhatsAppNotifierFactory();
       notifierFactory.sendMessage("WhatsApp Message, Hello");


        notifierFactory.sendMessage("Hello, Good afternoon");
    }
}
