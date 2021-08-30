package classi_i_biblioteki.lambda;

interface Sayable1{
    public String say(String name);
}

public class Example_Odin_Parametr {

    public static void main(String[] args) {
        // Лямбда-выражение с одним параметром
        Sayable1 s1 = (name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Solo"));
        // Вы можете опустить скобки для функций
        Sayable1 s2 = name -> {
            return "Hello, "+name;
        };
        System.out.println(s2.say("Molo"));

    }
}
