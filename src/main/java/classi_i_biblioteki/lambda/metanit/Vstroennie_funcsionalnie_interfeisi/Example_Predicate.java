package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;

import java.util.function.Predicate;

interface Example<T>{
    boolean test(T t);

}

public class Example_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));
    }
}
