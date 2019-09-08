fun main(args: Array<String>) {

    // here test is level
    /*When Break Statement Execute
    * in inner loop then outer loop also execute
    * due to test@ leveled
    *
    * */
    test@for (i in 1..10)
    {
        for (j in 1..10)
        {
            if (j == 5)
                break@test
            println("i = $i & j = $j")
        }

    }
}