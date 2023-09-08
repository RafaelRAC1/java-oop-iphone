package edu.rafael.classes.interfaces;

public interface Phone {
    abstract void call(Long number);

    abstract void acceptCall();

    abstract void rejectCall();

    abstract void sendSMS(Long number, String sms);

    abstract void addContact(Long number);

    abstract void removeContact(Long number);

    abstract void endCall();

    abstract void receiveSMS();
}
