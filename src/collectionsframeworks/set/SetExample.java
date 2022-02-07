package collectionsframeworks.set;

import java.util.HashSet;
import java.util.Set;

/**
 * public class HashSet<E>
 *     extends AbstractSet<E>
 *     implements Set<E>, Cloneable, java.io.Serializable
 * */
public class SetExample {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        // We can add the null in set
        set.add(null);

        // we can not add duplicates
        set.add("One");

        for (String str:set){
            System.out.println(str);
        }

        System.out.println(" ======");
        Set<String> set2=new HashSet<>();
        set2.add("One");
        set2.add("Four");

    //    set.retainAll(set2); // both have common just like intersection

        for (String str:set){
            System.out.println(str);
        }

        System.out.println(set.containsAll(set2)); // it should be true

        set.removeAll(set2); // remove one and four

        for (String str:set){
            System.out.println(str);
        }




    }
}
