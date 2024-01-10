package collectionsframeworks.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        example1();
        priorityQueueExample();
        int arr[] = new int[]{1, 9, 8, 6, 3, 4, 5, 11, 45, 55, 61};
        findTheKthLargestNo(arr, 10);
    }

    private static void example1() {
        // coz LinkedLst is implements Dequeue , and Dequeue extends Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        queue.offer("Four"); // this is same as add() , this will return true if we added item successfully.

        System.out.println(queue.element()); //Return the first item not removing it from queue

        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void priorityQueueExample() {
        // By Default, it works on Ascending Order
        Queue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("One", 27));
        queue.add(new Person("Two", 37));
        queue.add(new Person("Onetwo", 47));
        queue.add(new Person("Four", 57));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();
        // Priority Queue with Descending Order
        Queue<Person> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.add(new Person("One", 27));
        queue1.add(new Person("Two", 37));
        queue1.add(new Person("Onetwo", 47));
        queue1.add(new Person("Four", 57));

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
    }


    private static void findTheKthLargestNo(int[] arr, int kthLargest) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(kthLargest);

        for (int i = 0; i < arr.length; i++) {
            if (priorityQueue.size() == kthLargest) {
                priorityQueue.poll();
            }
            priorityQueue.offer(arr[i]);

        }
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
