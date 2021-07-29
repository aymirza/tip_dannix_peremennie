package Class_Objects_Method.Cat;

public class Cat_static {
    String name;
    int age;
    static int count = 0;

    public static void main(String[] args) {
        Cat_static barsik = new Cat_static();
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Cat_static vasia = new Cat_static();
        vasia.age = 5;
        vasia.name = "Вася";
        count++;

        System.out.println("Мы создали кота по имени "+barsik.name+", его возраст - "+barsik.age);
        System.out.println("Мы создали кота по имени "+vasia.name+", его возраст - "+vasia.age);

        System.out.println("общее количество котов = "+count);
    }
}

/*

Теперь у нас в классе появилась новая переменная — count (количество).
 Она отвечает за подсчет созданных котов. Каждый раз, когда в методе main
 мы создаем кота, мы увеличиваем эту переменную на 1.

Эта переменная обозначена ключевым словом static. Это значит, что она
принадлежит классу, а не конкретному объекту класса. Что, конечно,
логично: если имя у каждого кота должно быть свое, то счетчик котов
нам нужен один на всех. Именно этого позволяет добиться слово
static — переменная count одна для всех котов.

Обрати внимание: когда мы выводим ее в консоль, мы не пишем barsik.count
или vasia.count. Она не принадлежит ни Барсику, ни Васе — она принадлежит
всему классу Cat. Поэтому — просто count.

Можно также написать Cat.count — это тоже будет правильно.

 */
