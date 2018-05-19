package com.appy.dinnerdecider

class Strings{

    val str = "Welcome to Kotlin"

    fun showStr() {
        println(str)
    }

    fun rawCrawl(){

        val data = """|Kotlin is Object Oriented,
            |Type infered,
            |Modern Programming language""".trimMargin()   // use pipe symbol to justify string

        println(data)
    }

    fun printChar(){
        for (char in str)
            println(char)
    }

    fun matchString(){
        val contentEquals = str.contentEquals("Welcome to Kotlin") // compare 2 strings
        val contains = str.contains("force",true)

        println(contentEquals)
        println(contains)
    }

}