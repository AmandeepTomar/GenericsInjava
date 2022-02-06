package collectionsframeworks.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * public class LinkedList<E>
 *     extends AbstractSequentialList<E>
 *     implements List<E>, Deque<E>, Cloneable, java.io.Serializable
 *
 * */
public class LinkedListExample {

    private static void example1(){
        // this one is using List interface so All linked list method like addFirst(),removeFirst() not available
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);

        // Adding and removing from first and last is o(1) running time.

        linkedList.addFirst(0);
        linkedList.addFirst(-1);
        System.out.println("After adding at first"+linkedList);
        linkedList.addLast(null);
        linkedList.addLast(5);
        linkedList.addLast(6);

        System.out.println("After adding at Last"+linkedList);

        linkedList.removeFirst();
        linkedList.removeFirst();

        System.out.println("After remove at First"+linkedList);

        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeLast();

        System.out.println("After remove at Last"+linkedList);

    }

    private static void performanceArrayListAndLinkedList(){

        List<Integer> list=new ArrayList<>();

        long start=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            list.add(0,i);
        }
        System.out.println("Running time to add at beginning of list "+(System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        // Adding at end of list
        for (int i = 0; i <500000 ; i++) {
            list.add(i);
        }
        System.out.println("Running time to add at end of list "+(System.currentTimeMillis()-start));

        LinkedList<Integer> linkedList=new LinkedList<>();
        start=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            linkedList.addFirst(i);
        }
        System.out.println("Running time to add at beginning of linkedList "+(System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        // Adding at end of linkedList
        for (int i = 0; i <500000 ; i++) {
            linkedList.addLast(i);
        }
        System.out.println("Running time to add at end of linkedList "+(System.currentTimeMillis()-start));


    }

    public static void main(String[] args) {
           // example1();
            performanceArrayListAndLinkedList();
    }
}
