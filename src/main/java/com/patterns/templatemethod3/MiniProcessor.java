package com.patterns.templatemethod3;

public abstract class MiniProcessor {

    private final Gateway gateway;
    private final Bus bus;

    public MiniProcessor(Gateway gateway, Bus bus) {
        this.gateway = gateway;
        this.bus = bus;
    }

    public final boolean process(int amount) {
        validate(amount);
        int process = gateway.process(amount);
        bus.publish((process ==1) ? "OK":"FAIL");
        return process==1;
    }
    protected void validate(int amount) {
        if(amount <=0) throw new IllegalArgumentException("Minimu is 1 rupee");
    }
}
