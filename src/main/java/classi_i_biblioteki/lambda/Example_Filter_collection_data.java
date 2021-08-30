package classi_i_biblioteki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1 {
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Example_Filter_collection_data {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<Product1>();
        list.add(new Product1(1,"Samsung A5",17000f));
        list.add(new Product1(2,"Iphone 6S",65000f));
        list.add(new Product1(5,"Sony Xperia",25000f));
        list.add(new Product1(6,"Nokia Lumia",15000f));
        list.add(new Product1(4,"Redmi 4",26000f));
        list.add(new Product1(3,"Lenovo Vibe",19000f));

        // использование лямбда для  фильтрации данных
        Stream<Product1> filtered_data = list.stream().filter(p -> p.price > 20000      );

        filtered_data.forEach(
                product1 -> System.out.println(product1.name+ ": "+product1.price)
        );


    }
}
