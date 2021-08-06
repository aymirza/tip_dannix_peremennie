package classi_i_biblioteki.isklyuchenie.youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// тема исключение
public class Exceptions1 {
    public static void main(String[] args)   {

        File file = new File("src/main/java/classi_i_biblioteki/isklyuchenie/youtube/test.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println();
            System.out.println("Vnutri try");
        } catch (FileNotFoundException e) {
            System.out.println("Fail ne nayden");
        }
        System.out.println("После блока try catch");
    }
}
