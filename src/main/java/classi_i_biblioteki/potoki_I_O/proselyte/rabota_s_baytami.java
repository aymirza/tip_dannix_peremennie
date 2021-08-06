package classi_i_biblioteki.potoki_I_O.proselyte;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class rabota_s_baytami {
    public static void main(String[] args) throws Exception{

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie/src" +
                    "/main/java/classi_i_biblioteki/potoki_I_O/proselyte/inputFile.txt");
            outputStream = new FileOutputStream("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie/src" +
                    "/main/java/classi_i_biblioteki/potoki_I_O/proselyte/outputFile.txt");
            int element;
            while ((element = inputStream.read()) != -1){
                outputStream.write(element);
            }
            System.out.println("Copying information complated.");

        }finally {
            if (inputStream != null){
                inputStream.close();
            }
            if (outputStream != null){
                outputStream.close();
            }


        }
    }
}
