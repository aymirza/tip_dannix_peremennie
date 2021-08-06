package classi_i_biblioteki.isklyuchenie.proglang.my_excaption;

public class Checking {
    private int number;
    private double balance;

    public Checking(int number) {
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsExcaption{
        if (amount <= balance){
            balance -= amount;
        }else {
            double needs = amount-balance;
            throw new InsufficientFundsExcaption(needs);
        }
    }
    public double getBalance(){
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
