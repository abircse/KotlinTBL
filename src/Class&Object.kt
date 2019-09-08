fun main(args: Array<String>) {

    // Initialize Person class
    var personObject = Person()
    // call person class functions printPerson
    personObject.printPerson()
}

// This is a class
class Person{

    var name: String = "Nayeem Shiddiki Abir"
    var age: Int = 27
    fun printPerson()
    {
        println("Name is $name And Age is $age")
    }
}