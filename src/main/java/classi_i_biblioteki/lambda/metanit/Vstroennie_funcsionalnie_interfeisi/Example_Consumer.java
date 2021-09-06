package classi_i_biblioteki.lambda.metanit.Vstroennie_funcsionalnie_interfeisi;

import java.util.function.Consumer;

interface Example4<T>{
    void accept(T t);
}

public class Example_Consumer {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.println(x+ " доллоров");
        printer.accept(600);
    }
}
