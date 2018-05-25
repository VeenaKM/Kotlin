package com.appy.dinnerdecider

import android.support.v7.widget.DialogTitle

class Pairs{
    fun callPairs(){

        val equipment = "Fishnet" to "catching fish"
        println(equipment.first)  // print 1st element
        println(equipment.second)  // print second element

        val equip =("Fishnet" to "catching fish") to ("of big size" to "and strong")
        println(equip.first.first)  // print 1st element of 1st pair
        println(equip.second.first)  // print 1st element of 2nd pair

        val fishnet = "Fishnet" to "catching fish"
        val (tool, use) = fishnet
        println("$tool is used for $use")

        // convert a pair to string
        val fishnetString = fishnet.toString()
        println(fishnetString)
        // convert to list
        val fishnetList = fishnet.toList()
        println(fishnetList)


        // call a method to return pair
        val(tool1,use1) = giveMeTool()
        println("$tool1 is used for $use1")


        //example to fetch book title and author
        val book = Book("Android","XYZ",156)
        val bookTitleAuthor =book.getTitleAndAuthor()
        val bookTitleAuthorYear = book.getTitleAuthorYear()
        println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
        println("Here is your book ${bookTitleAuthorYear.first} " +
                "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    }

    fun giveMeTool():Pair<String,String>{
        return ("Fishnet" to "catching fish")
    }
}

// Example
class Book(val title: String,val author: String,val year: Int){

    fun getTitleAndAuthor(): Pair<String,String>{
        return (title to author)
    }

    // func to return triple
    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}