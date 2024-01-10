package collectionsframeworks.set;

import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        example1();
        linkedHashSetDemo();

    }

    private static void example1() {

        Set<Integer> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(null);

        for (Integer item:linkedHashSet){
            System.out.println(item);
        }

        System.out.println("HashSet");

        Set<Integer> hashSet=new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(null);

        for (Integer item:hashSet){
            System.out.println(item);
        }

    }


    private static void linkedHashSetDemo(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Aman");
        linkedHashSet.add("Komal");
        linkedHashSet.add("Tomar");
        linkedHashSet.add("Chauhan");
        linkedHashSet.add(null);

        linkedHashSet.forEach(System.out::println);

        System.out.println("Now Print same with HashSet");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Aman");
        hashSet.add("Komal");
        hashSet.add("Tomar");
        hashSet.add("Chauhan");
        hashSet.add(null);

        hashSet.forEach(System.out::println);
    }

}
