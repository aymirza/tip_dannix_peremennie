package classi_i_biblioteki.collection_framework.collection.devColibri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_List {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(2);  // индекс - 0
        list.add(3);  // индекс - 1
        list.add(6);  // индекс - 2

        list.remove(0);

        System.out.println("Размер лист: "+list.size());

        for (int n : list){
            System.out.println(n);
        }

        System.out.println("\n"+"Выводит все элементы с индексом");
        for (int i=0; i<list.size(); i++){
            int l = list.get(i);
            System.out.println("Элемент "+i+" = "+l);
        }

        System.out.println("\nС помощью итератор");
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nПроверка: если наша л ист пусто выходит true, если не пусто выходит false");
        boolean a = list.isEmpty();
        System.out.println(a);
    }
}
