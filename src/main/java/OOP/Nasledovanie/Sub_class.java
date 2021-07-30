package OOP.Nasledovanie;
// Интерфейс
class Super_class{
    int num=88;

    // Метод display() суперкласс
    public void display(){
        System.out.println("Это метод display() суперкласса");
    }
}

public class Sub_class extends Super_class {

    int num = 77;
    // Метод dispay() субкласса
    public void display(){
        System.out.println("Это метод display()  подкласса");
    }

    public void my_method(){
        // иницализация подкласса
        Sub_class sub = new Sub_class();
        // Вызоваем метод dispaly() подкласса
        sub.display();
        // Вызываем метод display() суперкласса
        super.display();
        // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в подклассе: "+sub.num);
        // Выводим значение переменной num сурекласса
        System.out.println("Значение переменной тгь в суперклассе: "+super.num);
    }

    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }

}
