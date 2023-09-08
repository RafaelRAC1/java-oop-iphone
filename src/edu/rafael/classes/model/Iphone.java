package edu.rafael.classes.model;

import edu.rafael.classes.interfaces.InternetBrowser;
import edu.rafael.classes.interfaces.MusicPlayer;
import edu.rafael.classes.interfaces.Phone;

public class Iphone implements MusicPlayer, InternetBrowser, Phone {

    @Override
    public void openPage(String page) {
        System.out.println("OPENING PAGE "+page+" IPHONE");
    }

    @Override
    public void previousPage() {
        System.out.println("PREVIOUS PAGE IPHONE");
    }

    @Override
    public void nextPage() {
        System.out.println("NEXT PAGE IPHONE");
    }

    @Override
    public void refresh() {
        System.out.println("REFRESHING PAGE IPHONE");
    }

    @Override
    public void favorite(String page) {
        System.out.println("FAVORITE PAGE "+page+" IPHONE");
    }

    @Override
    public void closePage() {
        System.out.println("CLOSING PAGE IPHONE");
    }

    @Override
    public void playmusic(String music) {
        System.out.println("PLAYING MUSIC "+music+" IPHONE");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOPPING MUSIC IPHONE");
    }

    @Override
    public void nextTrack() {
        System.out.println("NEXT TRACK IPHONE");
    }

    @Override
    public void previousTrack() {
        System.out.println("GOING TO PREVIOUS TRACK IPHONE");
    }

    @Override
    public void volumeUp() {
        System.out.println("TURNING VOLUME UP IPHONE");
    }

    @Override
    public void volumeDown() {
        System.out.println("TURNING VOLUME DOWN IPHONE");
    }

    @Override
    public void call(Long number) {
        System.out.println("CALLING NUMBER "+number+" IPHONE");
    }

    @Override
    public void acceptCall() {
        System.out.println("ACCEPTING CALL IPHONE");
    }

    @Override
    public void rejectCall() {
        System.out.println("REJECTING CALL IPHONE");
    }

    @Override
    public void sendSMS(Long number, String sms) {
        System.out.println("SENDING SMS '"+sms+"' TO NUMBER "+number+" IPHONE");
    }

    @Override
    public void addContact(Long number) {
        System.out.println("ADDING CONTACT "+number+" IPHONE");
    }

    @Override
    public void removeContact(Long number) {
        System.out.println("REMOVING CONTACT "+number+" IPHONE");
    }

    @Override
    public void endCall() {
        System.out.println("ENDING CALL IPHONE");
    }

    @Override
    public void receiveSMS() {
        System.out.println("RECEIVING SMS IPHONE");
    }
}
