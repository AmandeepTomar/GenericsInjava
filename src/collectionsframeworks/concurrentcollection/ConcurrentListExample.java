package collectionsframeworks.concurrentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {

    public static void concurrentList() {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        Runnable t1 = () -> {
            for (int i = 0; i < 1000; i++) {
        list.get(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t2 = () -> {
            list.add(1000000011);
            list.add(1000000012);
            list.add(1000000013);
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
        try {
            thread2.join();
            thread1.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("With CopyOnWriteArrayList "+list.size());
    }

    public static void normalListList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Runnable t1 = () -> {
            for (int i = 0; i < 1000; i++) {
                list.get(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t2 = () -> {
            for (int i = 0; i <20 ; i++) {
                list.add(100);
                list.add(101);
                list.add(103);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread2.start();
        thread1.start();

        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(list.size());
    }


}
