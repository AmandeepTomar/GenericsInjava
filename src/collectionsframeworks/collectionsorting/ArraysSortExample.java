package collectionsframeworks.collectionsorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortExample {
    public static void main(String[] args) {

        sortingArrays();
    }


    /**
     * All about sorting the arrays , Primitive and reference
     * */
    private static void sortingArrays() {


        //        - `QuickSort` sort primitive type (int , float..)
//        - `MergeSort` sort reference type (Integer, String, Custom Objects....)

        int nums[]={1,10,9,7,2,3,6,7,0,-10,8,6};

        Arrays.sort(nums);

        for (int num:nums){
            System.out.print(num+" ");
        }

        System.out.println("In Reverse Order");

        for (int i = 0; i < nums.length/2 ; i++) {
            int temp=nums[nums.length-1-i];
            nums[nums.length-1-i]=nums[i];
            nums[i]=temp;
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(" Sort String Array");

        String [] names = {"aabc","abac","aaab","aaac","baca","baba","bb"};

        Arrays.sort(names);

        for (String name:names){
            System.out.print(name+" ");
        }

        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Order");

        for (String name:names){
            System.out.print(name+" ");
        }


    }
}
