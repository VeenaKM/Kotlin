package com.appy.dinnerdecider

class DataClasses{

    fun makeDecorations(){

        val d1= Decoration("granite")
        println(d1)
        val d2 = Decoration("slate")
        println(d2)
        val d3 = Decoration("slate")
        println(d3)

        // compare 2 dataclass objects
        println(d1.equals(d2))
        println(d2.equals(d3))

        // This creates new object with the same propert value
        val d4 = d1.copy()
        println("copied object d1 to d4 = $d4")
        println("d1 object = $d1")

        val d5 = Decoration2("crystal","wood","diver")
        println(d5)

        // Kotlin allows decomposition
        // make 3 variables one for each property and assign object to it
        // kotlin puts the property value in each variable and we can use it
        val (rock,woods,diver) = d5
        println(rock)
        println(woods)
        println(diver)


        // Anothe example
        val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
                SpiceContainer(Curry("Red Curry", "medium")),
                SpiceContainer(Curry("Green Curry", "spicy")))

        for(element in spiceCabinet) println(element.label)
    }
}

data class Decoration(val rocks:String)

data class Decoration2(val rocks: String,val woods: String,val diver: String)


// Another Example

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}
