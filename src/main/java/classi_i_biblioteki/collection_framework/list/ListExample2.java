package classi_i_biblioteki.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        System.out.println(list1.get(1)+" : ");
        list1.add(1,"test4");
        System.out.println(list1.get(1)+" : ");
        for (int i=0; i<list1.size();i++){
            System.out.println(list1.get(i)+" : ");
        }
    }
}
