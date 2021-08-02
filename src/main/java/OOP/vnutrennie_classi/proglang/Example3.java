package OOP.vnutrennie_classi.proglang;

public class Example3 {
    // Метод экземпляра внешнего класса
    void my_Method(){
        int num =888;

        // Локальный метод внутреннего класса
        class MethodInner_Demo{
            public void print(){
                System.out.println("Это метод внутреннего клаcса: "+num);
            }
        } // Конец внутреннего класса

        // Доступ к внутреннему классу
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String[] args) {
        Example3 example3= new Example3();
        example3.my_Method();
    }
}

/*
В Java мы можем написать класс внутри метода, и это будет локальный тип.
Как и локальные переменные, возможности внутреннего класса ограничены в рамках метода.
Локальный метод внутреннего класса может быть создан только внутри метода,
где определяется внутренний класс.
 */