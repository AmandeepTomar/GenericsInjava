package collectionsframeworks.list;

import java.sql.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);

        //  list.removeAll(list1); // op [2, 4, 6]

        //  list.retainAll(list1);
        //  System.out.println(list); // o/p -> [1,3,5]


        List<Integer> subList = list.subList(4, list.size());
        subList.add(10);
        subList.add(11);
        System.out.println(list); // it is works as exoected reflect the changes in list also
        System.out.println("SubList " + subList);
        list.set(4, 80);
        System.out.println("Main list " + subList); // works as expcted because its NON-structural changes.
        list.add(2, 100);
        //  System.out.println("Main list throw error ConcurrentModificationException "+subList);

// to fix that we should use iterator.
        for (int element : list) {
            System.out.println(element);
            if (element == 4) {
              //  list.remove(element);
            }
        }


        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
            if (element == 4 || element ==100) {
                iterator.remove();
            }
        }

        System.out.println("Removed 4 and 100 " + list);


    }

}
