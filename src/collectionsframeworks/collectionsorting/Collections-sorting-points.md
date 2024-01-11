
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
        - ```java
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
        
###Sorting with Lamda Expression

- we don't need to implement Comparator and Comparable interface 
- ```aidl
        System.out.println("Apply sorting on name then count");
        Collections.sort(items, Comparator.comparing(Item::getName).thenComparing(Item::getCount));
        CollectionsSortExample.printAllItem(items);

   ```
        

