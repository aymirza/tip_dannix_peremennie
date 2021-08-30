package classi_i_biblioteki.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Example_comparator {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        // добавление товаров
        list.add(new Product(1,"Notebook HP",2500f));
        list.add(new Product(3,"Keyboard", 300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Сортировка по имени ...");

        // реализация лямбда-выражения
        Collections.sort(list,(p1,p2) ->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }

}
