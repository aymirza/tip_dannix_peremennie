package classi_i_biblioteki.isklyuchenie.proglang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class mnogokratnie_bloki_catch {
    public static void main(String[] args) {

        try {
            int[] a = new int[]{2,5,8,};
            for (int i=0; i<a.length;i++)

            System.out.println(a[3]);
        }catch (Exception e){
            e.printStackTrace();
        } /*catch (ArrayIndexOutOfBoundsException e) // ne rabotaet potomu shto predidushiy Exception uje otvetil oshibku
        {
            e.printStackTrace();
        }*/
    }
}
