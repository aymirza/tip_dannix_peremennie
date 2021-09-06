package classi_i_biblioteki.Stream_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Sozdanie_potoka {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities,"Париж","Лондон","Мадрид");
        cities.stream()   // получаем поток
                .filter(s -> s.length()==6) // применяем фильтрацию по длина строки
                .forEach(s-> System.out.println(s));   // выводим отфильтрованные строки на консоль

        System.out.println();
        Stream<String> citiesStream = Arrays.stream(new String[]{"Toshkent","Samarqand","Nukus"});
        citiesStream.forEach(s -> System.out.println(s));  // выводим все элементы массива
        System.out.println();
        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5});
        intStream.forEach(i -> System.out.println(i));
        System.out.println();
        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(l -> System.out.println(l));
        System.out.println();
        DoubleStream doubleStream = Arrays.stream(new double[]{3.4,6.7,9.5,8.2345,121});
        doubleStream.forEach(d -> System.out.println(d));
        System.out.println();
        // еще один способ создания потока представляет статический метод of(T..values) класса Stream:

        Stream<String> citiesStream2 = Stream.of("Париж 2","Лондон 2","Мадрид 2");
        citiesStream2.forEach(s -> System.out.println(s));
        System.out.println();
        // можно передать массив
        String[] cities2 = {"Париж 3","Лондон 3","Мадрид 3"};
        Stream<String> citiesStream3 = Stream.of(cities2);
        citiesStream3.forEach(s -> System.out.println(s));
        System.out.println();
        IntStream intStream1= IntStream.of(1,2,3,4);
        intStream1.forEach(i -> System.out.println(i));
        System.out.println();
        LongStream longStream1 = LongStream.of(100,250,400,56546548,213);
        longStream1.forEach(l -> System.out.println(l));
        System.out.println();
        DoubleStream doubleStream1 = DoubleStream.of(5.1,3.6,55.8,996.4,548);
        doubleStream1.forEach(d -> System.out.println(d));




    }
}
