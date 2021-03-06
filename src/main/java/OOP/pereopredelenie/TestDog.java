package OOP.pereopredelenie;

class Animal{
    public void move(){
        System.out.println("Животные могут двигаться");
    }
}
class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("Собаки могут ходить и бегать");
    }
    public void bark(){
        System.out.println("Собаки могут лаять");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();  // Animal - ссылка и объект
        Animal b = new Dog();   // Animal - ссылка, но Dog - объект

        a.move();   // Запускает метод в классе Animal
        b.move();   // Запускает метод в классе Dog

    }
}
