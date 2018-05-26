package com.appy.dinnerdecider

class CollectionsExample{


    fun collection()
    {
        val arr = listOf("Bob","Mark","Luke","Alice")  // immutable array of strings but can contain int,double,string , float

        println(arr)
        println(arr.sorted())  // sorts array in
        println(arr[2])  // gives element at 2nd position
        println(arr.last())  // gives last element in the array
        println(arr.contains("Mark")) // returns true if present


        // mutable array
        val arr2 = arrayListOf("Apple","Mango","Cherry")
        println(arr2.size)
        arr2.add("Orange")
        println(arr2)
        println(arr2.add(0,"Watermelon"))


        // immutable map
        val phoneBook = mapOf("Alice" to "222222", "Bob" to "4444444") // to is used to map value on right side to key on leftside
        println(phoneBook["Alice"]) // pass to get value
        println(phoneBook.get("Alice")) // use get method to fetch value from the given key

        // mutable hashMAp
        val phoneBook2 = hashMapOf("Alice" to "222222", "Bob" to "4444444")
        phoneBook2["Alice"] = "88888"  // change the value of key "Alice
        phoneBook2.put("Bob","99999")// change the value of key "Bob
        println(phoneBook2)



        //Example
//        Create a Set of book titles called allBooks, for example, by William Shakespeare.
        val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")

//        Create a Map called library that associates the set of books, allBooks, to the author.
        val library = mapOf("Shakespeare" to allBooks)

//        Use the collections function any() on library to see if any of the books are “Hamlet’
        println(library.any { it.value.contains("Hamlet") })

//        Create a MutableMap called moreBooks, and add one title/author to it.
        val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")

//        Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
//        getOrPut() is a handy function that will check whether a key is in a map, and if it is, will return the value. Otherwise, it will add the key with the supplied value to the map.
        moreBooks.getOrPut("Jungle Book") { "Kipling" }
        moreBooks.getOrPut("Hamlet") { "Shakespeare" }
        println(moreBooks)
    }


}