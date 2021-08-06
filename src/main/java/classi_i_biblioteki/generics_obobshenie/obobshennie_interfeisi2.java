package classi_i_biblioteki.generics_obobshenie;

/*
Вторая стратегия представляет определение обобщенного класса,
который также использует тот же универсальный параметр:
 */

interface AccountTable2<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account4<T> implements AccountTable2<T> {
    private T id;
    private int sum;

    public Account4(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
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

public class obobshennie_interfeisi2 {
    public static void main(String[] args) {

        Account4<String> acc1 = new Account4<String>("1235rwr", 5000);
        Account4<String> acc2 = new Account4<String>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId()+" "+acc2.getSum());
    }

}
