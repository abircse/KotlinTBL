fun main(args: Array<String>) {

    // call outer class & with outclass function
    Outer().findSum()
}

// we are going to be create a outer class
class Outer
{

    fun findSum()
    {
        val sum = Outer.Nested().x+Outer.Nested().y
        println("Result is: $sum")
    }

    // Nested class because this class is written inside another class
    class Nested
    {
        // define member variable of this class
        val x = 10
        val y = 20
    }
}
