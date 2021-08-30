package classi_i_biblioteki.lambda;

interface Sayable{
    public String say();
}

public class Example_Bez_Parametr {
    public static void main(String[] args) {

        Sayable s = () -> {
            return "Мне ничего сказать";
        };
        System.out.println(s.say());
    }

    // Хиндуча ФИО
    // Фамилия: Жасур Учкур Мададкор Афсонавий Тинмас Афсонавий Шиддатли Она Важохатли
    // Имя: Арслон Йулбоши Мушук Илон Ракиб Зайтун Арслон


}
