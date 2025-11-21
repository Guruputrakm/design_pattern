package com.patterns.Observer3;

public interface IChannel {

   void subscriber(ISubscriber subscriber);

   void unSubscribe(ISubscriber subscriber);

   void notifySubscribers(String video);

}
