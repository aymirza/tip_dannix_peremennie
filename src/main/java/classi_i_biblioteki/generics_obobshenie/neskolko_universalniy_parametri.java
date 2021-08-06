package classi_i_biblioteki.generics_obobshenie;

class Account5<T, S>{
    private T id;
    private S sum;

    public Account5(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}

public class neskolko_universalniy_parametri {
    public static void main(String[] args) {
        Account5<String, Double> acc1 = new Account5<String, Double>("354",5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.println("Id: "+id+" "+"Sum: "+sum);
    }
}
