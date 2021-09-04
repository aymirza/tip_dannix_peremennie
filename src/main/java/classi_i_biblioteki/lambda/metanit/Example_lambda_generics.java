package classi_i_biblioteki.lambda.metanit;

public class Example_lambda_generics {
    public static void main(String[] args) {
        Operationable4<Integer> operation1 = (x,y)->x+y;
        Operationable4<String> operation2 = (x,y)->x+y;

        System.out.println(operation1.calculate(20,10));
        System.out.println(operation2.calculate("20","10"));
    }
}

interface Operationable4<T>{
    T calculate(T x, T y);
}
