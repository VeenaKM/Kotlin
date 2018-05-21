package com.appy.dinnerdecider

class CollectionsExample{

    val arr = listOf("Bob","Mark","Luke","Alice")  // array of strings but can contain int,double,string , float

    fun collection()
    {
         println(arr)
        println(arr.sorted())  // sorts array in
        println(arr[2])  // gives element at 2nd position
        println(arr.last())  // gives last element in the array
        println(arr.contains("Mark")) // returns true if present
    }


}