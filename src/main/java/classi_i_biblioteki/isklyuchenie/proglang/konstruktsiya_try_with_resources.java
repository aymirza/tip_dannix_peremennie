package classi_i_biblioteki.isklyuchenie.proglang;

import java.io.File;
import java.io.FileReader;

public class konstruktsiya_try_with_resources {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File f = new File("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie/" +
                    "src/main/java/classi_i_biblioteki/isklyuchenie/proglang/test.txt");
            fr = new FileReader(f);
            char[] array = new char[15];
            fr.read(array);     // чтение содержимого массива
            for (char c : array)
                System.out.print(c);  // вывод символов на экран, один за одним
        } catch (Exception e) {
            System.out.println("not file");
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch (Exception e){
                System.out.println("not close");
                e.printStackTrace();
            }
        }
    }
}
