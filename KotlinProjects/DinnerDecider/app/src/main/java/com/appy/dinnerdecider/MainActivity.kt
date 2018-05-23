package com.appy.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val foodList = arrayListOf("Mc Donalds", "Burger King", "Chinese", "Dominos")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]

        }

        addFoodBtn.setOnClickListener{
            val newFood = newFoodTxt.text.toString()
            foodList.add(newFood)
            newFoodTxt.text.clear()
        }


        callStringClass() // example code for String usage
        callNumbersAndOperators()
        callFunctions()
        callCondionalLogic()
        callCollectionClass()
        callLoopsClass()
        callNullableClass()
        callClassesAndInheritence()
        callLamdaClass()
        callPracticeCode()
    }

    private fun callPracticeCode() {
        PracticeCode().showTimeMessage(PracticeCode().getTime());
    }

    private fun callLamdaClass() {
        Lambda().lambda()
    }

    private fun callClassesAndInheritence() {

        // classes example
//        val car = Car("Toyota","Avalon")
//        println(car.make)
//        println(car.model)
//        car.color()
//        car.details()
//
//        val truck = Truck("Ford","F-150",1000)
//        println(truck.tow())
//        truck.details()

        // Inheritance example
         val tesla = Car("Tesla","Model1","Red")
          tesla.accelerate()
          tesla.park()
        val truck =Truck("Ford","F-150",1000)
         truck.tow()
    }

    private fun callNullableClass() {
        NullableClass().nullabelCheck()
    }

    private fun callLoopsClass() {
        Loops().forLoopExample()
    }

    private fun callCollectionClass() {
        CollectionsExample().collection()
    }

    private fun callCondionalLogic() {
        ConditionalLogic().conditions()
    }

    private fun callFunctions() {
        Functions().callFunctions()
    }

    fun callNumbersAndOperators() {
         NumbersAndOperators().operators()
     }

    fun callStringClass(){
       Strings().stringFunctions()
    }

}
