package edu.rafael.classes.model;

import edu.rafael.classes.interfaces.Phone;

public class MobilePhone implements Phone {

    @Override
    public void call(Long number) {
        System.out.println("CALLING "+number);
    }

    @Override
    public void acceptCall() {
        System.out.println("ACCEPTING CALL");
    }

    @Override
    public void rejectCall() {
        System.out.println("REJECTING CALL");
    }

    @Override
    public void sendSMS(Long number, String sms) {
        System.out.println("SENDING MESSAGE '"+sms+"' TO NUMBER "+number);
        receiveSMS();
    }

    @Override
    public void addContact(Long number) {
        System.out.println("ADDING CONTACT WITH NUMBER "+number);
    }

    @Override
    public void removeContact(Long number) {
        System.out.println("REMOVING CONTACT WITH NUMBER "+number);
    }

    @Override
    public void endCall() {
        System.out.println("ENDING CALL");
    }

    @Override
    public void receiveSMS() {
        System.out.println("RECEIVING SMS");
    }
}
