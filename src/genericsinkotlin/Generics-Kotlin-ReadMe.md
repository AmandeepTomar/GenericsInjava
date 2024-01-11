
## Generics

Generics in Kotlin allow you to write reusable code by creating classes, interfaces, and functions that can work with multiple types. They provide type safety and help in avoiding type-casting errors at runtime

- Class 
```kotlin
class FindElement<T>(private val array:Array<T>){

    fun findElement(element:T,foundedElement:(index:Int,element:T?)->Unit){
        for (i in array.indices){
            if (element == array[i]){
                foundedElement(i,element)
                return
            }
        }

        foundedElement(-1,null)
        return
    }
}

```
- Methods 

```kotlin

 fun <T> findElements(element:T,array: Array<T>,foundedElement:(index:Int,element:T?)->Unit){
     for (i in array.indices){
         if (element==array[i]){
             foundedElement(i,element)
             return
         }
     }
     foundedElement(-1,null)
     return
 }

```
#### `in` keyWord
- Type parameters can only be consumed (receive) values.
- if we have a class with a given super type generic then we can assignees the sub-type generic of that super class.

#### `out` Keyword
- Parameters can only be produce (return) values

#### `reified` Keyword