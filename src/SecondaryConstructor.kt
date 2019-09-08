fun main(args: Array<String>) {

    var vehicles1 = Vehicles("CAR","COROLLA")
    vehicles1.printVehicles()

    // 3rd parameter possible to add due to secondary constructor call with primary constructor
    var vehicles2 = Vehicles("BUS","Mahindra","red")
    vehicles2.printVehicles()

}

// below line is primary Constructor
class Vehicles constructor(var name: String, var brand:String)
{
    var bodyColor:String = "Not Mentioned"

    // Secondary Constructor
    constructor(name:String,brand:String,bodycolor:String):this(name,brand)
    {
        this.bodyColor = bodycolor
    }

    fun printVehicles()
    {
        println("Name: $name \n Brand: $brand \n BodyColor: $bodyColor")
    }
}