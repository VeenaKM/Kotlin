package com.appy.dinnerdecider

class NumbersAndOperators{

    fun operators(){
        val a = 12
        val b = 25.8
        val c = 25

        // + - / *
        println(b + a)
        println(b - a)
        println(b / a)
        println(b * a)
        println(c % a)

        sum(intArrayOf(3,2,4))
    }
    fun sum(a: IntArray){
        var sum = 0
        for(b in 0..a.size-1){
            sum = sum + a[b]
            println("a= ${a[b]}")
        }
        println("sum = $sum")
    }


}