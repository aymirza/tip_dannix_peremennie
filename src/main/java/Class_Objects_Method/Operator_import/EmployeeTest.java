package Class_Objects_Method.Operator_import;

public class EmployeeTest {
    public static void main(String[] args) {
        // Создание двух объектов с помощью конструктора
        Employee empOne = new Employee("Олег Олегов");
        Employee empTwo = new Employee("Иван Иванов");

        /* Вызов метода для каждого созданного объекта. */
        // Вызов метода empAge и присвоим значение
        empOne.empAge(26);
        // Вызов метода empDesignation и присвоим значение
        empOne.empDesignation("Старший инженер-программист");
        // Вызов метода empSalary и присвоим значение
        empOne.empSalary(1000);
        // Вызов метода printEmployee и он выводит подробно все данные которые не давно вводили мы
        empOne.printEmployee();

        System.out.println();

        empTwo.empAge(21);
        empTwo.empDesignation("Инженер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
