package edu.rafael.classes.model;

import edu.rafael.classes.interfaces.InternetBrowser;

public class Computer implements InternetBrowser {

    @Override
    public void openPage(String url) {
        System.out.println("OPENING "+url);
    }

    @Override
    public void previousPage() {
        System.out.println("GOING BACK TO PREVIOUS PAGE");
    }

    @Override
    public void nextPage() {
        System.out.println("GOING BACK TO NEXT PAGE");
    }

    @Override
    public void refresh() {
        System.out.println("REFRESHING PAGE");
    }

    @Override
    public void favorite(String url) {
        System.out.println("FAVORITE URL "+url);
    }

    @Override
    public void closePage() {
        System.out.println("CLOSE PAGE");
    }
}
