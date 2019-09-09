fun main(args: Array<String>) {

    println("************BIRD**************")
    val bird = Bird("Bird")
    bird.fly()
    bird.eat()
    bird.sleep()

    println("************FISH**************")
    val fish = Fish("Fish")
    fish.swim()
    fish.eat()
    fish.sleep()


}

// create a class with constructor including 2 functions called ear & sleep
// To make class inheritable use open keyword beclass class keyword
open class Animal constructor(var name:String)
{
    fun eat()
    {
        println("$name can Eat")
    }

    fun sleep()
    {
        println("$name can Sleep")
    }
}

// create class for fish
// inherit Animal class using : & pass constructor parameter as required
class Fish constructor(name: String): Animal(name)
{
    fun swim()
    {
        println("Fish Can Swim")
    }
}

// create class for bird
// inherit Animal class using : & pass constructor parameter as required
class Bird constructor(name: String): Animal(name)
{
    fun fly()
    {
        println("Bird Can fly")
    }
}