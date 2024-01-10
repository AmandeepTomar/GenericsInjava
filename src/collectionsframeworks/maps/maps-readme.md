# Maps Implementations
    
    -  Map (Interface)
        - HashTable 
        - HashMap
        - LinkedHashMap
    -  SortedMap
        - TreeMap
=========================

    - V put(K,V) // K -> Key V -> Value  , and retrun type is old value.
      V get(K) 
      V remove(K)
      boolean containsKey(K)
      boolean containsValue(K)
      int size()
      boolean isEmpty()
      void putAll(MAP<K,V>)
      void clear()
      Set<E> keySet() // backed by original Set 
      Collection<V> values()
      Set<Map.Entry<KV>> entrySet() // Backed by original , used for iterating the map.

    Where Entry is and Interface. 
    V getKey()
    V getValue() 
    V setValue(V)
      

      


- Associative arrays(map and dictionary) are abstract data types
- Collection of <B>Key Value pairs</B> where each key appears at most once in the collection 
- Implement hasmap with hashTable.
- Key should be immutable. if we use the mutable keys then the state of key change at any time and we will get the different hashIndex for the same object. try with example where key is list of Integers and value is String. `Map<List<Integer>,String> map = new HashMap<>();`  
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
- LinkedHashMap iteration is faster than HashMap iteration because it uses doubly linked list. 
- It is used as LRU cache
- LRU cache Implementation.
- Least Recently Use and Most Recently used there are two concepts. So in LRU the least recently used item will be removed. 
- **Cache Hit** that means if we search for any item and that will found in cache the we call it cache hit. 
- **Cache Miss** if we are not found item in cache then we call it cache miss. 
- LRU is only apply to `LinkedHashMap` not to `LinkedHasSet` although `LinkedHashSet` also use the `HashMap` internally.
- So we have a constructor in `LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)`


- `public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)`
- where `accessOrder = true ` means Lru cache. 
- where `accessOrder = false ` means NO Lru cache, Normal ordered Map. 
- there is a method `removeEldestEntry()` by default it is return false, that means elder element is not removed.this method is called internally whenever `put()` and `putAll()` method get called.
```java
@Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return false;
        }
```
- But we have one problem that we can not restrict the size of LRU cache it is a LRU cache with unlimited size. 
- To make it with Limited size we need to create our own LRUCache implementation that extends the LinkedHashMap class and override the `removeEldestEntry()` functionality.
- SO lets see the example. 
#### Implementation  of LRU Cache

```java
    class LruCache<K,V> extends LinkedHashMap<K,V> {

        int MAX_CAPACITY = 4;
        public LruCache(int initialCapacity , float loadFactor , boolean accessOrder){
            super(initialCapacity,loadFactor,accessOrder);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > MAX_CAPACITY;
        }
    }

```


### TreeMap

`public class TreeMap<K,V>
extends AbstractMap<K,V>
implements NavigableMap<K,V>, Cloneable, java.io.Serializable`

`NavigableMap -> SortedMap-> Map` 
- It is Red-Black tree implementation under thr hood.
- Item are stored in the sorted order in terms of keys , `by default it is in ascending order`.
- Reverse the order using `Collections.reverseOrder() in TreeMap<>(Collections.reverseOrder())`
  - `Map<Integer, String> treeMap=new TreeMap<>(Comparator.reverseOrder());`
- A Red-Black tree based `NavigableMap` implementation.
- The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
- As it used Balanced binary tree so operations in `O(logN)` running time complexity
- TreeMap get lastKey using `treeMap.lastKey()`
- TreeMap get firstKey using `treeMap.firstKey()`
- We can not add `null` key in tree Map.
- Need less memory from HashMap and LinkedHashMap

### From Java 8

- We have changed the data structure to deal with collision from LinkedList to Tree(balanced Binary Tree)
  - so the worst case running complexity is `O(logN)` now