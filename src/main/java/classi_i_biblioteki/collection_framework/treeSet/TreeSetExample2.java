package classi_i_biblioteki.collection_framework.treeSet;

import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");

        for (String state : states){
            System.out.println(state);
        }
        System.out.println();
        System.out.println(states.first());  // получим первый - самый меньший элемент
        System.out.println(states.last());   // получим последный - самый больший элемент
        // получим поднабор от одного элемента до другого
        SortedSet<String> set = states.subSet("Germany","Italy");
        System.out.println("\n"+set+"\n");
        // элемент из набора, который больше текущего
        String greater = states.higher("Germany");
        System.out.println(greater);
        // элемент из набора, который меньше текущего
        String lower = states.lower("Germany");
        System.out.println(lower);
        // возвращаем набор в обратном порядке
        NavigableSet<String> navSet = states.descendingSet();
        System.out.println(navSet);
        // возвращаем в котором все элементы меньше текущего
        SortedSet<String> setLower = states.headSet("Germany");
        System.out.println(setLower);
        // возвращаем набор в котором все элементы больше текущего
        SortedSet<String> setGreater = states.tailSet("Germany");
        System.out.println(setGreater);

    }
}
