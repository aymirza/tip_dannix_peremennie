package sintaksis.Operatori_tsikla;

public class Operator_continue {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        for (int x : numbers){
            if (x==30){
                continue;
            }
            System.out.print("Значение x: "+x);
            System.out.print("\n");
        }
    }
}
