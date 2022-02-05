#Collection Frameworks 
- Almost all the collections(expect for map) can be derived from `java.utill.collection` interface
- `toArray()` convert any collection into 1-D Array.
- `Collection` interface extends `java.lang.Iterable`

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.
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

- Measure the no of steps a given algorithm required with response to the input

- ####O(1) Constant time complexity

  - The running time is independent of the N input. for example Swap two no with given indices of N size Array.
- ####O(N) Linear time complexity

  - Running time scale linearly with the N input so the running time increase linearly with the size of input.
  - Example linear search , Search an item in array so need to iterate N items in worst case.
- ####O(logN) Logarithmic running time complexity
 
  - Running time scale logarithmically with the N input so the running time increase logarithmically with the size of input.
  - Example Binary search , We use Divide rule here so each time N/2 times N/4.




