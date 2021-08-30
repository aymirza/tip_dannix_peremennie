package classi_i_biblioteki.lambda;
interface Sayable2{
    String say(String massage);
}
public class Example_Neskolko_virajenie {
    public static void main(String[] args) {
        // Вы можете передать несколько операторов в лямбда-выражении
        Sayable2 person = (massage)-> {
            String str1 = "Я хочу сказать, ";
            String str2 = str1 + massage;
            return str2;
        };
        System.out.println(person.say("время дорого"));
    }
}
