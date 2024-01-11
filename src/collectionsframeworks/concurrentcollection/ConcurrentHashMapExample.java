package collectionsframeworks.concurrentcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void withoutConcurrentHashMap() throws InterruptedException {
        // Skipped some operation due to thread scheduling.
        Map<String, Integer> map = new HashMap<>();
        map.put("Name",1);

        Thread t1 =  new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                map.put("NameT1"+i,i);
            }
        });

        Thread t2 =  new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                map.put("NameT2"+i, i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("After Completing T1 and T2 map size "+map.size());
        // System.out.println("After Completing T1 and T2 "+map);
    }

    public static void concurrentHasMap() throws InterruptedException {
        // this one provide the correct size and all the operation performed.
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Name",1);

        Thread t1 =  new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                map.put("NameT1"+i,i);
            }
        });

        Thread t2 =  new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                map.put("NameT2"+i, i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("After Completing T1 and T2 map size "+map.size());
        // System.out.println("After Completing T1 and T2 "+map);
    }
}
