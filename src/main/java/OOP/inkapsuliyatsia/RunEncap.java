package OOP.inkapsuliyatsia;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Олег");
        encap.setAge(28);
        encap.setIdnum("1234ms");

        System.out.println("Имя: "+encap.getName()+ ", возраст: "+encap.getAge());
    }
}


/*

Преимущества инкапсуляции
Поля класса можно сделать только для чтения или только для записи.
Класс может иметь полный контроль над тем, что хранится в его полях.


 */