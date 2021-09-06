package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;

import java.util.function.UnaryOperator;

interface Example2<T>{
    T apply(T t);
}

public class Example_UnaryOpertor {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));
    }
}
