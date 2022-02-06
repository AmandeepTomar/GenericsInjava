package collectionsframeworks.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * public class ArrayList<E> extends AbstractList<E>
 *         implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 *         The List.of and List.copyOf static factory methods provide a convenient way to create unmodifiable lists. The List instances created by these methods have the following characteristics:
 * They are unmodifiable. Elements cannot be added, removed, or replaced. Calling any mutator method on the List will always cause UnsupportedOperationException to be thrown. However, if the contained elements are themselves mutable, this may cause the List's contents to appear to change.
 * They disallow null elements. Attempts to create them with null elements result in NullPointerException.
 * They are serializable if all elements are serializable.
 * The order of elements in the list is the same as the order of the provided arguments, or of the elements in the provided array.
 * They are value-based. Callers should make no assumptions about the identity of the returned instances. Factories are free to create new instances or reuse existing ones. Therefore, identity-sensitive operations on these instances (reference equality (==), identity hash code, and synchronization) are unreliable and should be avoided.
 *
 *         */
public class ListExample {
    private static void aboutList(){
        List<String> list=new ArrayList<>();

        list.add("one");
        list.add("Two");
        list.add("Three");
        list.add("four");

        System.out.println(list.get(list.size()-1)); // Manipulate of LST item is FAST. O(1)

        System.out.println(list.contains("one")); //O(N)

        System.out.println(list.remove("one")); //O(N)

        System.out.println(list.contains("one")); //O(N)

        System.out.println(list);

        // due to Iterable , we can use foreach loops
        for (String str:list){
            System.out.println(str);
        }
        Object [] arr=list.toArray();
        System.out.println("Array is "+ Arrays.toString(arr));
    }

    private static void factoryMethods(){
        List<String> list=new ArrayList<>();

        list.add("one");
        list.add("Two");
        list.add("Three");
        list.add("four");

       List<String> list1= List.of(); // it is ruturn (List<E>) ImmutableCollections.ListN.EMPTY_LIST;
        System.out.println(list1.isEmpty()); // this one must be true

        List<String> list2=List.of("Data","IT","CSE","ME");
        System.out.println(list2.size());

        // We can not add , remove it will throw
        /**
         * Exception in thread "main" java.lang.UnsupportedOperationException
         * 	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:73)
         * 	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:77)
         * 	at collectionsframeworks.list.ListExample.factoryMethods(ListExample.java:59)
         * 	at collectionsframeworks.list.ListExample.main(ListExample.java:65)
         * */
        try {
            list2.add("Civil");
            list2.remove(0);
        }catch (UnsupportedOperationException e){
            System.out.println("Exception is "+e);
        }

        /**
         * Exception in thread "main" java.lang.NullPointerException
         * 	at java.base/java.util.List.of(List.java:1033)
         * 	at collectionsframeworks.list.ListExample.factoryMethods(ListExample.java:74)
         * 	at collectionsframeworks.list.ListExample.main(ListExample.java:94)
         * */
        try {
            List<Object> list4 = List.of(null);
        }catch (NullPointerException e){
            System.out.println("Exception on add null =>"+e);
        }


        // ================ List.copyOF()=============
        List<String> list3=List.copyOf(list);
        System.out.println(list3);
        System.out.println(list3.contains("No Data"));
        boolean isEqual=list.equals(list3);
        System.out.println("Is list1 and list3 equals "+isEqual);

        try {
            list3.add("Civil");
            list3.remove(0);
        }catch (UnsupportedOperationException e){
            System.out.println("Exception is "+e);
        }


    }

    public static void main(String[] args) {
        aboutList();
        factoryMethods();

        // add null , but if we want to add null in List<String> getting nullpointer exception
        List<Integer> list=new ArrayList<>();
        list.add(null);
        System.out.println(list);
    }
}
