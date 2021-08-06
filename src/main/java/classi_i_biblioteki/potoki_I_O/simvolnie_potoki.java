package classi_i_biblioteki.potoki_I_O;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class simvolnie_potoki  {
    public static void main(String[] args)  throws IOException {

        FileReader fileIn = null;
        FileWriter fileOut = null;
        try {
            fileIn = new FileReader("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O/test1.txt");
            fileOut = new FileWriter("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O/test2.txt");
            int a;
            while ((a = fileIn.read()) != -1){
                fileOut.write(a);
            }
        }finally {
            if (fileIn != null){
                fileIn.close();
            }
            if (fileOut != null){
                fileOut.close();
            }

        }

    }


}
