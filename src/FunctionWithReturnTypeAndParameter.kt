fun main(args: Array<String>) {

    // where we call Method & use double value as parameter
    // which is called Formal parameter (10.0,20.0 we use is called formal Parameter)
    var sum = findSum(10.0,20.0)
    println("10.0 + 20.0 = $sum")
}

// function with actual parameter (Here 2 parameter) & return type in Int
fun findSum (num1:Double, num2:Double): Int
{
    var sum = num1+num2
    return sum.toInt()
}