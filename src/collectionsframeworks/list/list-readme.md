##List

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.
###List (Interface)

- ArrayList
- LinkedList
- Vector
    - Stack

###List Interface

- it extends `Collection interface` and `Collection interface` extends `Iterable` Interface
- it is ordered collection
- it can include duplicates
- it provides full visibility and control over the ordering of elements.
- ArrayList using 1-D Arrays under the hood.
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
  - <B>`Add null , but if we want to add null in List<String> getting nullpointer exception`</B>


##LinkedList
  
- LinkedList node connected by references 
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

###Vector

- Thread safe and have capacity increment counter.

###STACK

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

