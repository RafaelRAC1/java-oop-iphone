package edu.rafael.classes.interfaces;

public interface MusicPlayer {
    abstract void playmusic(String music);

    abstract void stopMusic();

    abstract void nextTrack();

    abstract void previousTrack();

    abstract void volumeUp();

    abstract void volumeDown();
}
