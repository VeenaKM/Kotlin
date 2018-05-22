package com.appy.retrofitexample.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.appy.retrofitexample.R
import com.appy.retrofitexample.util.NetworkConnection
import kotlinx.android.synthetic.main.activity_first.*
import org.jetbrains.anko.toast

class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_first)

        loadList.setOnClickListener {
            if (NetworkConnection.isNetworkConnection(applicationContext)) {

                val inent = Intent(this, MainActivity::class.java)
                startActivity(inent)
            } else {
                toast("Please turn on your Internet")
            }
        }
    }
}