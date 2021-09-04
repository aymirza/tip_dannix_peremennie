package classi_i_biblioteki.lambda.metanit;
/*
Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->.
 Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список
 параметров выражения, а правая собственно представляет тело лямбда-выражения, где
 выполняются все действия.
 */
public class Example_lambda {

    public static void main(String[] args) {

        Operationable operation = (x,y)->x+y;
        Operationable operation1 = (x,y)->x-y;
        Operationable operation2 = (x,y)->x*y;

        int result = operation.calculate(10,30);
        System.out.println(result);
        int result1 = operation1.calculate(30,10);
        System.out.println(result1);
        int result2 = operation2.calculate(10,30);
        System.out.println(result2);

    }
}

interface  Operationable{
    int calculate(int x, int y);
}
