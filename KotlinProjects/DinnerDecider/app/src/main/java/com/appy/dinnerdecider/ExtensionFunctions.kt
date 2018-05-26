package com.appy.dinnerdecider

import java.util.*

class ExtensionFunctions {
    val puppy = Puppy()
    val book = Book2("Oliver Twist", "Charles Dickens", 1837,20)

    fun callExtensionFunctions() {
        // to remove characters from string
        val myString = "Hello Everyone"
        val subString = myString.removeFirstAndLastChar()
        println("First character is = $subString")

        //convert spaces to underscore
        println(convertSpaceToUnderscore1("This is my text"))// one basic way is to call a method with parameters
        // or instead use extension fun
        println("This is my text".convertSpaceToUnderscore2()) // invoke func wih instance of the text string

        // check if string is numeric
        println("String qwerty is numeric:${"qwerty".isNumeric()}")
        println("String 123 is numeric:${"123".isNumeric()}")


        // call Hero class members and print
        println(Hero("Veena", "Kumar", "Mawarkar").getIdentity())


        println("Weight of the book is ${book.weight()}") // extension function
        //    Create a puppy and give it a book to play with, until there are no more pages.

        while (book.pages > 0) {
            puppy.playWithBook(book)
            println("${book.pages} left in ${book.title}")
            println("Remaining pages= ${book.tornPages2(5)}")  //extension function

        }

        println("Sad puppy, no more pages in ${book.title}. ")


    }

    private fun convertSpaceToUnderscore1(s: String): String {
        return s.replace(" ", "_")
    }

    private fun String.convertSpaceToUnderscore2(): String {        // prefix the fun with class name.
        return this.replace(" ", "_")              // this refers to text string
    }

    fun String.removeFirstAndLastChar(): String = this.substring(1, this.length - 1)

//      in java
//    class Util {
//            public static final boolean isNumeric(String receiver)
//        {
//            return reveiver.matches("\\d+");
//        }
//    }
//    String myString = ...;
//    if(Util.isNumeric(myString)) ...

    // kotlin extension
    fun String.isNumeric(): Boolean {
        return this.matches("\\d+".toRegex())
    }


    fun Hero.getIdentity() = "$name $middleName, $surName"


    // example
    //  Create an extension function on Book that returns the weight of a book as the page count multiplied by 1.5 grams.
    fun Book2.weight(): Double {
        return (pages * 1.5)
    }

    //    Create another extension, tornPages(), that takes the number of torn pages as an argument and changes the page count of the book.
    fun Book2.tornPages2(torn: Int)  = if (book.pages >= torn) book.pages -= torn else book.pages = 0


}
class Puppy() {
    fun playWithBook(book: Book2) {
        book.tornPages(Random().nextInt(12))
    }
}
class Book2(val title: String,val author: String,val year: Int,var pages: Int){

    fun tornPages(pages:Int){
        println("torn pages = $pages")
    }

}
class Hero (val name: String ,  val middleName: String, val surName: String)