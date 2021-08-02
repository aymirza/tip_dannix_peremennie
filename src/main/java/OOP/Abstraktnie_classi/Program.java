package OOP.Abstraktnie_classi;

public class Program {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam","Leman Brothers");
        sam.display();
        System.out.println();
        Client bob = new Client("Bob","Lemon Brothers");
        bob.display();
    }
}

abstract class Person{
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public abstract void display();
}

class Employee extends Person{
    private String bank;
    public Employee(String name, String company){
        super(name);
        this.bank=company;
    }
    public void display(){
        System.out.println("Employee name: "+super.getName()+"\nBank: "+bank);
    }
}
class Client extends Person{
    private String bank;

    public Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }
    public void display(){
        System.out.println("Client Name: "+super.getName()+"\nBank: "+bank);
    }
}

/*

Зачем нужны абстрактные классы? Допустим, мы делаем программу для обслуживания
банковских операций и определяем в ней три класса: Person, который описывает
человека, Employee, который описывает банковского служащего, и класс Client,
который представляет клиента банка. Очевидно, что классы Employee и Client будут
производными от класса Person, так как оба класса имеют некоторые общие поля и методы.
И так как все объекты будут представлять либо сотрудника, либо клиента банка,
то напрямую мы от класса Person создавать объекты не будем. Поэтому имеет смысл сделать его абстрактным.

 */