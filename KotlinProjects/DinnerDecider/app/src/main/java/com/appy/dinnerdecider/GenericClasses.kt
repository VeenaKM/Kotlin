package com.appy.dinnerdecider

class GenericClasses{

    fun genericExample(){
        val aquarium = Aquarium1<TapWater>(TapWater()) //or  val aquarium = Aquarium1(TapWater())
         //  it is also possible to pass string as parameter since T has got no bounds but if T has Watersupply type it throws error
//        val aqua = Aquarium1("string")

         val aqua4 = Aquarium1<LakeWater>(LakeWater())
        aqua4.waterSupply.filter()
        println(aqua4.addWater())
        println(aquarium.waterSupply.addChemicalCleaner())
        println(aqua4.waterSupply.filter().toString())


        //example
      //  Building(Wood()).build()
        // Generic function
        Building(Wood()).isSmallBuilding(Building(Brick()))
    }
}
class MyList<T>{
    fun get(pos:Int):T{
        TODO()
    }
    fun addItem(item: T){}
}

class WorkWithMyList{
    val intList = MyList<Int>()
    val fishList= MyList<String>()
}

open class WaterSupply(var needsProcessed : Boolean)

class TapWater: WaterSupply(true){
    fun addChemicalCleaner(){
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter(){
        needsProcessed = false
    }
}


class Aquarium1<T:WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $waterSupply")
    }
}


    // Example
    open class BaseBuildingMaterial() {
        open val numberNeeded = 1
    }

    class Wood : BaseBuildingMaterial() {
        override val numberNeeded = 4
    }

    class Brick : BaseBuildingMaterial() {
        override val numberNeeded = 8
    }

    class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {

        val baseMaterialsNeeded = 100
        val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

//        fun build() {
//            println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
//        }

        fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
            if (building.actualMaterialsNeeded < 500) println("Small building")
            else println("large building")
        }

    }

