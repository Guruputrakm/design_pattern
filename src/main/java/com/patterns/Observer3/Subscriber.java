package com.patterns.Observer3;

public class Subscriber implements ISubscriber{
    private String name;

    private Videomanager videomanager;
   // private Channel channel;

    public Subscriber(String name, Videomanager videomanager) {
        this.name = name;
       // this.channel = channel;
        //channel.subscriber(this);
        this.videomanager = videomanager;
    }

    @Override
    public void update(String video) {
        Video video1 = videomanager.getVideo(video);
        System.out.println("The subscriber "+name+" got video "+video1);
    }
}
