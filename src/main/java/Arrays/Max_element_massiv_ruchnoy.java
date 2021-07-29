package Arrays;

public class Max_element_massiv_ruchnoy {
    public static void main(String[] args) {
        // Нахождение минимального значение в массиве myArray из 4 элементов типа double
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной min задаем значение и нулевого элемента
        double min = myArray[0];

        // Перебираем все элементы массива
        for (int i =1; i< myArray.length; i++){
            // Сравниваем значение переменной min со значениями элемента массива
            // Если значение элемента массива меньше значения переменной min
            // то новое значение переменной min будет равно значению этого элемента
            // Егерде максимальный числоны тауу керек булса if условиянынг ишинде массив больше деб койылады
            if (myArray[i]>min){
                min = myArray[i];
            }
        }
        System.out.println("Mинимальное значение в массиве myArray: " + min);


    }
}
