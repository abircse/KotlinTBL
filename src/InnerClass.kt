fun main(args: Array<String>) {

    // create object for inner class call from inside of outer class
    val INCLASS = OuterClass().Inner()
    INCLASS.findSum()
}

class OuterClass
{
    var x = 40
    var y = 20

    // we cant access x & y from outer class in inner class function
    // without writing inner keyword in front of inner class
    inner class Inner
    {
        fun findSum()
        {
            val sum = x + y
            println("Sum is $sum")
        }

    }
}