package OOP.Class_Objects_Method;

public class Konstruktor_class {

    public Konstruktor_class(){
    }

    // Так выглядит конструктор в Java и у него один параметр, name.
    public Konstruktor_class(String name){
        // Это конструктор у него один параметр, name.
        System.out.println("Передеваемое имя: " + name);
    }

    public static void main(String[] args) {

        // Создание объекта по именам myFirstOvject
        Konstruktor_class muFirstObject = new Konstruktor_class("Багет");

    }

  /*
        Переменные и методы доступны через созданные объекты.
        Чтобы получить доступ к переменной экземпляра, полный
        путь должен выглядеть следующим образом::

        *//* Сначала создайте объект *//*
        ObjectReference = new Constructor();

        *//* Теперь вызовите переменную следующим образом *//*
        ObjectReference.variableName;

        *//* Теперь Вы можете вызвать метод класса *//*
        ObjectReference.MethodName();
*/

}
