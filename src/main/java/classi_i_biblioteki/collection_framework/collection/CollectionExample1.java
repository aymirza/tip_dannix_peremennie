package classi_i_biblioteki.collection_framework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample1 {
    public static void main(String[] args) {
        // создаем коллекции для демонстрации
        Collection col1 = createFirstCollection();
        Collection col2 = createSecondCollection();

        // Демонстрация прохода по коллекции
        System.out.println("===================== Проход по коллекции");
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }

        System.out.println();

        // демонстрация прохода по коллекции через итератор
        System.out.println("===================== Проход по коллекции через итератор");
        for (Iterator it = col1.iterator(); it.hasNext(); ) {
            String s = (String) it.next();
            System.out.println("Item: " + s);
        }
        System.out.println();

        // Демонстрации групповых операций
        System.out.println();
        System.out.println("===================== Групповые операции");
        // Можно проверить содержаться ли все элементы col2 и col
        if (col1.containsAll(col2)) {
            System.out.println("Коллекция col1 содержи все от col2");
        }
        System.out.println();

        System.out.println("===================== Добавить всех элементов в col1 из col2");
        // Можно добавить элементы из col2 в col1
        col1.addAll(col2);
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }

        System.out.println("===================== Удаление всех элементов col2, которые есть в col1");
        // Можно удалить ВСЕ элементы col2, которые есть в col1
        col1.removeAll(col2);
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }
        System.out.println();

        // Пересоздаем коллекции для допальнейшей демонстрации
        col1 = createFirstCollection();
        col2 = createSecondCollection();
        System.out.println("===================== Удаление элементов из col1, которых есть в col2");
        col1.retainAll(col2);
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }
        System.out.println("===================== Очистка коллекции - не будет элементов");
        col1.clear();
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }
        System.out.println();

        // Удаление элемента коллекции
        // Снова создаем коллекцию для демонстрации
        col1 = createFirstCollection();
        // Удаляем один элемент
        col1.remove("1");
        System.out.println("===================== Удаляем элемент '1' - его не будет в списке");
        for (Object o : col1) {
            System.out.println("Item: " + o);
        }

        // Удаление коллекции через итератор
        // Снова создаем коллекцию для демонстрации
        col1 = createFirstCollection();
        System.out.println("===================== Удаление через итератор");
        while (!col1.isEmpty()){
            Iterator it=col1.iterator();
            Object o = it.next();
            System.out.println("Удаляем: "+o);
            // Удаляем элемент
            it.remove();

        }

        System.out.println();
        Collection<String> cs = new ArrayList<String>();
        boolean csex1 = cs.add("dffd");
        boolean csex = cs.isEmpty();
        System.out.println(csex);


    }


    // Первая коллекция для примера
    private static Collection createFirstCollection() {
        // Создать коллекция на основе стандартного класса ArrayList
        Collection col = new ArrayList();
        // Добавление в коллекцию
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        return col;
    }

    // вторая коллекция для примера
    private static Collection createSecondCollection() {
        // Создать коллекция на основе стандартного класса ArrayList
        Collection col2 = new ArrayList();
        col2.add("1");
        col2.add("2");
        col2.add("3");
        return col2;
    }
}
