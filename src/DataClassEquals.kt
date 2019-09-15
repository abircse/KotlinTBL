fun main(args: Array<String>) {

    // We use equal keyword basically used for comparison of one more object
    val p1 = Product("Laptop", 20000)
    val p2 = Product("Laptop",20000)

    println(p1.equals(p2))
}

data class Product(val name:String, var prize:Int)