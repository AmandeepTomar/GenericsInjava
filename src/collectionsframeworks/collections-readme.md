#Collection Frameworks 
- Almost all the collections(expect for map) can be derived from `java.utill.collection` interface
- `toArray()` convert any collection into 1-D Array.
- `Collection` interface extends `java.lang.Iterable`

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.

## Collection interface has methods 
- Basis Operations
  ```
    boolean add(Object o);
    boolean remove(Object o);
    boolean contains(Object o);
    int size()
    Iterator<E> iterator();
  ```
- Bulk operations
   ```
    boolean addAll(Collection<? extends E> c);
    boolean removeAll(Collection<?> c);
    boolean retainAll(Collection<?> c); // elements that are not present in new collection will be removed from old one.
    boolean containsAll(Collection<?> c);
    void clear();
  ```
 - Array Operations
   ```
     Object[] toArray();
     <T> T[] toArray(T[] a);
   ```  

###List (Interface)

- ArrayList
- LinkedList
- Vector
  - Stack
###Queue (Interface)
  
- PriorityQueue
- Dequeue <B>(interface)</B>
  - ArrayDequeue

###Set (Interface)

- HashSet
- LinkedHashSet
- SortedSet <B>(interface)</B>
- TreeSet

Map is not comes under collection DataStructure 

###Map 

- HashTable 
- HashMap
- LinkedHashMap
- SortedMap <B>Interface</B>
  - TreeMap

##Running Time Complexity

- Measure the no of steps a given algorithm requires in response to the input

- ####O(1) Constant time complexity

  - The running time is independent of the N input. for example Swap two no with given indices of N size Array.
- ####O(N) Linear time complexity

  - Running time scale linearly with the N input so the running time increases linearly with the input size.
  - Example linear search, Search an item in the array so need to iterate N items in worst case.
- ####O(logN) Logarithmic running time complexity
 
  - Running time scale logarithmically with the N input so the running time increases logarithmically with the input size.
  For example Binary search, We use the Divide rule here so each time N/2 times N/4.


## List

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.
### List (Interface)

- ArrayList
- LinkedList
- Vector
    - Stack

### List Interface

- it extends `Collection interface` and `Collection interface` extends `Iterable` Interface
- it is ordered collection
- it can include duplicates
- it provides full visibility and control over the ordering of elements.
- ArrayList using 1-D Arrays under the hood.
- ArrayList allow `null` elements. 
- `ArrayList implements Serializable,cloneable, Iterable, Collection,List,RandomAccess`
- Initial capacity is 10.
- Resizing the array is really heavy operation O(N) so if we know that we need more that 10 or like 10000 items to be added in list them we need to create a list with initial capacity of 10000.
- Random Indexing get(0)->`O(1)`
- Insert item at given index , Remove at given index -> `O(N)` 
- ArrayList are fast if we manipulate at last item.coz Java don't need to perform any shifting or operation.
- If we check list is `list.contains(item)` it will take `O(N)`
- The List.of and List.copyOf static factory methods provide a convenient way to create unmodifiable lists. The List instances created by these methods have the following characteristics:

  - They are unmodifiable. Elements cannot be added, removed, or replaced. Calling any mutator method on the List will always cause `UnsupportedOperationException` to be thrown. However, if the contained elements are themselves mutable, this may cause the List's contents to appear to change.
  - They `disallow null elements`. Attempts to create them with null elements result in `NullPointerException`.
  - They are serializable if all elements are serializable.
  - The order of elements in the list is the same as the order of the provided arguments, or of the elements in the provided array.
  - They are value-based. Callers should make no assumptions about the identity of the returned instances. Factories are free to create new instances or reuse existing ones. Therefore, identity-sensitive operations on these instances (reference equality (==), identity hash code, and synchronization) are `unreliable and should be avoided`.
  ```
        List<Integer> list=new ArrayList<>();
           // list.add(null);
            list.add(1);

            System.out.println(list);

            List<String> strList=new ArrayList<>();
            strList.add(null);

            System.out.println(strList);

            List<Integer> list1=List.copyOf(list);
            list1.add(null);
            
            if you add null in list its works file. 
            add null in strList its works fine.
            
            if You add null in list and now you try List<Integer> list1=List.copyOf(list); will get NullPointerException cause you added null in list. 
            
            if you remove null from list then it works fine. 
            
            Now you get the copy of list and now you try to add null , will get NullPointerExceptio.
            
            If you want to add some valid object like not null like list1.add(5) then you get public class UnsupportedOperationException extends RuntimeException {

            
  ```
  
  ## LinkedList
  
  -  LinkedList node connected by references 
  - As array have a disadvantages , there may be `holes` in the Array Data structures and we have to shift a lot of items.
  - This problem will be fixed by LinkedList.
