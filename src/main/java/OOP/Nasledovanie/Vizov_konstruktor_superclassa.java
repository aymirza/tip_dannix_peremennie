package OOP.Nasledovanie;

class Superclass{
    int age;

    Superclass(int age){
        this.age=age;
    }

    public void getAge() {
        System.out.println("Значение переменной age в суперклассе равно: "+age);
    }
}
public class Vizov_konstruktor_superclassa extends Superclass{
    Vizov_konstruktor_superclassa(int age){
        super(age);
    }

    public static void main(String[] args) {
        Vizov_konstruktor_superclassa obj = new Vizov_konstruktor_superclassa(24);
        obj.getAge();
    }


}
