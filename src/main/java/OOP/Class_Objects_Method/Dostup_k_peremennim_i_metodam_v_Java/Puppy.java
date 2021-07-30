package OOP.Class_Objects_Method.Dostup_k_peremennim_i_metodam_v_Java;

public class Puppy {

    int puppyAge;

    public Puppy(String name){
        // Это конструктор и у него один параметр, name.
        System.out.println("Передаваемое имя: "+name);
    }

    public void setPuppyAge(int age){
        puppyAge=age;
    }

    public int getPuppyAge() {
        System.out.println("Возраст щенка: "+puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {

        // Создание объекта
        Puppy myPuppy = new Puppy("Багет");

        // Вызов метод класса, чтобы установить возраст щенка.
        myPuppy.setPuppyAge(2);

        // Вызов другого метода класса, чтобы получить возраст щенка.
        myPuppy.getPuppyAge();

        // Получание переменной экземпляра класса.
        System.out.println("Значение переменной: "+myPuppy.puppyAge);
    }
}
