package genericsinkotlin

// Animal class and its subtypes
open class Animal {
    open fun speak() {
        println("Animal speaks")
    }
}

class Dog : Animal() {
    override fun speak() {
        println("Woof!")
    }
}

class Cat : Animal() {
    override fun speak() {
        println("Meow!")
    }
}

// Covariant interface using 'out'
interface Container<out T> {
    fun get(): T
}

class AnimalContainer<out T : Animal>(private val animal: T) : Container<T> {
    override fun get(): T = animal
}

fun main() {
    val dogContainer: Container<Dog> = AnimalContainer(Dog())
    val catContainer: Container<Cat> = AnimalContainer(Cat())

    val animalContainer: Container<Animal> = dogContainer // Allowed due to covariance

    animalContainer.get().speak()  // Output will be Woof! or Meow! depending on the assignment above
}
