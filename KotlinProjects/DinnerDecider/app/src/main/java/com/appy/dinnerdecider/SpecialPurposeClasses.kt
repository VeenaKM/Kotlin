package com.appy.dinnerdecider

// singleton class
//
object MobyDeckWhale{
    val author = "Herman"
    fun jump(){

    }
}

enum class Color(val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0X0000FF)
}

// it can be sub classed only in the file it is declared
sealed class Seal

class SeaLion : Seal()
class Walrus : Seal()

fun match(seal : Seal) : String{
   return when(seal){
        is Walrus -> "walrus"
         is SeaLion -> "seaLion"
    }
}