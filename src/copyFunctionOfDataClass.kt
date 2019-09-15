fun main(args: Array<String>) {


    var emp1 = Employee("Thomas", 250000)
    // now we use copy functions. we can copy/modify object using this from other object here we replace emp 1 object name to Abir
    var  emp2 = emp1.copy(name = "Abir")
    // lets print both employee object
    println("Employee : name: ${emp1.name} and Salary: ${emp1.salary}")
    println("Employee : name: ${emp2.name} and Salary: ${emp2.salary}")
}

data class Employees(val username:String, var usersalary: Int)