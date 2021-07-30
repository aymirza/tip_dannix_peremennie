package OOP.Nasledovanie.otnoshenie_IS_A;

class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
}

public class Dog extends Mammal {

    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}


/*

Основываясь на примере выше, в объектно-ориентированных терминах, следующие утверждения верны

Animal является суперклассом класса Mammal.
Animal является суперклассом класса Reptile.
Mammal и Reptile являются подклассами класса Animal.
Dog одновременно является подклассом классов Mammal и Animal.
Теперь, используя отношение IS-A, мы можем сказать так:

Mammal IS-A Animal.
Reptile IS-A Animal.
Dog IS-A Mammal.
Таким образом, Dog IS-A тоже Animal.

С использованием ключевого слова extend, подклассы могут
наследовать все свойства суперкласса кроме его приватных свойств (private).

 */