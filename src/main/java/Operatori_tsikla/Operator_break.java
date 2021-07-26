package Operatori_tsikla;

public class Operator_break {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        for (int x : numbers){
            if (x == 30){
                break;
            }
            System.out.print("Значение x: "+x);
            System.out.print("\n");
        }
    }
}
