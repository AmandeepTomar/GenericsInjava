package collectionsframeworks.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    private static void implementQueue(){
        // FIFO
        Deque<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static void implementStack() {
        // LIFO
        Deque<Integer> queue=new ArrayDeque<>();
        queue.push(1);
        queue.push(10);
        queue.push(100);
        queue.push(1000);

        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
    public static void main(String[] args) {
        implementQueue();
        implementStack();
    }


}
