package collectionsframeworks.maps;

import java.util.*;

/**
 * public class HashMap<K,V> extends AbstractMap<K,V>
 *     implements Map<K,V>, Cloneable, Serializable
 * */
public class HashMapExample {

    public static void main(String[] args) {
        example();
        System.out.println("With Custom Keys");
        exampleWithCustomKeys();
        checkPerformanceForTreeAndHashMap();
        System.out.println("When key is mutable");
        checkWithMutableKey();
    }

    private static void checkWithMutableKey() {
        // thats why we create the immutable keys , and also implements the hashcode and equals method.
        Map<MutablePerson ,Integer> map = new HashMap<>();
        MutablePerson person = new MutablePerson("abc",1);
        MutablePerson person2 = new MutablePerson("abc",1);
        map.put(person,1);
        map.put(person2,2);
        System.out.println(map.get(person));
        person.setName("NewName");
        System.out.println(map.get(person) +" size "+map.size());

        for (Map.Entry<MutablePerson,Integer> entrys : map.entrySet()){
            System.out.println(entrys.getKey().getName());
        }

    }

    private static void exampleWithCustomKeys() {


        Map<Person,String> map=new HashMap<>();
        map.put(new Person("One",10),"One");
        map.put(new Person("One",10),"Two");
        map.put(new Person("One",10),"Three");

        // now hasMap must have the size 3 , if we are not using hashCode and equals
        // to fix this we need to implement the hashcode() and Equals() now size is one
        System.out.println(map.size());

        for (Map.Entry<Person,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" Values "+entry.getValue());
        }

    }

    private static void example(){

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"three");
        map.put(4,"Four");

        System.out.println(map.containsKey(1));
        System.out.println(map.remove(1));

        map.put(null,"This one is null key");


        System.out.println();
        for (Integer key:map.keySet()){
            System.out.println(map.get(key));
        }

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
        }


        Map<String,String> map1=new HashMap<>();
        map1.put(null,"Null Key");
        map1.put("One","Yes First");

        for (Map.Entry<String,String> entry:map1.entrySet()){
            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());

        }
    }


    private static void checkPerformanceForTreeAndHashMap(){

        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> treeMap=new TreeMap<>();
        Map<Integer,String> linkedListMap=new LinkedHashMap<>();
        long start=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            map.put(i,i+"");
        }

        for (int i = 0; i <500000 ; i++) {
            map.get(i);
        }

        System.out.println("Time taken With HashMap "+(System.currentTimeMillis()-start));

         start=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            linkedListMap.put(i,i+"");
        }

        for (int i = 0; i <500000 ; i++) {
            linkedListMap.get(i);
        }

        System.out.println("Time taken With LinkedListHashMap "+(System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            treeMap.put(i,i+"");
        }

        for (int i = 0; i <500000 ; i++) {
            treeMap.get(i);
        }

        System.out.println("Time taken With TreeMap "+(System.currentTimeMillis()-start));
    }
}
