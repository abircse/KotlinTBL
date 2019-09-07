fun main(args: Array<String>) {

    val names = arrayOf("Thomas","Mark","Json","Peter")
    // for loop for show array item
    for (item in names)
    {
        println(item)
    }
    // for loop for Show array item with index no
    for (index in names.indices)
    {
        println("names[$index]: "+names[index])
    }

    // for Loop with Range of data (here i print 1-5)
    for (i in 1..5 )
    {
        println(i)
    }
    // for loop for get simple string in a below line
    /* like this
    * k
    * o
    * t
    * l
    * i
    * n
    * */
    val Text = "Kotlin"
    for (letter in Text)
    {
        println(letter)
    }
}