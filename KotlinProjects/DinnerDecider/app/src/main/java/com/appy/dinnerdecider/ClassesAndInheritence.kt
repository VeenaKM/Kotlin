package com.appy.dinnerdecider



// open to call inheritance
open class Vehicle(val make: String, val model: String){

    // open to override fun in children class
   open fun accelerate(){
        println("Vroom vroom..")
    }
    fun park(){
        println("Parking the vehicle")
    }
    fun brake(){
        println("Stop")
    }

}
class Car(make: String,model: String, var color: String): Vehicle(make,model){

    override fun accelerate() {
        super.accelerate()
        println("We are going in ludicrous mode")
    }

}
class Truck(make: String,model: String, var towingCapacity: Int): Vehicle(make,model){

    fun tow(){
        println("Headed over to the mountains!")
    }

}

//class Car(val make: String, val model: String) {
//
//    fun color(){
//        println("Black")
//    }
//
//    fun details(){
//        println("This is a $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int){
//
//    fun tow(){
//        println("Taking the horses to rodeo")
//    }
//
//    fun details(){
//        println("The $make $model has towing capacity of $towingCapacity lbs")
//    }
//}