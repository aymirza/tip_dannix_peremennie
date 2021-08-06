package classi_i_biblioteki.isklyuchenie.proglang.my_excaption;

public class InsufficientFundsExcaption extends Exception{
    private double amount;

    public InsufficientFundsExcaption(double amount){
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
}
