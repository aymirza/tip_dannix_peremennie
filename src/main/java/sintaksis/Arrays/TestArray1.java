package sintaksis.Arrays;

public class TestArray1 {
    public static void main(String[] args) {
        double[] myList = {1.9,2.9,3.4,3.5};
        //Вывести на экран все элементы массива
        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        // Сумма элементов массива
        double total=0;
        for (int i=0; i<myList.length;i++){
            total += myList[i];
            System.out.println("Сумма чисел массива в внутри цикла: "+total);
        }
        System.out.println("Сумма чисел массива: "+total);

        // Нахождение среди элементов массива наибольшего
        double max=myList[0];
        for (int i=0; i<myList.length;i++){
           // System.out.println("Наибольший элемент 1: "+max);

            if (myList[i]>max) max = myList[i];
           System.out.println("Наибольший элемент 2: "+max);

        }
        System.out.println("Наибольший элемент: "+max);




    }
}
