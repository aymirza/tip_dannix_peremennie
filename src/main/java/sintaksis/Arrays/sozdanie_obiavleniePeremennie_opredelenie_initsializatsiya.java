package sintaksis.Arrays;

public class sozdanie_obiavleniePeremennie_opredelenie_initsializatsiya {
    public static void main(String[] args) {
        // Создание массивов myArrayInt1 и myArrayInt2 типа int и объявление переменных
        int[] myArrayInt1;
        int myArrayInt2[];

        // Определение массива или выделение памяти
        // Массив myArrayInt3 из 10 элементов с начальнымзначением 0 для каждого элемента
        int[] myArrayInt3;
        myArrayInt3 = new int[10];
        // Массив myArrayInt4 из 20 элементов с начальным значением 0 длякаждого элемента
        int[] myArrayInt4 = new int[20];

        // Инициализация массив
        // Массив  myArrayInt5 из 5 элементов со значением элементов 1, 3, 8, 10, 4
        int[] myArrayInt5 = {1,3,8,10,4};
        // Массив myArrayInt6 из 10 элементов с начальнымзначением 0 для каждого элемента
        int[] myarrayInt6 = new int[10];
        // присвоение второму элементу myArrayInt6 значение 14
        myarrayInt6[2] =14;
        // Присвоение пятому элементу myArrayInt6 значение 8
        myarrayInt6[5]= 8;



    }
}
