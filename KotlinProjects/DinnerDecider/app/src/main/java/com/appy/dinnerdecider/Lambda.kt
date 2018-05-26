package com.appy.dinnerdecider

class Lambda {

    fun lambda() {
        // lambda is a function literal
        // right side of the arrow is the parameter
        // left side of the arrow is return data
        val printMessage = { message: String -> println(message) }
        printMessage("Lambda - Hello World")

        // similar to above funtion literal
//        fun printMessage(message: String){
//            println(message)
//        }

        val waterFilter = {dirty : Int -> dirty/2}
        println(waterFilter(30))

        val fishList = listOf(Fish("Dolphin"), Fish("Flipper"), Fish("Shark"))
        // print names of all the fish containg i   // it corresponds to current element of list,
        // apply jointToString to returned list
        fishList.filter { it.name.contains("i") }.joinToString (" "){ it.name}

        val sumA = { x: Int, y: Int -> x+y}
        println("Lambda sum= ${sumA(4,3)}")

        //or

        val sumB : (Int,Int) -> Int = {x,y -> x+y}


        fun downloadData(url: String, completion: ()-> Unit){
            // Sent a download request
            // we got the data back
            // no network errors
            completion()
        }
         // call downloadData function
        downloadData("fakeUrl.com",{
            println(" The code in this block, will only run after completion")
        })



        fun downloadCarData(url: String, completion: (Car) -> Unit){
            // Sent a download request
            // we got Car  data back
            val car = Car("Tesla","ModelX","white")
            completion(car)
        }
        // call downloadCarData function
        downloadCarData("fakeUrl.com"){car ->
            println(car.make)
            println(car.color)
        }
        //// or  as completion has single parameter car can be replaced to it
        downloadCarData("fakeUrl.com"){
            println(it.make)
            println(it.color)
        }



        fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
            // Sent a download request
            // we got Car  data back
            val webRequestSuccess = false
            if(webRequestSuccess) {
                val truck = Truck("Ford", "f-120", 1000)
                completion(truck,webRequestSuccess)
            }else {
                completion(null,webRequestSuccess)
            }
        }

        downloadTruckData("fakeUrl"){truck, success ->
            if(success){
                truck?.tow()
                println("Success")
            }else{
                println("Failed")
            }
        }
    }
}
data class Fish(val name:String)