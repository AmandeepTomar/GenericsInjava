## Concurrent Collection  introduced in JDK 1.5.
- they are introduced in JDK 1.5, Prior we use `Collections,synchronizedList()` but this one has the performance issues. as it block the complete object. if some one is writing then other thread must wait to release the lock anf than read. 

Concurrent collection is set of classes that allow multiple thread to access and modify the collection undercurrent without the need for explicit synchronization. these collections are part of `java.util.concurret` package. thread safe implementation of `List , Set and Map`.
- Synchronized collections are collections that are accessed by multiple threads, but only one thread can access them at a time. This can lead to performance issues as threads have to wait for access to the collection.
- Concurrent collections solve this problem by allowing multiple threads to access the collection concurrently, without the need for explicit synchronization.
  - ConcurrentHashMap:
  - ConcurrentLinkedQueue:
  - CopyOnWriteArrayList:
  - BlockingQueue:
  - ConcurrentSkipListMap and ConcurrentSkipListSet:

### ConcurrentHashMap:
- The default concurrency-level of ConcurrentHashMap is 16.
-  at a time any number of threads can perform retrieval operation but for updated in the object, the thread must lock the particular segment in which the thread wants to operate. This type of locking mechanism is known as Segment locking or bucket locking. Hence at a time, 16 update operations can be performed by threads.
- Provide a thread safe implementation of `hashTable`. Multiple threads can read and write without any external synchronization.
- `   Map<String, Integer> map = new ConcurrentHashMap<>();`
- If one thread is writing on s1 then non of thread can not be read the data from t1 until the lock release or write operation completed.
- null is not allowed. 


### ConcurrentLinkedQueue:
_ Thread safe variant of `LinkedList`. and provide the thread safe implementation of `FIFO Queue`.

### CopyOnWriteArrayList
- This class is a thread-safe variant of the `ArrayList` class.
  It provides thread safety by creating a fresh copy of the underlying array whenever an element is added, modified, or removed. This strategy makes it ideal for scenarios where traversal is more common than modification.
- Does not use lock for read operation. When a read operation perform it works on original array snapshot without any locks.
- Write operation `add(), set(), remove()` uses locks internally that means only one thread can perform a operation at a time.
  - use `ReentrantLock`
  - When `add()` new elements
    1. acquire the lock
    2. create a new array one element larger than previous
    3. copy old array into new array.
    4. now element added to the copied array. at the end.
    5. Update the reference to the new array and release the lock.


### CopyOnWriteArraySet
- for `Set`

### BlockingQueue
- This is an interface that represents a queue that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become available in the queue when adding an element.
  Implementations like `LinkedBlockingQueue and ArrayBlockingQueue` provide blocking behavior, making them suitable for `producer-consumer scenarios`

### ConcurrentSkipListMap and ConcurrentSkipListSet: 
- Added in java 1.6. for `TreeMap` and for `TreeSet`
- Sorted Map and Sorted set. 
- floor , ceil , height and lower entries. 
- first and last. 





