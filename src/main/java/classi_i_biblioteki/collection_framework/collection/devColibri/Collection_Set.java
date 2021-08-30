package classi_i_biblioteki.collection_framework.collection.devColibri;

import java.util.*;

public class Collection_Set {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");

        Iterator<String> ls = list.iterator();
        while (ls.hasNext()) {
            System.out.println(ls.next());
        }

        System.out.println("\nSize element: " + list.size());
        System.out.println("\nelement index 1: "+list.get(1));


        Set<String> set = new HashSet<String>();
        set.add("string set 1");
        set.add( "string set 2");
        set.add("string set 3");
        set.add("string set 1");
        System.out.println("\nSize element set: "+set.size());
        for (String se : set){
            System.out.println(se);
        }



    }
}
