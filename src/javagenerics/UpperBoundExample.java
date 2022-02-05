package javagenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundExample {

    private static double sumAllItem(List<? extends Number> numbers)
    {
        double sum=0;
        for (Number num:numbers) {
            sum +=num.doubleValue();
        }
        return sum;
    }

    private static void showAllList(List<? extends Number> numbers){
        for (Number number:numbers) {
            System.out.println(number);
        }
    }
    public static void main(String[] args) {

        // We can create list with Integer , Double and Float
        List<? extends Number> list1=new ArrayList<Integer>();
        List<? extends Number> list2=new ArrayList<Double>();
        List<? extends Number> list3=new ArrayList<Float>();

      //  list1.add(new Integer(10)); // compile time error as we can not add in upperbound.

     // List<? extends Number> list=new ArrayList<String>();  Compile time error as String is not subtype of  Number.

        // Using list of Integer
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        showAllList(list); // as upperbound can read
        System.out.println(sumAllItem(list));

        // Using list of Double
        List<Double> listDouble= Arrays.asList(1.0,2.0,3.0,4.5,5.6,6.9);
        showAllList(listDouble); // as upperbound can read
        System.out.println(sumAllItem(listDouble));


        // Using list of Float
        List<Float> listFloat= Arrays.asList(1f,2f,3f,4f,5f,6f);
        showAllList(listFloat); // as upperbound can read
        System.out.println(sumAllItem(listFloat));


    }
}
