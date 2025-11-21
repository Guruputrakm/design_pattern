package com.patterns.Observer3;

import java.util.ArrayList;
import java.util.List;

public class Videomanager {
   private List<Video> videos;
   public static Videomanager instance = getInstance();
   private Videomanager(){
       videos = new ArrayList<>();
   }


    private static Videomanager getInstance() {

       if(instance == null){
        synchronized (Videomanager.class){
            if(instance == null) {
                instance = new Videomanager();
            }
        }
       }
       return instance;
   }

   public void uploadVideo(String video, Channel channel){
       videos.add(new Video(video));
       if(channel != null){
            channel.notifySubscribers(video);
       }

   }

   public Video getVideo(String video){
       return videos.stream().filter(v -> v.getName().equalsIgnoreCase(video)).findFirst().orElseThrow( () -> new RuntimeException("Video not present"));
   }



}
