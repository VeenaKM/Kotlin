package com.appy.dinnerdecider

class DelgateInterfaces{

    fun callDelgates(){
        val dolphin = Dolphin1()
        println("fish has color ${dolphin.color}")
        dolphin.eat()

        // Spice example
        val spice = Curry("Pepper","Very Spicy")
        println("Spice name ${spice.name} and Spiciness is ${spice.spiciness} color is ${spice.color}")
    }
}

interface FishAction1{
    fun eat()
}

interface FishColor{
   val color:String
}
//  interface delgation
// implment FishAction and FishColor  by calling Singleton class GoldenColor
// we can remove implementaion of color variable
// by Golden color means implement interface fish color by diferring all calls to the object , gold color
class Dolphin1(val fishColor: FishColor = GoldenColor) :
        FishAction1 by PrintFishAction(" and eats lot of algea")
        ,FishColor by fishColor{
//    override val color: String
//        get() = "Gold"

//    override fun eat() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

}

object GoldenColor : FishColor{
    override val color: String = "Gold"

}
object RedColor : FishColor{
    override val color: String = "red"

}

class PrintFishAction(val food: String): FishAction1{
    override fun eat() {
        println(food)
    }

}

// Another Example


abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}