fun main(args: Array<String>) {


    // call data class by initialization must have to input parameter due to we used parameter
   val  employee = Employee("Nayeem Shiddiki Abir", 20000)
    println("Name is ${employee.name} And Salary is ${employee.salary}")


}

// if we use data keyword in front of class to convert data class & parameter is used as constructor.
data class Employee(val name:String, var salary: Int)