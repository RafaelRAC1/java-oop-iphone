import edu.rafael.classes.model.Computer;
import edu.rafael.classes.model.Iphone;
import edu.rafael.classes.model.Ipod;
import edu.rafael.classes.model.MobilePhone;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Ipod myIpod = new Ipod();
        MobilePhone myMobilePhone = new MobilePhone();
        Iphone myIphone = new Iphone();
        System.out.println("------ COMPUTER ------");
        myComputer.openPage("https://linkedin.com");
        myComputer.closePage();
        myComputer.openPage("https://github.com");
        myComputer.previousPage();
        myComputer.nextPage();
        myComputer.refresh();
        myComputer.favorite("https://linkedin.com");

        System.out.println("\n------ IPHONE ------");
        myIphone.openPage("https://linkedin.com");
        myIphone.closePage();
        myIphone.openPage("https://github.com");
        myIphone.previousPage();
        myIphone.nextPage();
        myIphone.refresh();
        myIphone.favorite("https://linkedin.com");

        System.out.println("\n------ MOBILE PHONE ------");
        myMobilePhone.call(1193085443L);
        myMobilePhone.endCall();
        myMobilePhone.acceptCall();
        myMobilePhone.endCall();
        myMobilePhone.rejectCall();
        myMobilePhone.addContact(1193085443L);
        myMobilePhone.sendSMS(1193085443L, "HELLO!");
        myMobilePhone.removeContact(1193085443L);

        System.out.println("\n------ IPHONE ------");
        myIphone.call(1193085443L);
        myIphone.endCall();
        myIphone.acceptCall();
        myIphone.endCall();
        myIphone.rejectCall();
        myIphone.addContact(1193085443L);
        myIphone.sendSMS(1193085443L, "HELLO!");
        myIphone.removeContact(1193085443L);

        System.out.println("\n------ IPOD ------");
        myIpod.playmusic("SCARLET FIRE");
        myIpod.nextTrack();
        myIpod.previousTrack();
        myIpod.volumeUp();
        myIpod.volumeDown();
        myIpod.stopMusic();

        System.out.println("\n------ IPHONE ------");
        myIphone.playmusic("SCARLET FIRE");
        myIphone.nextTrack();
        myIphone.previousTrack();
        myIphone.volumeUp();
        myIphone.volumeDown();
        myIphone.stopMusic();
    }
}