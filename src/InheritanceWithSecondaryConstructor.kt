fun main(args: Array<String>) {

    // EXAMPLE OF how to use SECONDARY CONSTRUCTOR in both base class & Derived Class
    DerivedClass("Hello From Kotlin")

}

// EXAMPLE OF how to use SECONDARY CONSTRUCTOR in both base class & Derived Class
open class BaseClass1 (message:String)
{
    // using init as primary Constructor
    init {
        println("From Base Class $message")
    }
}

class DerivedClass1:BaseClass1
{
    constructor(message: String) : super(message) {
        println("From Secoondary Constructor of derived the class: $message")
    }
}