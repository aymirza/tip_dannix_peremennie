package classi_i_biblioteki.collection_framework.collection.devColibri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Example {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");
        list.add("string 4");
        System.out.println("Index 0: "+list.get(0));
        for (String st : list){
            System.out.println(st);
        }

        System.out.println("\nMap:");
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("key", 2);
        map.put("key 1", 4);
        map.put("key 2", 6);
        map.put("key 3", 10);
        Integer key = map.get("key");
        System.out.println("Map key: "+key+"\n");
        for (Integer listMap : map.values()){
            System.out.println(listMap);

        }




    }
}
