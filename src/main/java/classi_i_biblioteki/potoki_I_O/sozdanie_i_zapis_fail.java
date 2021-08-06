package classi_i_biblioteki.potoki_I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class sozdanie_i_zapis_fail {
    public static void main(String[] args) {
        try {
            char[] c= {'a','b','c','d','e'};
            OutputStream output = new FileOutputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O/test1.txt");     // Создание текстового файла
            for (int i=0; i<c.length; i++){
                output.write(c[i]); // Запись каждого символа в текстовый файл
            }
            output.close();
            InputStream input = new FileInputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
            "/src/main/java/classi_i_biblioteki/potoki_I_O/test1.txt");
            int size = input.available();

            for (int j = 0; j< size; j++){
                System.out.println((char) input.read()+ " "); // Чтение текстового файла посимвольно
            }
            input.close();
        }catch (Exception e){
            System.out.println("Exception");

        }
    }
}
