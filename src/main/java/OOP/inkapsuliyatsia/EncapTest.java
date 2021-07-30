package OOP.inkapsuliyatsia;

public class EncapTest {
    private String name;
    private String idnum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*

    Инкапсуляция в Java является механизмом обёртывания данных (переменных) и кода,
работающего с данными (методами), в одно целое. В инкапсуляции переменные класса
будут скрыты от других классов и доступ к ним может быть получен только с помощью
метода их текущего класса. По-другому это называется скрытием данных.

Для достижения инкапсуляции в Java:

  Объявите переменные класса как private.
Предоставьте public к методам установки и получения (сеттеру и геттеру)
для изменения и просмотра значений переменных.


 */
