package com.patterns.command2;

public class TV {

    private int volumnSize;
    public void channelChange(String toChannel, String from) {
        System.out.println("The channel has been changed from "+from+" to "+toChannel);
    }

    public void increaseVolum() {
        this.volumnSize++;
        System.out.println("Volum upadted to "+this.volumnSize);
    }

    public void reduceVolum() {
        this.volumnSize--;
        System.out.println("the value reduced to "+this.volumnSize);
    }

}
