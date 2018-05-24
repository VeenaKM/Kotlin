package com.appy.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.appy.coderswag.R
import com.appy.coderswag.adapter.CategoryRecyclerAdapter
import com.appy.coderswag.services.DataService
import com.appy.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   // lateinit var adapter: CategoryAdapter
     lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // listview
//        adapter = CategoryAdapter(this,
//                DataService.categories)
//
//        categoryListView.adapter = adapter
//
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "clicked on ${category.title}",Toast.LENGTH_LONG).show()
//        }

        // RecyclerView
        /*
        *Param1 = context
        * parma2 = arraylist
        * move lamda(category ->) outside parenthesis to get itemclick
         */
        adapter = CategoryRecyclerAdapter(this,
                DataService.categories){category ->
            println(category.title)
            Toast.makeText(this,"clicked on ${category.title}",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(intent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
