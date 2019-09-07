fun main(args: Array<String>) {

    /*Part 1*/
   // when statement is a replacement of switch statement in java
    val a: Int = 12
    val b: Int = 2

    println("Enter a arithmetic Operator")
    val operatorByUser = readLine()

    when (operatorByUser)
    {
        // if user insert + sign
        "+" ->
        {
            val result = a+b
            println("$a + $b = $result")
        }
        // if user insert - sign
        "-" ->
        {
            val result = a-b
            println("$a - $b = $result")
        }
        // if user insert * sign
        "*" ->
        {
            val result = a*b
            println("$a * $b = $result")
        }
        // if user insert / sign
        "/" ->
        {
            val result = a/b
            println("$a / $b = $result")
        }

        // else is the replacement of switch case default
        else -> println("$operatorByUser is Invalid")
    }

}