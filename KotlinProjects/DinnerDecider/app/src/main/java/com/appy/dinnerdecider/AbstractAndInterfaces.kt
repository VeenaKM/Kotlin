package com.appy.dinnerdecider

abstract class Aquarium(){
    abstract var color:String
}
// extend abstract class and implement interface
class Shark : Aquarium(), FishAction{
    override var color: String = "Black"  // override abstract property color
    override fun eat() {                  // implement eat fun
        println("Hunts and eat fish")
    }
}

// extend abstract class and implement interface
class Dolphin: Aquarium(), FishAction{
    override var color: String = "Gray"  // override abstract property color
    override fun eat() {               // implement eat fun
        println("munch on algea")
    }
}

interface FishAction{

    fun eat()
}