package classi_i_biblioteki.isklyuchenie.youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// тема исключение
public class Exceptions2 {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка файл ошибка");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("weas");
        Scanner scanner = new Scanner(file);
    }
}