- LinkedList 
  - Data 
  - Reference of Next node 
  - First node is `head`
  - Last node reference to `NULL called tail node.`
- It required more memory than Arrays 
- But it does not have holes so no shifting required.
- No `random Access indexing`
- We can implement Data Structures such as `STACKS and QUEUE`
- Finding arbitrary item in the linked list still has `O(N) Running Time
- We can insert item at the beginning of the data structure `FAST at O(1)`
- If we add and remove at the end or last of linked list its operation is `SLOW O(N)`
- <B>Important Notes</B>
  - All of the operations perform as could be expected for a doubly-linked list. Operations that index into the list will traverse the list from the beginning or the end,
  - Note that this implementation is not synchronized.
  - This is typically accomplished by `synchronizing on some object that naturally encapsulates the list`. If no such object exists, the list should be` "wrapped" using the Collections.synchronizedList method`. This is best done at creation time, to prevent accidental unsynchronized access to the list:
    `List list = Collections.synchronizedList(new LinkedList(...));`
  - Adding and removing from first and last is `O(1)` running time.

### Vector

- Thread safe and have capacity increment counter.

### STACK

- `LIFO` Last In First out 
- Can be implemented using array and LinkedList
- Operations `push()->Insert, pop()->Remove and peek()->Top or Last item of stack`
- Modern programing languages are `STACK-Oriented`
- Depth search algo can be implemented using stack
- Strongly connected elements in a graph G(E,V)
- We have considered Vectors - and we came to the conclusion that ArrayList is a better option usually.

- Stack extends the Vector class - which means that stacks are inherently synchronized.

  - however synchronization is not always needed - in such cases it is better to use ArrayDeque
- `poll()` this will return the Last item , but it is different from `pop()` because it throw exception if stack is empty.


# Queue Implementation 
- it is based on `FIFO` , first in firt out.
- Implemented using arrays and linked list
- Basic operations 
  - `enqueue() -> Insert ` 
  - `dequeue() -> Remove `
  - `peek()-> fetch Top item`
- Several applications in `Operating System` and `Thread management`
## Queues Application
- useful when resource is shared with several consumers
- Threads are stored in queues
- use in CPU scheduling
- When data transfer asynchronously 
- Graph algorithms 
### Implementations

  - We can instance `Queue<String> queue=new LinkedList<>()`, because LinkedList implements `Dequeue` interface nd `Dequeue` interface extends `Queue` interface.
  - `queue.add(e)` add element in queue
  - `queue.offer(e)` add element and return a boolean value
  - `queue.element()` Return the first element , but not removing it from queue
  - `queue.remove()` Return and remove first element from queue

## PriorityQueue Implementation

- An unbounded priority queue based on a priority heap. 
- The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
- A priority queue does not permit null elements.
- A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException).
- `add(e)` insert elements 
- `peek()` Retrieves and does not remove from the queue
- `poll()` Retrieves and remove from queue
- <B>NOTE</B>
  - If we want to create our own custom class and implement priorityQueue on it then we need to implement `Comprable` interface
  - Because we need to tell the compiler on which property we check for the priority.
  - If we do not implement `Comprable` then it will throw Exception
    - `Exception in thread "main" java.lang.ClassCastException: class collectionsframeworks.queue.Person cannot be cast to class java.lang.Comparable (collectionsframeworks.queue.Person is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
      `
  - By default, it works on ascending order (Small -> Big)
  - If you want to use the descending order (Big -> Small)
    - `Queue<Person> queue=new PriorityQueue<>(Collections.reverseOrder())`
### ArrayDequeue Implementation
    

- It is Double ended queue 
- Huge 1-D Array 
- First and Last item manipulation on O(1) that is FAST.
- `addFirst()` insert
- `addlast()` insert end
- `offerFirst()` insert first and throw exception
- `offerLast()` insert end and throw exception
- `removeFirst()`
- `removeLast()`
- `poll()` remove and retrieves items

# Maps Implementations
    
    -  Map (Interface)
        - HashTable 
        - HashMap
        - LinkedHashMap
    -  SortedMap
        - TreeMap

- Associative arrays(map and dictionary) are abstract data types
- Collection of <B>Key Value pairs</B> where each key appears at most once in the collection 
- Implement hasmap with hashTable.
- to achieve O(1) time complexity for each operation.
- We can combine `Random Access ` with `hash funtion` to end up with O(1) running times.
- Key Value pair are unordered. so its not supporting sorting.
- Q. <B> How to achieve O(1) running time for insertion and removal?</B>
  - Transform the key into an array index - to achieve Random access.
  - Key Must be unique to avoid the same index 
  - use h(x)-> Hash function transform key into indexes [o N-1];
  - to calculate hashcode for String we must use ASCII values for better result.
## Collisions
 
- When hash function generate the same index for different key.
- We will solve using 
  - Chaining 
    - We store the item in same bucket in the same index using LinkedList.
    - In the worst case all store in the same bucket so final time complexity O(N)
  - Open Addressing 
    - If collision happens , we generate a new index for the item
      - <b>Linear Probing</b>
        - if collision happen at the array index x then , we try to find the new empty index with x+1,x+2,x+3.. so on
        - there will be cluster in the underlying array
        - It has better cache performance
        - Read direct from the main memory that why it is fast.
      - <b>Quadratic Probing</b>
        - If collision happens at array index x then , we try successive value of an arbitrary quadratic polynomial
          - Like (array slot 1 4 9 16 ...steps away from the collision)
        - No cluster 
        - No cache advantages 
      - <b>Rehashing</b>
        - When collision happen we regenerate the hashing index using hash function.
### HashTable collisions Complexity 

    - Memory                Average         Worst Case
    - memory Complexity     O(N)                O(N)
    - Search                O(1)                O(N)
    - Insertion             O(1)                O(N)
    - Deletion              O(1)                O(N)

### Load Factor 

- P(x) probability of collision is not constant , 
- More item in hashtable is higher P(x)
- Load factor = n/m 
- where 
  - n-> No of actual items 
  - m the size of array
- <B> Small Load factor (around 0)</B>
  
  - When n is smaller than m or hashtable nearly empty , low probability of P(x) collisions.
  - Lot of memory wasted.

- <B> High Load factor (around 1)</B>

  - n is grater than m or hashtable near full , high probability of P(x)
  - No memory wasted 
  - running time complexity is `O(N) in worst case` 
- When the `load factor is > 0.75` then java resize the hashtable automatically to avoid too many collisions.
- Resizing the array is heavy task , its have linear running complexity `O(N)`
- Methods 
  - `put(key,Value)` insert values 
  - `get(key)` get the values of key
  - `containsKey(key)` boolean 
  - `remove(key)` value and removed from the hashmap.
- <B> Important </B>

  - We can put `null` as key in HashMap. this one always on `0th` index in hashtable.
  - We can enter the duplicate keys but it update the old values.
  - It is not store the item in sorted order.
  
### HashCode() and Equals() Methods 

- `hashCode()`
  - hash-function that calculate the index based on hash key
  - To avoid clustering we use prime number , No clustering means low P(x) that is probability of collisions.
  - If two objects are same then they have same hashcode() values.
- `equals()`
  - When collisions happen we may need to find out the item (Object) in linked list.
  - it is happens that two object may have same hashcode may return false in equals.
- <B> Rules for hashMap key</B>

  - If using custom object must be implemented `hashcode()` and `equals()`
  - Key must be Immutable 
    - Because if we use custom object and someone changes the key after adding some values then iot will return null or something else.
### LinkedHashMap

- LinkedHashMap preserve the order of insertion 
- Doubly LinkedList connection to the item inserted.

### TreeMap

- It is Red-Black tree implementation under thr hood.
- Item are stored in the sorted order in terms of keys , `by default it is in ascending order`.
- Reverse the order using `Collections.reverseOrder() in TreeMap<>(Collections.reverseOrder())`
  - `Map<Integer, String> treeMap=new TreeMap<>(Comparator.reverseOrder());`
- A Red-Black tree based NavigableMap implementation.
- The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
- As it used Balanced binary tree so operations in `O(logN)` running time complexity
- TreeMap get lastKey using `treeMap.lastKey()`
- TreeMap get firstKey using `treeMap.firstKey()`
- We can not add `null` key in tree Map.
- Need less memory from HashMap and LinkedHashMap

### From Java 8

- We have changed the data structure to deal with collision from LinkedList to Tree(balanced Binary Tree)
  - so the worst case running complexity is `O(logN)` now'


# Set Implementation

    - Set(Interface) 
        - HashSet
        - LinkedListSet
    - SortedSet(Interface)
    - TreeSet

- Store certain values without any particular order and no repeated values.
- No Duplicates 
- This class implements the Set interface, backed by a hash table (actually a HashMap instance).
- It makes no guarantees as to the iteration order of the set; in particular, 
- it does not guarantee that the order will remain constant over time. T
- This class permits the null element.
- This class offers constant time performance for the basic operations (add, remove, contains and size),
- Note that this implementation is not synchronized. 
- `  Set s = Collections.synchronizedSet(new HashSet(...));` for synchronised.
- We have single value not Key and value pair like HashMap.
- Initial capacity is 16 , in 1-D Array.
- `add(E)` insert element 
- `remove(E)` remove element 
- `retainAll()` Intersection common in both sets
- Worst case running time complexity is `O(logN)`
- Average case running time complexity is `O(1)`

### LinkedHashSet

- it maintains the insertion order , the order in which we inserted items.
- Under the hood it is using Doubly LinkedList
- It needed more memory than hashset

### TreeSet

- Under the hood it is using the Red black tree structure 
- It guarantees `O(logN)` running complexity 
- A NavigableSet implementation based on a TreeMap.
- The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.
- This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
- Note that this implementation is not synchronized
- If no such object exists, the set should be "wrapped" using the Collections.synchronizedSortedSet method. This is best done at creation time, to prevent accidental unsynchronized access to the set:
  `SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));`
- `set.subSet(1,5)` return set with item 1 inclusive and 5 exclusive 
  - Example set(1,2,5,7,8,9) => set.subSet(1,5)=>[1,2]
- `set.tailSet(5)` it return all element with SortedSet, including element
  - Example set(1,2,5,7,8,9) => set.tailSet(5)=>[5,7,8,9]
- `set.headSet(5)` it return all element with SortedSet , excluding element
- Example set(1,2,5,7,8,9) => set.tailSet(6)=>[1,2,5]
- We can get the largest and smallest 
  - `set.first()` smallest 
  - `set.last()` largest
- <B> it is memory friendly</B>
  -it is taking less memory than HashSet and LinkedHashSet
- Can not store null in TreeSet



# Sorting Done by Under hood 
- Java uses Arrays Sorting
  - `QuickSort` sort primitive type (int , float..) 
  - `MergeSort` sort reference type (Integer, String, Custom Objects....)
  - then have `O(NlogN)` Running time complexity.
  - In worst case `QuickSort` may have `O(N2)` but merge sort guarantee `O(NLogN)` 
# Collections Class
  
- This class consists exclusively of static methods that operate on or return collections.
- It contains polymorphic algorithms that operate on collections, "wrappers", which return a new collection backed by a specified collection, and a few other odds and ends.
- The methods of this class all throw a NullPointerException if the collections or class objects provided to them are null.
- We can map the `Unsynchronised` collection into `Synchronised` 
- We are able to sort the List<E interface , 
  - `Queue<String> queue=new LinkedList<>()` its not sort because `sort()` required List interface to sort.
    - `List<String> queue=new LinkedList<>()` its works fine.
      - If you want to sort reference/Custom Object list 
        - Solution1 -> need to implement `Comparable<Object>` interface
        - ```aidl
                @Override
          public int compareTo(Person o) {
             // return name.compareTo(o.getName()); // provide ascending order
              // provide ascending order
              if (this.getAge() > o.getAge()) return +1;
              if (this.getAge()== o.getAge())return 0;
              else return -1;
            // if you want in descending order
            if (this.getAge() > o.getAge()) return -1;
            if (this.getAge()== o.getAge())return 0;
            else return +1;

          }
          ```
        
      - Solution2 ->`Comparator` is class and interface
        - We create a separate comparator for class and extract comparator information from simple data class
        - We can provide as many comparator as we want.
        - ```aidl
           public class BookComparator implements Comparator<Book> {

          @Override
          public int compare(Book o1, Book o2) {
            return o1.getBookName().compareTo(o2.getBookName());
          }
          }
            // We can use like 
               books.sort(new BookComparator());
           printAllItem(books);
            System.out.println("===========");
             Collections.sort(books,new BookComparator());
          ```
        
### Sorting with Lamda Expression

- we don't need to implement Comparator and Comparable interface 
- ```aidl
        System.out.println("Apply sorting on name then count");
        Collections.sort(items, Comparator.comparing(Item::getName).thenComparing(Item::getCount));
        CollectionsSortExample.printAllItem(items);

   ```
   
   # Collections Class 

- Synchronised collections 
- UnModifiable Collections 
- Sort the collections 
- Shuffle the collections 
- Replace ALL 
- these all present in Collections class
- Methods 
  - `    public static <T>
    int binarySearch(List<? extends Comparable<? super T>> list, T key) {}`
  - 
  - `public static void reverse(List<?> list) {}`
  - 
  - ` public static void shuffle(List<?> list) {}`
  - 
  - ` public static void swap(List<?> list, int i, int j) {}`
  - 
  - `Replaces all of the elements of the specified list with the specified element.
    This method runs in linear time. public static <T> void fill(List<? super T> list, T obj) {}`
  - 
  - `Copy()` , `min()` , `max()`
  - `rotate()` 
  - `replaceAll()`
  - `unmodifiableCollection()`
  - `subSet()`
  - `headSet()` , `tailSet()` and many more
  - `Will get this Exception in thread "main" java.lang.UnsupportedOperationException` when we try to modify the `unmodifiableCollection()`
### Synchronised Classes 
  - Stack and Vector
  - hashTable 
  - `SynchronisedCollection()` return the `Thread-Safe` Collections
    - `synchronisedList()`
    - `synchronisedMap()`
    - `synchronisedSet()`
  - What is the Problems in Multi-threaded environment ?
    - if we start two threads and both are adding the items in List , so they provide the wrong answer because both are adding in different threads 
    - Solution:- used `synchronizedList()`
      - It is using `Intrinsic lock `
      - It is not that efficient because threads having to wait for each others even when they want to execute in different methods(Operations).
        


# References
- https://idemia.udemy.com/course/introduction-to-generics-in-java
- JavaDocs 




