package com.appy.dinnerdecider

class Functions{

    fun callFunctions(){

        printStatement()
        makeEnterance("Welcome to Kotlin")

        val add = add(10,20)
        println("Sum of 2 numbers = $add ")
        println("Sum of 2 numbers = ${add(10,20)} ")  // directly call funtion in print stmt

        AliceIsFeeling() // if empty take default arg
        AliceIsFeeling("Happy")
    }

    // function with no paramenters
    fun printStatement(){
        println(" Hello World!")
    }

    // funtion with string param
    fun makeEnterance(line: String)
    {
        println(line)
    }

    // function with return type
    fun add(a: Int , b: Int): Int{
        val c =  a+b
        return c
    }

    // default value for arguments
    fun AliceIsFeeling(mood :String = "angry"){
        println(mood)
    }

}