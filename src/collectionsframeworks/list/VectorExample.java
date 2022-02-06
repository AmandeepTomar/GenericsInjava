package collectionsframeworks.list;

import java.util.Vector;
/**
 * public class Vector<E>
 *     extends AbstractList<E>
 *     implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 * */
public class VectorExample {

    private static void example1(){
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());
        for (int i = 0; i <10 ; i++) {
            vector.add(i);
        }
        System.out.println(vector.capacity());
        vector.add(11);
        System.out.println(vector.capacity());


    }
    public static void main(String[] args) {
        example1();
    }
}
