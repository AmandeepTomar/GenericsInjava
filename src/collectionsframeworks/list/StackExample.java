package collectionsframeworks.list;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
 *   Deque<Integer> stack = new ArrayDeque<Integer>();
 *
 * */
public class StackExample {
    private static void example1(){

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(null);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void example2(){
        Deque<Integer> stack=new ArrayDeque<>();
        try {
            System.out.println(stack.isEmpty());
            System.out.println(stack.poll());

        }catch (NoSuchElementException e) {
            System.out.println("Exception "+e);
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Size "+stack.size());
        System.out.println("Peek method only return last item"+stack.peek());
        System.out.println("Size After peek"+stack.peek());
        System.out.println("poop method only return and removed last item"+stack.pop());
        System.out.println("Size After pop"+stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
      //  System.out.println(stack.peek());

        try {
            System.out.println(stack.poll());

        }catch (NoSuchElementException e) {
            System.out.println("Exception "+e);
        }




    }
    public static void main(String[] args) {
            example1();
            example2();
    }

}
