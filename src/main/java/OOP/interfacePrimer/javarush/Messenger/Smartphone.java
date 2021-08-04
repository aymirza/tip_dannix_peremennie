package OOP.interfacePrimer.javarush.Messenger;

public class Smartphone {

    private Application application;

    public Smartphone(){
        this.application = new Telegram();
    }
}
