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
