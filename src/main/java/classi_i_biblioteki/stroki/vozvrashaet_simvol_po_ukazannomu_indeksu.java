package classi_i_biblioteki.stroki;

/*
Метод charAt() — возвращает символ, расположенный по
указанному индексу строки. Индексы строк в Java начинаются с нуля.
 */
public class vozvrashaet_simvol_po_ukazannomu_indeksu {

    public static void main(String[] args) {
        String s ="Я буду хорошим программистом!";

        char result1 = s.charAt(8); //В Java charAt() возвращает символ из массива строки по указанному индексу.
        char result2 = s.charAt(11); //В Java charAt() возвращает символ из массива строки по указанному индексу.
        System.out.println("Восьмой символ строки - "+result1);
        System.out.println("Одиннадчатый символ строки - "+result2);

    }

}
