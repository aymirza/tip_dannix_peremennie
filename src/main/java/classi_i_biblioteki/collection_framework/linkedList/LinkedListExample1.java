package classi_i_biblioteki.collection_framework.linkedList;

import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");  // добавляем на последнее место
        states.addFirst("Spain");   // добавляем на первое место
        states.add(1, "Italy");  // добавляем элемент по индексу 1

        System.out.println("List has " + states.size() + " elements");


        System.out.println("\n"+states.get(1)+"\n");


        states.set(1, "Portugal");
        for (String state : states) {
            System.out.println(state);
        }
        System.out.println();
        // проверка на наличие элемента в списке
        if (states.contains("Germany")) {
            System.out.println("List contains Germany");
        }
        System.out.println();
        states.remove("Germany");
        states.removeFirst();  // удаление первого элемента
        states.removeLast();  // удаление посленего элемента

        for (String state : states) {
            System.out.println(state);
        }
        System.out.println();

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);  // удаление второго элемента

        for (Person p : people){
            System.out.println(p.getName());
        }

        Person first = people.getFirst();
        System.out.println(first.getName());  // вывод первого элемента

    }


}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
