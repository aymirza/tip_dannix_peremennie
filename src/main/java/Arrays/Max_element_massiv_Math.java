package Arrays;

public class Max_element_massiv_Math {
    public static void main(String[] args) {
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double
        double[] myArray = {11, 5.8, 11.1, 10.9};
        // Переменной max задаем минимальное double значение
        // егер минимальный числоны тауу керек булса Методдан кейин MAX_VALUE жазылады
        double max= Double.MIN_VALUE;
        // Перебираем всеэелементы массива
        for (int i=0; i<myArray.length; i++){
            // Перепенной max с помощью метода Math.max()  присваиваем максимальное значение
            // путем выбора найбольшего из двух значений ("старого" значение max и значение элемента)
            // егер минимальный числоны тауу керек ббулса Math методыдан кейин min сузи жазылады (Math.min())
            max=Math.max(max,myArray[i]);
        }
        // Выводим на экран найбольшее число массива myArray
        System.out.println("Максимальный элемент в массиве myArray: "+max);
    }
}
