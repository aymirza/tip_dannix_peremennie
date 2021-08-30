package classi_i_biblioteki.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example_Sikl_po_kajdomu_elementu {
    public static void main(String[] args) {

        // Пример лямбда-выражения Java: цикл по каждому элементу
        List<String> list = new ArrayList<String>();
        list.add("Adik");
        list.add("Badik");
        list.add("Dadik");
        list.add("Gadik");

        list.forEach(
                (n)-> System.out.println(n)
        );


    }
}
