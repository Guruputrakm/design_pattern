package com.patterns.Observer3;

import com.principle2.lsp.A;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{
    private List<ISubscriber> subscribers = new ArrayList<>();
    private String name;
    private Videomanager videomanager;
    public Channel(String name) {
        this.name = name;
    }

   /* public void updateVideo(String latestVideo) {

        notifySubscribers();
    }

    public String getLatestVideo() {
        return "Checkout our new video "+this.latestVideo;
    }
*/
    @Override
    public void subscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String video) {
        subscribers.stream().forEach( s -> s.update(video));
    }

}
