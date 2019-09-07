fun main(args: Array<String>) {

    /*Part 2*/
    // when statement is a replacement of switch statement in java
    // How to use When Construct As a simple Expression
    val a: Int = 12
    val b: Int = 2

    println("Enter a arithmetic Operator")
    val operatorByUser = readLine()

    // set when into a variable.
    val result = when (operatorByUser) {
        // this is called simple expression
        "+" -> "$a + $b = " + (a + b)
        "-" -> "$a - $b = " + (a - b)
        "*" -> "$a * $b = " + (a * b)
        "/" -> "$a / $b = " + (a / b)
        else -> "$operatorByUser is invalid"
    }
    // now just print the result
    print(result)


}