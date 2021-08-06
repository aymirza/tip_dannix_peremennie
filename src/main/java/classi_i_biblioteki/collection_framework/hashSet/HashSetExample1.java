package classi_i_biblioteki.collection_framework.hashSet;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        //  пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded+"\n");   // false

        System.out.printf("Set contains " + states.size()+" elements");
        System.out.println();

        for (String state:states){
            System.out.println(state);
        }

        // удаление элемента
        states.remove("Germany");
        System.out.println();
        for (String st : states){
            System.out.println(st);
        }
        System.out.println();
        // хеш-таблица объектов Person
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mick"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for (Person p : people){
            System.out.println(p.getName());
        }

    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
