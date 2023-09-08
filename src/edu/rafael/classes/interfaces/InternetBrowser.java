package edu.rafael.classes.interfaces;

public interface InternetBrowser {
    void openPage(String page);

    void previousPage();

    void nextPage();

    void refresh();

    void favorite(String page);

    void closePage();
}
