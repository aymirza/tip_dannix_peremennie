package classi_i_biblioteki.generics_obobshenie;

/*
С помощью буквы T в определении класса class Account<T> мы указываем,
что данный тип T будет использоваться этим классом. Параметр T в угловых
скобках называется универсальным параметром, так как вместо него можно
подставить любой тип. При этом пока мы не знаем, какой именно это будет тип:
String, int или какой-то другой. Причем буква T выбрана условно, это может и
любая другая буква или набор символов.
 */
class Account2<T> {
    private T id;
    private int sum;

    public Account2(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

public class Example_generics2 {


    public static void main(String[] args) {

        Account2<String> acc1 = new Account2<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account2<Integer> acc2 = new Account2<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);

    }
}
