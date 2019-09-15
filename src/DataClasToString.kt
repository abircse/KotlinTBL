fun main(args: Array<String>) {



  var emp = allEmployee("Thomas", 250000)
    // we use tostring for print value as key value pair
   println(emp.toString())

}

data class allEmployee(val username1:String, var usersalary1: Int)