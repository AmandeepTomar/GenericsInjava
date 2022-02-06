#Maps Implementations
    
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
##Collisions
 
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
###HashTable collisions Complexity 

    - Memory                Average         Worst Case
    - memory Complexity     O(N)                O(N)
    - Search                O(1)                O(N)
    - Insertion             O(1)                O(N)
    - Deletion              O(1)                O(N)

###Load Factor 

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
  
###HashCode() and Equals() Methods 

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
###LinkedHashMap

- LinkedHashMap preserve the order of insertion 
- Doubly LinkedList connection to the item inserted.

###TreeMap

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

###From Java 8

- We have changed the data structure to deal with collision from LinkedList to Tree(balanced Binary Tree)
  - so the worst case running complexity is `O(logN)` now