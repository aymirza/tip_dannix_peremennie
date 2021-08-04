package OOP.pereopredelenie;

class Animal1{
    public void move(){
        System.out.println("Животные могут двигаться");
    }
}
class Dog1 extends Animal{
    @Override
    public void move() {
        super.move();    // Вызывает метод суперкласса
        System.out.println("Собаки могут ходить и бегать");
    }
}
public class TestDog_super {

    public static void main(String[] args) {
        Animal b = new Animal();  // Aminal - ссылка, но Dog - Объект
        b.move();
    }

}
