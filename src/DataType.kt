fun main(args: Array<String>) {

    val a: Int = 30000
    val b: Double = 200.00
    val c: Long = 1000000024
    val d: Float = 100.00f
    val e: Byte = 1
    val f: Short = 20
    val g: Char = 'X'
    var h: Boolean = true

    // Two type of String
    /*
    * Escape String- It means we can add escape character like e.g: \n, \t
    * Raw String- It means we cant add escape character here. work like paragraph
    * */

    // Escape String (Need to Use Double Cotation Only)
    val University1: String
    University1 = "Cox's Bazar International University\nKolatoly Coxsbazar"
    println(University1)

    // Raw String (Need to Use Triple Coatation Only)
    val University2: String
    University2 = """Cox's 
        Bazar 
        International 
        University 
        Kolatoly 
        Coxsbazar"""
    println(University2)


    println("Int Value is: "+a)
    println("Double Value is: "+b)
    println("Long Value is: "+c)
    println("Float Value is: "+d)
    println("Byte Value is: "+e)
    println("Short Value is: "+f)
    println("Character  Value is: "+g)
    println("Is it true? Answer: "+h)



}