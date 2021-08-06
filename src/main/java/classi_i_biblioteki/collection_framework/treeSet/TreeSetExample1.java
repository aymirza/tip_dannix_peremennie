package classi_i_biblioteki.collection_framework.treeSet;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();
        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.println("TreeSet contains "+states.size()+" elements\n");
        for (String state:states){
            System.out.println(state);
        }
        System.out.println();
        // удаление элемента
        states.remove("Germany");
        for (String st : states){
            System.out.println(st);
        }
    }
}
