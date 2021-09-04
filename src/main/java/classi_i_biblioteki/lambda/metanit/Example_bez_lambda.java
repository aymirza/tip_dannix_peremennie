package classi_i_biblioteki.lambda.metanit;

public class Example_bez_lambda {
    public static void main(String[] args) {
        Operationable2 op = new Operationable2() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        int z = op.calculate(30,10);
        System.out.println(z);
    }
}

interface Operationable2{
    int calculate(int x,int y);
}
