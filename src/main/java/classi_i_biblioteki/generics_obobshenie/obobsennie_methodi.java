package classi_i_biblioteki.generics_obobshenie;

class Printer{
    public <T> void print(T[] items){
        for (T item : items);
        System.out.println(items);
    }
}

public class obobsennie_methodi {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = { "Tom","Alice","Sam","Kate","Bob","Helen"};
        Integer[] numbers = {23,4,5,2,13,456,4,5};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
