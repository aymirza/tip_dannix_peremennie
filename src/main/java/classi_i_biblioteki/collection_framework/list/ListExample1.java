package classi_i_biblioteki.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        String st1 = "One";
        String st2 = "Two";
        String st3 = "Three";
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
        for (String s : list1) {
            System.out.println(s);
        }
        st2 = "Four";
        list1.remove(st2);
        for (String ss : list1) {
            System.out.println(ss);
        }
    }
}
