package classi_i_biblioteki.generics_obobshenie;

/*
Обобщения или generics (обобщенные типы и методы) позволяют нам уйти от жесткого
определения используемых типов. Рассмотрим проблему, в которой они нам могут понадобиться.
 */

class Account{
    private Object id;
    private  int sum;

    public Account(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

public class Example_generics {

    public static void main(String[] args) {
        Account acc1 = new Account(2334,5000); // id - число
        int acc1Id = (int) acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523",5000);  // id - строка
        System.out.println(acc2.getId());
    }

}
