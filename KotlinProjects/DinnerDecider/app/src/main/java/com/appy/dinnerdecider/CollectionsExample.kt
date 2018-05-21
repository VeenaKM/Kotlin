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

    }


}