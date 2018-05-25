package com.appy.dinnerdecider

class NullableClass{

    fun nullabelCheck(){
        var name: String = "John"
//        name=null

        var nullableName: String? = "Do I exist"
//          nullableName = null

        // 1st method to get length
        if (nullableName != null) {
            println(nullableName.length)
        }else{
            println(-1)
        }
        // 2nd method to get length
        val l = if(nullableName!=null) nullableName.length else -1
        println("l = $l")

        // Consise method to get length  Safe call operator
        println(nullableName?.length)

        // Elvis operator
        val len = nullableName?.length ?: -1

        val noName = nullableName ?: "No one knows me"
        println(noName)


        // !! to give null pointer exception for nullable if value is null
        println(nullableName!!.length)

    }

}