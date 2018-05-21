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
            Product("Developes Graphic Beanie","$18","hat01"),
            Product("Developes Hat Black","$10","hat02"),
            Product("Developes Hat White","$24","hat03"),
            Product("Developes Hat SnapBack","$38","hat04")
    )

    val hoodies = listOf(
            Product("Developes Hoodie Gray","$18","hoodie01"),
            Product("Developes Hoodie Red","$10","hoodie02"),
            Product("Developes Gray Hoodie","$24","hoodie03"),
            Product("Developes Blac Hoodie ","$38","hoodie04")
    )
    val shirts = listOf(
            Product("Developes Shirt Black","$18","shirt01"),
            Product("Developes Badge Light Gray","$10","shirt02"),
            Product("Developes Logo Shirt Red","$24","shirt03"),
            Product("Kickflip studio ","$38","shirt04")

    )

}
