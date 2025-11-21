package com.patterns.adaptor2.mediaplayerexample;

public class AudioPlayer {
    public static void main(String[] args) {
        MediaAdaptor mediaAdaptor = new MediaAdaptor(new VlcMediaPlayer(), new Mp4Player());
        mediaAdaptor.play(AudioType.MP3,"Kansugara");

        mediaAdaptor.play(AudioType.MP4, "Mungarumale ");
    }
}
