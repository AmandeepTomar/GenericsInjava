#Queue Implementation 
- it is based on `FIFO` , first in firt out.
- Implemented using arrays and linked list
- Basic operations 
  - `enqueue() -> Insert ` 
  - `dequeue() -> Remove `
  - `peek()-> fetch Top item`
- Several applications in `Operating System` and `Thread management`
##Queues Application
- useful when resource is shared with several consumers
- Threads are stored in queues
- use in CPU scheduling
- When data transfer asynchronously 
- Graph algorithms 
###Implementations

  - We can instance `Queue<String> queue=new LinkedList<>()`, because LinkedList implements `Dequeue` interface nd `Dequeue` interface extends `Queue` interface.
  - `queue.add(e)` add element in queue
  - `queue.offer(e)` add element and return a boolean value
  - `queue.element()` Return the first element , but not removing it from queue
  - `queue.remove()` Return and remove first element from queue

##PriorityQueue Implementation

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
###ArrayDequeue Implementation
    

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