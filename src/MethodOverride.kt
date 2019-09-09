fun main(args: Array<String>) {

    // call show message function instead of Parent class
    // truely inherited by ChildClass
    ChildClass().showMessage()

}
// use open for availability to inheritance of this class
open class ParentClass{
    // Due to write open keyword here it will be convert as non final method
    // It mean Any Child class can override this show message method
    open fun showMessage(){
        println("Hello From Parent Class Method")
    }
}

// inherit by parentClass
class  ChildClass:ParentClass()
{
    // this is called Method Overriding
    override fun showMessage() {

        // now in out showing only child class method
        // If We want to show call parent class method to show fun message just class super keyword with fun
        super.showMessage()
        println("Hello From Child Class Method")
    }



}