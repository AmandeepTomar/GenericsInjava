
#Generics

###Why to use generics ?

- It enable types (classes and interface) to be parameters when defining classes , interfaces and methods.
- We can reuse the same code with different inputs. 
- ```public void create(T t)```
- Stronger  type safety at compile time.
- We can eliminate typecasting
  - If we are not using generics 
  ```
      List list=new ArrayList()
      String item=(String)list.get(index)
  ```
  - Here we have to cast the Object into String.
  - If we use the generics
  ```
      List<String> list=new ArrayList()
      String item=list.get(index)
  ```
  - We don't need to typecast.
- If we use generics , Most of the time we convert Run-Time errors to Compile-Time Errors.
- Generic Algorithm 
  - Like we have implemented searching algo fo integer, float and Double and so on.  
  
###How to Define class and method with generic properties
- Generic class 
  ```
  class Item<T>{
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    private T item;

    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                '}';
    }
  }
  ```
- Class with multiple parameters 
  ```
  public class MultipleParameters<K,V,E> {
    private K key;
    private V value;
    private E entity;

    public MultipleParameters(K key, V value, E entity ){
        this.key=key;
        this.value=value;
        this.entity=entity;
    }


    public static void getMultipleGenericsExample(){
        Item<String> item=new Item<>();
        item.setItem("It's Items Value");
        MultipleParameters<String,Integer,Item<String>> itemMulti=new MultipleParameters<>("MultipleParams",1,item);
        System.out.println(itemMulti);
    }


    @Override
    public String toString() {
        return "MultipleParameters{" +
                "key=" + key +
                ", value=" + value +
                ", entity=" + entity +
                '}';
    }
  }
  ```
  
- Generic Methods 
- we need to use the syntax like 
  - `public <T> void methodName(T t)` where <T> should be same as parameter
    - If you are not writing <T> ,then it will show compile error
- Wen we have return type is generic 
  - `public <T> T methodName(T t)`

####Bounded Generic Types 
- restrict the type that can be used as typed arguments in parameterized type
- Like we want to perform some operation only on (Integer, float and Double) so we restrict them to accept the instance of Number class and its sub class
- Allow you to invoke methods defined in the bounds.
- Syntax `<T extends Interface/class>`
- We can define multiple bounds as well 

####Type Inference
- Type Inference is the ability of the compiler to look at each method invocation and corresponding declaration.
- In order to determine the type arguments such as `T` gereric type that make the invocation applicable.
- type inference algorithm try to find out the most specific types that works with all arguments.
  - ```
    public <T> T getItem(T t1,T t2){
    retunr t1;
    }
    ```
- if we write like `List<String> list = new ArrayList<>();` it is due to Type inference that we don't need to define type `String` in `new ArrayList<>()`
- here compiler know the type of arguments with the help of type inference.
####Subtyping
- Subtyping is the fundamental principle of OOP
- `Integer is subtype of Number`
- `ArrayList<E> is subtype of List<E>`
- `List<E> is subType of Collection<E>`
- In generics subtype relationship is not valid if we are using collections.
```aidl
Ex.
// If Integer is subtype of Number 
List<Integer> is not subtype of List<Number>

```
####Wildcard
- Unbounded wildcards
  - ? Now java does not know the type so we can solve the problem like suppos we know integer is subclass of Number but List<Integer> is not subtype of List<Number>.
- Upper bounded wildcards
  - use wild cards with subtypes so its like parent child relationship
  - `void printAll(? extends T)`
  - this method can accept the list of any subclass of T
  - example ``printListOfNumbers(? extends Number)`` it accept List<integer>, List<Double> and so on.
  - We can read items from List<? extends T> but we can not add items.
  - Some Upperbounds example
  - ```aidl
      private static double sumAllItem(List<? extends Number> numbers)
    {
        double sum=0;
        for (Number num:numbers) {
            sum +=num.doubleValue();
        }
        return sum;
    }

    private static void showAllList(List<? extends Number> numbers){
        for (Number number:numbers) {
            System.out.println(number);
        }
    }
    
       // We can create list with Integer , Double and Float
        List<? extends Number> list1=new ArrayList<Integer>();
        List<? extends Number> list2=new ArrayList<Double>();
        List<? extends Number> list3=new ArrayList<Float>();

      //  list1.add(new Integer(10)); // compile time error as we can not add in upperbound.

     // List<? extends Number> list=new ArrayList<String>();  Compile time error as String is not subtype of  Number.

        // Using list of Integer
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        showAllList(list); // as upperbound can read
        System.out.println(sumAllItem(list));

     ```
    
####Lower bounded wild cards 
- wildcard with supertype so parent class 
- It is useful to insert item into a generic data structure and collections.
- `public void showAllList(? super T)`
- Can accept the list of any superclass of T.
- We can add items using lower bounded wild cards but we can not read items using lower bounded wild cards.
- ```aidl
    addItem(List<? super T>) workd 
    getItem(List<? super T>) is not worked.
  
   private static void printAllItems(List<? super Number> numbers){
        // As we can not read with lower bounds  , We need to convert the Number into Object
        for (Object num:numbers){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        // All works its like child = parent
        List<? super Integer> list=new ArrayList<Number>();
        List<? super Integer> list1=new ArrayList<Integer>();
        List<? super Integer> list2=new ArrayList<Object>();

        // how to use lower bound to read items
        List<Serializable> list3=new ArrayList<>();
        list3.add("Test");
        list3.add("Test1");
        list3.add("Test2");

        printAllItems(list3);
        List<? super  Number> list4=new ArrayList<>();
        list4.add(1);
        list4.add(2.0);
        list4.add(2.0f);
        
        printAllItems(list4);
    }
  ```
  
####Type Erasure
- Java uses type erasure to implement generics, this is how generic code handled
- It replaces all generic type parameters with their bound or object for unbound type parameters 
- It is true for wild card as well
- NOTE <B> Final bytecode will contain plain java classes and object</B>
- Erasure uses type casting , sometimes it needed tro generate additional methods. 
- These are called <B>Bridge Methods</b> to maintain polymorphism with generic type as well.
- Generic Types
```aidl
    class FirstStore<T>{
    private T t;

      public T getT() {
          return t;
      }

      public void setT(T t) {
          this.t = t;
      }
      }

      // compile code like
      class FirstStore{
      private Object t;
    
          public Object getT() {
              return t;
          }
    
          public void setT(Object t) {
              this.t = t;
          }
      }
```
- Bounded Type
```aidl
    class FirstStore<T extends Serializable>{
    private T t;

      public T getT() {
          return t;
      }

      public void setT(T t) {
          this.t = t;
      }
      }

      // compile code like
      class FirstStore{
      private Serializable t;
    
          public Serializable getT() {
              return t;
          }
    
          public void setT(Serializable t) {
              this.t = t;
          }
      }
```
