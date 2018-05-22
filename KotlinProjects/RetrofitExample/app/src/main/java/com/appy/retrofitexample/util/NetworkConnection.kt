package com.appy.retrofitexample.util

import android.content.Context
import android.net.ConnectivityManager

class NetworkConnection {

    //  Every class can implement a companion object,
//      which is an object that is common to all instances of that class.
//      It'd come to be similar to static fields in Java.
    companion object{

        fun isNetworkConnection(context: Context): Boolean{
            val connectionManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetworkInfo = connectionManager.activeNetworkInfo

            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting

        }
    }
}
