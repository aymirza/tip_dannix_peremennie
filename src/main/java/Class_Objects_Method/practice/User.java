package Class_Objects_Method.practice;

public class User {

    //локальные переменные
    String name;  // переменных экземпляра имя
    short age;    // переменных экземпляра возраст
    int height;   // переменных экземпляра рост

    // Метод infoUser
    void infoUser() {
        System.out.println(name + age + height);
    }

    // Универсальный метод
    public User() {
    }

    public static void main(String[] args) {

        User user1 = new User(); // Создание объект

        // изменение имя и возраст и рост
        user1.name = "AAA";   // присвоем значение
        user1.age = 25;       // присвоем значение
        user1.height = 180;   // присвоем значение
        System.out.println(user1.name+" "+user1.age+" "+user1.height+" ");
    }
}
