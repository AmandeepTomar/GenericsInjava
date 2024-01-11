package collectionsframeworks.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

    public static void main(String[] args) {
       // problemWithMultiThread();
        solutionWithMultiThreaded();
    }

    private static void solutionWithMultiThreaded() {
        // add or remove methods are synchronised
        List<Integer> list= Collections.synchronizedList(new ArrayList<>());

        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    list.add(i);
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    list.add(i);
                }
            }
        });

        // starting both thread
        t1.start();
        t2.start();

        //Waits for this thread to die.
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of thread "+list.size());
    }

    private static void problemWithMultiThread() {
        // not providing the correct size

        List<Integer> list=new ArrayList<>();

      Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    list.add(i);
                }
            }
        });

      Thread t2=new Thread(new Runnable() {
          @Override
          public void run() {
              for (int i = 0; i <1000 ; i++) {
                  list.add(i);
              }
          }
      });

      // starting both thread
      t1.start();
      t2.start();

      //Waits for this thread to die.
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of thread "+list.size());
    }
}
