package com.appy.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appy.coderswag.R
import com.appy.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    var categoryType=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}
