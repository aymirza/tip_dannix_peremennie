package classi_i_biblioteki.generics_obobshenie;

class Account6{
    private String id;
    private int sum;

    <T> Account6(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

public class obobshennie_konstruktori {
    public static void main(String[] args) {
        Account6 acc1 = new Account6("cid2373",5000);
        Account6 acc2 = new Account6(53757,4000);
        System.out.println(acc1.getId()+"  "+acc1.getSum());
        acc2.setSum(2323);
        System.out.println(acc2.getId()+"  "+acc2.getSum());
    }
}
