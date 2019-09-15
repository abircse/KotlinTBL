fun main(args: Array<String>) {


    println("***************CAR RESULT***************")
    val c= jeep()
    c.showFuelType()
    c.showNoTyres()
    c.showMaxSpeed()
    c.showPowerSteer()


    println("***************TRUCK RESULT***************")
    val t = truck()
    t.showFuelType()
    t.showNoTyres()
    t.showMaxSpeed()
    t.showPowerSteer()


}

// create an abstract class
abstract class allVehicle
{
    // creating abstract variable
    abstract var fuel:String
    abstract var noTyres:Int

    // creating abstract method
    abstract fun showFuelType()
    abstract fun showNoTyres()

    // No abstract Variable
    var maxSpeed = 180
    // Non Abstract method
    fun showMaxSpeed()
    {
        println("Max speed : $maxSpeed")
    }
    // Non Abstract method
    fun showPowerSteer()
    {
        println("Power Steer available....")
    }
}

class jeep : allVehicle()
{
    override var fuel = "Petrol"
    override var noTyres = 4
    override fun showFuelType() {
        println("Fuel: $fuel")
    }
    override fun showNoTyres() {
        println("No Tyres: $noTyres")
    }

}

class truck: allVehicle()
{
    override var fuel = "Diesel"
    override var noTyres = 18
    override fun showFuelType() {
        println("Fuel: $fuel")
    }
    override fun showNoTyres() {
        println("No Tyres: $noTyres")
    }

}