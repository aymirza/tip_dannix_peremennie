package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;


import java.util.Scanner;
import java.util.function.Supplier;

interface Example5<T>{
    T get();
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Example_Supplier {
    public static void main(String[] args) {

        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("В ведите имя: ");
            String name = in.nextLine();
            return new User(name);
        };
        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println("Имя user1: "+user1.getName());
        System.out.println("Имя user2: "+user2.getName());
    }
}
