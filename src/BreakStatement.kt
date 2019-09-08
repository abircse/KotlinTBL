fun main(args: Array<String>) {

    // use break in for loop
    for(i in 1..10)
    {
        if (i == 5)
            break
            println("i = $i")
    }
    println("Statement after loop")

    // use break in while loop
    var num1: String
    var num2: String
    var isContinue: String

    while (true)
    {
        println("Enter First Number")
        num1 = readLine()!!
        println("Enter Second Number")
        num2 = readLine()!!

        println("$num1 + $num2 = "+(num1.toInt()+num2.toInt()))
        println("Do you want to Continue y/n")
        isContinue = readLine()!!
        if (isContinue == "n" || isContinue == "N")
            break
    }




}