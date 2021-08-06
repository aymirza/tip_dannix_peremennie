package classi_i_biblioteki.collection_framework.arrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample1 {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France");  // добавляем элемент в самое начала
        states.push("Great Britain");   // добавление элемент в самое начала
        states.addLast("Spain");    // добавление элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst+"\n");   // Great Britain

        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast+"\n");  // Italy

        System.out.printf("Queue size "+states.size()+"\n");   // 5
        System.out.println();
        // перебор коллекции
        while (states.peek() != null){
            // извлечение с начала
            System.out.println(states.pop());
        }
        System.out.println();
        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for (Person p : people){
            System.out.println(p.getName());
        }



    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
