package javagenerics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedExample {

    private static <T> void copyList(List<? extends T> source,List<? super T> destination){
        for(T item:source){
            destination.add(item);
        }
    }

    private static void printAllItems(List<? super Number> numbers){
        // As we can not read with lower bounds  , We need to convert the Number into Object
        for (Object num:numbers){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        // All works its like child = parent
        List<? super Integer> list=new ArrayList<Number>();
        List<? super Integer> list1=new ArrayList<Integer>();
        List<? super Integer> list2=new ArrayList<Object>();

        // how to use lower bound to read items
        List<Serializable> list3=new ArrayList<>();
        list3.add("Test");
        list3.add("Test1");
        list3.add("Test2");

        printAllItems(list3);
        List<? super  Number> list4=new ArrayList<>();
        list4.add(1);
        list4.add(2.0);
        list4.add(2.0f);

        printAllItems(list4);

        List<String> source= Arrays.asList("List1","List2","List4");
        List<String> destination= new ArrayList<>();
        destination.add("List3");
        destination.add("List5");
        destination.add("List6");
        copyList(source,destination);
        System.out.println(destination);
    }
}
