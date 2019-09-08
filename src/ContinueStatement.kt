fun main(args: Array<String>) {

    for (i in 1..10)
    {
        // Continue statement Basically Used for skip conditional value
        // here 5,6,7 is the range of below loop after this
        // line execution loop skip 5,6,7  value due to continue
        if (i in 5..7)
            continue
        println("i = $i")
    }

}