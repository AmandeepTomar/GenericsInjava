package collectionsframeworks.concurrentcollection;

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
