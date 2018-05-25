package com.appy.dinnerdecider

import android.view.View
import java.lang.Math.random
import java.text.SimpleDateFormat
import java.util.*


class PracticeCode{

    fun getTime() : String{
        val timeInMillis = System.currentTimeMillis()
        val cal1 = Calendar.getInstance()
        cal1.setTimeInMillis(timeInMillis)
        val dateFormat = SimpleDateFormat(
                "hh")
        val dateTime = dateFormat.format(cal1.getTime())

        return dateTime
    }

    fun showTimeMessage(time: String) {
        if (time.toInt()<12) println("MidDay") else println("Good Night")
      //  or
        println("${if (time.toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")


        feedTheFish()

        sortingOfSpices()

        // lambda
        var swim = { println("Swim")}

        var waterFilter = { dirty: Int -> dirty/2}
        val random1 = random() //random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
        val random2 = {random()} //has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.

        val rollDice1 = { Random().nextInt(12) + 1} // Creates a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).

        val rollDice2 = { sides: Int ->
            Random().nextInt(sides) + 1
        }
        val rollDice0 = { sides: Int ->
            if (sides == 0) 0
            else Random().nextInt(sides) + 1
        }
        val rollDice3: (Int) -> Int = { sides ->
            if (sides == 0) 0
            else Random().nextInt(sides) + 1
        }
        gamePlay(rollDice1())

        //extension functions
        println(View.VISIBLE)

    }
    fun gamePlay(diceRoll: Int){
        // do something with the dice roll
        println(diceRoll)
    }
    private fun sortingOfSpices() {
        val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

        spices.filter { it.contains("curry") }.sortedBy { it.length }
        spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}


    }
    private fun shouldChangeWater(day: String, temperature: Int=22,dirty :Int=20) : Boolean {
        return true
    }

    private fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eats $food")

        if(shouldChangeWater(day,dirty=30))
            println("Change the water")
    }

    private fun fishFood(day: String): String {

        var food = "fasting"

        when(day){
            "Monday" -> food = "Flakes"
            "Tuesday" -> food = "Pallete"
            "Wednesday" -> food = "Worms"
            "Thursday" -> food = "lettuce"
        }
        return food

    }

    private fun randomDay() : String{
        val week = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
        return week[Random().nextInt(7)]


    }



}