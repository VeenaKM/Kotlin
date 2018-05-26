package com.appy.dinnerdecider


const val rock=5 // determined at compile time
val rock1 = 5 // determined during program execution

// top level constant
const val MAX_NUMBER_BOOKS = 20
class ConstantsClass {
    fun callConstants() {
        val book = Book1()
        println(book.canBorrow(10))
        book.printUrl()
    }

    val title = "Android"

    //Inside the Book class, create a method canBorrow() that returns true or false depending on whether a user has already borrowed the max number of books.
    class Book1 {
        fun canBorrow(numbOfBooks: Int): Boolean {
            return (numbOfBooks < MAX_NUMBER_BOOKS)
        }

        fun printUrl() {
            println(BASE_URL + "Android" + ".html")
        }

        //The base URL is really of interest to the Book class. As such, it makes sense to limit its scope to the Book class.
// Use a companion object to define the constant in Book.
        companion object ConstBook2 {
            val BASE_URL = "http://www.turtlecare.net/"
        }
    }
//Create a Constants object that provides constants to the book. For this example, provide the BASE_URL for all books in the library catalog.
// Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL, the book title, and “.html”.

    object ConstBook {
        const val BASE_URL = "http://www.turtlecare.net/"
    }


}