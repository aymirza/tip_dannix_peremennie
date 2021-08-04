package OOP.interfacePrimer.javarush.Duck_Swimmable;

public class Duck implements Swimmable {

     @Override
    public void eat() {}

    @Override
    public void run() {}

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
    }
}

/*
Класс Duck «связывается» с интерфейсом Swimmable при помощи ключевого слова implements.
Если помнишь, мы использовали похожий механизм для связи двух классов в наследовании, только там было слово «extends».

«public class Duck implements Swimmable» можно для понятности перевести дословно:
«публичный класс Duck реализует интерфейс Swimmable».
 */
