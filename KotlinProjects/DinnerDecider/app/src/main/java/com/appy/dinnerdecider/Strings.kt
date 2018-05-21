package com.appy.dinnerdecider

class Strings{

    val str = "Welcome to Kotlin"


    fun stringFunctions(){
        showStr()
        rawCrawl()
        matchString()
//      printChar()
        intToString()
        upperLowerCaseString()
        subString()
        printStringValues()
    }
    fun showStr() {
        println(str)
    }

    fun rawCrawl(){

        val data = """|Kotlin is Object Oriented,
            |Type inferred,
            |Modern Programming language""".trimMargin()   // use pipe symbol to justify string

        println(data)
    }

    fun printChar(){
        for (char in str)
            println(char)
    }

    fun matchString(){
        val contentEquals = str.contentEquals("Welcome to Kotlin") // compare 2 strings
        val contains = str.contains("Kotlin",true)   // check if given string contains in main string  // boolean to ignorecase

        println("Equals String = "+contentEquals)
        println("String contains = "+contains)
    }

    fun upperLowerCaseString(){
        val upperCase = str.toUpperCase()
        val lowerCase = str.toLowerCase()
        println("UpperCase = "+upperCase)
        println("LowerCase = "+lowerCase)
    }

    fun intToString(){
        val num = 8
        val numStr = num.toString()
        println("Number to string = "+numStr)
    }
    fun subString(){
        val subSequence = str.subSequence(8,16)

        println("subString = "+subSequence)
    }

    fun printStringValues()
    {
        val luke = "Luke Skywalker"
        val lightSaberColor = "green"
        val vehicle = "landSpeeder"
        val age = 27

        println("$luke has a $lightSaberColor lightSaber and drives a $vehicle and age is $age")  //$variable name to print value of that variable
        println(" Luke's full name $luke has ${luke.length} characters") // ${} is used to call variable methods
    }
}