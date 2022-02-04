
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
    
  
