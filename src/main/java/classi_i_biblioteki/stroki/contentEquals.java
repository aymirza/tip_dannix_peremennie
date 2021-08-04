package classi_i_biblioteki.stroki;

public class contentEquals {

    public static void main(String[] args) {
        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = "Сайт для изучения программирование";
        StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\" \n"+result);

        System.out.println();

        result = str2.contentEquals(str3);
        System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        System.out.println();

        result = str1.contentEquals(str4);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result);
    }
}

/*
Метод contentEquals() — возвращает значение true только в том случае,
если эта строка представляет собой ту же последовательность символов,
которая указана в строке буфера (StringBuffer).
 */
