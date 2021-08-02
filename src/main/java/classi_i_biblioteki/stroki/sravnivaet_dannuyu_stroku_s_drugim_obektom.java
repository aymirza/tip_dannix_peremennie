package classi_i_biblioteki.stroki;

/*
Метод compareTo() в Java структурирован двумя вариантами. Первый: метод сравнивает
строку с другим объектом, а второй: метод лексически сравнивает две строки.
Как работает compareTo() с числовым объектом мы рассмотрели в прошлом уроке.
Рассмотрим второй вариант: сравнение двух строк.
 */


public class sravnivaet_dannuyu_stroku_s_drugim_obektom {

    public static void main(String[] args) {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим айтишником";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
    }
}
