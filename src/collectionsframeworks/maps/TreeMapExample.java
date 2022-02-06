package collectionsframeworks.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * public class TreeMap<K,V>
 *     extends AbstractMap<K,V>
 *     implements NavigableMap<K,V>, Cloneable, java.io.Serializable
 * */
public class TreeMapExample {

    public static void main(String[] args) {

        example1();
        reverseOrderUsingCollections();
        reverseOrderUsingComparator();
        checkNullKeyInsertion();
    }

    private static void reverseOrderUsingComparator() {
        // we need to use the TreeMap in place of Map to hold the reference of treeMap
        TreeMap<Integer, String> treeMap=new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(8,"Eight");
        treeMap.put(5,"Five");
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(9,"Nine");
        treeMap.put(2,"Two");

        System.out.println("Smallest key "+treeMap.lastKey());
        System.out.println("Largest key "+treeMap.firstKey());

        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void example1() {

        TreeMap<Integer, String> treeMap=new TreeMap<>();
        treeMap.put(8,"Eight");
        treeMap.put(5,"Five");
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(9,"Nine");
        treeMap.put(2,"Two");

        System.out.println("largest key "+treeMap.lastKey());
        System.out.println("Smallest key "+treeMap.firstKey());

        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    private static void reverseOrderUsingCollections() {

        TreeMap<Integer, String> treeMap=new TreeMap<>(Collections.reverseOrder());
        treeMap.put(8,"Eight");
        treeMap.put(5,"Five");
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(9,"Nine");
        treeMap.put(2,"Two");

        System.out.println("Smallest key "+treeMap.lastKey());
        System.out.println("Largest key "+treeMap.firstKey());

        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


    private static void checkNullKeyInsertion(){
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(null,"Null value can not be store in TreeMap");

        // getting Exception in thread "main" java.lang.NullPointerException
    }

}
