package collectionsframeworks.collectionsorting.concurrentcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionsDemo {

    public static void main(String[] args) {
        try {
            ConcurrentHashMapExample.concurrentHasMap();
            ConcurrentHashMapExample.withoutConcurrentHashMap();

         //   ConcurrentListExample.concurrentList();
            ConcurrentListExample.normalListList();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
