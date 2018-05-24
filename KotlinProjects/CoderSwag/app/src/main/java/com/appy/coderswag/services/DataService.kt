package com.appy.coderswag.services

import com.appy.coderswag.model.Category
import com.appy.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")  ,
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Developes Graphic Beanie","$18","hat1"),
            Product("Developes Hat Black","$10","hat2"),
            Product("Developes Hat White","$24","hat3"),
            Product("Developes Hat SnapBack","$38","hat4"),
            Product("Developes Graphic Beanie","$18","hat1"),
            Product("Developes Hat Black","$10","hat2"),
            Product("Developes Hat White","$24","hat3"),
            Product("Developes Hat SnapBack","$38","hat4")

    )

    val hoodies = listOf(
            Product("Developes Hoodie Gray","$18","hoodie1"),
            Product("Developes Hoodie Red","$10","hoodie2"),
            Product("Developes Gray Hoodie","$24","hoodie3"),
            Product("Developes Blac Hoodie ","$38","hoodie4"),
            Product("Developes Hoodie Gray","$18","hoodie1"),
            Product("Developes Hoodie Red","$10","hoodie2"),
            Product("Developes Gray Hoodie","$24","hoodie3"),
            Product("Developes Blac Hoodie ","$38","hoodie4")

    )
    val shirts = listOf(
            Product("Developes Shirt Black","$18","shirt1"),
            Product("Developes Badge Light Gray","$10","shirt2"),
            Product("Developes Logo Shirt Red","$24","shirt3"),
            Product("Kickflip studio ","$38","shirt4"),
            Product("Developes Shirt Black","$18","shirt1"),
            Product("Developes Badge Light Gray","$10","shirt2"),
            Product("Developes Logo Shirt Red","$24","shirt3"),
            Product("Kickflip studio ","$38","shirt4")

    )

    val digitals = listOf<Product>()

    fun getProducts(category: String): List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitals
        }
    }
}
