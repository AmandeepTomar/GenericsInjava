package genericsinkotlin

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