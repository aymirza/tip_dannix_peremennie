package OOP.interfacePrimer.javarush.Messenger;

public class Telegram implements Messenger,Application{

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в Telegram");
    }
}
