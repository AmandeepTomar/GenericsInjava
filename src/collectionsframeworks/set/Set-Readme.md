#Set Implementation

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

###LinkedHashSet

- it maintains the insertion order , the order in which we inserted items.
- Under the hood it is using Doubly LinkedList
- It needed more memory than hashset

###TreeSet

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