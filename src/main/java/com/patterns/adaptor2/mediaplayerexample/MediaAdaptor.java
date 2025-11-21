package com.patterns.adaptor2.mediaplayerexample;

public class MediaAdaptor implements MediaPlayer{

    private final VlcMediaPlayer vlcMediaPlayer;
    private final Mp4Player mediaPlayer;

    public MediaAdaptor(VlcMediaPlayer vlcMediaPlayer, Mp4Player mediaPlayer) {
        this.vlcMediaPlayer = vlcMediaPlayer;
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(AudioType audioType, String fileName) {

        switch (audioType) {
            case MP3 -> {
                vlcMediaPlayer.playMusic(fileName);
                break;
            }
            case MP4 -> {
                mediaPlayer.playMp4File(fileName);
                break;
            }
            default -> {
                System.out.println("No Media player is supproted yet");
            }
        }
    }
}
