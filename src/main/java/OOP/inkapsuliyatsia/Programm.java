package OOP.inkapsuliyatsia;

public class Programm {

    public static void main(String[] args) {
        Person kate = new Person("Kate",30);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(111);
        System.out.println(kate.getAge());

    }

}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0 && age<110)
        this.age = age;
    }
}

/*

Инкапсуляция
Казалось бы, почему бы не объявить все переменные и методы с модификатором public,
чтобы они были доступны в любой точке программы вне зависимости от пакета или класса?
Возьмем, например, поле age, которое представляет возраст. Если другой класс имеет
прямой доступ к этому полю, то есть вероятность, что в процессе работы программы ему
будет передано некорректное значение, например, отрицательное число. Подобное изменение
данных не является желательным. Либо же мы хотим, чтобы некоторые данные были достуны
напрямую, чтобы их можно было вывести на консоль или просто узнать их значение.
В этой связи рекомендуется как можно больше ограничивать доступ к данным, чтобы
защитить их от нежелательного доступа извне (как для получения значения,
так и для его изменения). Использование различных модификаторов гарантирует,
что данные не будут искажены или изменены не надлежащим образом. Подобное сокрытие
данных внутри некоторой области видимости называется инкапсуляцией.

 */
