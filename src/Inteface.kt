fun main(args: Array<String>) {

    // initialize class for car
    val car =  car()
    car.availableColor()
    car.availableFuelType()

}

// interface
interface vehicle
{
    // in interface this variable is called abstract variable
    var name: String
    var fuel: String
    var color: String

    // abstract method
    fun availableFuelType()
    // Non abstract method
    fun availableColor()
    {
        println("$name available in $color colors")
    }


}

// here use : for implement interface of Vehicles
class car:vehicle{

    override var name = "SwIFT"
    override var fuel  = "Petrol & Diesel"
    override var color = "Red & White"
    override fun availableFuelType() {
        println("$name available in $fuel")
    }

}

