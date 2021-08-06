package classi_i_biblioteki.isklyuchenie.proglang;

import javax.naming.InsufficientResourcesException;
import java.rmi.RemoteException;

public class klyuchevie_slova_throws_and_throw {

    // Primer 1 (method-da bitta isklyuchenieni nasledovat etu
    public void deposit(double amout) throws RemoteException{
        // Реализация метода
        throw new RemoteException();
    }
    // Остаток определения класса


    // Primer 2 (eger mnojestvenniy isklyuchenie jazu kerek bolsa method-qa nasledovat qilip vergulmen jazip ketse boladi)
    public void withdraw(double amout) throws RemoteException, InsufficientResourcesException{
        // реализация метод
    }
    // Остаток определения класса


}


