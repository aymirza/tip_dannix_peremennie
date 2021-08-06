package classi_i_biblioteki.isklyuchenie.proglang.my_excaption;

public class Bank {

    public static void main(String[] args) {
        Checking c = new Checking(101);
        System.out.println("Депозит $300 ....");
        c.deposit(300.00);
        try {
            System.out.println("\nСнятие $100 ....");
            c.withdraw(100.00);
            System.out.println("\nСнятие $400");
            c.withdraw(400.00);
        } catch (InsufficientFundsExcaption e) {
            System.out.println("Извините, но у вас $" + e.getAmount());
            //e.printStackTrace();
        }
    }
}
