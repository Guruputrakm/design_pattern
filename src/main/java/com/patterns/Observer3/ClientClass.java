package com.patterns.Observer3;

public class ClientClass {
    public static void main(String[] args) {

        Channel youTube = new Channel("YouTube");
    /*    ISubscriber subscriber1 = new Subscriber("Guru", youTube);
        ISubscriber subscriber2 = new Subscriber("Kiran", youTube);
*/

        // Alternatively we can subscribe to the channel when the user object it self is created
        //youTube.subscriber(subscriber1);
       // youTube.subscriber(subscriber2);
        Videomanager instance = Videomanager.instance;

        ISubscriber subscriber = new Subscriber("Guru", instance);
        ISubscriber subscriber1 = new Subscriber("Kiran", instance);
        youTube.subscriber(subscriber);
        youTube.subscriber(subscriber1);

        instance.uploadVideo("Design pattern", youTube);

    }
}
