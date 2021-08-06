package classi_i_biblioteki.potoki_I_O;

import java.io.IOException;
import java.io.InputStreamReader;

public class standartnie_potoki {
    public static void main(String[] args) throws IOException {
        InputStreamReader inStRe = null;
        try {
            inStRe = new InputStreamReader(System.in);

            System.out.println("Введите символ, символ 'q' для выхода");
            char a;
            do {
                a = (char) inStRe.read();
                System.out.print(a);
            }while (a != 'q');
        }finally {
            if (inStRe != null){
                inStRe.close();
            }
        }
    }
}
