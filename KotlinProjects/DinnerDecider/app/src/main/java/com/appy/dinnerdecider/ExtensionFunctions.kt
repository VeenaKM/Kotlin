package com.appy.dinnerdecider

import android.view.View

class ExtensionFunctions {

    fun callExtensionFunctions(){
        // to remove characters from string
        val myString = "Hello Everyone"
        val subString= myString.removeFirstAndLastChar()
        println("First character is = $subString")

        //convert spaces to underscore
        println(convertSpaceToUnderscore1("This is my text"))// one basic way is to call a method with parameters
        // or instead use extension fun
        println("This is my text".convertSpaceToUnderscore2()) // invoke func wih instance of the text string

        // check if string is numeric
        println("String qwerty is numeric:${"qwerty".isNumeric()}")
        println("String 123 is numeric:${"123".isNumeric()}")


        // call Hero class members and print
        println(Hero("Veena","Kumar","Mawarkar").getIdentity())
    }

    private fun convertSpaceToUnderscore1(s: String) : String{
       return s.replace(" ","_")
    }
    private fun String.convertSpaceToUnderscore2() : String{        // prefix the fun with class name.
        return this.replace(" ","_")              // this refers to text string
    }

    fun String.removeFirstAndLastChar() : String = this.substring(1, this.length-1)

//in java
//    class Util {
        //        public static final boolean isNumeric(String receiver)
//        {
//            return reveiver.matches("\\d+");
//        }
//    }
//    String myString = ...;
//    if(Util.isNumeric(myString)) ...

    // kotlin extension
    fun String.isNumeric(): Boolean{
        return this.matches("\\d+".toRegex())
    }


    fun Hero.getIdentity()= "$name $middleName, $surName"

}

 class Hero (val name: String ,  val middleName: String, val surName: String){

}