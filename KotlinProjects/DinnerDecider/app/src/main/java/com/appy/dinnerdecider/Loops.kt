package com.appy.dinnerdecider

class Loops{

    fun forLoopExample(){

        val arrays = arrayListOf("Apple","Mango","Cherry")   //mutable list

        val phoneBook = hashMapOf("Alice" to "222222", "Bob" to "4444444") //mutable list

        for (fruit in arrays) {
            println("fruit : $fruit")
        }

        for((name,phone) in phoneBook){
            println("$name = $phone")
        }

        var x =10
        while (x>0){
            println(x)
            x--
        }
    }
}