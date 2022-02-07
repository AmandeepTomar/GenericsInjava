package collectionsframeworks.collectionsorting;

import java.util.*;

public class CollectionsSortExample {

    public static void main(String[] args) {

        sortListExample();
        sortListWithCustomObjectExample();
        sortListWithCustomObjectWithComparatorExample();

    }

    private static void sortListWithCustomObjectWithComparatorExample() {
        List<Book> books=new ArrayList<>();
        books.add(new Book("BookName","Author Name",700));
        books.add(new Book("Java","John",800));
        books.add(new Book("Android","Google",7000));
        books.add(new Book("Angular","Another",650));
        books.add(new Book("Spring","Author is ",7001));

        books.sort(new BookComparator());
        printAllItem(books);
        System.out.println("===========");
        Collections.sort(books,new BookComparator());
        printAllItem(books);
        System.out.println("Next");
        books.sort(new BookComparator().reversed());
        printAllItem(books);
        System.out.println("===========");
        Collections.sort(books,new BookComparator().reversed());
        printAllItem(books);
    }

    private static void sortListWithCustomObjectExample() {

        List<Person> persons=new ArrayList<>();
        persons.add(new Person("aman",20,"12-12-2002"));
        persons.add(new Person("abid",10,"12-12-2002"));
        persons.add(new Person("akram",30,"12-12-2002"));
        persons.add(new Person("amit",23,"12-12-2002"));
        persons.add(new Person("karan",21,"12-12-2002"));
        persons.add(new Person("gaurav",18,"12-12-2002"));

       // it's like we need to implement Comparable or Comparator.
        Collections.sort(persons);

        printAllItem(persons);

    }


    private static void sortListExample() {

        List<String> names=new ArrayList<>();
        names.add("Aman");
        names.add("Abid");
        names.add("Amandeep");
        names.add("Saurav");
        names.add("Shivam");
        names.add("Gaurav");
        names.add("Anupam");

        printAllItem(names);
        System.out.println("Sort the List");

        Collections.sort(names); // ascending order

        printAllItem(names);

        System.out.println("Reverse order");

        names.sort(Collections.reverseOrder());

        printAllItem(names);


        names.sort(Comparator.naturalOrder());
        printAllItem(names);// ascending


        // some questions

//        Queue<String> queue=new LinkedList<>();
//        Collections.sort(queue); // it is not compile coz sort take List as input.

        List<String> queue=new LinkedList<>();
        Collections.sort(queue); // it works fine

        Stack<String> stack=new Stack<>();
        stack.push("Aman");
        stack.push("Abid");
        stack.push("AAnc");
        stack.push("aabc");

       Collections.sort(stack);  // its works fine.

       printAllItem(stack);

    }

    public static <T> void printAllItem(List<T> t){
        for (T items:t){
            System.out.print(items+"  ");
        }
        System.out.println();
    }
}
