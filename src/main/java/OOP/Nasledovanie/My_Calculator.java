package OOP.Nasledovanie;

// создали супер_класс
class Calculator{
    // переменные экземпляра
    int c;
    // метод косу
    public void addition(int a, int b){
        c=a+b;
        System.out.println("Сумма чисел: "+c);
    }
    // метод айыру
    public void subtraction(int a, int b){
        c=a-b;
        System.out.println("Разность чисел: "+c);
    }
}
                            // супер_клысс-ты шакырып алу
public class My_Calculator extends Calculator {
    // под кластынг ишинде супер класс-тан "с"-переменныйсыны шакырып алдым
    public void multiplication(int a, int b){
        c=a*b;
        System.out.println("Произведение чисел: "+c);
    }
    // главный метод
    public static void main(String[] args) {
        // переменныйларга значение киритилди
        int a=10, b=20;
        // объект создать кылынды (ссылочный переменный)
        My_Calculator cal = new My_Calculator();
        // вызвали с помощью объекта всех методов
        cal.addition(a,b);
        cal.subtraction(a,b);
        cal.multiplication(a,b);
    }
}
