package classi_i_biblioteki.stroki;

/*
В Java compareTo() получает значение 0, если аргумент является строкой лексически
равной данной строке; значение меньше 0, если аргумент является строкой лексически
большей, чем сравниваемая строка; и значение больше 0, если аргумент является строкой
лексически меньшей этой строки.
 */
public class Sravnivaet_dve_stroki_leksicheski_ignoriruya_registr_bukv {

    public static void main(String[] args) {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим айтишником";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }
}
