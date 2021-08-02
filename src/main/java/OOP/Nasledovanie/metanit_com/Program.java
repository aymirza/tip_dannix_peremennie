package OOP.Nasledovanie.metanit_com;

public class Program {
    public static void main(String[] args) {


        Employee sam = new Employee("Sam", "Oracle");
        sam.display();
        sam.work();

    }

}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    private String company;

    public String getCompany() {
        return company;
    }

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work() {
        System.out.println(getName() + " works in " + company);
    }
}
