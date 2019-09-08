fun main(args: Array<String>) {

    // Initialize class
    var allPerson = AllPerson("Abir", 27)
    // here i get the data from parameter of class objecy using ${allPerson.age}
    println("Name: ${allPerson.name} \n Age: ${allPerson.age}")

}

// this is the class header primary constructor
class AllPerson(val name: String, val age: Int)
{

}