package sintaksis.Arrays;

public class Perebor_elementjv_massiva {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //Нумеруем все элементы массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= i + 1; j++) {
                arr[i] = j;
            }
        }
        // Выводим значения в прямом порядке
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        // Выводим значения в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
        int[] array = {9, 8, 7, 6};
        for (int i : array) {
            i += 10; // переменная i локальная
            System.out.println(i);
        }
        for (int i : array) {
            System.out.println(i + " ");
        }


    }
}

