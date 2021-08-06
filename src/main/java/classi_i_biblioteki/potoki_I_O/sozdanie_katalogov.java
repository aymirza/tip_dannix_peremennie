package classi_i_biblioteki.potoki_I_O;

import java.io.File;

public class sozdanie_katalogov {
    public static void main(String[] args) {
        String nameDir = "C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
        "/src/main/java/classi_i_biblioteki/potoki_I_O/mkdir";
        File a = new File(nameDir);
        // Создание на диске папки и всех выщестоящих каталогов
        a.mkdirs();
    }
}
