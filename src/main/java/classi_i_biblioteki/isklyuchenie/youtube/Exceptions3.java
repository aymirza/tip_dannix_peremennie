package classi_i_biblioteki.isklyuchenie.youtube;


import java.util.Scanner;

// выбрасывать исключение
public class Exceptions3 {

    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
               throw  new ScannerException("Polzovatel vvol shto-to krome nuliya");
            }
        }
    }
}
