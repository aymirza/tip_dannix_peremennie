package classi_i_biblioteki.potoki_I_O;

import java.io.File;

public class spisok_failov_v_papke {
    public static void main(String[] args) {
        File pathDir = null;
        String[] pathFileAndDir;
        try {
            // Создани нового объекта file
            pathDir = new File("C:/Users/user/Desktop/AYKA/java/lessons/tip_dannix_peremennie" +
                    "/src/main/java/classi_i_biblioteki/potoki_I_O"); // Обязательно должен существовать указанный каталог на диске, иначе выдост ощибку

            // Массив файлов и папок
            pathFileAndDir = pathDir.list();

            for (String path : pathFileAndDir) {
                // Вывод списка файлов и каталогов
                System.out.println(path);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
