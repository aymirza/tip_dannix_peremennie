package classi_i_biblioteki.generics_obobshenie;

/*
При реализации подобного интерфейса есть две стратегии. В данном случае реализована первая
стратегия, когда при реализации для универсального параметра интерфейса задается конкретный
тип, как например, в данном случае это тип String. Тогда класс, реализующий интерфейс,
жестко привязан к этому типу.
 */
interface AccountTable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account3 implements AccountTable<String>{
    private String id;
    private int sum;

    public Account3(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}

public class obobshennie_interfeisi {
    public static void main(String[] args) {

        AccountTable<String> acc1 = new Account3("123rwr",5000);
        Account3 acc2 = new Account3("2373",4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

    }

}
