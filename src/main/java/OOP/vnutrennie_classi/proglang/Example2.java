package OOP.vnutrennie_classi.proglang;

class Outer_Demo1{
    // Частная переменая внешного класса
    private int num=2018;

    // Внутренний класс
    public class Inner_Demo{
        public int getNum(){
            System.out.println("Это метод getNum() внутреннего класса");
            return num;
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Создание внешнего класса
        Outer_Demo1 outer = new Outer_Demo1();
        // Создание внутреннего класса
        Outer_Demo1.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }

}
/*
Доступ к частным (private) членам
Как упоминалось ранее, внутренние классы также используются в
Java для доступа к закрытым членам класса. Предположим, у класса
есть private члены. Для доступа к ним напишите в нем внутренний
класс, верните частные члены из метода внутри внутреннего класса,
скажем, методом getValue() и, наконец, из другого класса (из которого
Вы хотите получить доступ к закрытым членам) вызовите метод getValue() внутреннего класса.
 */