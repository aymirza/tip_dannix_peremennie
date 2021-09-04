package classi_i_biblioteki.lambda.metanit;

public class Example_localnoe_peremenni {
    static int m=70;
    static int n=30;
    public static void main(String[] args) {

        Operationable3 op = ()->{
            return m+n;
        };
        System.out.println(op.calculete());
    }
}

interface Operationable3{
    int calculete();
}
