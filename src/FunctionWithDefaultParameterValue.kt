fun main(args: Array<String>) {

    // call the function
    // look this functions did not required any data due to default parameter
    myFunctions()
    // But we can override the default value
    myFunctions(25,'T')
    // We can Assign default value second specific
    myFunctions(x = 'A')
}

// in this functions We Define the default parameter
fun myFunctions (num: Int = 15, x:Char = 'X')
{
    println("num = $num and x = $x")
}