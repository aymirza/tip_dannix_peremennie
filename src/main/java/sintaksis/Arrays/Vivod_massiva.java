package sintaksis.Arrays;

public class Vivod_massiva {
    public static void main(String[] args) {
        // Вывод на экран массива myList из 5 элементов типа double.
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        // Вывод массива на экран с помощью улучшенного цикла for.
        System.out.println("Вывод элементов массива myList: ");
        for (double element : myList){
            System.out.println(element+ " ");
        }

        // Вывод элементов массива на экран.
        System.out.println("\nВывод элементов массива myList: ");
        for (int i=0;i<myList.length; i++){

            System.out.println(myList[i]+", ");
        }



    }
}
