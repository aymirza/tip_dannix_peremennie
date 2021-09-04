package classi_i_biblioteki.lambda.metanit;

public class Example_ssilki_na_konstruktori {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());
    }
}
interface UserBuilder{
    User create(String name);
}
class User{
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}
