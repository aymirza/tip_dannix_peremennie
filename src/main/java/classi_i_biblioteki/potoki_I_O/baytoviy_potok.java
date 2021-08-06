package classi_i_biblioteki.potoki_I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class baytoviy_potok {
    public static void main(String[] args) throws IOException {

        FileInputStream filein = null;
        FileOutputStream fileout = null;

        try {
            filein = new FileInputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O/test1.txt");
            fileout = new FileOutputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O/test2.txt");
            int a;
            while ((a = filein.read()) != -1){
                fileout.write(a);
            }
            System.out.println("Zadacha sdelano");

    }finally {
            if (filein != null){
                filein.close();
            }
            if (fileout != null){
                fileout.close();
            }

        }
        }
}

/*
Потоки байтов в Java используются для осуществления ввода и вывода 8-битных байтов.
Не смотря на множество классов, связанных с потоками байтов, наиболее распространено
использование следующих классов: FileInputStream и FileOutputStream. Ниже рассмотрен
пример, иллюстрирующий использование данных двух классов для копирования из одного файла в другой.
 */
