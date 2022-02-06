package collectionsframeworks.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedListHashMap {

    public static void main(String[] args) {
        hashMapNoOrdering();
        linkedListHashMapHavingInsertionOrder();
    }

    private static void linkedListHashMapHavingInsertionOrder() {
        HashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("aaaa",1);
        map.put("bbbb",2);
        map.put("cccc",3);
        map.put("dddd",4);
        map.put("eeee",5);
        map.put("ffff",6);
        map.put("gggg",7);
        map.put("hhhh",8);
        map.put("iiii",9);
        map.put("jjjj",10);
        map.put("kkkk",11);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }

    private static void hashMapNoOrdering() {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("aaaa",1);
        map.put("bbbb",2);
        map.put("cccc",3);
        map.put("dddd",4);
        map.put("eeee",5);
        map.put("ffff",6);
        map.put("gggg",7);
        map.put("hhhh",8);
        map.put("iiii",9);
        map.put("jjjj",10);
        map.put("kkkk",11);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
