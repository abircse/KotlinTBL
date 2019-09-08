fun main(args: Array<String>) {

    println("Person 1")
    GentleperSon("Tomas",10)
    println("Person 2")
    GentleperSon()
    println("Person 3")
    GentleperSon("Abir")
    println("Person 4")
    GentleperSon(age = 25)
}

// i used here default value if this class not found parameter it will assigned this value
class GentleperSon(name: String = "Unknown", age: Int = 0)
{
    // init block
    init {
       println("Name: $name And Age: $age")
    }

}
