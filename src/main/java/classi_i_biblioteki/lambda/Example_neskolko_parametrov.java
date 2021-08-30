package classi_i_biblioteki.lambda;

interface Addable{
    int add(int a, int b);
}

public class Example_neskolko_parametrov {
    public static void main(String[] args) {
        // Несколько параметров в лямбда-выражении
        Addable ad1 = (a, b) ->(a+b);
        System.out.println(ad1.add(10,20));

        // Несколько параметров с типом данных в лямбда-выражении
        Addable ad2 = (int a, int b) -> (a+b);
        System.out.println(ad2.add(100,200));

        /*
        В лямбда-выражении Java, если есть только один оператор, вы можете
        или не можете использовать ключевое слово return. Вы должны использовать
        ключевое слово return, если лямбда-выражение содержит несколько операторов.
         */

        // Лямбда-выражение без ключевого слова return
        Addable ad3 = (a, b) -> (a+b);
        System.out.println(ad3.add(11,21));

        // Лямбда-выражение с ключевым словом return
        Addable add4 = (int a, int b)->{
            return (a+b);
        };
        System.out.println(add4.add(101,201));

    }
}
