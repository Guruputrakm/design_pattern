package com.patterns.templatemethod3;

public class DemoExample {

    public static void main(String[] args) {
        Gateway gateway = amount -> {
            System.out.println("processed amount "+amount);
            return 1;
        };
        Bus bus = message -> System.out.println("[BUS] "+message);
        StandardMini standardMini = new StandardMini(gateway , bus);
        standardMini.process(2000);

        new HighValueMiniProcessor(gateway, bus).process(15000000);
    }
}
