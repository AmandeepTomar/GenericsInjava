package collectionsframeworks.set;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        exmple1();
        printInReverseOrder();
    }

    private static void printInReverseOrder() {
        System.out.println("Print In reverse Order");
        SortedSet<Integer> treeSet=new TreeSet<>(Collections.reverseOrder());
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(3);


        // so if we are using the reverseOrder() then we need to usi first element
        // should be grater then second element in subSet()
        Set<Integer>subSet=treeSet.subSet(8,1);

        for (Integer item:subSet) {
            System.out.println(item);
        }
        System.out.println("Head Set");

        Set<Integer> headSet=treeSet.headSet(5); // so it will from start to till 5(exclusive)

        for (Integer item:headSet){
            System.out.println(item); //[10,8,9,7,6]
        }

        System.out.println("Tail Set");
        Set<Integer> tailSet=treeSet.tailSet(5); // so it will from end to 5)

        for (Integer item:tailSet){
            System.out.println(item); //[5,4,3,2,1]
        }
    }

    private static void exmple1() {
        // basically sorted order
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(3);


        for (Integer item:treeSet){
            System.out.println(item);
        }

       //  treeSet.first()  as of now we are not getting this because it is part of TreeSet, and we have stored its  instance in Set

        TreeSet<Integer>  treeSet1=new TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(4);
        treeSet1.add(5);
        treeSet1.add(2);
        treeSet1.add(3);

        System.out.println("Now we have TreeSet specific");
        for (Integer item:treeSet1){
            System.out.println(item);
        }

        System.out.println("Smallest item"+treeSet1.first());
        System.out.println("largest item"+treeSet1.last());

        System.out.println("Tails set");  // tailset include the element
       Set<Integer> tailSet= treeSet1.tailSet(4);

        for (Integer item:tailSet){
            System.out.println(item);  //(4,5)
        }

        System.out.println("Head Set"); // headset exclusive the element
        Set<Integer> headSet= treeSet1.headSet(5);

        for (Integer item:headSet){
            System.out.println(item);  //(1,2,3,4)
        }

    }
}
