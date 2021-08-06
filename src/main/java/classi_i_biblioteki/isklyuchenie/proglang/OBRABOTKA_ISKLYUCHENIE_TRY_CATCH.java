package classi_i_biblioteki.isklyuchenie.proglang;

// try ishindegi funksional istemese catchting ishindegi exception nimede problema ekenini shigarip korsetedi
public class OBRABOTKA_ISKLYUCHENIE_TRY_CATCH {
    public static void main(String[] args) {

        try {
            int array[] = new int[2];
            System.out.println("Доступ к третьему элементу: "+array[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: "+e);
        }
        System.out.println("Вне блока");
    }

}
