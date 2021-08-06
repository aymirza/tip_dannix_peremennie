package classi_i_biblioteki.potoki_I_O.proselyte;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws Exception{

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);

        System.out.println("Enter the string (up to 12 elements");
        while (byteArrayOutputStream.size() != 13){
            byteArrayOutputStream.write(System.in.read());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        System.out.println("Byte Array; ");
        for (byte b:byteArray){
            System.out.print((char) b + " ");
        }

        System.out.println("\n=======================================");

        int i;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        System.out.println("Now we will convert all elements of array to lower case: ");

        while ((i = byteArrayInputStream.read()) != -1){
            System.out.println(Character.toUpperCase((char) i));
        }
        byteArrayInputStream.close();
    }
}
