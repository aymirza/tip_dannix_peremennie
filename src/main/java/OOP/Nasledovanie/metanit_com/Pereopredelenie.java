package OOP.Nasledovanie.metanit_com;

public class Pereopredelenie {

    public static void main(String[] args) {
        Employeee sam = new Employeee("Sam","Microsoft");
        sam.display();
    }


}

class Personn {
    private String name;

    public Personn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employeee extends Person {
    private String company;

    public Employeee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Works in: " + company);
    }

}