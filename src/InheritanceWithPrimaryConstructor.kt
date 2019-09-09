fun main(args: Array<String>) {

    // EXAMPLE OF how to use PRIMARY CONSTRUCTOR in both base class & Derived Class
    DerivedClass("Hello From Kotlin")

}

// EXAMPLE OF how to use PRIMARY CONSTRUCTOR in both base class & Derived Class
open class BaseClass (message:String)
{
    // using init as primary Constructor
    init {
        println("From Base Class $message")
    }
}

class DerivedClass(message: String): BaseClass(message)
{
    // using init as primary Constructor
    init {
        println("From Derived Class $message")
    }
}