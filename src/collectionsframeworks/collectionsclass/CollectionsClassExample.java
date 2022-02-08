package collectionsframeworks.collectionsclass;

import collectionsframeworks.collectionsorting.CollectionsSortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassExample {

    public static void main(String[] args) {
        withJavaClassesExample1();
        unmodifiableCollections();
    }

    private static void unmodifiableCollections() {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(5);

        Collections.sort(list);
        CollectionsSortExample.printAllItem(list);

        modifyList(list);
        // to stop this we need to use the unmodifiable Collections
        CollectionsSortExample.printAllItem(list);

       List<Integer> unmodifiableList= Collections.unmodifiableList(list);
        modifyList(unmodifiableList);

        CollectionsSortExample.printAllItem(unmodifiableList);
    }

    private static void modifyList(List<Integer> list) {
        // it is work on reference so it will modify the list
        list.remove(3);
        list.remove(1);
    }

    private static void withJavaClassesExample1() {

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(5);

        System.out.println("Print list as inserted");
        CollectionsSortExample.printAllItem(list);

        System.out.println("Apply sorting in List");
        Collections.sort(list);
        CollectionsSortExample.printAllItem(list);

        System.out.println("Apply sorting in Reverse order in List");
        Collections.sort(list,Collections.reverseOrder());
        CollectionsSortExample.printAllItem(list);

        // Reverse order
        System.out.println("Reverse method from Collections class");
        Collections.reverse(list);
        CollectionsSortExample.printAllItem(list);

//        System.out.println("Copy method from Collections class");
//        List<Integer> destination=new ArrayList<>();
//        destination.add(11);
//        destination.add(10);
//        destination.add(12);
//        Collections.copy(destination,list);
//        CollectionsSortExample.printAllItem(destination);

        // Max and Min
        System.out.println("Maximum "+Collections.max(list));
        System.out.println("Minimum "+Collections.min(list));

        //Rotate
        System.out.println("List After 3 times Rotations");
        Collections.rotate(list,1);
        CollectionsSortExample.printAllItem(list);

        //Replace
        list.add(1);
        list.add(1);
        list.add(1);
        Collections.sort(list);

        System.out.println("Using Replace Method of Collections class , relace 1 with 12");
        Collections.replaceAll(list,1,12);
        CollectionsSortExample.printAllItem(list);

       Collections.replaceAll(list,12,1);
       list.remove(1);
       list.remove(1);
       list.remove(1);

        // Shuffle
        System.out.println("Shuffled List");
        Collections.shuffle(list);
        CollectionsSortExample.printAllItem(list);
    }


}
