package sintaksis.operatori;

class Vehicle {
}

public class Operator_instanceof extends Vehicle {

    public static void main(String[] args) {

        Vehicle a = new Operator_instanceof();
        boolean result = a instanceof Operator_instanceof;
        System.out.println(result);


        String name = "Олег";
        boolean result2 = name instanceof String;
        System.out.println(result2);


    }
}
