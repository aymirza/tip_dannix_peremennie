package OOP.vnutrennie_classi.proglang;

class Outer_Demo {
    int num;
    // Внутренний класс
    private class Inner_Demo{
        public void print(){
            System.out.println("Это внутренный класс");
        }
    }

    // Доступ к внутреннему классу из метода
    void display_Inner(){
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class Example1{
    public static void main(String[] args) {
        // Создание внешнего класса
        Outer_Demo example1 = new Outer_Demo();
        // Доступ к методу display_Inner()
        example1.display_Inner();
    }
}

/*
Здесь Вы можете заметить, что Outer_Demo – внешний класс,
Inner_Demo – внутренний класс,display_Inner() – метод,
внутри которого мы создаем внутренний класс, и этот метод
вызывается из основного метода.
 */
