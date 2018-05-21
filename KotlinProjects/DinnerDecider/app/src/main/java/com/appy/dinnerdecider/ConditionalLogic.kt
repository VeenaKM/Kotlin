package com.appy.dinnerdecider

class ConditionalLogic{

    fun conditions() {

        val a = 2
        val b = 2

        if (a == b) {
            println("A does equals to b")
        }

        val accountBalance=50
        val price = 60

        if (price > accountBalance){
            println("Sorry you cant buy!")
        }else{
            println("You can buy it!")
        }

        // switch condition
        val x = 1
        when(x){
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> println(" x does not equals to 1 or 2")
        }

        // function with argument and defult value
        fun AliceisFeeling(mood : String = "angry"){
            if (mood == "angry"){
                println("Alice is $mood")
            }else{
                println("Dont make her angry")
            }

        }

        AliceisFeeling()
    }
}