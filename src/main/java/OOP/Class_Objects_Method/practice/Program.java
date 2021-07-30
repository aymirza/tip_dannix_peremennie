package OOP.Class_Objects_Method.practice;

public class Program {
    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person jerry = new Person("Jerry", 21);
        jerry.displayInfo();

    }
}

class Person {

    String name;
    int age;

    {
        name = "Undefined";
        age = 18;
    }

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + "   " + "Age: " + age);
    }

}
