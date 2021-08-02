package sintaksis.type_variable.Peremennie_ekzempliyara;

public class Employee {
    // Переменная экземпляра открыта для любого дочернего класса.
    public String name;
    // Переменная salary видна только в Employee.
    private double salary;
    // Имя переменной присваивается в конструкторе.
    public Employee(String empName){
        name = empName;
    }
    // Переменной salary присваивается значение.
    public void setSalary(double empSal){
        salary=empSal;
    }
    // Этот метод выводит на экран данные сотрудников.
    public void printEmp(){
        System.out.println("Имя: "+ name);
        System.out.println("Зарплата: " + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
    }


}


