package classi_i_biblioteki.lambda.metanit;

public class Example_lambda_kak_rezultat_metodov {
    public static void main(String[] args) {

        Operation func = action(1);
        int a = func.execute(6,5);
        System.out.println(a);

        int b = action(2).execute(8,2);
        System.out.println(b);

        int c = action(3).execute(2,4);
        System.out.println(c);

    }
    private static Operation action(int number){
        switch (number){
            case 1: return (x,y)->x+y;
            case 2: return (x,y)->x-y;
            case 3: return (x,y)->x*y;
            default: return (x,y)->0;
        }
    }
}
interface Operation{
    int execute(int x, int y);
}

