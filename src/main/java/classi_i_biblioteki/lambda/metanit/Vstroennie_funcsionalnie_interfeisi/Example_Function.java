package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;

import java.util.function.Function;

interface Example3<T,R>{
    R apply(T t);
}

public class Example_Function {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x)+" доллоров";
        System.out.println(convert.apply(5));
    }
}
