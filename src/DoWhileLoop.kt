fun main(args: Array<String>) {

    // while is called exit control loop
    var num1: String
    var num2: String
    var isContinue : String

    do {
        // Read first number from user
        // use !! for non null/ Safe which mean user must have to input number. it cant be null
        println("Enter The First Number: ")
        var num1 = readLine()!!

        // Read Second Number from user
        println("Enter The Second Number: ")
        var num2 = readLine()!!

        // print the num1 & num2 value get from user & show result using regular expression
        println("$num1 + $num2 = "+(num1.toInt()+num2.toInt()))

        // ask user by a message that user may continue or not
        println("Are Your Sure Want to Continue? Enter Y for Yes & N for No")
        isContinue = readLine()!!

        // below while we check or for if user put capital/small letter
    } while (isContinue == "Y" || isContinue == "y")

}