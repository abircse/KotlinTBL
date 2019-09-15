fun main(args: Array<String>) {

    val p1 = Product("Laptop",20000)
    val p2 = Product("Keyboard",20000)

    println("Product 1, Name: ${p1.component1()}  Price: ${p1.component2()}")
    println("Product 2, Name: ${p2.component1()}  Price: ${p2.component2()}")

}

data class AllProduct(val name:String, val prize:String)