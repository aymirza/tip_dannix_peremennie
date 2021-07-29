package Class_Objects_Method.Operator_import;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Это конструктор класса Employee
    public Employee(String name){
        this.name = name;
    }
    // Присвоение возраста работника переменной age
    public void empAge(int empAge){
        age = empAge;
    }
    // Присвоение переменной designation
    public void  empDesignation(String empDesig){
        designation = empDesig;
    }
    // Присвоение перемонной salary
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    // Вывод подробной информации
    public void printEmployee(){
        System.out.println("Имя: "+ name);
        System.out.println("Возрасть: "+age);
        System.out.println("Найменование: "+designation);
        System.out.println("Заработная плата: "+salary);
    }
}
