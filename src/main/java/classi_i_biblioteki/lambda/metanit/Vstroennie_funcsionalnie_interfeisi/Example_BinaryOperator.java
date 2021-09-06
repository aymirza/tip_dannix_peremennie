package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;

import java.util.function.BinaryOperator;

interface Example1<T>{
    T apply(T t1, T t2);
}

public class Example_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x,y) -> x*y;

        System.out.println(multiply.apply(3,5));
        System.out.println(multiply.apply(10,-2));
    }
}
