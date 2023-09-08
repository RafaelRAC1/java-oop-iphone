package edu.rafael.classes.model;

import edu.rafael.classes.interfaces.MusicPlayer;

public class Ipod implements MusicPlayer {
    @Override
    public void playmusic(String music) {
        System.out.println("PLAYING " + music);
    }

    @Override
    public void stopMusic() {
        System.out.println("STOPPING MUSIC");
    }

    @Override
    public void nextTrack() {
        System.out.println("PLAYING NEXT TRACK");
    }

    @Override
    public void previousTrack() {
        System.out.println("PLAYING PREVIOUS TRACK");
    }

    @Override
    public void volumeUp() {
        System.out.println("VOLUME UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("VOLUME DOWN");
    }
}
