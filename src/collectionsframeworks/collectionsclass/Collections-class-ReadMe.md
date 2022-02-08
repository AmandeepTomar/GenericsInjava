#Collections Class 

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
###Synchronised Classes 
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