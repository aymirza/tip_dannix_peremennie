package operatori_prinitia_resheniy;

public class Operator_switch {
    public static void main(String[] args) {

        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено");
                break;
            case 'D':
                System.out.println("Вы прошли");
                break;
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка "+grade);
    }
}
