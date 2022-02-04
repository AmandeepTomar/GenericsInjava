
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
- 