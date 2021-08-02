package OOP.vnutrennie_classi.metanit;

public class Programm {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        System.out.println();
        tom.account.displayAccount();
    }

}

class Person {

    private String name;
    Account account;

    public Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson() {
        System.out.println("Person Name: " + name + "\nPassword: " + account.password);
    }

    public class Account {
        private String password;

        Account(String pass) {
            this.password = pass;
        }

        void displayAccount() {
            System.out.println("Account Login: " + Person.this.name + "\nPassword: " + password);
        }
    }
}