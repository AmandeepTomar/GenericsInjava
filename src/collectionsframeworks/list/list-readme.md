## List Interface

`Iterable`<----`Collection`<-----`List, Queue and set` All are interface.
### List (Interface)

- List `interface` has some specific method related to List
```
    E get(int index);
    E set(int index, E element);
    void add(int index, E element);
    E remove(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);
    List<E> subList(int fromIndex, int toIndex); // backed by original list that means if we made any changes in original list will be reflected in sub list.

// Added in Java 1.8
  default void sort(Comparator<? super E> c) 

// added in JAVA 9
 static <E> List<E> of(E... elements)

// Added in JAVA 10
 static <E> List<E> copyOf(Collection<? extends E> c)

```


- ArrayList
- LinkedList
- Vector
    - Stack

###List Interface

- it extends `Collection interface` and `Collection interface` extends `Iterable` Interface
- it is ordered collection
- it can include duplicates and `null`
- it provides full visibility and control over the ordering of elements.
- ArrayList using 1-D Arrays under the hood.
- `ArrayList implements Serializable,cloneable, Iterable, Collection,List,RandomAccess`
- Initial capacity is 10. increased by 50% of size when we reached at the capacity.
- Resizing the array is really heavy operation O(N) so if we know that we need more that 10 or like 10000 items to be added in list them we need to create a list with initial capacity of 10000.
- Random Indexing get(0)->`O(1)` , access the elements.
- Insert item at given index , Remove at given index -> `O(N)`
- When we add new element at the start of the list then we need to shift all the elements towards the right of the list that why adding at the start or beginning of the list is expensive `O(N)`. Same if we remove elements from the begning then it shift all elements to `LEFT` and it is also expensive operation of ~ `O(N)`
- ArrayList is fast if we manipulate at last item. coz Java doesn't need to perform any shifting or operation. -> `O(1). at last index. 
- If we check list is `list.contains(item)` it will take `O(N)`
- The `List.of` and `List.copyOf` static factory methods provide a convenient way to create unmodifiable lists. The List instances created by these methods has the following characteristics:

  - They are unmodifiable. Elements cannot be added, removed, or replaced. Calling any mutator method on the List will always cause `UnsupportedOperationException` to be thrown. However, if the contained elements are themselves mutable, this may cause the List's contents to appear to change.
  - They `disallow null elements`. Attempts to create them with null elements result in `NullPointerException`.
  - They are serializable if all elements are serializable.
  - The order of elements in the list is the same as the order of the provided arguments, or of the elements in the provided array.
  - They are value-based. Callers should make no assumptions about the identity of the returned instances. Factories are free to create new instances or reuse existing ones. Therefore, identity-sensitive operations on these instances (reference equality (==), identity hash code, and synchronization) are `unreliable and should be avoided`.
  - <B>`Add null , but if we want to add null in List<String> getting nullpointer exception`</B>
- `list1.removeAll(list2)` all the elements that is present in list one and list two is removed.
- `list1.retainAll(list2)` All the elements that are common in both list will be retains and all other removed.

**NOTE**
- When we iterate a list then we can not remove the element using `foreach loop or for loop`. if we tried then we will get `ConcurrentModificationException`.

```java
class Sample {
   
  private void printList() {
    list.forEach {
      System.out.println(it);
      if (it == 9) {
        list.remove(Integer.valueOf(it)); // this line throw the exception.
      }
    }
  }
  
  // solution 
  
  private void solution(){
    System.out.println(list);
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      int element = iterator.next();
      System.out.println(element);
      if (element == 4 || element ==100) {
        iterator.remove();
      }
    }
    System.out.println("Removed 4 and 100 " + list);
  }
}

```
- To fix that remove element problem we need to use the `Iterator()` check `solution()` above.
- `Iterator is an Interface` it has some methods 
```java
  - hasNext();
  - next();
  - remove();
  - default forEach(); // added in java 1.8
```

**ListIterator**
- `ListInterator` is an `interface` that extends the `iterator` interface.
- it has some methods and bidirectional access capability and also replace the elements.
- Uses traversing Tree and application installation software.

```java
void add(E e);
void set(E e);
void remove();
// Bidirectional Accress 
boolean hasNext();
boolean hasPrevious();
E next();
E previous();
int nextIndex();
int previousIndex();
```



## LinkedList
  
- LinkedList node connected by references 
- As arrays have a disadvantages, there may be `holes` in the Array Data structures and we have to shift a lot of items.
- LinkedList will fix this problem.
- LinkedList 
  - Data 
  - Reference of Next node 
  - The first node is `head`
  - Last node reference to `NULL called tail node.`
- It required more memory than Arrays 
- But it does not have holes so no shifting is required.
- No `random Access indexing`
- We can implement Data Structures such as `STACKS and QUEUE`
- Finding an arbitrary item in the linked list still has `O(N)` Running Time
- We can insert an item at the beginning of the data structure `FAST at O(1)`
- If we add and remove at the end or last of the linked list its operation is `SLOW O(N)`
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

