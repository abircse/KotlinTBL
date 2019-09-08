fun main(args: Array<String>) {
    
    // call class with parameter
    People("Abir","Nayeem")
}
class People(var fname: String, var lname: String)
{
    val firstName: String
    val lasyName: String

    // this is the initializer block of the primary constructor
    init
    {
        firstName = fname
        lasyName = lname
        var name = (firstName +" "+lasyName).toUpperCase()
        println(name)
    }

}