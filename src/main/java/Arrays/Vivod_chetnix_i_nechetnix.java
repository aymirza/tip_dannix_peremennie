package Arrays;

public class Vivod_chetnix_i_nechetnix {
    public static void main(String[] args) {

        // Массива myArray из 5 элементов типа double
        double[] myArray = {2, 2.7, 3, 12, 23.8};

        // Вывод четных элементов массива на экран.
        System.out.println("Четные элементы массива myArray: ");
        for (int i=0; i< myArray.length; i++){
            if (myArray[i]%2 == 0){
                System.out.println(myArray[i]+ ", ");
            }
        }

        // Вывод нечетных элементов массива на экран.
        System.out.println("\nНечетные элементы массива myArray: ");
        for (int i=0; i< myArray.length; i++){
            if (myArray[i]%2 != 0){
                System.out.println(myArray[i]+", ");
            }
        }

        // Вывод элементов массива с четным индексом на экран.
        System.out.println();
        for (int i=0;i< myArray.length;i++){
            if (i%2 ==0){
                System.out.println("индекс "+i+" = "+myArray[i]+", ");
            }
        }

        // Вывод элементов массива с нечетным индексом на экран.
        System.out.println();
        for (int i=0; i< myArray.length;i++){
            if (i%2 !=0){
                System.out.println("индекс "+i+" = "+myArray[i]+", ");
            }
        }


    }
}
