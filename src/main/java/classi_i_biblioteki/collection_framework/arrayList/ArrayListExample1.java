package classi_i_biblioteki.collection_framework.arrayList;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1,"Bob");  // добавляем элемент по индексу 1

        System.out.println(people.get(1));  // получаем 2-й объект
        people.set(1,"Robert"); // установка нового значение для 2-го объекта

        System.out.println("ArrayList has "+people.size()+" elements \n");
        for (String person:people){
            System.out.println(person);
        }

        // проверяем наличие элемента
        if (people.contains("Tom")){
            System.out.println("\nArrayList contains Tom \n");
        }

        // удаляем несколько объектов
        // удаляем конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray){
            System.out.println(person);
        }
    }
}
