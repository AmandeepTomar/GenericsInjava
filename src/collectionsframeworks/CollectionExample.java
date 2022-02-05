package collectionsframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("Two");
        list.add("Three");

        System.out.println(list.toArray());

        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
